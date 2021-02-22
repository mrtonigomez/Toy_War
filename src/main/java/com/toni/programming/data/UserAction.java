package com.toni.programming.data;

import java.util.List;

public class UserAction {

    private String toy;
    private List<Actions> historicalActions;
    private final Integer startingPoints = 50;
    private Integer achievedPoints;

    public String getToy() {
        return toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }

    public Integer getStartingPoints() {
        return startingPoints;
    }

    public Integer getAchievedPoints() {
        return achievedPoints;
    }

    public void setAchievedPoints(Integer achievedPoints) {
        this.achievedPoints = achievedPoints;
    }

    public List<Actions> getHistoricalActions() {
        return historicalActions;
    }

    public void setHistoricalActions(List<Actions> historicalActions) {
        this.historicalActions = historicalActions;
    }
}
