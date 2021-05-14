package com.co.certification.automatizacion.choucair.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.choucairtesting.com/")
public class ChoucairPage extends PageObject {
   public static final  Target JOB = Target.the("User click Button Job").located(By.xpath("//a[contains(text(),'Empleos')]"));
   public static final  Target COOKIES = Target.the("User accept Cookies").located(By.id("cookie_action_close_header"));
}
