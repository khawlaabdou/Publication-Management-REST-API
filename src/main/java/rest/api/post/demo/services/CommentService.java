package rest.api.post.demo.services;

import rest.api.post.demo.models.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.api.post.demo.reposetories.CommentRepository;
import rest.api.post.demo.reposetories.PostRepositpory;
import rest.api.post.demo.models.Post;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;


@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private PostRepositpory postRepositpory;

    private Post post;

    public Comment create(Comment comment){
        return commentRepository.save(comment);

    }

    public Comment getAll (String PostId, String id) {
        Optional<Post> post = postRepositpory.findById(PostId);
        Comment comment = commentRepository.findById(id);
        if (comment.getPost().getId().equals(comment.getId())) {
            return commentRepository.findById(id);
        }
        return commentRepository.findById(id);

    }

    public Comment update(String body, String id){

        Comment c = commentRepository.findById(id);
        c.setBody(body);
        return commentRepository.save(c);

    }
    public void delete(String id){
        Comment c = commentRepository.findById(id);
        commentRepository.deleteById(String.valueOf(c));
    }

    public Comment getPost (String id) {
        return commentRepository.findById(id);
    }


    }





