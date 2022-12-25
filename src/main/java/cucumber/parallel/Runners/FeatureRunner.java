package cucumber.parallel.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
            tags = "",
            features = {"src/test/resources/features"},
            glue = {"cucumber.parallel.stepdefs"},
            monochrome = true,
            plugin = {"pretty", "html:target/cucumber-reports.html"}
    )

    public class FeatureRunner extends AbstractTestNGCucumberTests {
        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
            return super.scenarios();
        }


    }

