package StepDefinations;

import Pages.Volkans_templateContent;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _12_CreateMySubjectCatSteps {

    Volkans_templateContent templateContent = new Volkans_templateContent();


    @Then("^Error message should be displayed$")
    public void errorMessageShouldBeDisplayed() {

        //   templateContent.findElementAndVerifyContainsText("errorAlertMessage","Item can't be deleted because it is used");

    }

}
