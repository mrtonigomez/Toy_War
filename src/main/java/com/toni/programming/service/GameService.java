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
    public static List<Pokemon> pokemonList = new ArrayList<>();
    private static Pokemon currentLifeBeing = new Pokemon();
    private static List<Actions> pokeActions = new ArrayList<>();


    public void addPokemons(Pokemon pokemon){
        pokemonList.add(pokemon);
    }

    public void addActions(Actions actions){
        pokeActions.add(actions);
    }

    public void setPokeActions(List<Actions> pokeActions) {
        GameService.pokeActions = pokeActions;
    }
    public List<Actions> getPokeActions(){
        return pokeActions;
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

    public void addPokeActions(List<Actions> actionsList) {
        currentLifeBeing.setActions(actionsList);
    }

    public void doAction (Actions pokeaction){

        switch (pokeaction){
            case ATTACK:
                getCurrentLifeBeing().doAttack();
                addActions(pokeaction);
                break;
            case DEFEND:
                getCurrentLifeBeing().doDefend();
                addActions(pokeaction);
                break;
            case ESCAPE:
                getCurrentLifeBeing().doEscape();
                addActions(pokeaction);
                break;
            case EAT:
                getCurrentLifeBeing().doEat();
                addActions(pokeaction);
                break;
            case FLY:
                getCurrentLifeBeing().doFly();
                addActions(pokeaction);
                break;
            case HEAL:
                getCurrentLifeBeing().doHeal();
                addActions(pokeaction);
                break;
            case SWIM:
                getCurrentLifeBeing().doSwim();
                addActions(pokeaction);
                break;
            case WEAKENED:
                getCurrentLifeBeing().doWeakened();
                addActions(pokeaction);
                break;
            case DIG:
                getCurrentLifeBeing().doDig();
                addActions(pokeaction);
                break;
            case SLEEP:
                getCurrentLifeBeing().doSleep();
                addActions(pokeaction);
                break;
        }
    }

    public void reset() {
        List<Actions> resetList = new ArrayList<>();
        getCurrentLifeBeing().setStatus(new Status());
        setPokeActions(resetList);
    }
}

