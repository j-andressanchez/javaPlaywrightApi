package com.playrightTest.utils;

import com.microsoft.playwright.*;

import java.util.HashMap;
import java.util.Map;

import static com.playrightTest.utils.Constantes.POKEMON;

public class ApiClient {
    private static final String POKEAPI_BASE_URL = "https://pokeapi.co/api/v2/";
    private Playwright playwright;
    private APIRequestContext request;

    public void prepararRequest() {
        createPlaywright();
        createAPIRequestContext();
    }

    public void createPlaywright() {
        playwright = Playwright.create();
    }

    private void createAPIRequestContext() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Accept", "application/json");

        request = playwright.request().newContext(new APIRequest.NewContextOptions()
                .setBaseURL(POKEAPI_BASE_URL)
                .setExtraHTTPHeaders(headers));
    }

    public APIResponse getPokemonDetails(String pokemonName) {
        String endpoint = POKEMON + pokemonName;
        return sendGetRequest(endpoint);
    }

    private APIResponse sendGetRequest(String endpoint) {
        try {
            APIResponse response = request.get(endpoint);
            int statusCode = response.status();
            System.out.println("Status Code: " + statusCode);
            return response;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void close() {
        if (request != null) {
            request.dispose();
            request = null;
        }
        if (playwright != null) {
            playwright.close();
            playwright = null;
        }
    }
}
