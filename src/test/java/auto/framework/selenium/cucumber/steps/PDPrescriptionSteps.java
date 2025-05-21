package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.PDPrescriptionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PDPrescriptionSteps {

    @LazyAutowired

    private PDPrescriptionPage PDPrescriptionPage;




    @When("I check the module PD Prescription appear correctly")
    public void iCheckTheModuleAccessesAppearCorrectly() {
        PDPrescriptionPage.isDisplayedTheTittle();
    }

    @And("I check if the system will display the questionnaire view with the fields: Questionnaire Name, Active \\(Yes, No), All Questions")
    public void iCheckIfTheSystemWillDisplayTheQuestionnaireViewWithTheFieldsQuestionnaireNameActiveYesNoAllQuestions()throws InterruptedException {
        PDPrescriptionPage.scrollToQuestionnaireTitle();
        PDPrescriptionPage.clickButtonQuestionnaireProva();
        PDPrescriptionPage.clickButtonActiveQuestionnaireProva();
        PDPrescriptionPage.clickButtonCloseQuestionnaireProva();
    }


    @And("I modify the assigned questionnaire: Start date, End date, Frequency and Days of the week.")
    public void iModifyTheAssignedQuestionnaireStartDateEndDateFrequencyAndDaysOfTheWeek()throws InterruptedException {
        PDPrescriptionPage.scrollToQuestionnaireTitle();
        PDPrescriptionPage.clickButtonEditQuestionnaire();
        PDPrescriptionPage.inputDataQuestionnaire();

    }

    @And("I try to save a new biometric marker with at least one required field empty")
    public void iTryToSaveANewBiometricMarkerWithAtLeastOneRequiredFieldEmpty()throws InterruptedException {
        PDPrescriptionPage.clickButtonThreePointsBiometricMarket();
        PDPrescriptionPage.clickButtonNew();
        PDPrescriptionPage.clickButtonSaveBiometricMarket();
        PDPrescriptionPage.clickButtonOkModal();
        PDPrescriptionPage.clickButtonCancelBiometricMarket();
        PDPrescriptionPage.clickButtonCancelPrescription();

    }

    @And("I successfully create and save the new Biometric Marker")
    public void iSuccessfullyCreateAndSaveTheNewBiometricMarker()throws InterruptedException {
        PDPrescriptionPage.clickButtonThreePointsBiometricMarket();
        PDPrescriptionPage.clickButtonNew();
        PDPrescriptionPage.inputDataNewBiometricMarket();
        PDPrescriptionPage.clickButtonSaveBiometricMarket();


    }

    @And("I save the changes in the Biometric Markers")
    public void iSaveTheChangesInTheBiometricMarkers()throws InterruptedException {
        PDPrescriptionPage.clickButtonEditBiometricMarker();
        PDPrescriptionPage.editDataBiometricMarket();
        PDPrescriptionPage.clickButtonSaveBiometricMarket();
    }

    @And("I create and save a new prescription")
    public void iCreateAndSaveANewPrescription()throws InterruptedException {
        PDPrescriptionPage.clickButtonThreePointsPrescription();
        PDPrescriptionPage.clickButtonNewPrescription();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickDropDownTypeOfInfusion();
        PDPrescriptionPage.clickButtonDropDownTreatment();
        PDPrescriptionPage.clickButtonDropDownWeekdays();
        PDPrescriptionPage.inputDataTotalVolume();
        PDPrescriptionPage.inputDataTherapyTime();
        PDPrescriptionPage.inputDataUrineVolume();
        PDPrescriptionPage.inputDataTargetUf();
        PDPrescriptionPage.inputDataDryWeight();
        PDPrescriptionPage.clickButtonAddExchange();
        PDPrescriptionPage.dataAddExchange();
        PDPrescriptionPage.clickSaveAddExchange();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickSavePrescription();

    }

    @And("I check if in prescription history I can add")
    public void iCheckIfInPrescriptionHistoryICanAdd()throws InterruptedException {
    PDPrescriptionPage.clickButtonPrescriptionHistory();
    PDPrescriptionPage.clickButtonPrescriptionHistory();
    PDPrescriptionPage.clickButtonAddPrescriptionHistory();
    PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
    }

    @And("I try to save a recipe with at least one required field empty.")
    public void iTryToSaveARecipeWithAtLeastOneRequiredFieldEmpty()throws InterruptedException {
        PDPrescriptionPage.clickButtonPrescriptionHistory();
        PDPrescriptionPage.clickButtonPrescriptionHistory();
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.cleanInputDataTotalVolume();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickButtonCancelPrescription();
    }

    @And("I try to create a new prescription but I click the cancel button")
    public void iTryToCreateANewPrescriptionButIClickTheCancelButton()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickDropDownTypeOfInfusion();
        PDPrescriptionPage.clickButtonDropDownTreatment();
        PDPrescriptionPage.inputDataTotalVolume();
        PDPrescriptionPage.inputDataTherapyTime();
        PDPrescriptionPage.inputDataUrineVolume();
        PDPrescriptionPage.inputDataTargetUf();
        PDPrescriptionPage.inputDataDryWeight();
        PDPrescriptionPage.clickButtonAddExchange();
        PDPrescriptionPage.dataAddExchange();
        PDPrescriptionPage.clickSaveAddExchange();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickButtonCancelPrescription();
    }

    @And("I verify that Previous Recipes will be displayed on the left and Active Recipes on the right, with their respective date.")
    public void iVerifyThatPreviousRecipesWillBeDisplayedOnTheLeftAndActiveRecipesOnTheRightWithTheirRespectiveDate()throws InterruptedException {
        PDPrescriptionPage.clickButtonPrescriptionHistory();
        PDPrescriptionPage.clickButtonPrescriptionHistory();
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
    }

    @And("I create and add a new Exchange")
    public void iCreateAndAddANewExchange()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonAddExchange();
        PDPrescriptionPage.dataAddExchange();
        PDPrescriptionPage.clickSaveAddExchange();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickSavePrescription();
    }

    @And("I check that the information for each solution and a delete button are displayed")
    public void iCheckThatTheInformationForEachSolutionAndADeleteButtonAreDisplayed()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.dragAndDrop1();
        PDPrescriptionPage.clickButtonRemoveSolution();
    }

    @And("I do Click on each label to drag and drop the desired solutions")
    public void iDoClickOnEachLabelToDragAndDropTheDesiredSolutions()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonSolutionE();
        PDPrescriptionPage.clickButtonSolutionN();
        PDPrescriptionPage.clickButtonSolutionP();
        PDPrescriptionPage.dragAndDrop1();
        PDPrescriptionPage.clickButtonRemoveSolution();
    }

    @And("I check The system hides details")
    public void iCheckTheSystemHidesDetails()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.titleParameterAdjustments();
        PDPrescriptionPage.clickButtonArrowDownParameterAdjustments();
        PDPrescriptionPage.clickButtonArrowUpParameterAdjustments();
        PDPrescriptionPage.clickButtonArrowUp();
    }

    @And("I verify that the system assigned the Questionnaire")
    public void iVerifyThatTheSystemAssignedTheQuestionnaire()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.titleParameterAdjustments();
        PDPrescriptionPage.scrollToQuestionnaireTitle();
        PDPrescriptionPage.clickButtonThreePointsQuestionnaire();
        PDPrescriptionPage.clickButtonAssignQuestionnaire();
        PDPrescriptionPage.inputsDataAssignQuestionnaire();
        PDPrescriptionPage.clickButtonSaveQuestionnaire();
    }

    @And("I create and save the new Questionnaire")
    public void iCreateAndSaveTheNewQuestionnaire()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.titleParameterAdjustments();
        PDPrescriptionPage.scrollToQuestionnaireTitle();
        PDPrescriptionPage.clickButtonThreePointsQuestionnaire();
        PDPrescriptionPage.clickButtonNewQuestionnaire();
        PDPrescriptionPage.clickDropDownQuestionnaireCopy();
        PDPrescriptionPage.inputDataQuestionnaireName();
        PDPrescriptionPage.clickButtonSaveNewQuestionnaire();
        PDPrescriptionPage.clickButtonArrowUp();
    }

    @And("I create a new CAPD prescription and verify that it is in history")
    public void iCreateANewCAPDPrescriptionAndVerifyThatItIsInHistory()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonCapd();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.inputsDataAddExchangeCapd();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsBiometricMarket();
        PDPrescriptionPage.clickSavePrescription();

    }

    @And("I try to create a new Prescription, but the system cancels the prescription")
    public void iTryToCreateANewPrescriptionButTheSystemCancelsThePrescription() throws InterruptedException{
        PDPrescriptionPage.clickButtonThreePointsPrescription();
        PDPrescriptionPage.clickButtonNewPrescription();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickDropDownTypeOfInfusion();
        PDPrescriptionPage.clickButtonDropDownTreatment();
        PDPrescriptionPage.clickButtonDropDownWeekdays();
        PDPrescriptionPage.inputDataTotalVolume();
        PDPrescriptionPage.inputDataTherapyTime();
        PDPrescriptionPage.inputDataUrineVolume();
        PDPrescriptionPage.inputDataTargetUf();
        PDPrescriptionPage.inputDataDryWeight();
        PDPrescriptionPage.clickButtonAddExchange();
        PDPrescriptionPage.dataAddExchange();
        PDPrescriptionPage.clickSaveAddExchange();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickButtonCancelPrescription();
    }

    @And("I verify that The system will delete the selected change line")
    public void iVerifyThatTheSystemWillDeleteTheSelectedChangeLine() throws InterruptedException{
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickButtonAddExchange();
        PDPrescriptionPage.dataAddExchange();
        PDPrescriptionPage.clickSaveAddExchange();
        PDPrescriptionPage.clickButtonDeleteManualExchanges();
        PDPrescriptionPage.clickButtonArrowUp();
    }

    @And("I'm trying to create a new prescription without Weekdays required")
    public void iMTryingToCreateANewPrescriptionWithoutWeekdaysRequired()throws InterruptedException {

        PDPrescriptionPage.clickButtonThreePointsPrescription();
        PDPrescriptionPage.clickButtonNewPrescription();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickDropDownTypeOfInfusion();
        PDPrescriptionPage.clickButtonDropDownTreatment();
        PDPrescriptionPage.inputDataTotalVolume();
        PDPrescriptionPage.inputDataTherapyTime();
        PDPrescriptionPage.inputDataUrineVolume();
        PDPrescriptionPage.inputDataTargetUf();
        PDPrescriptionPage.inputDataDryWeight();
        PDPrescriptionPage.clickButtonAddExchange();
        PDPrescriptionPage.dataAddExchange();
        PDPrescriptionPage.clickSaveAddExchange();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickSavePrescription();
        PDPrescriptionPage.clickButtonOkWarning();
    }

    @And("I try to create a new prescription, but I click on the cancel button")
    public void iTryToCreateANewPrescriptionButIClickOnTheCancelButton()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickButtonAddExchange();
        PDPrescriptionPage.dataAddExchange();
        PDPrescriptionPage.clickButtonCancelAddExchanges();
    }

    @And("I try to create a new questionnaire, but I click on the cancel button")
    public void iTryToCreateANewQuestionnaireButIClickOnTheCancelButton()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.scrollToQuestionnaireTitle();
        PDPrescriptionPage.clickButtonThreePointsQuestionnaire();
        PDPrescriptionPage.clickButtonNewQuestionnaire();
        PDPrescriptionPage.clickDropDownQuestionnaireCopy();
        PDPrescriptionPage.inputDataQuestionnaireName();
        PDPrescriptionPage.clickButtonCancelSaveNewQuestionnaire();
        PDPrescriptionPage.clickButtonArrowUp();

    }

    @And("I try to save the prescription for APD treatment with an infusion volume greater than the total volume, but the system cancels the prescription")
    public void iTryToSaveThePrescriptionForAPDTreatmentWithAnInfusionVolumeGreaterThanTheTotalVolumeButTheSystemCancelsThePrescription()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickDropDownTypeOfInfusion();
        PDPrescriptionPage.clickButtonDropDownTreatment();
        PDPrescriptionPage.clickButtonDropDownWeekdays();
        PDPrescriptionPage.inputDataTherapyTime();
        PDPrescriptionPage.inputDataUrineVolume();
        PDPrescriptionPage.inputDataTargetUf();
        PDPrescriptionPage.inputDataDryWeight();
        PDPrescriptionPage.clickButtonAddExchange();
        PDPrescriptionPage.dataAddExchange();
        PDPrescriptionPage.clickSaveAddExchange();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickSavePrescription();
        PDPrescriptionPage.clickButtonOkWarning();

    }

    @And("I try to save the prescription for CAPD treatment without concentrations in the exchanges")
    public void iTryToSaveThePrescriptionForCAPDTreatmentWithoutConcentrationsInTheExchanges()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonAddExchange();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickButtonCancelPrescription();
    }

    @And("I try to save the prescription for APD with low treatment time")
    public void iTryToSaveThePrescriptionForAPDWithLowTreatmentTime()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickDropDownTypeOfInfusion();
        PDPrescriptionPage.clickButtonDropDownTreatment();
        PDPrescriptionPage.clickButtonDropDownWeekdays();
        PDPrescriptionPage.inputDataTherapyTimeLowTime();
        PDPrescriptionPage.inputDataUrineVolume();
        PDPrescriptionPage.inputDataTargetUf();
        PDPrescriptionPage.inputDataDryWeight();
        PDPrescriptionPage.clickButtonAddExchange();
        PDPrescriptionPage.dataAddExchange();
        PDPrescriptionPage.clickSaveAddExchange();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickSavePrescription();
        PDPrescriptionPage.clickButtonOkWarning();
    }

    @And("I am trying to add biometric markers with the same biometric data more than once")
    public void iAmTryingToAddBiometricMarkersWithTheSameBiometricDataMoreThanOnce() throws InterruptedException{
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.scrollToBiometricMarket();
        PDPrescriptionPage.clickButtonThreePointsBiometricMarket();
        PDPrescriptionPage.clickButtonNew();
        PDPrescriptionPage.inputDataNewBiometricMarket();
        PDPrescriptionPage.clickButtonSaveBiometricMarket();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickButtonCancelBiometricMarket();
        PDPrescriptionPage.clickButtonArrowUp();
    }

    @And("I try to create a new biometric market with an empty required field")
    public void iTryToCreateANewBiometricMarketWithAnEmptyRequiredField()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.scrollToBiometricMarket();
        PDPrescriptionPage.clickButtonThreePointsBiometricMarket();
        PDPrescriptionPage.clickButtonNew();
        PDPrescriptionPage.cleanInputDateOfOnset();
        PDPrescriptionPage.clickButtonCancelBiometricMarket();
        PDPrescriptionPage.clickButtonArrowUp();
    }

    @Then("I successfully modified the parameter Adjustments")
    public void iSuccessfullyModifiedTheParameterAdjustments()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.titleParameterAdjustments();
        PDPrescriptionPage.clickButtonArrowDownParameterAdjustments();
        PDPrescriptionPage.inputDataMinDrainageVol();
        PDPrescriptionPage.clickButtonArrowUpParameterAdjustments();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickSavePrescription();
    }

    @Then("I trying to add a Home Choice Claria solution")
    public void iTryingToAddAHomeChoiceClariaSolution()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickButtonDropDownSystem();
        PDPrescriptionPage.selectHomeChoiseSystem();
        PDPrescriptionPage.clickButton8Routes();
        PDPrescriptionPage.dragAndDrop1();
        PDPrescriptionPage.clickButtonArrowUp();
    }

    @Then("I saving a new prescription for APD Sleep Safe")
    public void iSavingANewPrescriptionForAPDSleepSafe()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickButtonDropDownSystem();
        PDPrescriptionPage.selectSleepSafeSystem();
        PDPrescriptionPage.clickButtonDropDownWeekdays();
        PDPrescriptionPage.inputDataUrineVolume();
        PDPrescriptionPage.inputDataTargetUf();
        PDPrescriptionPage.inputDataDryWeight();
        PDPrescriptionPage.clickButtonAddCycle();
        PDPrescriptionPage.inputDataLowerVolAssistant();
        PDPrescriptionPage.clickButtonDropDownConcentrationAssistant();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickSavePrescription();


    }

    @Then("I try saving a new prescription for APD Sleep Safe, but I cancel")
    public void iTrySavingANewPrescriptionForAPDSleepSafeButICancel()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickButtonDropDownSystem();
        PDPrescriptionPage.selectSleepSafeSystem();
        PDPrescriptionPage.clickButtonDropDownWeekdays();
        PDPrescriptionPage.inputDataUrineVolume();
        PDPrescriptionPage.inputDataTargetUf();
        PDPrescriptionPage.inputDataDryWeight();
        PDPrescriptionPage.clickButtonAddCycle();
        PDPrescriptionPage.inputDataLowerVolAssistant();
        PDPrescriptionPage.clickButtonDropDownConcentrationAssistant();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickButtonCancelPrescription();
    }

    @Then("I try saving a new prescription with empty Total vol and last infusion, but I cancel")
    public void iTrySavingANewPrescriptionWithEmptyTotalVolAndLastInfusionButICancel()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickButtonDropDownSystem();
        PDPrescriptionPage.selectSleepSafeSystem();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickButtonCancelPrescription();
    }

    @Then("I try saving a new prescription with weekdays empty, the system shall display the error message")
    public void iTrySavingANewPrescriptionWithWeekdaysEmptyTheSystemShallDisplayTheErrorMessage()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickButtonDropDownSystem();
        PDPrescriptionPage.selectSleepSafeSystem();
        PDPrescriptionPage.inputDataUrineVolume();
        PDPrescriptionPage.inputDataTargetUf();
        PDPrescriptionPage.inputDataDryWeight();
        PDPrescriptionPage.clickButtonAddCycle();
        PDPrescriptionPage.inputDataLowerVolAssistant();
        PDPrescriptionPage.clickButtonDropDownConcentrationAssistant();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickSavePrescription();
        PDPrescriptionPage.clickButtonOkWarning();
    }

    @Then("I create new Exchange with system sleep safe")
    public void iCreateNewExchangeWithSystemSleepSafe()throws InterruptedException {

        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonDropDownSystem();
        PDPrescriptionPage.selectSleepSafeSystem();
        PDPrescriptionPage.clickButtonAddCycle();
        PDPrescriptionPage.inputDataExTimeAssistant();
        PDPrescriptionPage.inputDataLowerVolAssistant();
        PDPrescriptionPage.inputDataDwellTimeAssistant();
        PDPrescriptionPage.clickButtonDropDownConcentrationAssistant();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickSavePrescription();
    }

    @Then("I try to create new Exchange with system sleep safe with required field empty")
    public void iTryToCreateNewExchangeWithSystemSleepSafeWithRequiredFieldEmpty()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonDropDownSystem();
        PDPrescriptionPage.selectSleepSafeSystem();
        PDPrescriptionPage.clickButtonAddCycle();
        PDPrescriptionPage.inputDataExTimeAssistant();

        PDPrescriptionPage.inputDataDwellTimeAssistant();
        PDPrescriptionPage.clickButtonDropDownConcentrationAssistant();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickButtonCancelPrescription();
    }

    @Then("I successfully removed Sleep Safe Exchange")
    public void iSuccessfullyRemovedSleepSafeExchange()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonDropDownSystem();
        PDPrescriptionPage.selectSleepSafeSystem();
        PDPrescriptionPage.clickButtonIconDelete();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickSavePrescription();

    }

    @Then("I am trying to save a new Home Choice Claria solution successfully")
    public void iAmTryingToSaveANewHomeChoiceClariaSolutionSuccessfully()throws InterruptedException {

        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickButtonDropDownSystem();
        PDPrescriptionPage.selectHomeChoiseSystem();
        PDPrescriptionPage.clickButton8Routes();
        PDPrescriptionPage.dragAndDrop1();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickSavePrescription();
    }

    @Then("I am trying to create a new CCPD prescription using the Housing Choice System")
    public void iAmTryingToCreateANewCCPDPrescriptionUsingTheHousingChoiceSystem()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickButtonDropDownSystem();
        PDPrescriptionPage.selectHomeChoiseSystem();
        PDPrescriptionPage.clickButtonDropDownTreatment();
        PDPrescriptionPage.inputDataTotalVolume();
        PDPrescriptionPage.clickButtonAddExchange();
        PDPrescriptionPage.dataAddExchange();
        PDPrescriptionPage.clickSaveAddExchange();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickSavePrescription();
    }

    @Then("I try to create a new CCPD prescription using the Home Choice System, but it keeps getting canceled")
    public void iTryToCreateANewCCPDPrescriptionUsingTheHomeChoiceSystemButItKeepsGettingCanceled()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickButtonDropDownSystem();
        PDPrescriptionPage.selectHomeChoiseSystem();
        PDPrescriptionPage.clickButtonDropDownTreatment();
        PDPrescriptionPage.inputDataTotalVolume();
        PDPrescriptionPage.clickButtonAddExchange();
        PDPrescriptionPage.dataAddExchange();
        PDPrescriptionPage.clickSaveAddExchange();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickButtonCancelPrescription();
    }
}
