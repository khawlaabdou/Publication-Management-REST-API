package rest.api.post.demo.reposetories;

import org.springframework.data.mongodb.repository.MongoRepository;
import rest.api.post.demo.models.Comment;


public interface CommentRepository extends MongoRepository<Comment, Integer> {


    Comment findById(String postId);
    void deleteById(String postId);

}
