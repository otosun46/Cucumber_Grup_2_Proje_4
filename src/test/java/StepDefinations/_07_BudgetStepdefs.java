/**
 * @Author:Otosun Tarih :01/11/2020
 */
package StepDefinations;

import Pages.HumanResourcesContent;
import Pages.NavbarContent;
import Pages.TemplateContent;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;

public class _07_BudgetStepdefs {

    NavbarContent navbarContent = new NavbarContent();
    HumanResourcesContent humanResourcesContent = new HumanResourcesContent();

    @Given("^Navigate to Budget Accounts page$")
    public void navigateToBudgetAccoundsPage() {
        navbarContent.findElementAndClickFunction("budget");
        navbarContent.findElementAndClickFunction("budgetAccounts");
    }

    @Given("^Navigate to Cost Centers page$")
    public void navigateToCostCentersPage() {
        navbarContent.findElementAndClickFunction("budget");
        navbarContent.findElementAndClickFunction("budSetup");
        navbarContent.findElementAndClickFunction("costCenters");
    }

    @When("^Add new Cost Centers and fill out the form$")
    public void addNewCostCentersAndFillOutTheForm(DataTable elements) {
        humanResourcesContent.findElementAndClickFunction("addButton");
        humanResourcesContent.usingElementsInTheDataTableAndSendKeys(elements);
    }

    @When("^Edit the Cost Centers and fill out the form$")
    public void editTheCostCentersAndFillOutTheForm(DataTable elements) {
        humanResourcesContent.usingElementsInTheDataTableAndSendKeys(elements);
    }

    @And("^Edit the Cost Centers \"([^\"]*)\"$")
    public void editTheCostCenters(String arg0) {
        humanResourcesContent.editAndDeleteFunction(arg0, "edit");
    }

    @When("^Delete the Cost Centers \"([^\"]*)\"$")
    public void deleteTheCostCenters(String arg0) {
        humanResourcesContent.editAndDeleteFunction(arg0, "delete");
        humanResourcesContent.findElementAndClickFunction("yesButton");
    }

    @When("^Add new Budget Account and fill out the form$")
    public void addNewBudgetAccountAndFillOutTheForm(DataTable elements) {
        humanResourcesContent.findElementAndClickFunction("accountAddButton");
        humanResourcesContent.usingElementsInTheDataTableAndSendKeys(elements);
    }

    @When("^Delete the Budget Accounts \"([^\"]*)\"$")
    public void deleteTheBudgetAccounts(String arg0) {
        humanResourcesContent.findElementAndSendKeysFunction("saModSearchDesc", arg0);
        humanResourcesContent.findElementAndClickFunction("saTypeSearch");
        humanResourcesContent.editAndDeleteFunction(arg0, "delete");
        humanResourcesContent.findElementAndClickFunction("yesButton");
    }

    @When("^Edit the Budget Account \"([^\"]*)\"$")
    public void editTheBudgetAccount(String arg0) {
        humanResourcesContent.findElementAndSendKeysFunction("saModSearchDesc", arg0);
        humanResourcesContent.findElementAndClickFunction("saTypeSearch");
        humanResourcesContent.editAndDeleteFunction(arg0, "edit");
    }

    @When("^Edit Budget Account and fill out the form$")
    public void editBudgetAccountAndFillOutTheForm(DataTable elements) {
        humanResourcesContent.usingElementsInTheDataTableAndSendKeys(elements);
    }
}
