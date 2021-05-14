package com.co.certification.automatizacion.choucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ApplyJobPage {
    public static final Target APPLY_JOB = Target.the("User  Click Buttton").located(By.xpath("//*[contains(@value, 'Apply for job')]"));
    public static final Target NOMBRE_COMPLETO = Target.the("User  Click Buttton").located(By.id("nombre-completo"));
    public static final Target CORREO_ELECTRONICO = Target.the("User  Click Buttton").located(By.id("correo-electronico"));
    public static final Target CELULAR = Target.the("User  Click Buttton").located(By.id("celular-o-telefono-de-contacto"));
    public static final Target ESTUDIOS = Target.the("User  Click Buttton").located(By.id("que-estudios-formales-tienes-o-en-que-semestre-te-encuentras-actualmente"));
    public static final Target EXPERENCIA = Target.the("User  Click Buttton").located(By.id("que-tiempo-de-experiencia-certificada-tienes-en-pruebas-o-en-desarrollo-de-softwaresi-aplica"));
    public static final Target AUTOMATIZACION = Target.the("User  Click Buttton").located(By.id("conoces-de-automatizacion-de-pruebas-te-gustaria-aprendersi-aplica"));
    public static final Target SALARIAL = Target.the("User  Click Buttton").located(By.id("cual-es-tu-aspiracion-salarial"));
    public static final Target DISPONIBILIDAD = Target.the("User  Click Buttton").located(By.id("si-eres-seleccionado-que-disponibilidad-de-tiempo-para-ingresar-tendrias"));
    public static final Target MENSAJE = Target.the("User  Click Buttton").located(By.id("mensaje-adicional"));
    public static final Target SEND_APPLICATION = Target.the("User  Click Buttton").located(By.xpath("//*[@id=\"post-7547\"]/div/div[2]/div[3]/div/form/p/input[1]"));
    public static final Target LABEL_VERIFICATION = Target.the("User verification ").located(By.xpath(""));

}

