package ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {
    public static final Target BTN_USER = Target.the("Boton User").locatedBy("//*[@id='hrefUserIcon']");
    public static final Target BTN_CREATE_NEW_ACCOUNT = Target.the("Boton crear nueva cuenta").locatedBy("//*[text()='CREATE NEW ACCOUNT']");


}
