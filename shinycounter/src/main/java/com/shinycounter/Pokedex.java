package com.shinycounter;

import java.util.ArrayList;
import java.util.List;

public class Pokedex {
    private List<Pokemon> pokemons = new ArrayList<>();

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    @Override
    public String toString() {
        return "Pokedex{" +
                "pokemons=" + pokemons +
                '}';
    }
}