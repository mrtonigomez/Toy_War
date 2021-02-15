package com.toni.programming.controller;

import com.toni.programming.data.Pokemon;
import com.toni.programming.data.Status;
import com.toni.programming.service.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/api/v1")
public class PokemonRestController {

    GameService gameService;

@GetMapping("/new")
public Pokemon getPokemon(@RequestParam(value = "name", defaultValue = "Charizard") String name,
                                @RequestParam(value = "type", defaultValue = "Fire") String type,
                                @RequestParam(value = "color", defaultValue = "red") String color,
                                @RequestParam(value = "level", defaultValue = "2") Integer level){

    Pokemon pokemon = new Pokemon();
    pokemon.doSleep();
    pokemon.setColor("Green");
    pokemon.setLevel(56);

    return pokemon;

}


}
