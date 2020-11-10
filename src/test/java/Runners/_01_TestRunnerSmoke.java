/**
 * @Author:Otosun Tarih :09/11/2020
 */
package Runners;

import Utilities.Driver;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = {"@SmokeTest"},
        features = {"src/test/java/FeaturesFiles"},
        glue = {"StepDefinations"},
        dryRun = false,
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
                // to generate a extend report we need this plugin
        }
)
public class _01_TestRunnerSmoke extends AbstractTestNGCucumberTests {

}
