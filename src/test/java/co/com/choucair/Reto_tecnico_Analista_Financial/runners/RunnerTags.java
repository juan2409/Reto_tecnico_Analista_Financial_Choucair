package co.com.choucair.Reto_tecnico_Analista_Financial.runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/automatizationUtest.feature",
        tags = "@stories",
        glue = "co.com.choucair.Reto_tecnico_Analista_Financial.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
}
