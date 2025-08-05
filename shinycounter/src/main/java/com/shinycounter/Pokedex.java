package com.shinycounter;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokedex {
    private List<Pokemon> pokedex;

    public List<Pokemon> getPokedex() {
        return pokedex;
    }

    public void setPokedex(List<Pokemon> pokedex) {
        this.pokedex = pokedex;
    }


}
