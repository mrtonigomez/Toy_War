package com.toni.programming.controller;

import com.toni.programming.data.Actions;
import com.toni.programming.data.Pokemon;
import com.toni.programming.data.RenderType;
import com.toni.programming.data.Status;
import com.toni.programming.service.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
                              @RequestParam(value = "level", defaultValue = "2") Integer level) {

        Pokemon charizard = new Pokemon(name, type, color, level);
        gameService.setCurrentLifeBeing(charizard);
        gameService.addPokemons(charizard);
        return gameService.getCurrentLifeBeing();
    }

    @GetMapping("/getPokemons")
    public List<Pokemon> getPokemons(){
        return gameService.getPokemonList();
    }

    @GetMapping("/getActions")
    public List<Actions> getActions() {

        List<Actions> pokemonActions = new ArrayList<>();

        pokemonActions.add(Actions.ATTACK);
        pokemonActions.add(Actions.DEFEND);
        pokemonActions.add(Actions.FLY);
        gameService.addPokeActions(pokemonActions);


        return gameService.getPokeActions();
    }

    @GetMapping("/doActions")
    public Pokemon doAttack(@RequestParam(value = "name", defaultValue = "Blastoise") String name,
                            @RequestParam(value = "type", defaultValue = "Water") String type,
                            @RequestParam(value = "color", defaultValue = "blue") String color,
                            @RequestParam(value = "level", defaultValue = "36") Integer level) {

        List<Actions> historicalActions = new ArrayList<>();
        gameService.setCurrentLifeBeing(new Pokemon(name, type, color, level));
        gameService.doAction(Actions.ATTACK);
        historicalActions.add(Actions.ATTACK);
        gameService.doAction(Actions.DEFEND);
        historicalActions.add(Actions.DEFEND);
        gameService.doAction(Actions.ESCAPE);
        historicalActions.add(Actions.ESCAPE);
        gameService.getCurrentLifeBeing().setActions(historicalActions);
        gameService.getCurrentLifeBeing().setCurrentActions(Actions.ATTACK);

        return gameService.getCurrentLifeBeing();

    }

    @GetMapping("/render")
    public String render(){

        gameService.setCurrentLifeBeing(new Pokemon("Picachu", "Electric", "Yellow", 200));
        return gameService.getCurrentLifeBeing().doRender(RenderType.HTML);

    }

    @GetMapping("/do/{action}")
    public Pokemon doAction(@PathVariable("action") String action) {

        gameService.doAction(Actions.valueOf(action.toUpperCase()));
        gameService.getCurrentLifeBeing().setActions(gameService.getPokeActions());
        gameService.getCurrentLifeBeing().setCurrentActions(Actions.valueOf(action.toUpperCase()));
        return gameService.getCurrentLifeBeing();
    }

}
