package rest.api.post.demo.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document (collection = "Users")
public class User {

    @Id
    private Integer id;
    private String username;
    private List<Post> posts;
    private  List <Comment>comments;


    public void setComment(List<Comment> comment) {
        this.comments = comment;
    }

    public List<Comment> getComment() {
        return comments;
    }



    public User(Integer id, String username, List<Post> posts, List<Comment> comments) {
        this.id = id;
        this.username = username;
        this.posts = posts;
        this.comments = comments;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }




    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
