package com.toni.programming.controller;

import com.toni.programming.data.Pokemon;
import com.toni.programming.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/controller")
public class PokemonsController {

    GameService gameService = new GameService();

    @PostMapping("/paint")
    public String pintarPokemonsPost(@ModelAttribute Pokemon pokemon){

        gameService.setCurrentLifeBeing(pokemon);
        gameService.reset();
        gameService.addPokemons(pokemon);

        return "pokemons";
    }

    @GetMapping("/")
    public String pintarPokemonsGet(){

        return "pokemons";
    }

}
