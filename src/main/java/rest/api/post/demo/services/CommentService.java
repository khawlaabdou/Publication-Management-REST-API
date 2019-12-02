package rest.api.post.demo.services;

import rest.api.post.demo.models.Comment;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.api.post.demo.reposetories.CommentRepository;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;


    public Comment create(Comment comment){
        return commentRepository.save(comment);

    }

    public List<Comment> getAll (int id) {
        return commentRepository.findById(id);

    }

    public Comment update(String body, int id){
        Comment c = (Comment) commentRepository.findById(id);
        c.setBody(body);
        return commentRepository.save(c);

    }
    public void delete(int id){
        Comment c = (Comment) commentRepository.findById(id);
        commentRepository.delete(c);
    }

    public void deleteById(int id){
        List<Comment> c =  commentRepository.findById(id);
        commentRepository.deleteById(id);
    }
    public List<Comment> getPost (int id) {
        return commentRepository.findById(id);
    }


    }





