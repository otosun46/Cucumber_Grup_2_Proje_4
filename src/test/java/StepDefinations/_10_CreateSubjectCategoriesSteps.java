package StepDefinations;

import Pages.Volkans_templateContent;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _10_CreateSubjectCategoriesSteps {

    Volkans_templateContent templateContent=new Volkans_templateContent();

    @When("^Navigate to Subject Categories$")
    public void navigateToSubjectCategories() {
        templateContent.findElementAndClickFunction("education");
        templateContent.findElementAndClickFunction("setup");
        templateContent.findElementAndClickFunction("subjectCategories");
    }


    @When("^Create a subject categories name as \"([^\"]*)\" and code as \"([^\"]*)\"$")
    public void createASubjectCategoriesNameAsAndCodeAs(String arg0, String arg1)   {

        templateContent.findElementAndClickFunction("addButton");
        templateContent.findElementAndClickFunction("nameInput");
        templateContent.findElementAndSendKeysFunction("nameInput",arg0);

        templateContent.findElementAndClickFunction("codeInput");
        templateContent.findElementAndSendKeysFunction("codeInput",arg1);
        templateContent.findElementAndClickFunction("saveButton");

    }



    @Then("^Delete subject categories name as \"([^\"]*)\"$")
    public void deleteSubjectCategoriesNameAs(String arg0) {
        templateContent.findElementAndSendKeysFunction("searchNameInput",arg0);
        templateContent.findElementAndClickFunction("searchButton");
        templateContent.findElementAndClickFunction("deleteButton");
        templateContent.findElementAndClickFunction("yesButton");
    }
/*
    @Then("^Success message should be displayed$")
    public void successMessageShouldBeDisplayed() {
        templateContent.findElementAndVerifyContainsText("msjContainer","successful");

    }
 */



}
