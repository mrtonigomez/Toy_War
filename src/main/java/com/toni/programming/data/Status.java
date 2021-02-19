package com.toni.programming.data;

import java.util.List;

public class Status extends LifeBeing {

    private Integer statusPoints;
    private String currentStatus;

    public Integer getStatusPoints() {
        return statusPoints;
    }

    public void setStatusPoints(Integer statusPoints) {
        this.statusPoints = statusPoints;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Override
    public void doAttack() {

    }

    @Override
    public void doDefend() {

    }

    @Override
    public void doEscape() {

    }

    @Override
    public void doFly() {

    }

    @Override
    public void doDig() {

    }

    @Override
    public void doTalk() {

    }

    @Override
    public void doSwim() {

    }

    @Override
    public void doSleep() {

    }

    @Override
    public void doEat() {

    }

    @Override
    public void doWeakened() {

    }

    @Override
    public List<Actions> getCurrentActions() {
        return null;
    }

    @Override
    public String doRender(RenderType renderType) {
        return null;
    }

}
