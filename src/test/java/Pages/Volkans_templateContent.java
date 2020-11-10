/**
 * @Author:Group_2 Tarih :30/10/2020
 */
package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Volkans_templateContent extends _Parent {
    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(linkText = "Got it!")
    public WebElement gotItBtn;

    @FindBy(id = "cookieconsent")
    public WebElement cookieConsent;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton; //sorun olursa bunu kullan

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']/input")
    private WebElement integrationCodeInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='priority']/input")
    private WebElement priorityInput;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement searchNameInput;

    @FindBy(xpath = "(//ms-save-button//button)[1]")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy(css = "div[role=alertdialog]")
    private WebElement alertdialog;

    @FindAll({
            @FindBy(xpath = "//div[@id='toast-container']")
    })
    private List<WebElement> msjContainers;

    @FindAll(
            {
                    @FindBy(xpath = "//span[@class='mat-option-text']")
            }
    )
    public List<WebElement> userTypeAllOptions;

    @FindBy(xpath = "//input[@class='mat-autocomplete-trigger mat-chip-input mat-input-element']")
// "//button[@class='mat-autocomplete-trigger mat-chip-input mat-input-element']")
    private WebElement userTypeDropdown;
    /*
        @FindAll({
                @FindBy(xpath = "//mat-option[@class='mat-option mat-focus-indicator ng-star-inserted']")
        })
        public List<WebElement> userTypeAllOptions;

    */
    @FindAll({
            @FindBy(xpath = "//table/tbody/tr/td[2]")
    })
    public List<WebElement> nameList;

    @FindAll({
            @FindBy(xpath = "//ms-delete-button/button")
    })
    private List<WebElement> deleteButtonList;

    @FindAll({
            @FindBy(xpath = "//ms-edit-button/button")
    })
    private List<WebElement> editButtonList;

    @FindAll({
            @FindBy(linkText = "Got it!")
    })
    public List<WebElement> gotItBtns;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement errorMessage;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "//span[text()='Education']")//nav-link-title ng-tns-c103-24 ng-star-inserted
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement setup;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectCategories;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']")
    private WebElement inputName;


    @FindBy(xpath = "//input[@required id='ms-text-field-2']")
    private WebElement inputNameS;

    @FindBy(xpath = "//ms-text-field[@id='ms-text-field-3']")
    private WebElement inputCode;

    @FindBy(xpath = "//ms-delete-button/button")
    private WebElement deleteButton;


    @FindBy(xpath = "//div[text()='Subject Category successfully deleted']")
    private WebElement messageSuccess;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectsCategories;

    @FindBy(xpath = "//span[text()='Subjects']")
    private WebElement subjects;


    @FindBy(xpath = "//span[text()=' yyy ']")
    private WebElement style;

    @FindBy(id = "mat-option-32")
    private WebElement styleText;

    @FindBy(xpath = "(//*[@class='svg-inline--fa fa-plus fa-w-12'])[2]")
    private WebElement addSubjectCategory;


    @FindBy(xpath = "//mat-form-field[@formgroupname='subjectCategory']")
    private WebElement subjectCategorySelect;

    @FindAll({@FindBy(xpath = "//mat-option[@role='option']")})
    private List<WebElement> subCategoryList;

    @FindBy(xpath = "//mat-form-field[@formgroupname='css']")
    private WebElement styleSelect;

    @FindAll({@FindBy(xpath = "//div[@role='listbox']")})
    private List<WebElement> styleList;

    @FindAll({
            @FindBy(css = "mat-option[role='option']")
    })
    private List<WebElement> option;

    @FindBy(xpath = "//mat-option[contains(@style,'rgb(41, 121, 255)')]")
    private WebElement styleOption;

    @FindBy(xpath = "(//ms-text-field[@formcontrolname='name']/input)[2]")
    private WebElement inputNameSC;

    @FindBy(xpath = "(//ms-text-field[@formcontrolname='code']/input)[2]")
    private WebElement inputCodeSC;


    @FindBy(xpath = "(//ms-save-button//button)[2]")
    private WebElement saveButtonSC;

    @FindBy(xpath = "//div[@role='alertdialog'")
    private WebElement errorAlertMessage;

    /**
     * Parametre olarak ismi girilen WebElementi bulur ve dondurur.
     *
     * @param webElementName
     * @return
     */
    public WebElement findWebElement(String webElementName) {
        switch (webElementName) {
            case "loginButton":
                myElement = loginButton;
                break;

            case "gotItBtn":    //Buradaki sorunu LoginStepste cookieConsent elemaninin gorunur olmasini sorgulayarak cozdum
                // bu eleman yok ise çoklu olarak yinede bulduk
                // eğer gerçekten yok ise size 0 olacağı için
                // bekletmeye düşmesin diye fonksiyonu geri gönderdik.
//                if (gotItBtns.size() == 0)
//                    return;
                myElement = gotItBtn;
                break;

            case "addButton":
                myElement = addButton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "yesButton":
                myElement = yesButton;
                break;
            case "closeDialog":
                myElement = closeDialog;
                break;
            case "searchButton":
                myElement = searchButton;
                break;
            case "UserTypeDropdown":
                myElement = userTypeDropdown;
                break;
            case "username":
                myElement = username;
                break;

            case "password":
                myElement = password;
                break;

            case "nameInput":
                myElement = nameInput;
                break;

            case "codeInput":
                myElement = codeInput;
                break;

            case "shortName":
                myElement = shortName;
                break;

            case "searchNameInput":
                myElement = searchNameInput;
                break;
            case "integrationCodeInput":
                myElement = integrationCodeInput;
                break;
            case "priorityInput":
                myElement = priorityInput;
                break;
            case "msjContainer":
                myElement = msjContainer;
                break;

            case "errorMessage":
                myElement = errorMessage;
                break;

            case "setup":
                myElement = setup;
                break;

            case "education":
                myElement = education;
                break;

            case "subjectCategories":
                myElement = subjectCategories;
                break;

            case "subjects":
                myElement = subjects;
                break;

            case "inputName":
                myElement = inputName;
                break;

            case "inputCode":
                myElement = inputCode;
                break;

            case "deleteButton":
                myElement = deleteButton;
                break;

            case "messageSuccess":
                myElement = messageSuccess;
                break;

            case "styleText":
                myElement = styleText;
                break;

            case "style":
                myElement = style;
                break;

            case "addSubjectCategory":
                myElement = addSubjectCategory;
                break;

            case "styleOption":
                myElement = styleOption;
                break;


            case "inputNameSC":
                myElement = inputNameSC;
                break;

            case "inputCodeSC":
                myElement = inputCodeSC;
                break;

            case "saveButtonSC":
                myElement = saveButtonSC;
                break;

            case "subjectCategorySelect":
                myElement = subjectCategorySelect;
                break;

            case "styleSelect":
                myElement = styleSelect;
                break;

            case "errorAlertMessage":
                myElement = errorAlertMessage;
                break;

        }
        return myElement;
    }

    /**
     * Parametre olarak ismi girilen WebElementListi dondurur.
     *
     * @param webElementListName
     * @return
     */
    public List<WebElement> findWebElementList(String webElementListName) {
        switch (webElementListName) {
            case "userTypeAllOptions":
                myElementList = userTypeAllOptions;
                break;
            case "deleteButtonList":
                myElementList = deleteButtonList;
                break;
            case "editButtonList":
                myElementList = editButtonList;
                break;
            case "nameList":
                myElementList = nameList;
                break;
            case "subCategoryList":
                myElementList = subCategoryList;
                break;
            case "styleList":
                myElementList = styleList;
                break;

            case "option":
                myElementList = option;
                break;
        }
        return myElementList;
    }

    /**
     * Bu metod steps classtan calistirilacak parametre olarak string olarak tiklanacak WebElementin ismini alir.
     *
     * @param element
     */
    public void findElementAndClickFunction(String element) {
        // wait.until(ExpectedConditions.visibilityOf(myElement));
//        wait.until(ExpectedConditions.elementToBeClickable(myElement));
        clickFunction(findWebElement(element));
    }

    /**
     * Parametre olarak ismi gonderilen WebElementi bulur ve value parametresini secilen WebElemente gonderir.
     *
     * @param element
     * @param value
     */
    public void findElementAndSendKeysFunction(String element, String value) {
        sendKeysFunction(findWebElement(element), value);
    }

    public void findElementAndSelectFunction(String myElementList, String value) {

        countrySelect(findWebElement(myElementList), value);
    }

    /**
     * Bu metod steps classindan cagrilir.
     * Parametre olarak seceneklerin oldugu WebElementListesinin adini ve secim kriterini string olarak alir.
     * Secim parametresi sayi olursa index olarak degerlendirilir ve o indexli WebElement secilir.
     * Parametre sayi degilse WebElementin texti ile karsilastirilir ve kapsayan WebElement secilir.
     *
     * @param listName
     * @param secenek
     */
    public void findElementAndSelectOption(String listName, String secenek) {
        selectOptionByString(findWebElementList(listName), secenek);
    }

    /**
     * Parametre olarak ismi gonderilen WebElementi bulur ve gorundugunu dogrular.
     *
     * @param elementName
     */
    public void findElementAndVerifyDisplayed(String elementName) {
        verifyMyElementIsDisplayed(findWebElement(elementName));
    }

    /**
     * Parametre olarak ismi gonderilen WebElementi bulur ve
     * parametre olarak giriilen msg nin WebElementin textinde bulundugunu dogrular.
     *
     * @param elementName
     * @param msg
     */
    public void findElementAndVerifyContainsText(String elementName, String msg) {
        verifyElementContainsText(findWebElement(elementName), msg);
        System.out.println("Metod calisti");
    }

    /**
     * Parametre olarak ismi girilen WebElementListin butun elemanlarina clickFunctioni uygular.
     *
     * @param listName
     */
    public void findElementListAndClickToAllElement(String listName) {
        for (WebElement element : findWebElementList(listName)) {
            clickFunction(element);
        }
    }

    /**
     * Parametre olarak ismi girilen WebElementListin ikinci parametrede girilen sayi kadar elemana sahip oldugu dogrulanir.
     * Ikinci parametre "0" girilirse listedeki elemenlari yazdirir.
     *
     * @param elementName
     * @param numberOfItems
     */
    public void findElementListAndNumberOfLstOrPrintItemsOfList(String elementName, int numberOfItems) {
        if (numberOfItems > 0)
            verifyTheNumberOfItemsOnTheList(waitVisibleListAllElement(findWebElementList(elementName)), numberOfItems);
        else
            printToList(findWebElementList(elementName));
    }

    public void findWebElementListAndClickEachOneElementWithForeachAndPrintOfList(String clickElementList, String printElementList) {
        System.out.println("************************************************************");
        System.out.println("List printing started");
        int list = 1;
        for (WebElement element : findWebElementList(clickElementList)) {
            clickFunction(element);
            System.out.println("List:" + list++);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            findElementListAndNumberOfLstOrPrintItemsOfList(printElementList, 0);
        }
        System.out.println("List printing finished");
        System.out.println("************************************************************");
    }

    public void editAndDeleteFunction(String countryName, String editOrDelete) {
        List<WebElement> btnList = new ArrayList<>();
        // invisible olma beklemesini, display ise şartına bağladık, yani
        // gözüküyorsa kaybolana kadar bekle.
        beklet(500);
//        if (msjContainers.size()>0) {
//            if (msjContainer.isDisplayed())
//                wait.until(ExpectedConditions.invisibilityOfAllElements(msjContainer));
//        }
        if (editOrDelete.equalsIgnoreCase("delete")) {
            btnList = waitVisibleListAllElement(deleteButtonList);
        } else btnList = waitVisibleListAllElement(editButtonList);

        for (int i = 0; i < waitVisibleListAllElement(nameList).size(); i++) {
            System.out.println(waitVisibleListAllElement(nameList).get(i).getText());
            if (waitVisibleListAllElement(nameList).get(i).getText().equalsIgnoreCase(countryName)) {
                clickFunction(btnList.get(i));
            }
        }
    }

    /**
     *
     */
    public void deleteAllItemsOfList() {
        List<WebElement> btnList = new ArrayList<>();
        waaiit(100);
        for (WebElement e : nameList) {
            waaiit(300);
            clickFunction(deleteButtonList.get(0));
            clickFunction(yesButton);
            waitUntilVisible(alertdialog);
            if (alertdialog.getText().contains("You can not delete")) break;
            System.out.println(alertdialog.getText());
        }
    }

    void waaiit(int milisaniye) {
        beklet(milisaniye);
    }

}
