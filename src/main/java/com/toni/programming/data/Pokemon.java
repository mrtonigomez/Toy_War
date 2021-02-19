package com.toni.programming.data;

import java.util.List;

public class Pokemon extends LifeBeing implements IAction, IRender {

    private Status status;
    private String typeOfToy = "Pokemon";
    private List<Actions> actions;
    private String name;
    private String Type;
    private String color;
    private Integer level;

    @Override
    public String getTypeOfToy() {
        return typeOfToy;
    }

    @Override
    public void setTypeOfToy(String typeOfToy) {
        this.typeOfToy = typeOfToy;
    }

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Actions> getActions() {
        return actions;
    }

    public void setActions(List<Actions> actions) {
        this.actions = actions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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


    public Pokemon(String name, String type, String color, Integer level) {
        this.name = name;
        this.Type = type;
        this.color = color;
        this.level = level;
    }

    public Pokemon() {

    }

    public Pokemon(Pokemon pokemon) {
        super();
    }


}
