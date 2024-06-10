package com.playrightTest.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.playrightTest.definition", "com.playrightTest.utils"},
        plugin = {"pretty"},
        tags = "@exitoso"
)
public class TestRunner {
}