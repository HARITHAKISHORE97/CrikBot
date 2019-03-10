package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class CommentaryMessageEntity {


    private CommentaryEntity commentaryEntity;
    private String message;
    private int score;

    public CommentaryEntity getCommentaryEntity() {
        return commentaryEntity;
    }

    public void setCommentaryEntity(CommentaryEntity commentaryEntity) {
        this.commentaryEntity = commentaryEntity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "CommentaryMessageEntity{" +
                "commentaryEntity=" + commentaryEntity +
                ", message='" + message + '\'' +
                '}';
    }
}
