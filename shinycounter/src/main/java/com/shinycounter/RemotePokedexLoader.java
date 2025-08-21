package com.shinycounter;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RemotePokedexLoader {
    public static Pokedex loadFromUrl() {
        try {
            // Création du client HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://tyradex.vercel.app/api/v1/pokemon"))
                    .header("User-Agent", "RobotPokemon")
                    .header("From", "venomcorpttv@gmail.com")
                    .header("Content-type", "application/json")
                    .build();

            // Envoi de la requête GET
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Récupération du JSON en String
            String json = response.body();

            // Parsing JSON → Liste de Pokémon
            ObjectMapper mapper = new ObjectMapper();
            List<Pokemon> pokemonList = mapper.readValue(json, new TypeReference<List<Pokemon>>() {
            });

            // Construction du Pokédex
            Pokedex pokedex = new Pokedex();
            for (Pokemon p : pokemonList) {
                if (p.getPokedexId() > 0) {
                    if (p.getFormes() != null) {
                        for (Formes forme : p.getFormes()) {
                            HttpRequest requestForme = HttpRequest.newBuilder()
                                    .uri(URI.create(
                                            "https://tyradex.vercel.app/api/v1/pokemon/" + p.getPokedexId() + "/"
                                                    + forme.getRegion()))
                                    .header("User-Agent", "RobotPokemon")
                                    .header("From", "venomcorpttv@gmail.com")
                                    .header("Content-type", "application/json")
                                    .build();

                            HttpResponse<String> responseForme = client.send(requestForme,
                                    HttpResponse.BodyHandlers.ofString());

                            String jsonForme = responseForme.body();

                            ObjectMapper mapperForme = new ObjectMapper();
                            Pokemon newForme = mapperForme.readValue(jsonForme, new TypeReference<Pokemon>() {

                            });

                            pokedex.addPokemon(newForme);
                        }
                    }
                    pokedex.addPokemon(p);
                }
            }

            return pokedex;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
