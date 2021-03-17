package com.toni.programming.data;


import com.toni.programming.service.GameService;
import org.apache.commons.lang3.StringUtils;


import java.util.List;


public class Pokemon extends LifeBeing implements IAction, IRender {

    GameService gameService = new GameService();

    private List<Actions> actions;
    private String name;
    private String Type;
    private String color;
    private Integer level;
    private Actions currentAction;

    @Override
    public String getTypeOfToy() {
        return "Pokemon";
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
        gameService.getCurrentLifeBeing().setStatus(attackStatus);
    }

    @Override
    public void doDefend() {
        Status defenseStatus = new Status();
        UserAction defenseUserAction = new UserAction();
        defenseStatus.setStatusPoints(defenseUserAction.getStartingPoints());
        defenseStatus.setCurrentStatus("Defense mode!");
        gameService.getCurrentLifeBeing().setStatus(defenseStatus);
    }

    @Override
    public void doEscape() {
        Status escapeStatus = new Status();
        UserAction escapeUserAction = new UserAction();
        escapeStatus.setStatusPoints(escapeUserAction.getStartingPoints()-5);
        escapeStatus.setCurrentStatus("You have no honor...");
        gameService.getCurrentLifeBeing().setStatus(escapeStatus);
    }

    @Override
    public void doFly() {
        Status flyStatus = new Status();
        UserAction flyUserAction = new UserAction();
        flyStatus.setStatusPoints(flyUserAction.getStartingPoints()+3);
        flyStatus.setCurrentStatus("You're flying high");
        gameService.getCurrentLifeBeing().setStatus(flyStatus);

    }

    @Override
    public void doDig() {
        Status digStatus = new Status();
        UserAction digUserAction = new UserAction();
        digStatus.setStatusPoints(digUserAction.getStartingPoints());
        digStatus.setCurrentStatus("You used dig");
        gameService.getCurrentLifeBeing().setStatus(digStatus);
    }

    @Override
    public void doHeal() {
        Status healStatus = new Status();
        UserAction healUserAction = new UserAction();
        healStatus.setStatusPoints(healUserAction.getStartingPoints()+20);
        healStatus.setCurrentStatus("You are healing");
        gameService.getCurrentLifeBeing().setStatus(healStatus);
    }

    @Override
    public void doSwim() {
        Status swimStatus = new Status();
        UserAction swimUserAction = new UserAction();
        swimStatus.setStatusPoints(swimUserAction.getStartingPoints()+4);
        swimStatus.setCurrentStatus("Your are swimming");
        gameService.getCurrentLifeBeing().setStatus(swimStatus);
    }

    @Override
    public void doSleep() {
        Status sleepStatus = new Status();
        UserAction sleepUserAction = new UserAction();
        sleepStatus.setStatusPoints(sleepUserAction.getStartingPoints());
        sleepStatus.setCurrentStatus("Your body is resting");
        gameService.getCurrentLifeBeing().setStatus(sleepStatus);
    }

    @Override
    public void doEat() {
        Status eatStatus = new Status();
        UserAction eatUserAction = new UserAction();
        eatStatus.setStatusPoints(eatUserAction.getStartingPoints());
        eatStatus.setCurrentStatus("Your are eating to much!");
        gameService.getCurrentLifeBeing().setStatus(eatStatus);
    }

    @Override
    public void doWeakened() {
        Status weakenedStatus = new Status();
        UserAction weakenedUserAction = new UserAction();
        weakenedStatus.setStatusPoints(weakenedUserAction.getStartingPoints());
        weakenedStatus.setCurrentStatus("Your are done...");
        gameService.getCurrentLifeBeing().setStatus(weakenedStatus);
    }

    @Override
    public Actions getCurrentActions() {
        return null;
    }

    @Override
    public void setCurrentActions(Actions pokeAction) {
        this.currentAction = pokeAction;
    }


    @Override
    public String doRender(RenderType renderType) {
        String rtn = StringUtils.EMPTY;

        switch (renderType) {
            case HTML:
                rtn = String.format("<div><h2>Tu pokemon</h2></div>");
                break;
            case CONSOLE:
                System.out.println(toStringPokemon(gameService.getCurrentLifeBeing()));
                break;
            case JSON:
               break;
        }
        return rtn;
    }


    public String toStringPokemon(Pokemon pokemon){

        String content= "Nombre: " + gameService.getCurrentLifeBeing().getName() + "\n" +
                        "Nivel: " + gameService.getCurrentLifeBeing().getLevel() + "\n" +
                        "Color: " + gameService.getCurrentLifeBeing().getColor() + "\n" +
                        "Tipo de jugueye: " + gameService.getCurrentLifeBeing().getTypeOfToy() + "\n";

        return content;
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
