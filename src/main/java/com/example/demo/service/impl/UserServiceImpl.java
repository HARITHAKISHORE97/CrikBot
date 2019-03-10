package com.example.demo.service.impl;

import com.example.demo.model.UserScoreEntity;
import com.example.demo.repository.UserScoreRepository;
import com.example.demo.service.UserScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserServiceImpl implements UserScoreService {

    @Autowired
    UserScoreRepository userScoreRepository;

    @Override
    public HashMap<String, String> getScore(String userName) {
        HashMap<String, String> hashMap = new HashMap<>();
        if(userScoreRepository.findByName(userName)!=null){
            int score = userScoreRepository.findByName(userName).getScore();
            hashMap.put("score", String.valueOf(score));
        }else{
            hashMap.put("score", "0");

        }
        return hashMap;
    }
}
