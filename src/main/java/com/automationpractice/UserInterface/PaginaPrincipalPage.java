package com.automationpractice.UserInterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;




@DefaultUrl("http://automationpractice.com/index.php")

public class PaginaPrincipalPage extends PageObject {

    public static final Target BTN_INICIAR_SESION= Target.the("ingresa la pagina para registrarse").
            located(By.xpath("//a[@class='login']"));


}
