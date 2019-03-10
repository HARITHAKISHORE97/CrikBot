package com.example.demo.service;

import com.example.demo.model.QuestionAndAnswerEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface QuestionAndAnswerService {

    void addQuestions(List<QuestionAndAnswerEntity> questionAndAnswerEntity);
//    QuestionAndAnswerEntity getQuestion();
}
