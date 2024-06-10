package com.playrightTest.definition;

import com.playrightTest.steps.PokeApiSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import static com.playrightTest.utils.SimDatadriven.POKEMON_NAME;

public class PokeApiDefinition {

    @Steps
    PokeApiSteps pokeSteps;

    @Given("se prepara el request a PokeApi")
    public void prepararRequest() {pokeSteps.prepararRequest();}

    @Given("se consulta un pokemon exitosamente")
    public void consultaPokemon() {
        pokeSteps.getPokemon(POKEMON_NAME);
    }

    @When("se recibe un response con codigo 200")
    public void validarCodigo() {
        pokeSteps.validarCodigo(200);
    }

    @Then("debe coincidir el nombre con el pokemon solicitado")
    public void validarResponse() {
        pokeSteps.validarNombrePokemon(POKEMON_NAME);
    }

}
