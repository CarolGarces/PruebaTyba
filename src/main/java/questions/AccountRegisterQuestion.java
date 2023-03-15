package questions;

import interations.WaitForElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.RegisterOkUI;

public class AccountRegisterQuestion implements Question<String>{


    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitForElement.byTime(RegisterOkUI.LBL_USER_CREATE, 30)
        );
        return RegisterOkUI.LBL_USER_CREATE.resolveFor(actor).getText();

    }

    public static AccountRegisterQuestion getText() {
        return new AccountRegisterQuestion();
    }

}
