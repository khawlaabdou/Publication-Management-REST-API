package rest.api.post.demo.models;

import java.sql.Date;


public class Comment {


    private Integer id;
    private String body;
    private Date datecomment;
    private User user;
    private Post post;

    public Comment(Integer id, String body, Date datecomment, User user , Post post) {
        this.id = id;
        this.body = body;
        this.datecomment = datecomment;
        this.user = user;
        this.post = post;
    }



    public void setId(Integer id) {
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setDatecomment(Date datecomment) {
        this.datecomment = datecomment;
    }

    public Date getDatecomment() {
        return datecomment;
    }

    public Integer getId() {
        return id;
    }

    public String getBody() {
        return body;
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }


    @Override
    public String toString() {
        return "Comment{" + "id=" + id + ", body='" + body + '\'' + ", datecomment=" + datecomment + ", user=" + user + ", post=" + post + '}';
    }



}
