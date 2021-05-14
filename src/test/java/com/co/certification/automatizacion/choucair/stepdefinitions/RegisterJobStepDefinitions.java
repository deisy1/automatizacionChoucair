package com.co.certification.automatizacion.choucair.stepdefinitions;

import com.co.certification.automatizacion.choucair.model.DataJobChoucair;
import com.co.certification.automatizacion.choucair.questions.VerificationJob;
import com.co.certification.automatizacion.choucair.task.ApplyJob;
import com.co.certification.automatizacion.choucair.task.OpenUp;
import com.co.certification.automatizacion.choucair.task.SearchForaJob;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class RegisterJobStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^the user enters the portal choucair$")
    public void the_user_enters_the_portal_choucair() {

        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage());
    }

    @When("^the user applies a job offer$")
    public void the_user_applies_a_job_offer(List<DataJobChoucair> dataJobChoucair) {
        OnStage.theActorCalled("user").attemptsTo(
                SearchForaJob.onThePage(dataJobChoucair),
                ApplyJob.onThePage(dataJobChoucair)
        );

    }

    @Then("^successful registration verification$")
    public void successful_registration_verification(List<DataJobChoucair> dataJobChoucair) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificationJob.onThePage(dataJobChoucair.get(0).getVerificacion())));

    }
}
