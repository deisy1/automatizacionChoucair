package com.co.certification.automatizacion.choucair.task;

import com.co.certification.automatizacion.choucair.model.DataJobChoucair;
import com.co.certification.automatizacion.choucair.userinterface.ApplyJobPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

public class ApplyJob implements Task {
    private List<DataJobChoucair> dataJobChoucair;

    public ApplyJob(List<DataJobChoucair> dataJobChoucair) {
        this.dataJobChoucair = dataJobChoucair;
    }

    public static ApplyJob onThePage(List<DataJobChoucair> dataJobChoucair) {
        return Tasks.instrumented(ApplyJob.class, dataJobChoucair);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ApplyJobPage.APPLY_JOB).andAlignToBottom(),
                Click.on(ApplyJobPage.APPLY_JOB),
                Enter.theValue(dataJobChoucair.get(0).getNombre()).into(ApplyJobPage.NOMBRE_COMPLETO),
                Enter.theValue(dataJobChoucair.get(0).getCorreo()).into(ApplyJobPage.CORREO_ELECTRONICO),
                Enter.theValue(dataJobChoucair.get(0).getCelular()).into(ApplyJobPage.CELULAR),
                Enter.theValue(dataJobChoucair.get(0).getEstudios()).into(ApplyJobPage.ESTUDIOS),
                Enter.theValue(dataJobChoucair.get(0).getExperiencia()).into(ApplyJobPage.EXPERENCIA),
                Enter.theValue(dataJobChoucair.get(0).getAutomatizacion()).into(ApplyJobPage.AUTOMATIZACION),
                Enter.theValue(dataJobChoucair.get(0).getSalarial()).into(ApplyJobPage.SALARIAL),
                Enter.theValue(dataJobChoucair.get(0).getDisponibilidad()).into(ApplyJobPage.DISPONIBILIDAD),
                Enter.theValue(dataJobChoucair.get(0).getMensaje()).into(ApplyJobPage.MENSAJE),
                Click.on(ApplyJobPage.SEND_APPLICATION)
        );
    }
}
