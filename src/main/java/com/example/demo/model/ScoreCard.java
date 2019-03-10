package com.example.demo.model;


public class ScoreCard {

    private String batteam;
    private String bowlteam;
    private float overs;
    private int runs;
    private int wickets;

    public String getBatteam() {
        return batteam;
    }

    public void setBatteam(String batteam) {
        this.batteam = batteam;
    }

    public String getBowlteam() {
        return bowlteam;
    }

    public void setBowlteam(String bowlteam) {
        this.bowlteam = bowlteam;
    }

    public float getOvers() {
        return overs;
    }

    public void setOvers(float overs) {
        this.overs = overs;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }
}
