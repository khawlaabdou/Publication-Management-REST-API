package rest.api.post.demo.models;

import java.sql.Date;


public class Comment {


    private Integer id;
    private Integer body;
    private Date datecomment;
    public Comment(Integer id, Integer body, Date datecomment) {
        this.id = id;
        this.body = body;
        this.datecomment = datecomment;
    }



    public void setId(Integer id) {
        this.id = id;
    }

    public void setBody(Integer body) {
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

    public Integer getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", body=" + body +
                ", datecomment=" + datecomment +
                '}';
    }
}
