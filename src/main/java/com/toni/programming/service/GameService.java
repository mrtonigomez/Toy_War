package com.toni.programming.service;

import com.toni.programming.data.LifeBeing;
import com.toni.programming.data.Pokemon;
import com.toni.programming.data.UserAction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    private Integer maxPoints;
    public static final LifeBeing currentLifeBeing = new Pokemon();
    public static final List<UserAction> userActions = new ArrayList<>();
    public static List<Pokemon> pokemonList = new ArrayList<>();

    public List<Pokemon> getPokemonList(){return pokemonList;}

    public Pokemon newPokemon(Pokemon pokemon) {

        Pokemon pokemon1 = new Pokemon(pokemon);
        pokemon1.setType("Electric");
        pokemonList.add(pokemon1);
        return pokemon1;
    }
}
