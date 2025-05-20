package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class HospitalizationPage extends BasePage<HospitalizationPage>{


    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Hospitalisation')]")
    private WebElement titleHospitalization;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_divBotones\"]/button")
    private WebElement threeButtonsDropdownMenuHospitalization;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'NEW')]")
    private WebElement newButtonLineHospitalization;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_dvHospitalizacion_rcbTipoIngreso_Arrow\"]")
    private WebElement dropdownButtonTypeOfAdmission;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_dvHospitalizacion_rcbCentroHosp_Arrow\"]")
    private WebElement dropdownButtonHospital;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_dvHospitalizacion_rcbMedico_Arrow\"]")
    private WebElement dropdownButtonPhysician;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_dvHospitalizacion_rtbMotivo\"]")
    private WebElement textAreaReasonForAdmission;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_saveButton\"]")
    private WebElement saveButtonHospitalization;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_deleteButton\"]")
    private WebElement deleteButtonHospitalization;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Associate additional examination')]")
    private WebElement associateAdditionalExaminationButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_dvHospitalizacion_rdpFechaIngreso_dateInput\"]")
    private WebElement dateOfAdmissionInput;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_relacionarPruebasComplementarias_C_listPruebas_i0\"]/span/div/label")
    private WebElement selectAdditionalStudyFirstFile;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_relacionarPruebasComplementarias_C_btnRelacionarPrueba\"]")
    private WebElement saveButtonForAttached;

    @FindBy(how = How.XPATH, using = "(//a[normalize-space()='Top'])[1]")
    private WebElement upButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menuRepeaterPanel\"]/div/div/div[1]")
    private WebElement leftButton;

    //*********Page Methods*********

    public void selectAdditionalStudyFile() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(selectAdditionalStudyFirstFile);
        pause(500);
        driver.switchTo().parentFrame();
    }
    public void clickSaveAttachedAdditionalStudy() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(saveButtonForAttached);
        driver.switchTo().parentFrame();
        pause(500);
        click(upButton);
        pause(100);
        click(leftButton);
    }




    public void resetReceptionDate(){
        driver.switchTo().frame("frmContenido");
        dateOfAdmissionInput.sendKeys(Keys.CONTROL + "a");
        dateOfAdmissionInput.sendKeys(Keys.DELETE);
        dateOfAdmissionInput.sendKeys(Keys.ENTER);
        driver.switchTo().parentFrame();

    }

    public void writeDateOfAdmission(String date) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        dateOfAdmissionInput.sendKeys(Keys.HOME);
        write(dateOfAdmissionInput,date);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void writeReasonForAdmission(String Reason) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        write(textAreaReasonForAdmission,Reason);
        pause(500);
        driver.switchTo().parentFrame();
    }
    public void selectPhysician(String Physician) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(dropdownButtonPhysician);
        pause(500);
        By loc = By.xpath("//*[contains(text(),'"+Physician+"')]");
        click(loc);
        driver.switchTo().parentFrame();
    }

    public void selectHospital(String Hospital) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(dropdownButtonHospital);
        pause(500);
        By loc = By.xpath("//*[contains(text(),'"+Hospital+"')]");
        click(loc);
        driver.switchTo().parentFrame();
    }

    public void selectTypeOfAdmission(String TypeAdmission) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(dropdownButtonTypeOfAdmission);
        pause(500);
        By loc = By.xpath("//*[contains(text(),'"+TypeAdmission+"')]");
        click(loc);
        driver.switchTo().parentFrame();
    }


    public void isDisplayedTheTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(titleHospitalization);
        titleHospitalization.isDisplayed();
    }

    public void clickThreePointsButton(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(threeButtonsDropdownMenuHospitalization);
        driver.switchTo().parentFrame();
    }
    public void clickSaveButton() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(saveButtonHospitalization);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickDeleteButton() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(deleteButtonHospitalization);
        pause(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.switchTo().parentFrame();

    }

    public void clickAssociateAdditionalExaminationButton() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(associateAdditionalExaminationButton);
        pause(1000);
        driver.switchTo().parentFrame();
    }




    public void clickNewButton() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(newButtonLineHospitalization);
        pause(1000);
        driver.switchTo().parentFrame();
    }


    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********







}
