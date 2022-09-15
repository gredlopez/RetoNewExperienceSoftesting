package com.automationpractice.Runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registro.feature",
        glue = "com.automationpractice.StepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RegistroRunner {
}
