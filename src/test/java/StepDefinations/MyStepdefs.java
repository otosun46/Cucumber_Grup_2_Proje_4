/**
 * @Author:Otosun Tarih :30/10/2020
 */
package StepDefinations;

import Pages.TemplateContent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class MyStepdefs {
    TemplateContent templateContent=new TemplateContent();

    @Given("^Login$")
    public void login() {
        templateContent.findElementAndSendKeysFunction("userName","username");

    }

    @And("^Navigate to Basqar$")
    public void navigateToBasqar() {

    }
}
