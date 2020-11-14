package StepDefinations;

import Pages.Volkans_templateContent;
import Pages._Parent;
import cucumber.api.java.en.When;

public class _11_CreateSubjectSteps {


    Volkans_templateContent templateContent = new Volkans_templateContent();

    @When("^Navigate to Subject$")
    public void navigateToSubject() {
        templateContent.findElementAndClickFunction("education");
        templateContent.findElementAndClickFunction("setup");
        templateContent.findElementAndClickFunction("subjects");
    }


    @When("^Create subject name as \"([^\"]*)\" code name as \"([^\"]*)\" and Create new subject category name as \"([^\"]*)\" code name as \"([^\"]*)\"$")
    public void createSubjectNameAsCodeNameAsAndCreateNewSubjectCategoryNameAsCodeNameAs(String arg0, String arg1, String arg2, String arg3) {
        templateContent.findElementAndClickFunction("addButton");
        templateContent.findElementAndSendKeysFunction("nameInput", arg0);
        templateContent.findElementAndSendKeysFunction("codeInput", arg1);


        templateContent.findElementAndClickFunction("addSubjectCategory");
        templateContent.findElementAndSendKeysFunction("inputNameSC", arg2);
        templateContent.findElementAndSendKeysFunction("inputCodeSC", arg3);
        templateContent.findElementAndClickFunction("saveButtonSC");
        templateContent.findElementAndVerifyContainsText("msjContainer", "successfully");

        templateContent.findElementAndClickFunction("subjectCategorySelect");
        templateContent.findElementAndSelectOption("subCategoryList", "Science");

        templateContent.findElementAndClickFunction("styleSelect");
        templateContent.findElementAndSelectOption("option", "rgb(32,0,250)");
        templateContent.findElementAndClickFunction("saveButton");
        templateContent.findElementAndVerifyContainsText("msjContainer", "successfully");
    }


    @When("^Delete subject name as \"([^\"]*)\" and subject category name as \"([^\"]*)\"$")
    public void deleteSubjectNameAs(String arg0, String arg1) {

        templateContent.findElementAndSendKeysFunction("searchNameInput", arg0);
        templateContent.findElementAndClickFunction("searchButton");

        templateContent.editAndDeleteFunction(arg0, "delete");
        templateContent.findElementAndClickFunction("yesButton");
        templateContent.findElementAndVerifyContainsText("msjContainer", "successfully");
        templateContent.findElementAndClickFunction("subjectCategories");
        templateContent.findElementAndSendKeysFunction("searchNameInput", arg1);
        templateContent.findElementAndClickFunction("searchButton");

        templateContent.editAndDeleteFunction(arg1, "delete");
        templateContent.findElementAndClickFunction("yesButton");
        templateContent.findElementAndVerifyContainsText("msjContainer", "successfully");

    }

    @When("^Delete subject name as \"([^\"]*)\"$")
    public void deleteSubjectNameAs(String arg0) {
        templateContent.findElementAndSendKeysFunction("searchNameInput", arg0);
        templateContent.findElementAndClickFunction("searchButton");

        templateContent.editAndDeleteFunction(arg0, "delete");
        templateContent.findElementAndClickFunction("yesButton");
        templateContent.findElementAndVerifyContainsText("msjContainer", "successfully");
    }
}




