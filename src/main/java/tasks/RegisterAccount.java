package tasks;

import interations.ClickOnElement;
import interations.WaitForElement;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import ui.RegisterUI;

public class RegisterAccount implements Task {

    private String userName;
    private String email;
    private String password;

    public RegisterAccount(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitForElement.byTime(RegisterUI.LBL_CREATE_ACCOUNT, 30),
                Enter.theValue(userName).into(RegisterUI.INPUT_USER_NAME),
                Enter.theValue(email).into(RegisterUI.INPUT_EMAIL),
                Enter.theValue(password).into(RegisterUI.INPUT_PASSWORD),
                Enter.theValue(password).into(RegisterUI.INPUT_CONFIRM_PASSWORD),
                ClickOnElement.byTime(RegisterUI.INPUT_T_Y_C, 10),
                ClickOnElement.byTime(RegisterUI.BTN_REGISTER, 10)
        );
    }

    public static Performable withData(String userName, String email, String password){
        return Instrumented.instanceOf(RegisterAccount.class).withProperties(userName, email, password);
    }
}
