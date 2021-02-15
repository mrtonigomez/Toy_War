package com.toni.programming.data;

import java.util.List;

public class Status extends LifeBeing {

    private Integer aLotOfPoints;

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

    public Integer getaLotOfPoints() {
        return aLotOfPoints;
    }

    public void setaLotOfPoints(Integer aLotOfPoints) {
        this.aLotOfPoints = aLotOfPoints;
    }
}
