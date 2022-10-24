package co.com.choucair.Reto_tecnico_Analista_Financial.stepdefinitions;
import co.com.choucair.Reto_tecnico_Analista_Financial.model.FormData;
import co.com.choucair.Reto_tecnico_Analista_Financial.questions.Answer;
import co.com.choucair.Reto_tecnico_Analista_Financial.tasks.Fill;
import co.com.choucair.Reto_tecnico_Analista_Financial.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class AutomatizationUtestStepDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^that Juan wants to register on the Utest page$")
    public void thatJuanWantsToRegisterOnTheUtestPage() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage());
    }

    @When("^he fills the registry form with his data$")
    public void heFillsTheRegistryFormWithHisData(List<FormData> formData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.theForm(formData.get(0).getStrFname(), formData.get(0).getStrLname(), formData.get(0).getStrEmail(), formData.get(0).getStrLanguage(), formData.get(0).getStrCity(), formData.get(0).getStrZip(), formData.get(0).getStrCountry(), formData.get(0).getStrComputer(), formData.get(0).getStrVersion(), formData.get(0).getStrClanguage(), formData.get(0).getStrMobile(), formData.get(0).getStrMobilem(), formData.get(0).getStrMobilev(), formData.get(0).getStrPassword()));
    }

    @Then("^he creates his new account successfully$")
    public void heCreatesHisNewAccountSuccessfully(List<FormData> formData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(formData.get(0).getStrEmail(), formData.get(0).getStrPassword(), formData.get(0).getStrValidation())));
    }

}
