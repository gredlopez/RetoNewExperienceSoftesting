package com.automationpractice.Taks;

import static com.automationpractice.UserInterface.RegistroPage.*;

import com.automationpractice.UserInterface.RegistroPage;
import com.automationpractice.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.apache.batik.swing.JSVGCanvas;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class Registro implements Task {
    Datos datos = new Datos();
    static final String NOMBRE_EXCEL = "DatosNuevaExperiencia.xlsx";
    private static final String HOJA_EXCEL = "Registro";


    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 0)).into(TXT_CORREO),
                    Click.on (BTN_CREAR_CUENTA),
                    Click.on(RDT_GENERO),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 1)).into(TXT_PRIMER_NOMBRE),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 2)).into(TXT_APELLIDO),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 3)).into(TXT_EMAIL),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 4)).into(TXT_CONTRASENA),
                    SelectFromOptions.byVisibleText(datos.leerDatosExcel(NOMBRE_EXCEL,HOJA_EXCEL , 1, 5)).from(LIST_DIA_NACIMIENTO),
                    SelectFromOptions.byVisibleText(datos.leerDatosExcel(NOMBRE_EXCEL,HOJA_EXCEL , 1, 6)).from(LIST_MES_NACIMIENTO),
                    SelectFromOptions.byVisibleText(datos.leerDatosExcel(NOMBRE_EXCEL,HOJA_EXCEL , 1, 7)).from(LIST_ANIO_NACIMIENTO),
                     Click.on(RDT_RECIBE_OFERTA),
                    Scroll.to(RDT_RECIBE_OFERTA),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 8)).into(TXT_NOMBRE_USUARIO),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 9)).into(TXT_APELLIDO_USUARIO),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 10)).into(TXT_COMPANIA),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 11)).into(TXT_DIRECCION_),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 12)).into(TXT_SEGUNDA_DIRECCION_),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 13)).into(TXT_CIUDAD),
                    Scroll.to(TXT_ESTADO),
                    SelectFromOptions.byVisibleText(datos.leerDatosExcel(NOMBRE_EXCEL,HOJA_EXCEL , 1, 14)).from(TXT_ESTADO),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 15)).into(TXT_CODIGO_POSTAL),
                   // SelectFromOptions.byVisibleText(datos.leerDatosExcel(NOMBRE_EXCEL,HOJA_EXCEL , 1, 16)).from(TXT_PAIS),
                    Scroll.to(TXT_INFORMACION_PERSONAL),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 16)).into(TXT_INFORMACION_PERSONAL),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 19)).into(TXT_TELEFONO_CASA),
                    Scroll.to(TXT_TELEFONO_CASA),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 20)).into(TXT_TELEFONO_MOVIL),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 21)).into(TXT_ALIAS_DIRECCIONES),
                    Click.on (BTN_REGISTRO)


















            );


        }catch (Exception  e){
            e.printStackTrace();
        }
    }
    public static Registro registrarse () { //para utilizar el metodo performan debemos utilizar una instancia dentro de ella instrumend para utilizar esa instancia de la super clase
        return instrumented(Registro.class); // lo que hacemos aqui es sustituir la clase padre por la hija me va a retornar lo de la clase logn
    }

}
