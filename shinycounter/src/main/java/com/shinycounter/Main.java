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
         Pokedex pokedex = RemotePokedexLoader.loadFromUrl();

        if (pokedex != null) {
            System.out.println("Pokédex chargé depuis le serveur !");
        } else {
            System.out.println("Échec du chargement du Pokédex");
        }

        PokedexWriter.writeToFile(pokedex);
    }
}
