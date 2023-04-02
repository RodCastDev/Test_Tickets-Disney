package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"steps","utils"},
        //tags = "not @ignore",
        //tags = "@run",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)
public class DestinoJet {
}
