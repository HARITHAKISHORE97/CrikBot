package com.example.demo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "Questions")
public class QuestionAndAnswerEntity {


    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String question;
    private String options;
    private String correctOption;


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(String correctOption) {
        this.correctOption = correctOption;
    }
}
