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
        Status attackStatus = new Status();
        UserAction attackUserAction = new UserAction();
        attackStatus.setStatusPoints(attackUserAction.getStartingPoints()+10);
        attackStatus.setCurrentStatus("Attack mode!");
        setStatus(attackStatus);
    }

    @Override
    public void doDefend() {
        Status defenseStatus = new Status();
        UserAction defenseUserAction = new UserAction();
        defenseStatus.setStatusPoints(defenseUserAction.getStartingPoints());
        defenseStatus.setCurrentStatus("Defense mode!");
        setStatus(defenseStatus);
    }

    @Override
    public void doEscape() {
        Status escapeStatus = new Status();
        UserAction escapeUserAction = new UserAction();
        escapeStatus.setStatusPoints(escapeUserAction.getStartingPoints()-5);
        escapeStatus.setCurrentStatus("You have no honor...");
        setStatus(escapeStatus);
    }

    @Override
    public void doFly() {
        Status flyStatus = new Status();
        UserAction flyUserAction = new UserAction();
        flyStatus.setStatusPoints(flyUserAction.getStartingPoints()+3);
        flyStatus.setCurrentStatus("You're flying high");
        setStatus(flyStatus);

    }

    @Override
    public void doDig() {

    }

    @Override
    public void doHeal() {

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
