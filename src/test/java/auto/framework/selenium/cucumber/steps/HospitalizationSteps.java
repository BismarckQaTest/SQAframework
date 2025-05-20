package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.HospitalizationPage;
import auto.framework.selenium.pages.baxter_page.MedicationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HospitalizationSteps {

    @LazyAutowired

    private HospitalizationPage HospitalizationPage;




    @When("I check the module Hospitalization appear correctly")
    public void iCheckTheModuleHospitalizationAppearCorrectly() {
        HospitalizationPage.isDisplayedTheTittle();
    }


    @And("I open the menu and add new line of Hospitalization")
    public void iOpenTheMenuAndAddNewLineOfHospitalization() throws InterruptedException {
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickNewButton();
    }


    @And("I add all data correctly for add the Hospitalization with this data: Date of admission {string}, Type of admission {string}, Hospital {string}, Physician {string} and Reason for admission {string}")
    public void iAddAllDataCorrectlyForAddTheHospitalizationWithThisDataTypeOfAdmissionHospitalPhysicianAndReasonForAdmission(String date,String TypeAdmission, String Hospital, String Physician, String Reason) throws InterruptedException {
        HospitalizationPage.selectTypeOfAdmission(TypeAdmission);
        HospitalizationPage.selectHospital(Hospital);
        HospitalizationPage.selectPhysician(Physician);
        HospitalizationPage.writeReasonForAdmission(Reason);
        HospitalizationPage.resetReceptionDate();
        HospitalizationPage.writeDateOfAdmission(date);
    }

    @And("I save the new Hospitalization")
    public void iSaveTheNewHospitalization() throws InterruptedException {
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickSaveButton();

    }

    @And("I attached the additional study with the Hospitalization created")
    public void iAttachedTheAdditionalStudyWithTheHospitalizationCreated() throws InterruptedException {
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickAssociateAdditionalExaminationButton();
    }

    @And("I select the additional study created and associate with Hospitalization")
    public void iSelectTheAdditionalStudyCreatedAndAssociateWithHospitalization() throws InterruptedException {
        HospitalizationPage.selectAdditionalStudyFile();
        HospitalizationPage.clickSaveAttachedAdditionalStudy();


    }

    @And("I remove the additional study with the Hospitalization")
    public void iRemoveTheAdditionalStudyWithTheHospitalization() throws InterruptedException {
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickAssociateAdditionalExaminationButton();

    }

    @And("I select the additional study created and remove the associate with Hospitalization")
    public void iSelectTheAdditionalStudyCreatedAndRemoveTheAssociateWithHospitalization() throws InterruptedException {
        HospitalizationPage.selectAdditionalStudyFile();
        HospitalizationPage.clickSaveAttachedAdditionalStudy();

    }

    @Then("I remove the Hospitalization created")
    public void iRemoveTheHospitalizationCreated() throws InterruptedException {
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickDeleteButton();

    }
}
