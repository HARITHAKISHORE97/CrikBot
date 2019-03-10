package com.example.demo.controller;

import com.example.demo.dto.UserScoreDTO;
import com.example.demo.model.*;
import com.example.demo.repository.CommentaryRepository;
import com.example.demo.repository.CommentaryRepositoryDemo;
import com.example.demo.service.CommentaryService;
import com.example.demo.service.QuestionAndAnswerService;
import com.example.demo.service.UserScoreService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/score")
public class
UserScoreController {

    @Autowired
    CommentaryService commentaryService;

    @Autowired
    UserScoreService userScoreService;

    @Autowired
    QuestionAndAnswerService questionAndAnswerService;

    @Autowired
    CommentaryRepository commentaryRepository;


    @RequestMapping(value = "/liveMatchesList")
    public MatchesResponse liveMatchesList(){
        return commentaryService.liveMatches();
    }

    @RequestMapping(value = "/checkingPredictionTrueOrFalse")
    public CommentaryMessageEntity checkingPredictionTrueOrFalse(@RequestParam String matchId, @RequestParam String userName, @RequestParam String prediction){

        CommentaryMessageEntity commentaryMessageEntity=new CommentaryMessageEntity();
        commentaryMessageEntity=commentaryService.getPredictionTrueOrFalse(matchId,userName,prediction);
        System.out.println(matchId+userName+prediction);
        return commentaryMessageEntity;
    }

    @RequestMapping(value = "/userScore")
    public HashMap<String, String> getUserScore(@RequestParam String userName){

        return userScoreService.getScore(userName);
    }

    @RequestMapping(value = "/scoreCard")
    public ScoreCard getScoreCard(@RequestParam String matchId){
       return commentaryService.getScoreCard(matchId);
    }

    @PostMapping(value = "/storeCommentary")// , method = RequestMethod.GET)
    public void storeCommentary(@RequestBody List<CommentaryEntity> commentaryEntity){
        commentaryService.saveCommentary(commentaryEntity);
    }

    @PostMapping(value = "/questionAndAnswer")
    public void questionAndAnswer(List<QuestionAndAnswerEntity> questionAndAnswerEntityList){

        questionAndAnswerService.addQuestions(questionAndAnswerEntityList);

    }

//
//    @RequestMapping(value = "/getQuestions")
//    public QuestionAndAnswerEntity getQuestions(){
//
//        return questionAndAnswerService.getQuestion();
//    }


//    @Scheduled(fixedRate = 10000)
//    public void addToFinalDataBase() {
//        if (Integer.parseInt(i) >= 0) {
//            CommentaryEntity commentaryEntity = commentaryRepository.findById(i);
//            commentaryService.saveCommentaryDemo(commentaryEntity);
//            i = String.valueOf(Integer.parseInt(i) - 1);
//        }
//    }

}
