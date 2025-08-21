package com.shinycounter;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {

    @JsonProperty("pokedex_id")
    private int pokedexId;

    private int generation;
    private Name name;
    private Sprites sprites;
    private List<Talent> talents;
    private List<Type> types;

    @JsonProperty("egg_groups")
    private List<String> eggGroups;

    private List<Formes> formes;

    @JsonProperty("danger")
    private Boolean isDanger;

    public int getPokedexId() {
        return pokedexId;
    }

    public void setPokedex_id(int pokedexId) {
        this.pokedexId = pokedexId;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public List<Talent> getTalents() {
        return talents;
    }

    public void setTalents(List<Talent> talents) {
        this.talents = talents;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public List<String> getEgg_groups() {
        return eggGroups;
    }

    public void setEgg_groups(List<String> eggGroup) {
        this.eggGroups = eggGroup;
    }

    public List<Formes> getFormes() {
        return formes;
    }

    public void setFormes(List<Formes> formes) {
        this.formes = formes;
    }

    public Boolean getIsDanger() {
        return isDanger;
    }

    public void setIsDanger(Boolean isDanger) {
        this.isDanger = isDanger;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "pokedexId=" + pokedexId +
                ", generation=" + generation +
                ", name=" + name +
                ", sprites=" + sprites +
                ", types=" + types +
                ", talents=" + talents +
                ", eggGroups=" + eggGroups +
                ", formes=" + formes +
                '}';
    }

}