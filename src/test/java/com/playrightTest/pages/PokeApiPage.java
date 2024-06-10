package com.playrightTest.pages;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.Response;
import com.playrightTest.utils.ApiClient;

public class PokeApiPage {

    private ApiClient pokeAPIClient = new ApiClient();

    public void prepararRequest(){
        pokeAPIClient.prepararRequest();
    }

    public APIResponse consultarPokemon(String nombrePokemon) {
        return pokeAPIClient.getPokemonDetails(nombrePokemon);
    }

    public void cerrarConexion() {
        pokeAPIClient.close();
    }

    public String getNombre(APIResponse response){
        String responseBody = response.text();
        JsonObject jsonResponse = JsonParser.parseString(responseBody).getAsJsonObject();
        JsonArray formsArray = jsonResponse.getAsJsonArray("forms");
        JsonObject formObject = formsArray.get(0).getAsJsonObject();

        if (formObject.has("name")) {
            String pokemonName = formObject.get("name").getAsString();
            System.out.println("Nombre del Pokémon: " + pokemonName);
            return pokemonName;
        } else {
            System.out.println("No se encontró el nombre del Pokémon en la respuesta.");
            return null;
        }
    }

}
