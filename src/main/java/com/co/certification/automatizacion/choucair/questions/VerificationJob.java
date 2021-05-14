package com.co.certification.automatizacion.choucair.questions;

import com.co.certification.automatizacion.choucair.userinterface.ApplyJobPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificationJob implements Question <Boolean> {
    private String verificacion;

    public VerificationJob(String verificacion) {
        this.verificacion = verificacion;
    }

    public static VerificationJob onThePage(String verificacion) {
        return new VerificationJob(verificacion);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean  result;
        String verification_job = Text.of(ApplyJobPage.LABEL_VERIFICATION).viewedBy(actor).asString();
        return verificacion.equals(verification_job);
    }
}
