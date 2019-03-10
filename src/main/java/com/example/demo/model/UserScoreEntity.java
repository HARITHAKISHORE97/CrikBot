package com.example.demo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "USER_SCORE")
public class UserScoreEntity {

    @Column(name = "Id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String name;
    private int score;

    public UserScoreEntity() {
    }

    public UserScoreEntity(String id, String name, Date timestamp, int score) {
        this.id = id;
        this.name = name;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
