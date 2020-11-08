/**
 * @Author:Otosun Tarih :08/11/2020
 */
package StepDefinations;

import Pages.HumanResourcesContent;
import Pages.TemplateContent;
import Utilities.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class _09_LoginStepsdefs {
    WebDriver driver;
    TemplateContent templateContent = new TemplateContent();

    @Given("^Navigate to basqar webpage$")
    public void navigateToBasqarWebpage() {
        driver = Driver.getDriver();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^Enter username \"([^\"]*)\" and password \"([^\"]*)\" and click Login button$")
    public void enterUsernameAndPasswordAndClickLoginButton(String arg0, String arg1) {
        templateContent.findElementAndSendKeysFunction("username", arg0);
        templateContent.findElementAndSendKeysFunction("password", arg1);
        templateContent.findElementAndClickFunction("loginButton");
        if (templateContent.cookieConsent.isDisplayed()) {
            templateContent.findElementAndClickFunction("gotItBtn");
        }


    }

    @Then("^User must login successfully$")
    public void userMustLoginSuccessfully() {
        templateContent.findElementAndVerifyDisplayed("dashboard");
    }
}
