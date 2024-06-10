package com.playrightTest.steps;

import com.playrightTest.pages.PokeApiPage;
import net.serenitybdd.annotations.Step;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import static com.playrightTest.utils.SimDatadriven.POKEMON_NAME;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PokeApiSteps {

    private int statusCode;
    private String pokemonName;

    PokeApiPage pokeApiPage = new PokeApiPage();

    @Step
    public void prepararRequest(){
        pokeApiPage.prepararRequest();
    }

    @Step
    public void getPokemon(String nombre) {
        var response = pokeApiPage.consultarPokemon(nombre);
        statusCode = response.status();
        pokemonName = pokeApiPage.getNombre(response);
    }

    @Step
    public void validarCodigo(int codigoEsperado) {
        assertEquals(codigoEsperado, statusCode);
    }

    @Step
    public void validarNombrePokemon(String nombreEsperado) {
        assertEquals(nombreEsperado, pokemonName);
        pokeApiPage.cerrarConexion();
    }
}