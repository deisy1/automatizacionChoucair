package com.co.certification.automatizacion.choucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchJopPage {
    public static final Target KEYWORDS = Target.the("The user intro date").located(By.id("search_keywords"));
    public static final Target LOCATIONS = Target.the("the user intro date").located(By.id("search_location"));
    public static final Target SEARCH_JOBS = Target.the("The User click on button").located(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/form/div[1]/div[4]/input"));
    public static final  Target SELECT_JOBS = Target.the("The user select Jobs").located(By.xpath("//h3[contains(text(), 'Analista de Pruebas')]"));
}
