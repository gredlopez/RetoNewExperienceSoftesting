package com.automationpractice.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ValidacionRegistroPage {

    public static final Target VISUALIZACION_CUENTA_CREADA = Target.the("visualizacion bolsa de compra").
            located(By.xpath("(//font[.='Mi cuenta'])[3]"));
}
