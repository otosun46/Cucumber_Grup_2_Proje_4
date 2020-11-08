package StepDefinations;

import Pages.TemplateContent;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _04_CityCreateandDelete {

    TemplateContent templateContent = new TemplateContent();

    @When("^Click Setup/Parameters/Cities$")
    public void clickSetupParametersCities() {

        templateContent.findElementAndClickFunction("setupOne");
        templateContent.findElementAndClickFunction("parameters");
        templateContent.findElementAndClickFunction("Cities");

    }

    @And("^Create a city name as \"([^\"]*)\" and country name as \"([^\"]*)\" and code as \"([^\"]*)\"$")
    public void createACityNameAsAndCountryNameAsAndCodeAs(String city, String country, String code) {

        templateContent.findElementAndClickFunction("cityAdd");
        templateContent.findElementAndClickFunction("cityAdd2");
        templateContent.findElementAndSendKeysFunction("countryNameInput", country);
        templateContent.findElementAndSendKeysFunction("countryCodeInput", code);
        templateContent.findElementAndClickFunction("countrySaveButton");
        templateContent.findElementAndClickFunction("countryOfTheCity");
        templateContent.findElementAndSelectOption("countryOfTheCityDropDown", country);
        templateContent.findElementAndSendKeysFunction("cityAddName", city);
        templateContent.findElementAndClickFunction("citySaveButton");

    }

    @Then("^Success message should be displayed!$")
    public void successMessageShouldBeDisplayed() {

        templateContent.findElementAndVerifyContainsText("msjContainer", "successfully");
    }


    @When("^Delete \"([^\"]*)\" city$")
    public void deleteCity(String cityName) {

        templateContent.findElementAndClickFunction("setupOne");
        templateContent.findElementAndClickFunction("parameters");
        templateContent.findElementAndClickFunction("Cities");

        templateContent.findElementAndSendKeysFunction("searchNameInput", cityName);
        templateContent.findElementAndClickFunction("searchButton");
        templateContent.findElementAndClickFunction("deleteButton");
        templateContent.findElementAndClickFunction("yesButton");


    }


    @Then("^Success message should be_displayed\\.$")
    public void successMessageShouldBe_displayed() {
        templateContent.findElementAndVerifyContainsText("msjContainer", "successfully");
    }
}
