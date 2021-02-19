package com.toni.programming.controller;

import com.toni.programming.data.Actions;
import com.toni.programming.data.Pokemon;
import com.toni.programming.data.Status;
import com.toni.programming.service.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/rest/api/v1")
public class PokemonRestController {

    GameService gameService = new GameService();

@GetMapping("/new")
public Pokemon getPokemon(@RequestParam(value = "name", defaultValue = "Charizard") String name,
                          @RequestParam(value = "type", defaultValue = "Fire") String type,
                          @RequestParam(value = "color", defaultValue = "red") String color,
                          @RequestParam(value = "level", defaultValue = "2") Integer level){

    Pokemon charizard = new Pokemon(name, type, color, level);

    return charizard;
}

@GetMapping("/getActions")
public List<Actions> getActions(){

    List<Actions> pokemonActions = new ArrayList<>();

    pokemonActions.add(Actions.ATTACK);
    pokemonActions.add(Actions.DEFEND);
    pokemonActions.add(Actions.FLY);
    gameService.addPokeActions(pokemonActions);

    return gameService.getPokeActions();

}

@GetMapping("/doAttack")
    public Pokemon doAttack(@RequestParam(value = "name", defaultValue = "Blastoise") String name,
                            @RequestParam(value = "type", defaultValue = "Water") String type,
                            @RequestParam(value = "color", defaultValue = "blue") String color,
                            @RequestParam(value = "level", defaultValue = "36") Integer level){

    Pokemon blastoise = new Pokemon(name, type, color, level);
    blastoise.doAttack();

    List<Actions> pokemonActions = new ArrayList<>();

    pokemonActions.add(Actions.ATTACK);
    pokemonActions.add(Actions.DEFEND);
    pokemonActions.add(Actions.FLY);
    gameService.addPokeActions(pokemonActions);

    return blastoise;

}

}
