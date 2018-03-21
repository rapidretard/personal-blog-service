package com.shiveenpandita.blog;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class Blog {

    @Id
    private String id;

    private String title;
    private String body;
    private LocalDateTime modifiedDtTm;

    public Blog() {
    }

    public Blog(String id, String title, String body, LocalDateTime modifiedDtTm) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.modifiedDtTm = modifiedDtTm;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getModifiedDtTm() {
        return modifiedDtTm;
    }

    public void setModifiedDtTm(LocalDateTime modifiedDtTm) {
        this.modifiedDtTm = modifiedDtTm;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", modifiedDtTm=" + modifiedDtTm +
                '}';
    }
}
