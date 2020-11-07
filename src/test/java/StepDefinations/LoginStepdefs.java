/**
 * @Author:Otosun Tarih :31/10/2020
 */
package StepDefinations;

import Pages.TemplateContent;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginStepdefs {
    WebDriver driver;
    TemplateContent templateContent=new TemplateContent();

    @Given("^Navigate to basqar$")
    public void navigateToBasqar() {
        driver = Driver.getDriver();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^Enter username and password and click Login button$")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        templateContent.findElementAndSendKeysFunction("username","daulet2030@gmail.com");
        templateContent.findElementAndSendKeysFunction("password","TechnoStudy123@");

        templateContent.findElementAndClickFunction("loginButton");

        if(templateContent.cookieConsent.isDisplayed()) {
            templateContent.findElementAndClickFunction("gotItBtn");
        }

    }

    @Then("^User should login successfully$")
    public void userShouldLoginSuccessfully() {
        templateContent.findElementAndVerifyDisplayed("dashboard");
    }
}
