package com.co.certification.automatizacion.choucair.task;

import com.co.certification.automatizacion.choucair.model.DataJobChoucair;
import com.co.certification.automatizacion.choucair.userinterface.SearchJopPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchForaJob implements Task {

    private List<DataJobChoucair> dataJobChoucair ;

    public SearchForaJob(List<DataJobChoucair> dataJobChoucair) {
        this.dataJobChoucair = dataJobChoucair;
    }

    public static SearchForaJob onThePage(List<DataJobChoucair> dataJobChoucair ) {
        return Tasks.instrumented(SearchForaJob.class, dataJobChoucair);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
        Enter.theValue(dataJobChoucair.get(0).getKeywords()).into(SearchJopPage.KEYWORDS).thenHit(Keys.ENTER),
        Enter.theValue(dataJobChoucair.get(0).getLocations()).into(SearchJopPage.LOCATIONS).thenHit(Keys.ENTER),
                Click.on(SearchJopPage.SEARCH_JOBS),
                WaitUntil.the(SearchJopPage.SELECT_JOBS, isVisible()).forNoMoreThan(10).seconds(),
        Click.on(SearchJopPage.SELECT_JOBS)
        );
    }
}
