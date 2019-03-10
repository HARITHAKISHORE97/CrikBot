package com.example.demo.service.impl;

import com.example.demo.model.QuestionAndAnswerEntity;
import com.example.demo.repository.QuestionAndAnswerRepository;
import com.example.demo.service.QuestionAndAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuestionAndAnswerServiceImpl implements QuestionAndAnswerService {

    @Autowired
    QuestionAndAnswerRepository questionAndAnswerRepository;
    @Override
    public void addQuestions(List<QuestionAndAnswerEntity> questionAndAnswerEntity) {

        questionAndAnswerRepository.save(questionAndAnswerEntity);
    }

//    @Override
//    public QuestionAndAnswerEntity getQuestion() {
//
//        Random rand = new Random();
//        int n=rand.nextInt(50)+1;
//        return questionAndAnswerRepository.finById(n);
//    }
}
