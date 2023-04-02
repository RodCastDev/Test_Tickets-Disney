package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenPage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.SelectOptions;
import org.hamcrest.Matchers;
import userInterfaces.HomePage;
import tasks.*;
import models.*;
import questions.*;
import userInterfaces.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

public class stepDefinitions {

    @Before
    public void setup() {
        setTheStage(new OnlineCast());

    }
    @Given("Deseo ir a la pagina DestinoJet")
    public void deseoIrALaPaginaDestinoJet() {
        System.out.println("Voy a abrir la pagina DestinoJet ");
        theActorCalled("Usuario").wasAbleTo(Open.browserOn(new HomePage()));
        System.out.println("Ya anbri la pagina DestinoJet");
    }

    @Given("Selecciono la opcion {string}")
    public void seleccionoLaOpcion(String option) {
        theActorInTheSpotlight().attemptsTo(SelectMenu.selectMenu(HomePage.SelectMenu));
    }

    @Given("Busco la disponivilidad del viaje con los datos")
    public void buscoLaDisponivilidadDelViajeConLosDatos(model_DataTicket DataTick) {
        theActorInTheSpotlight().attemptsTo(SendData.addData(DataTick.getFecha(),DataTick.getDias(), DataTick.getAdultos(),DataTick.getNinos()));
    }

    @Then("Valido la solicitud de viaje {string}")
    public void validoLaSolicitudDeViaje(String text) {
        theActorInTheSpotlight().should(seeThat(ValidateTicket.getText(HomePage.Resumtitle), Matchers.is(text)));
    }
}
