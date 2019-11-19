package rest.api.post.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document (collection = "Posts")
public class Post {

    @Id
    private String id;
    private String value;
    private User user;
    private String datepub;
    private String title;
    private List<Comment> comments;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public String getDatepub() {
        return datepub;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDatepub(String datepub) {
        this.datepub = datepub;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Post(String id, String value, User user, String datepub, String title, List<Comment> comments) {
        this.id = id;
        this.value = value;
        this.user = user;
        this.datepub = datepub;
        this.title = title;
        this.comments = comments;
    }
}
