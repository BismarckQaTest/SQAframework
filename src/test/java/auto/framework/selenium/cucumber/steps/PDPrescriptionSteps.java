package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.AccessesPage;
import auto.framework.selenium.pages.baxter_page.PDPrescriptionPage;
import io.cucumber.java.en.When;

public class PDPrescriptionSteps {

    @LazyAutowired

    private PDPrescriptionPage PDPrescriptionPage;




    @When("I check the module PD Prescription appear correctly")
    public void iCheckTheModuleAccessesAppearCorrectly() {
        PDPrescriptionPage.isDisplayedTheTittle();
    }













}
