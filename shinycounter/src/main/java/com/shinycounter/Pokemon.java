package com.shinycounter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {
    int pokedex_id;
    int generation;
    Name name;
    Sprites sprites;
    Talents talents;
    Types types;
    String egg_groups;
    Formes formes;
    Boolean isDanger;

    public Pokemon(String egg_groups, Formes formes, int generation, Name name, int pokedex_id, Sprites sprites,
            Talents talents, Types types, Boolean isDanger) {
        this.egg_groups = egg_groups;
        this.formes = formes;
        this.generation = generation;
        this.name = name;
        this.pokedex_id = pokedex_id;
        this.sprites = sprites;
        this.talents = talents;
        this.types = types;
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

    public Talents getTalents() {
        return talents;
    }

    public void setTalents(Talents talents) {
        this.talents = talents;
    }

    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }

    public String getEgg_groups() {
        return egg_groups;
    }

    public void setEgg_groups(String egg_groups) {
        this.egg_groups = egg_groups;
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