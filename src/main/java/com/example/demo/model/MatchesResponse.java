package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;



public class MatchesResponse {


    private List<Matches> matches;

    public List<Matches> getMatches() {
        return matches;
    }

    public void setMatches(List<Matches> matches) {
        this.matches = matches;
    }
}
