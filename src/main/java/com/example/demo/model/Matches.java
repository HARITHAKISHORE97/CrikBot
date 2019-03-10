package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Matches")
public class Matches {

    @Id
    private String id;
    private String matchId;
    private String matchDetails;


    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getMatchDetails() {
        return matchDetails;
    }

    public void setMatchDetails(String matchDetails) {
        this.matchDetails = matchDetails;
    }
}
