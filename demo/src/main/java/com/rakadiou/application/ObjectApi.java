package com.rakadiou.application;

import com.rakadiou.domain.Team;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;


public class ObjectApi{
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public LinkedHashMap getFilter() {
        return filter;
    }

    public void setFilter(LinkedHashMap filter) {
        this.filter = filter;
    }

    public LinkedHashMap getCompetitions() {
        return competitions;
    }

    public void setCompetitions(LinkedHashMap competitions) {
        this.competitions = competitions;
    }

    public LinkedHashMap getSeason() {
        return season;
    }

    public void setSeason(LinkedHashMap season) {
        this.season = season;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    int count;
    LinkedHashMap filter;
    LinkedHashMap competitions;
    LinkedHashMap season;
    List<Team> teams = new ArrayList<Team>();
}

