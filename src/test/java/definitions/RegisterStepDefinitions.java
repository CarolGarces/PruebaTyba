package definitions;

import interations.ClickOnElement;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.AccountRegisterQuestion;
import tasks.RegisterAccount;
import ui.HomeUI;
import utils.PropertiesUtils;

import java.util.List;

public class RegisterStepDefinitions {

    @Dado("que el usuario ingresa al portal AdvantageDemo")
    public void queElUsuarioIngresaAlPortalAdvantageDemo() {
        OnStage.setTheStage(new OnlineCast());
        String url = PropertiesUtils.getProperty("url");
        OnStage.theActorCalled("Usurio").attemptsTo(
                Open.url(url)
        );
    }

    @Dado("requiere realizar un registro")
    public void requiereRealizarUnRegistro() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ClickOnElement.byTime(HomeUI.BTN_USER, 30),
                ClickOnElement.byTime(HomeUI.BTN_CREATE_NEW_ACCOUNT, 30)
        );
    }
    @Cuando("diligencia los campos obligatorios de registro")
    public void diligenciaLosCamposObligatoriosDeRegistro(DataTable dataTable) {
        List<String> dataFeature = dataTable.values();
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegisterAccount.withData(dataFeature.get(0), dataFeature.get(1), dataFeature.get(2))
        );
    }
    @Entonces("^se debe registrar exitosamente (.*)$")
    public void seDebeRegistrarExitosamente(String userName) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("Titulo de cuenta registrada", AccountRegisterQuestion.getText(), Matchers.equalTo(userName))
        );
    }

}
