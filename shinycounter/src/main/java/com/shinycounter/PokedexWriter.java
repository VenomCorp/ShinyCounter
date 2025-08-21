package com.shinycounter;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class PokedexWriter {
    public static void writeToFile(Pokedex pokedex) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            // Pour avoir un JSON lisible avec indentation
            mapper.enable(SerializationFeature.INDENT_OUTPUT);

            // Écriture du Pokédex complet dans le fichier
            mapper.writeValue(new File("pokedex.json"), pokedex.getPokemons());

            System.out.println("✅ Pokédex écrit correctement");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
