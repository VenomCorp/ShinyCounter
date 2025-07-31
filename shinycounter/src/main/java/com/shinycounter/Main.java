package com.shinycounter;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Venom
 */
public class Main {

    public static void main(String[] args) {
        Formes formes = new Formes("aucune");
        Sprites sprites = new Sprites("aucun", "aucun");
        Talents talents = new Talents("aucun");
        Types types = new Types("aucun");
        Name name = new Name("MyAss", "MonFion", "Kaneki");
        Pokemon pokemon = new Pokemon("none", formes, 1, name, 1, sprites, talents, types);
    }
}
