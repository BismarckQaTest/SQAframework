package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.annotations.TakeScreenshot;
import auto.framework.selenium.annotations.WebdriverScopeBean;
import auto.framework.selenium.pages.baxter_page.SupplementaryTestsModulePage;
import io.appium.java_client.remote.options.SupportsLanguageOption;
import io.appium.java_client.windows.options.SupportsAppTopLevelWindowOption;
import io.cucumber.core.backend.Backend;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SupplementaryTestsSteps {

    @LazyAutowired

    private SupplementaryTestsModulePage SupplementaryTestsSteps;




    @When("I check the module Complementary tests appear correctly")
    public void iCheckTheModuleComplementaryTestsAppearCorrectly() {
        SupplementaryTestsSteps.isDisplayedMenuButton();
    }
    @When("I open the menu and add new line of complementary test")
    public void iOpenTheMenuAndAddNewLineOfComplementaryTest() {
        SupplementaryTestsSteps.openMenu();
        SupplementaryTestsSteps.createComplementaryTest();

    }


    @And("I add all data correctly for add the complementary test with the reception date {string} description {string}")
    public void IAddAllDataCorrectlyForAddTheComplementaryTest(String receptionDate, String description) {
        SupplementaryTestsSteps.writeReceptionDate(receptionDate);
        SupplementaryTestsSteps.clickMenuTestButton();
        SupplementaryTestsSteps.selectTest();
        SupplementaryTestsSteps.writeDescription(description);
    }



    @When("I delete the Date of Record")
    public void iOpenTheDateOfRecord() {
        SupplementaryTestsSteps.resetReceptionDate();
    }

    @When("I add all data less test field for add the complementary test with the reception date {string} description {string}")
    public void IAddAllDataLessTestFieldForAddTheComplementaryTest(String receptionDate, String description) {
        SupplementaryTestsSteps.writeReceptionDate(receptionDate);
        SupplementaryTestsSteps.clickMenuTestButton();
        SupplementaryTestsSteps.writeDescription(description);
    }
    @When("I save the new complementary test")
    public void ISaveTheNewComplementaryTest() throws InterruptedException {
        SupplementaryTestsSteps.clickSaveButton();
    }

    @When("I Cancel the edition of this complementary test")
    public void ICancelTheEditionOfThisComplementaryTest() {
        SupplementaryTestsSteps.clickCancelButton();
    }

    @When("I check that the new test added correctly")
    public void ICheckThatTheNewTestAddedCorrectly() throws InterruptedException {
        SupplementaryTestsSteps.isDisplayedDescription();
    }

    @When("I Check that the changes not saved")
    public void ICheckThatTheChangesNotSaved() throws InterruptedException {
        SupplementaryTestsSteps.isDisplayedDescription();
    }
    @When("I edit complementary test added recently")
    public void IEditComplementaryTestAddedRecently() throws InterruptedException {
        SupplementaryTestsSteps.clickEditButton();
    }

    @When("I delete the test added recently")
    public void IDeleteTheTestAddedRecently() throws InterruptedException {
        SupplementaryTestsSteps.deleteLastCreationTest();
    }

    @When("I cancel the creation new complementary test")
    public void ICancelTheCreationNewComplementaryTest() {
        SupplementaryTestsSteps.clickCancelButton();
    }

    @When("I check the creation of test is cancelled")
    public void ICheckTheCreationOfTestIsCancelled() throws InterruptedException {
        SupplementaryTestsSteps.noDataFoundDisplayed();
    }

    @When("I check the save button doesn't appear")
    public void ICheckTheSaveButtonDoesntAppear() {
        SupplementaryTestsSteps.isDisplayedAlert();
    }


    @Then("I check that the new test added correctly with description QATestEdit")
    public void iCheckThatTheNewTestAddedCorrectlyWithDescriptionQATestEdit() throws InterruptedException {
        SupplementaryTestsSteps.isDisplayedDescriptionEdit();

    }

    @And("I add all data correctly for add the complementary test with the data record {string} the reception date {string} description {string}")
    public void iAddAllDataCorrectlyForAddTheComplementaryTestWithTheDataRecordTheReceptionDateDescription(String dateOfRecord, String receptionDate, String description) {
        SupplementaryTestsSteps.resetReceptionDate();
        SupplementaryTestsSteps.writeDateOfRecord(dateOfRecord);
        SupplementaryTestsSteps.writeReceptionDate(receptionDate);
        SupplementaryTestsSteps.clickMenuTestButton();
        SupplementaryTestsSteps.selectTest();
        SupplementaryTestsSteps.writeDescription(description);
    }


    @And("I link this Complementary test to the actual access")
    public void iLinkThisComplementaryTestToTheActualAccess() {
        SupplementaryTestsSteps.acceptLinkComplementaryTestToThisAccess();
    }

    @Then("The Complementary test linked correctly")
    public void theComplementaryTestLinkedCorrectly() throws InterruptedException {
        SupplementaryTestsSteps.isDisplayedDescriptionAttached();

    }

    @And("I open the menu and filter")
    public void iOpenTheMenuAndFilter() {
        SupplementaryTestsSteps.openMenu();
        SupplementaryTestsSteps.filterComplementaryTest();
    }

    @And("I filter category test 1")
    public void iFilterCategoryTest(){
        SupplementaryTestsSteps.filterDropDownButton();
        SupplementaryTestsSteps.filterDropDownTest1();
    }

    @Then("Check filter correctly")
    public void checkFilterCorrectly() throws InterruptedException {
        SupplementaryTestsSteps.noDataFoundDisplayed();
    }


    @And("I check if not select filter all complementary test showed")
    public void iCheckIfNotSelectFilterAllComplementaryTestShowed() throws InterruptedException {
        SupplementaryTestsSteps.isDisplayedDescription();
        SupplementaryTestsSteps.isDisplayedDescriptionAttached();
    }

    @Then("I delete All Complementary test created")
    public void iDeleteAllComplementaryTestCreated() throws InterruptedException {
        SupplementaryTestsSteps.deleteTwoLastCreationTest();

    }

    @And("I try to delete the complementary test")
    public void iTryToDeleteTheComplementaryTest() throws InterruptedException {
        SupplementaryTestsSteps.deleteSupplementaryTestCreation();

    }

    @Then("The alert showed because there is relation")
    public void theAlertShowedBecauseThereIsRelationWithAccesses() throws InterruptedException {
        SupplementaryTestsSteps.errorCantBeDeletedIsVisible();
    }

    @When("I push in delete complementary test")
    public void iPushInDeleteComplementaryTest() {
        SupplementaryTestsSteps.pushDeleteSupplementaryTestButton();
    }

    @And("Confirmation windows open but I push in No")
    public void confirmationWindowsOpenButIPushInNo() {
        SupplementaryTestsSteps.confirmationWidowOpenAndPushNo();
    }

    @Then("The test not deleted")
    public void theTestNotDeleted() throws InterruptedException {
        SupplementaryTestsSteps.isDisplayedDescription();
    }

    @And("Confirmation windows open but I push in yes")
    public void confirmationWindowsOpenButIPushInYes() {
        SupplementaryTestsSteps.confirmationWidowOpenAndPushYes();
    }

    @Then("The test deleted correctly")
    public void theTestDeletedCorrectly() throws InterruptedException {
        SupplementaryTestsSteps.noDataFoundDisplayed();
    }
}
