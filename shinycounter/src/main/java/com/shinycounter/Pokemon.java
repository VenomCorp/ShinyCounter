package com.shinycounter;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {
    int pokedex_id;
    int generation;
    Name name;
    Sprites sprites;
    List<Talent> talents;
    List<Type> types;
    String egg_group;
    Formes formes;
    Boolean isDanger;

    @JsonCreator
    public Pokemon(String egg_groups, Formes formes, int generation, Name name, int pokedex_id, Sprites sprites,
            List<Talent> talent, List<Type> type, Boolean isDanger) {
        this.egg_group = egg_groups;
        this.formes = formes;
        this.generation = generation;
        this.name = name;
        this.pokedex_id = pokedex_id;
        this.sprites = sprites;
        this.talents = talent;
        this.types = type;
        this.isDanger = isDanger;
    }

    public int getPokedex_id() {
        return pokedex_id;
    }

    public void setPokedex_id(int pokedex_id) {
        this.pokedex_id = pokedex_id;
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

    public String getEgg_groups() {
        return egg_group;
    }

    public void setEgg_groups(String egg_group) {
        this.egg_group = egg_group;
    }

    public Formes getFormes() {
        return formes;
    }

    public void setFormes(Formes formes) {
        this.formes = formes;
    }

    public Boolean getIsDanger() {
        return isDanger;
    }

    public void setIsDanger(Boolean isDanger) {
        this.isDanger = isDanger;
    }

    
}