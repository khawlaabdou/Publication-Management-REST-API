package rest.api.post.demo.services;


import rest.api.post.demo.models.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import rest.api.post.demo.repositories.PostRepositpory;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
   @Autowired
    private PostRepositpory postRepositpory;

    public Post create(Post post){
        return postRepositpory.save(post);

    }
    public Optional <Post>getById(String id ){
        return postRepositpory.findById(id);

    }

   public List <Post> getAll(){
        return postRepositpory.findAll();
    }

    public List <Post>getByFirstTitle(String firstTitle ){
        return postRepositpory.findByTitleRegex(firstTitle);

    }
    public Post update(String title, String body){
        Post p = postRepositpory.findByTitle(title);
        p.setTitle(title);
        p.setBody(body);
        return postRepositpory.save(p);
    }
    public void  deleteAll(){
        postRepositpory.deleteAll();

    }
 public void delete(String title){
     Post p = postRepositpory.findByTitle(title);
     postRepositpory.delete(p);
 }

    public Optional<Post> getPost (String id) {
        return postRepositpory.findById(id);
    }

}
