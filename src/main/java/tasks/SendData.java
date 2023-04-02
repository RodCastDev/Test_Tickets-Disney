package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import userInterfaces.HomePage;

public class SendData implements Task {


    private String fecha;
    private String dias;
    private String adultos;
    private String ninos;

    public SendData(String fecha, String dias, String adultos, String ninos) {
        this.fecha = fecha;
        this.dias = dias;
        this.adultos = adultos;
        this.ninos = ninos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(HomePage.SendDate));
        actor.attemptsTo(new SendKeysIntoTarget(HomePage.SendDate, fecha));
        actor.attemptsTo(Clear.field(HomePage.SendDays));
        actor.attemptsTo(new SendKeysIntoTarget(HomePage.SendDays, dias));
        actor.attemptsTo(Clear.field(HomePage.SendAdultos));
        actor.attemptsTo(new SendKeysIntoTarget(HomePage.SendAdultos, adultos));
        actor.attemptsTo(Clear.field(HomePage.Sendchildren));
        actor.attemptsTo(new SendKeysIntoTarget(HomePage.Sendchildren, ninos));

        actor.attemptsTo(Click.on(HomePage.ButtonSearch));
    }

    public static SendData addData(String fecha, String dias,
                                   String adultos, String ninos){
        return Tasks.instrumented(SendData.class, fecha,dias,adultos,ninos);
    }
}
