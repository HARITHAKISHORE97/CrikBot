package com.example.demo.service;

import com.example.demo.dto.UserScoreDTO;
import com.example.demo.model.UserScoreEntity;

import java.util.HashMap;

public interface UserScoreService{

    HashMap<String, String> getScore(String userName);

}
