package StepDefinations;

import Pages.TemplateContent;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _03_CountryCreateandDelete {

    TemplateContent templateContent = new TemplateContent();

    @When("^Click Setup/Parameters/Countries$")
    public void clickSetupParametersCountries() {

        templateContent.findElementAndClickFunction("setupOne");
        templateContent.findElementAndClickFunction("parameters");
        templateContent.findElementAndClickFunction("Countries");


    }

    @And("^Create a country name as \"([^\"]*)\" and code as \"([^\"]*)\"$")
    public void createACountryNameAsAndCodeAs(String ulke, String code) {
        templateContent.findElementAndClickFunction("countryAdd");
        templateContent.findElementAndSendKeysFunction("countryAddName", ulke);
        templateContent.findElementAndSendKeysFunction("countryAddCode", code);
        templateContent.findElementAndClickFunction("saveButton");
    }

    @Then("^Success message should be displayed$")
    public void successMessageShouldBeDisplayed() {
        templateContent.findElementAndVerifyContainsText("msjContainer", "successfully");

    }

    @When("^Delete \"([^\"]*)\" country$")
    public void deleteCountry(String ulke) {

        templateContent.findElementAndClickFunction("setupOne");
        templateContent.findElementAndClickFunction("parameters");
        templateContent.findElementAndClickFunction("Countries");

        templateContent.findElementAndSendKeysFunction("searchNameInput", ulke);
        templateContent.findElementAndClickFunction("searchButton");
        templateContent.findElementAndClickFunction("deleteButton");
        templateContent.findElementAndClickFunction("yesButton");
        templateContent.findElementAndVerifyContainsText("msjContainer", "successfully");

    }



}
