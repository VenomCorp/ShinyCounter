package com.shinycounter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.FileUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
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
        // HttpClient client = HttpClient.newHttpClient();
        //
        // try {
        // HttpRequest request = HttpRequest.newBuilder().uri(new
        // URI("https://tyradex.app/api/v1/pokemon"))
        // .header("User-Agent", "RobotPokemon").header("From",
        // "venomcorpttv@gmail.com")
        // .header("Content-type", "application/json").GET().build();
        //
        // HttpResponse<String> response = client.send(request,
        // HttpResponse.BodyHandlers.ofString());
        // String json = response.body();
        // ObjectMapper objectMapper = new ObjectMapper();
        // objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
        // false);
        // Pokedex listePokemon = objectMapper.readValue(json, Pokedex.class);
        //
        // try {
        // FileWriter monWriter = new FileWriter("test.json");
        // ObjectWriter pokemonWriter = new
        // ObjectMapper().writer().withDefaultPrettyPrinter();
        // String pokemonJSON = pokemonWriter.writeValueAsString(listePokemon);
        // monWriter.write(pokemonJSON);
        // monWriter.close();
        // } catch (IOException e) {
        // System.out.println("Erreur");
        // e.printStackTrace();
        // }
        // } catch (URISyntaxException e) {
        // e.printStackTrace();
        // } catch (IOException e) {
        // e.printStackTrace();
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        //

        try {
            File bulbizarre = new File("bulbizarre.json");
            String data = FileUtils.readFileToString(bulbizarre, StandardCharsets.UTF_8.name());
            ObjectMapper objectMapper = new ObjectMapper();
            Pokemon bulbiPokemon = objectMapper.readValue(data, Pokemon.class);
            try {
                FileWriter monWriter = new FileWriter("test.json");
                ObjectWriter pokemonWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
                String pokemonJSON = pokemonWriter.writeValueAsString(bulbiPokemon);
                monWriter.write(pokemonJSON);
                monWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
