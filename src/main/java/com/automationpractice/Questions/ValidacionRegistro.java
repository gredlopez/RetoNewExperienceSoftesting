package com.automationpractice.Questions;

import com.automationpractice.UserInterface.ValidacionRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionRegistro implements Question {


        @Override
        public Boolean answeredBy(Actor actor) {

            return ValidacionRegistroPage.VISUALIZACION_CUENTA_CREADA .resolveFor(actor).isVisible();
        }
        public static Question validar(){
            return new ValidacionRegistro();
        }
}
