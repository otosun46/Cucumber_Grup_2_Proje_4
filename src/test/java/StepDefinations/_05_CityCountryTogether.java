package StepDefinations;

import Pages.TemplateContent;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _05_CityCountryTogether {

    TemplateContent templateContent = new TemplateContent();

    @Given("^Click Setup -> Parameters -> Countries$")
    public void clickSetupParametersCountries() {

        templateContent.findElementAndClickFunction("setupOne");
        templateContent.findElementAndClickFunction("parameters");
        templateContent.findElementAndClickFunction("Countries");

    }

    @And("^Create a country named \"([^\"]*)\" and coded as \"([^\"]*)\"$")
    public void createACountryNamedAndCodedAs(String ulke, String code){

        templateContent.findElementAndClickFunction("countryAdd");
        templateContent.findElementAndSendKeysFunction("countryAddName", ulke);
        templateContent.findElementAndSendKeysFunction("countryAddCode", code);
        templateContent.findElementAndClickFunction("saveButton");

    }

    @And("^Success message should be seen on the screen$")
    public void successMessageShouldBeSeenOnTheScreen() {
        templateContent.findElementAndVerifyContainsText("msjContainer", "successfully");
    }

    @When("^Click on Cities$")
    public void clickOnCities() {
        templateContent.findElementAndClickFunction("Cities");
    }

    @And("^Create a city name as \"([^\"]*)\" and country name as \"([^\"]*)\"$")
    public void createACityNameAsAndCountryNameAs(String city, String country) {

        templateContent.findElementAndClickFunction("cityAdd");
        templateContent.findElementAndClickFunction("countryOfTheCity");
        templateContent.findElementAndSelectOption("countryOfTheCityDropDown", country);
        templateContent.findElementAndSendKeysFunction("cityAddName", city);
        templateContent.findElementAndClickFunction("citySaveButton");

    }

    @And("^Success message must be displayed!$")
    public void successMessageMustBeDisplayed() {

        templateContent.findElementAndVerifyContainsText("msjContainer", "successfully");

    }

    @Then("^Click on Countries$")
    public void clickOnCountries() {

        templateContent.findElementAndClickFunction("Countries");
    }

    @And("^Find the country \"([^\"]*)\" and try to delete it$")
    public void findTheCountryAndTryToDeleteIt(String ulke) {
        templateContent.findElementAndSendKeysFunction("searchNameInput", ulke);
        templateContent.findElementAndClickFunction("searchButton");
        templateContent.findElementAndClickFunction("deleteButton");
        templateContent.findElementAndClickFunction("yesButton");

    }

    @And("^Error message should be displayed!$")
    public void errorMessageShouldBeDisplayed() {

        templateContent.findElementAndVerifyContainsText("msjContainer", "deleted");
    }


    @And("^Click on Cities again$")
    public void clickOnCitiesAgain() {

        templateContent.findElementAndClickFunction("Cities");

    }

    @And("^Delete \"([^\"]*)\"$")
    public void delete(String city) {

        templateContent.findElementAndSendKeysFunction("searchNameInput", city);
        templateContent.findElementAndClickFunction("searchButton");
        templateContent.findElementAndClickFunction("deleteButton");
        templateContent.findElementAndClickFunction("yesButton");

    }

    @And("^Success message should be observed$")
    public void successMessageShouldBeObserved() {

        templateContent.findElementAndVerifyContainsText("msjContainer", "successfully");
    }
}
