package com.example.demo;

import com.example.demo.service.impl.CommentaryServiceImpl;
import org.mockito.InjectMocks;

public class CommentaryServiceTest {

    @InjectMocks
    public CommentaryServiceImpl commentaryServiceImpl;
    public void test_something(){
        commentaryServiceImpl.getPredictionTrueOrFalse("","","1");
    }
}
