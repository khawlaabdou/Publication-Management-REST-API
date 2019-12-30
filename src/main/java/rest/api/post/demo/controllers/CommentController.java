package rest.api.post.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rest.api.post.demo.models.Comment;
import rest.api.post.demo.services.CommentService;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private final CommentService commentService;
    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public Comment addPost(@Valid @RequestBody Comment c){
        return commentService.create(c);
    }

    @GetMapping
    public List<Comment> getAllPosts( @RequestBody String PostId, @RequestBody String id ){
        return (List<Comment>) commentService.getAll(PostId, id);
    }

    @PutMapping("/{id}")
    public Comment updatePost(@PathVariable(name = "id") String id, @RequestBody String title, @RequestBody String value){
        return commentService.update(title,value);
    }

    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable(name = "id") String id){
        commentService.delete(id);
        return  "Post deleted successfullt"+id;

    }

    @GetMapping("/{id}")
    public Comment getPost(@PathVariable(name = "id") String id){
        return commentService.getComment(id);
    }


}
