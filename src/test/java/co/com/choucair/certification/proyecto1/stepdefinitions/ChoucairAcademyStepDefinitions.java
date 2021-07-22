package co.com.choucair.certification.proyecto1.stepdefinitions;
import co.com.choucair.certification.proyecto1.questions.Answer;
import co.com.choucair.certification.proyecto1.tasks.Login;
import co.com.choucair.certification.proyecto1.tasks.OpenUp;
import co.com.choucair.certification.proyecto1.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

@Before
public void setStage(){
    OnStage.setTheStage(new OnlineCast());
}

    @Given("^than Cindy wants to learn automation at the academy Choucair$")
    public void thanCindyWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Cindy").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^she search for the course(.*) Recursos Automatizacion Bancolombia on the Chaucair academy platform$")
    public void sheSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChaucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^she finds the course called recursos(.*)$")
    public void sheFindsTheCourseCalledRecursosAutomatizacionBancolombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
