package com.shinycounter;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

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
        //Formes formes = new Formes("aucune");
        //Sprites sprites = new Sprites("aucun", "aucun");
        //Talents talents = new Talents("aucun");
        //Types types = new Types("aucun");
        //Name name = new Name("MyAss", "MonFion", "Kaneki");
        //Pokemon pokemon = new Pokemon("none", formes, 666, name, 666, sprites, talents, types, true);

        HttpClient client = HttpClient.newHttpClient();

        try {
            HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://tyradex.app/api/v1/pokemon"))
                    .header("User-Agent", "RobotPokemon").header("From", "venomcorpttv@gmail.com")
                    .header("Content-type", "application/json").GET().build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            Pokedex listePokemon = objectMapper.readValue(json, Pokedex.class);

            try {
                FileWriter monWriter = new FileWriter("test.json");
                ObjectWriter pokemonWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
                String pokemonJSON = pokemonWriter.writeValueAsString(listePokemon);
                monWriter.write(pokemonJSON);
                monWriter.close();
            } catch (IOException e) {
                System.out.println("Erreur");
                e.printStackTrace();
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
