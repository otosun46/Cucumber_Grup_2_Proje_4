/**
 * @Author:Otosun Tarih :31/10/2020
 */
package StepDefinations;

import Pages.NavbarContent;
import Pages.TemplateContent;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HumanResourcesStepdefs {
    TemplateContent templateContent=new TemplateContent();
    NavbarContent navbarContent=new NavbarContent();

    @Given("^Navigate to Position Salary page$")
    public void navigateToPositionSalaryPage() {
        navbarContent.findElementAndClickFunction("humanResources");
        navbarContent.findElementAndClickFunction("hR_Setup");
        navbarContent.findElementAndClickFunction("positionSalary");
    }

    @When("^Create a position salary as \"([^\"]*)\"$")
    public void createAPositionSalaryAs(String arg0) {
        templateContent.findElementAndClickFunction("addButton");
        templateContent.findElementAndSendKeysFunction("poSaName",arg0);
        templateContent.findElementAndClickFunction("saveButton");
    }

    @Then("^Success message shuld be diplayed$")
    public void successMessageShuldBeDiplayed() {
        templateContent.findElementAndVerifyContainsText("msjContainer","successfully");
    }

    @When("^Edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void editTheTo(String arg0, String arg1){
        templateContent.findElementAndSendKeysFunction("poSaSearchName", arg0);
        templateContent.findElementAndClickFunction("searchButton");

        templateContent.editAndDeleteFunction(arg0, "edit");

        templateContent.findElementAndSendKeysFunction("poSaName", arg1);
        templateContent.findElementAndClickFunction("saveButton");
    }

    @When("^Delete the \"([^\"]*)\"$")
    public void deleteThe(String arg0) {
        templateContent.findElementAndSendKeysFunction("poSaSearchName", arg0);
        templateContent.findElementAndClickFunction("searchButton");

        templateContent.editAndDeleteFunction(arg0, "delete");
        templateContent.findElementAndClickFunction("yesButton");

    }


}
