package com.automationpractice.StepDefinitions;

import com.automationpractice.UserInterface.PaginaPrincipalPage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import com.automationpractice.Taks.PaginaPrincipal;
import com.automationpractice.Taks.Registro;
import com.automationpractice.Questions.ValidacionRegistro;
import org.hamcrest.Matchers;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;



public class RegistroStepDefinitions {

    @Managed(driver ="Chrome")
    private WebDriver navegador;
    private Actor gregoria = Actor.named("gregoria");
    PaginaPrincipalPage paginaPrincipalPage = new PaginaPrincipalPage();

    @Before
    public void  configuracion() {
        gregoria.can(BrowseTheWeb.with(navegador));

    }

    @Dado("que el usuario se encuentre en la pagina web")
    public void queElUsuarioSeEncuentreEnLaPaginaWeb() {
        gregoria.attemptsTo(Open.browserOn(paginaPrincipalPage));
         gregoria.attemptsTo(PaginaPrincipal.informacion());


        }


    @Cuando("el ingrese los datos de registro")
    public void elIngreseLosDatosDeRegistro() {
        gregoria.attemptsTo(Registro.registrarse());

    }

    @Entonces("el usuario visualizara su cuenta creada.")
    public void elUsuarioVisualizaraSuCuentaCreada() {
            gregoria.should(seeThat( "el actor puede ver ", ValidacionRegistro.validar(), Matchers.equalTo(true)));

    }



}
