package rest.api.post.demo.reposetories;

import org.springframework.data.mongodb.repository.MongoRepository;
import rest.api.post.demo.models.Comment;

import java.util.List;



public interface CommentRepository extends MongoRepository<Comment, Integer> {

    List<Comment> findById(int id);

}
