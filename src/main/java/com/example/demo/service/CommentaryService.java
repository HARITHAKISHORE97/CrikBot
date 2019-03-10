package com.example.demo.service;

import com.example.demo.model.*;

import java.util.List;

public interface CommentaryService {
    CommentaryMessageEntity getPredictionTrueOrFalse(String matchId, String userName, String prediction);
    void saveCommentary(List<CommentaryEntity> commentaryEntity);
    MatchesResponse liveMatches();
    ScoreCard getScoreCard(String matchId);

    void saveCommentaryDemo(CommentaryEntity commentaryEntity);

}
