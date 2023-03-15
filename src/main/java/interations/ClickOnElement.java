package interations;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ClickOnElement implements Interaction {

    private final Target ELEMENT;
    private final int TIMEOUT;

    public ClickOnElement(Target ELEMENT, int TIMEOUT) {
        this.ELEMENT = ELEMENT;
        this.TIMEOUT = TIMEOUT;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitForElement.byTime(ELEMENT,TIMEOUT),
                JavaScriptClick.on(ELEMENT)
        );
    }

    public static Performable byTime(Target element, int timeout){
        return Instrumented.instanceOf(ClickOnElement.class).withProperties(element,timeout);
    }


}
