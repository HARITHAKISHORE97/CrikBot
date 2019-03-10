package com.example.demo.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "Commentary")
public class CommentaryEntity {

    @Column(name = "Id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String runs;
    private String over;
    @Column(length = 2048)
    private String commentary;

    public String getRuns() {
        return runs;
    }

    public void setRuns(String runs) {
        this.runs = runs;
    }

    public String getOver() {
        return over;
    }

    public void setOver(String over) {
        this.over = over;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    @Override
    public String toString() {
        return "CommentaryEntity{" +
                "id='" + id + '\'' +
                ", runs='" + runs + '\'' +
                ", over=" + over +
                ", commentary='" + commentary + '\'' +
                '}';
    }
}
