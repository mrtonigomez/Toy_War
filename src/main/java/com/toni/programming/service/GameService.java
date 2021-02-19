package com.toni.programming.service;

import com.toni.programming.data.Actions;
import com.toni.programming.data.Pokemon;
import com.toni.programming.data.UserAction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    private Integer maxPoints = 100;
    UserAction userAction = new UserAction();
    public static List<UserAction> userActions = new ArrayList<>();
    private static Pokemon currentLifeBeing = new Pokemon();

    public Pokemon getCurrentLifeBeing() {
        return currentLifeBeing;
    }

    public void setCurrentLifeBeing(Pokemon currentLifeBeing) {
        GameService.currentLifeBeing = currentLifeBeing;
    }

    public List<Actions> getPokeActions() {
        return currentLifeBeing.getActions();
    }

    public void addPokeActions(List<Actions> actionsList) {
        currentLifeBeing.setActions(actionsList);
    }

    public void doAction (Actions pokeaction){

    }

}

