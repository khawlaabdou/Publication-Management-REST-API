package rest.api.post.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rest.api.post.demo.models.Post;
import rest.api.post.demo.services.PostService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts(){
        return postService.getAll();
    }


    @PostMapping
    public Post addPost(Post p){
        return postService.create(p);
    }

    @GetMapping("/{id}")
    public Optional<Post> getPost(@PathVariable(name = "id") String id){
        return postService.getById(id);
    }

    @PutMapping("/{id}")
    public Post updatePost(@PathVariable(name = "id") String id, @RequestBody String title, @RequestBody String value){
        return postService.update(title,value);
    }

    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable(name = "id") String id){
         postService.deleteById(id);
         return  "Post deleted successfullt"+id;

    }

    @GetMapping("/{text}")
    public List<Post> getPostByFewLetters(@PathVariable(name = "title") String title) {

        List<Post> list = postService.getAll();
        return   list.stream()
                .filter(p-> p.getTitle().toLowerCase().contains(title.trim().toLowerCase()))
                .collect(Collectors.toList());
    }
}