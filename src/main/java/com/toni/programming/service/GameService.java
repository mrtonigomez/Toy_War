package com.toni.programming.service;

import com.toni.programming.data.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    private Integer maxPoints = 100;
    UserAction userAction = new UserAction();
    public static List<UserAction> userActions = new ArrayList<>();
    public static List<Pokemon> pokemonList = new ArrayList<>();
    private static Pokemon currentLifeBeing = new Pokemon();

    public void addPokemons(Pokemon pokemon){
        pokemonList.add(pokemon);
    }

    public  List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public  void setPokemonList(List<Pokemon> pokemonList) {
        GameService.pokemonList = pokemonList;
    }

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

        switch (pokeaction){
            case ATTACK: getCurrentLifeBeing().doAttack();
            break;
            case DEFEND: getCurrentLifeBeing().doDefend();
            break;
            case ESCAPE: getCurrentLifeBeing().doEscape();
            break;
            case EAT: getCurrentLifeBeing().doEat();
            break;
            case FLY: getCurrentLifeBeing().doFly();
            break;
            case HEAL: getCurrentLifeBeing().doHeal();
            break;
            case SWIM: getCurrentLifeBeing().doSwim();
            break;
            case WEAKENED: getCurrentLifeBeing().doWeakened();
            break;
            case DIG: getCurrentLifeBeing().doDig();
            break;
            case SLEEP: getCurrentLifeBeing().doSleep();
            break;
        }

    }

}

