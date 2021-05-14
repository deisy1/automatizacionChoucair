package com.co.certification.automatizacion.choucair.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registerjobchoucair.feature",
        tags = "@scenario1",
        glue = "com.co.certification.automatizacion.choucair.stepdefinitions"
)

public class RunnerTags {
}
