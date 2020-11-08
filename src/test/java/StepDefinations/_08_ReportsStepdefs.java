/**
 * @Author:Otosun Tarih :03/11/2020
 */
package StepDefinations;

import Pages.HumanResourcesContent;
import Pages.NavbarContent;
import Pages.TemplateContent;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;

public class _08_ReportsStepdefs {
    NavbarContent navbarContent = new NavbarContent();
    HumanResourcesContent humanResourcesContent = new HumanResourcesContent();

    @Given("^Navigate to Excel Template page$")
    public void navigateToExcelTemplatePage() {
        navbarContent.findElementAndClickFunction("reports");
        navbarContent.findElementAndClickFunction("repSetup");
        navbarContent.findElementAndClickFunction("excelTemplate");
    }

    @When("^Add new Excel Template and fill out the form$")
    public void addNewExcelTemplateAndFillOutTheForm(DataTable elements) {
        humanResourcesContent.findElementAndClickFunction("excTmpAddButton");
        humanResourcesContent.usingElementsInTheDataTableAndSendKeys(elements);
    }

    @Given("^Save the Excel Template$")
    public void SaveTheExcelTemplate() {
        humanResourcesContent.findElementAndClickFunction("saveButton");
    }

    @Given("^Close the dialog$")
    public void closeTheDialog() {
        humanResourcesContent.findElementAndClickFunction("closeDiolog");
    }

    @When("^Edit the \"([^\"]*)\" and change out the form$")
    public void editTheAndChangeOutTheForm(String arg0,DataTable elements) {
        humanResourcesContent.editAndDeleteFunction(arg0, "edit");
        humanResourcesContent.usingElementsInTheDataTableAndSendKeys(elements);
    }

    @When("^Delete the Excel Template \"([^\"]*)\"$")
    public void deleteTheExcelTemplate(String arg0) {
        humanResourcesContent.editAndDeleteFunction(arg0, "delete");
        humanResourcesContent.findElementAndClickFunction("yesButton");
    }
}
