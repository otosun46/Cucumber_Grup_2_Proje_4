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

public class BudgetStepdefs {
    TemplateContent templateContent= new TemplateContent();
    NavbarContent navbarContent = new NavbarContent();
    HumanResourcesContent humanResourcesContent = new HumanResourcesContent();

    @Given("^Navigate to Budget Groups page$")
    public void navigateToBudgetGroupsPage() {
        navbarContent.findElementAndClickFunction("budget");
        navbarContent.findElementAndClickFunction("budSetup");
        navbarContent.findElementAndClickFunction("budgetGroups");
    }

    @When("^Create a Budget Groups$")
    public void createABudgetGroups() {
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
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);
        System.out.println("List size= "+elementsNameAndValue.size());

        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            humanResourcesContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }

    }

    @When("^Edit the Cost Centers and fill out the form$")
    public void editTheCostCentersAndFillOutTheForm(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);
        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            humanResourcesContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @And("^Edit the Cost Centers \"([^\"]*)\"$")
    public void editTheCostCenters(String arg0) {
        humanResourcesContent.editAndDeleteFunction(arg0, "edit");
    }

    @When("^Delete the Cost Centers \"([^\"]*)\"$")
    public void deleteTheCostCenters(String arg0){
        humanResourcesContent.editAndDeleteFunction(arg0, "delete");
        humanResourcesContent.findElementAndClickFunction("yesButton");
    }
}
