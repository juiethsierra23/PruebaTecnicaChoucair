package co.com.choucair.certification.proyecto1.runners;


import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features="src/test/resources/features/academyChoucair.feature",
        tags="@stories",
        glue="co.com.choucair.certification.proyecto1.stepdefinitions",
        snippets=SnippetType.CAMELCASE)
public class RunnerTags {
}
