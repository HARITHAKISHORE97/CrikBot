package com.example.demo.dto;

import java.util.Date;

public class UserScoreDTO {
    private String id;
    private String name;
    private Date timestamp;
    private int score;


    public UserScoreDTO() {
    }

    public UserScoreDTO(String id, String name, Date timestamp, int score) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
