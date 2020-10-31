/**
 * @Author:Otosun Tarih :30/10/2020
 */
package StepDefinations;

import Pages.TemplateContent;
import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    WebDriver driver;
    TemplateContent templateContent=new TemplateContent();

    @Given("^Login$")
    public void login() {
        driver = Driver.getDriver();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        templateContent.findElementAndSendKeysFunction("username","daulet2030@gmail.com");
        templateContent.findElementAndSendKeysFunction("password","TechnoStudy123@");

        templateContent.findElementAndClickFunction("loginButton");

    }

    @And("^Navigate to Basqar$")
    public void navigateToBasqar() {

    }
}
