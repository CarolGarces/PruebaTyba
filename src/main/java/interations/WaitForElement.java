package interations;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class WaitForElement implements Interaction {

    private final Target ELEMENT;
    private final int TIMEOUT;

    public WaitForElement(Target ELEMENT, int TIMEOUT) {
        this.ELEMENT = ELEMENT;
        this.TIMEOUT = TIMEOUT;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ELEMENT, WebElementStateMatchers.isVisible()).forNoMoreThan(TIMEOUT).seconds(),
                WaitUntil.the(ELEMENT, WebElementStateMatchers.isClickable()).forNoMoreThan(TIMEOUT).seconds()
        );
    }

    public static Performable byTime(Target element, int timeout){
        return Instrumented.instanceOf(WaitForElement.class).withProperties(element,timeout);
    }
}
