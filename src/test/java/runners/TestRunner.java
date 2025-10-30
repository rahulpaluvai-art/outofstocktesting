package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;

@CucumberOptions(
        features = "./src/test/resources/features/Krasida/KrasidaCases.feature",
        glue = "stepDefs",
        tags = "@TC:_Krasida_8_to_15 or @TC:_Krasida_16_To_22",
        monochrome = true,
        plugin = {"pretty", "html: CucumberHTMLReport.html","json: CucumberJSONReport.json","junit: CucumberJSONReport.xml"},
        publish = true,
        dryRun = false
)

public class TestRunner extends AbstractTestNGCucumberTests
{
    @DataProvider(parallel = false)
    public Object[][] scenarios()
    {
        return super.scenarios();
    }
}
