package com.example.demo.service.impl;

import com.example.demo.model.*;
import com.example.demo.repository.CommentaryRepository;
import com.example.demo.repository.CommentaryRepositoryDemo;
import com.example.demo.repository.UserScoreRepository;
import com.example.demo.service.CommentaryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CommentaryServiceImpl implements CommentaryService {

    public static int i= 45;
    @Autowired
    private CommentaryRepository commentaryRepository;

    @Autowired
    private CommentaryRepositoryDemo commentaryRepositoryDemo;

    @Autowired
    private UserScoreRepository userScoreRepository;


    @Override
    public CommentaryMessageEntity getPredictionTrueOrFalse(String matchId, String userName, String prediction) {

        CommentaryMessageEntity commentaryMessageEntity=new CommentaryMessageEntity();
        CommentaryEntity commentaryEntity = new CommentaryEntity();

//        final String uri = "http://172.16.28.149:5000/getCommentary/"+matchId;
//        RestTemplate restTemplate = new RestTemplate();
//        commentaryEntity=restTemplate.getForObject(uri, CommentaryEntity.class);
          commentaryEntity= commentaryRepository.findById(i);
          System.out.println(commentaryEntity);
//        i = String.valueOf(Integer.parseInt(i) - 1);
          i=i-1;
          System.out.println(commentaryEntity);

          UserScoreEntity userScoreEntity = userScoreRepository.findByName(userName);

        if(userScoreEntity != null)
        {
            if(commentaryEntity.getRuns().equalsIgnoreCase(prediction)){

                int score=userScoreEntity.getScore()+1;
                userScoreEntity.setScore(score);
                commentaryMessageEntity.setMessage("Prediction is correct");
                commentaryMessageEntity.setScore(score);
            }
            else{
                commentaryMessageEntity.setMessage("Prediction is incorrect");
                commentaryMessageEntity.setScore(userScoreEntity.getScore());
            }
            userScoreRepository.save(userScoreEntity);

        }
        else {
            UserScoreEntity userScoreEntityCreated=new UserScoreEntity();
            userScoreEntityCreated.setName(userName);

            if(commentaryEntity.getRuns().equalsIgnoreCase(prediction)){

                userScoreEntityCreated.setScore(1);
                commentaryMessageEntity.setMessage("Prediction is correct");
                commentaryMessageEntity.setScore(1);
            }
            else{
                commentaryMessageEntity.setMessage("Prediction is incorrect");
                commentaryMessageEntity.setScore(0);
            }
            userScoreRepository.save(userScoreEntityCreated);

        }

        commentaryMessageEntity.setCommentaryEntity(commentaryEntity);
        return commentaryMessageEntity;

    }

    @Override
    public void saveCommentary(List<CommentaryEntity> commentaryEntity) {
        commentaryRepository.save(commentaryEntity);
    }

    @Override
    public MatchesResponse liveMatches() {

        MatchesResponse listOfMatches= new MatchesResponse();

        final String uri = "http://localhost:8080/springrestexample/employees.xml";
        RestTemplate restTemplate = new RestTemplate();

        listOfMatches=restTemplate.getForObject(uri,MatchesResponse.class);

        return listOfMatches;
    }

    @Override
    public ScoreCard getScoreCard(String matchId) {

        final String uri = "http://172.16.28.149:5000/getScoreCard/21345";
        RestTemplate restTemplate = new RestTemplate();

        ScoreCard scoreCard=restTemplate.getForObject(uri,ScoreCard.class);

        return scoreCard;
    }


    @Override
    public void saveCommentaryDemo(CommentaryEntity commentaryEntity) {
            commentaryRepositoryDemo.deleteAll();
            CommentaryEntityDemo commentaryEntityDemo=new CommentaryEntityDemo();
        BeanUtils.copyProperties(commentaryEntity,commentaryEntityDemo);
            commentaryRepositoryDemo.save(commentaryEntityDemo);
    }




}
