package ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterUI {

    public static final Target LBL_CREATE_ACCOUNT = Target.the("Texto crear cuenta").locatedBy("//h3[text()='CREATE ACCOUNT']");
    public static final Target INPUT_USER_NAME  = Target.the("Input nombre de usuario.").locatedBy("//input[@name='usernameRegisterPage']");
    public static final Target INPUT_EMAIL = Target.the("Input email").locatedBy("//input[@name='emailRegisterPage']");
    public static final Target INPUT_PASSWORD = Target.the("Input contraseña").locatedBy("//input[@name='passwordRegisterPage']");
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Input confirmar contraseña").locatedBy("//input[@name='confirm_passwordRegisterPage']");
    public static final Target INPUT_T_Y_C = Target.the("Check terminos y condiciones").locatedBy("//input[@name='i_agree']");
    public static final Target BTN_REGISTER = Target.the("Boton registrar").locatedBy("//button[@id='register_btnundefined']");

}
