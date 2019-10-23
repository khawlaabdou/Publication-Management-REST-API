package rest.api.post.demo.controller;


import rest.api.post.demo.models.Post;
import rest.api.post.demo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;


import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/post")

public class PostController {

    @Autowired
   private PostService postService;


    @PostMapping ("/add")
    public ResponseEntity<?> create(@RequestBody Post p){
       postService.create(p);
        return new ResponseEntity("Student added successfully", HttpStatus.OK);
    }
    @GetMapping("/{title}")
    public List<Post> getPostByFirstTitle(@PathVariable String title){
        return postService.getByFirstTitle(title);
    }
    @GetMapping("/getOne/{id}")
    public Optional<Post> getOne(@PathVariable String id){
        return postService.getById(id);
    }
    @GetMapping()
  //@RequestMapping(value = "/", method = RequestMethod.GET)
    public  List <Post> getAll(){
     // System.out.println("hello");
        return postService.getAll();
    }

    @PutMapping("/{id}")
    public String update( @PathVariable int id , @Valid @RequestBody String title, @Valid @RequestBody String body){
     Post p = postService.update(title,body);
     return p.toString();
    }
    @DeleteMapping("/{title}")
    public  String delete(@PathVariable String title){
        postService.delete(title);
        return "deleted"+title;

    }

    @DeleteMapping("/deleteAll")
    public String deleteAll(){
        postService.deleteAll();
        return "Deleted all posts";
    }
}

