package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import questions.CheckPdf;
import tasks.BuyDresses;
import tasks.Start;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitions {
    @Given("^adonis should perform a search on the mi gobierno page\\.$")
    public void adonis_should_perform_a_search_on_the_banistmo_page()  {
        theActorCalled("Adonis").wasAbleTo(Start.webSite());

    }


    @When("^he will search in cultura for the correct pdf to display\\.$")
    public void he_will_search_in_products_and_services_for_the_correct_pdf_to_display()  {
        theActorInTheSpotlight().attemptsTo(BuyDresses.WebSite());

    }

    @Then("^he will look for the contracts pdf and the correct one should be displayed (.*)$")
    public void he_will_look_for_the_contracts_pdf_and_the_correct_one_should_be_displayed(String texto)  {
        theActorInTheSpotlight().should(seeThat(CheckPdf.is(texto)));

    }
}


