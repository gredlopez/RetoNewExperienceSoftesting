package com.automationpractice.Taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.automationpractice.UserInterface.PaginaPrincipalPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;



public class PaginaPrincipal implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
           WaitUntil.the(BTN_INICIAR_SESION,isVisible()),
                    Click.on(BTN_INICIAR_SESION)
            );

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static PaginaPrincipal informacion () {
        return instrumented(PaginaPrincipal.class);    }

}
