package com.automationpractice.UserInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroPage {


    public static final Target TXT_CORREO = Target.the("ingresar correo").
            located(By.xpath("//input[@id='email_create']"));

    public static final Target BTN_CREAR_CUENTA= Target.the("ingresar correo").
            located(By.xpath("//button[@id='SubmitCreate']"));

    public static final Target RDT_GENERO= Target.the("seleccionar genrero mrs").
            located(By.xpath("//div[@id='uniform-id_gender2']"));

    public static final Target TXT_PRIMER_NOMBRE= Target.the("ingresar primer nombre ").
            located(By.xpath("']//input[@name='customer_firstname"));

    public static final Target TXT_APELLIDO= Target.the("ingresar apellido").
            located(By.xpath("//input[@id='customer_lastname']"));

    public static final Target TXT_EMAIL= Target.the("ingresar el email del usuario").
            located(By.xpath("//input[@id='email']"));

    public static final Target TXT_CONTRASENA= Target.the("ingresar contrasena").
            located(By.xpath("//input[@id='passwd']"));

 public static final Target LIST_DIA_NACIMIENTO= Target.the("ingresar fecha de nacimiento dia").
            located(By.id("days"));

    public static final Target LIST_MES_NACIMIENTO= Target.the("ingresar fecha de nacimiento mes").
            located(By.xpath("//select[@id='months']"));

    public static final Target LIST_ANIO_NACIMIENTO= Target.the("ingresar fecha de nacimiento anio").
            located(By.xpath("//select[@id='years']"));

    public static final Target RDT_RECIBE_OFERTA= Target.the("click en el boton recibir oferta").
            located(By.xpath("//input[@id='optin']"));

    public static final Target TXT_NOMBRE_USUARIO= Target.the("ingresar nombre del usuario").
            located(By.xpath("//input[@id='firstname']"));

    public static final Target TXT_APELLIDO_USUARIO= Target.the("ingresar apellido del usuario").
            located(By.xpath("//input[@id='lastname']"));


    public static final Target TXT_COMPANIA= Target.the("ingresar la compañia del usuario").
            located(By.xpath("//input[@id='company']"));


    public static final Target TXT_DIRECCION_= Target.the("ingresar la compañia del usuario").
            located(By.xpath("//input[@id='address1']"));

    public static final Target TXT_SEGUNDA_DIRECCION_= Target.the("ingresar la compañia del usuario").
            located(By.xpath("//input[@id='address2']"));

    public static final Target TXT_CIUDAD= Target.the("ingresar la ciudad").
            located(By.xpath("//input[@id='city']"));


    public static final Target TXT_ESTADO= Target.the("seleccione ciudad").
            located(By.xpath("//select[@id='id_state']"));

    public static final Target TXT_CODIGO_POSTAL= Target.the("seleccione ciudad").
            located(By.xpath("//input[@id='postcode']"));

   // public static final Target TXT_PAIS= Target.the("seleccione ciudad").
           // located(By.xpath("//*[@id=\"id_country\"]"));

    public static final Target TXT_INFORMACION_PERSONAL= Target.the("seleccione ciudad").
            located(By.xpath("//textarea[@id='other']"));

    public static final Target TXT_TELEFONO_CASA= Target.the("seleccione ciudad").
            located(By.xpath("//input[@id='phone']"));

    public static final Target TXT_TELEFONO_MOVIL= Target.the("seleccione ciudad").
            located(By.xpath("//input[@id='phone_mobile']"));

    public static final Target TXT_ALIAS_DIRECCIONES= Target.the("seleccione ciudad").
            located(By.xpath("//input[@id='alias']"));

    public static final Target  BTN_REGISTRO= Target.the("seleccione ciudad").
            located(By.xpath("//button[@id='submitAccount']"));

}
