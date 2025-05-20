package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class SupplementaryTestsModulePage extends BasePage<SupplementaryTestsModulePage>{


    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Complementary tests')]")
    private WebElement titleSupplementaryTests;

    @FindBy(how = How.XPATH, using = "//*[@id=\"dropDownMenuTp\"]")
    private WebElement MenuButton;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/ct-main/div[2]/div/div/div[1]/ct-three-points-menu/versia-ui-three-points-menu/ul/li/ul/ul/li[1]/button")
    private WebElement CreateButton;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/ct-main/div[2]/div/div/div[1]/ct-three-points-menu/versia-ui-three-points-menu/ul/li/ul/ul/li[2]/button")
    private WebElement FilterButton;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/ct-main/div[2]/div/div/div[2]/ct-tests-list/div/div/div[1]/ct-test/div/form/div[1]/div[2]/div[1]/versia-kendo-datepicker/kendo-datepicker/kendo-dateinput/input")
    private WebElement InputReception;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/ct-main/div[2]/div/div/div[2]/ct-tests-list/div/div/div/ct-test/div/form/div[1]/div[1]/div[1]/versia-kendo-datepicker/kendo-datepicker/kendo-dateinput/input")
    private WebElement InputDateOfRecord;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/ct-main/div[2]/div/div/div[2]/ct-tests-list/div" +
            "/div/div[1]/ct-test/div/form/div[1]/div[1]/div[2]/versia-codes/versia-kendo-dropdownlist/kendo-dropdownlist/button")
    private WebElement MenuTestButton;

    @FindBy(how = How.XPATH, using = "/html/body/div")
    private WebElement inputTextDescription;

    @FindBy(how = How.XPATH, using = "//*[contains(@title, 'Save')]")
    private WebElement saveButton;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/ct-main/div[2]/div/div/div[2]/ct-tests-list/div/div/div/ct-test/div/form/div[3]/div/div/button[1]")
    private WebElement editButton;

    @FindBy(how = How.XPATH, using = "//*[contains(@value,'<p>QATest</p>')]")
    private WebElement descriptionQA;

    @FindBy(how = How.XPATH, using = "//*[contains(@value,'<p>QATestEdit</p>')]")
    private WebElement descriptionQAEdit;

    @FindBy(how = How.XPATH, using = "//*[contains(@value,'<p>QATestAttached</p>')]")
    private WebElement descriptionQATestAttached;

    @FindBy(how = How.XPATH, using ="/html/body/app-root/kendo-popup/div/div/kendo-list/div/ul/li[1]/span")
    private WebElement anemiaTest;

    @FindBy(how = How.XPATH, using ="(//*[name()='path'][@fill='currentColor'])[6]")
    private WebElement buttonDeleteLastCreation;
    @FindBy(how = How.XPATH, using ="//*[contains(@data-icon, 'trash')]")
    private WebElement buttonDeleteLastCreationWithAccesses;

    @FindBy(how = How.XPATH, using ="//*[contains(@class,'btn btn-primary') and contains(text(),'Yes')]")
    private WebElement buttonConfirmDelete;

    @FindBy(how = How.XPATH, using ="//*[contains(@title, 'Cancel')]")
    private WebElement buttonCancelTestCreation;

    @FindBy(how = How.XPATH, using ="/html/body/app-root/div/div/ct-main/div[2]/div/div/div[2]/ct-tests-list/div/div/div/ct-test/div/form/div[1]/div[1]/div[1]/versia-kendo-datepicker/kendo-datepicker/kendo-actionsheet")
    private WebElement alertDateOfRecord;

    @FindBy(how = How.XPATH, using ="//span[contains(text(),'No data found.')]")
    private WebElement noDataFoundText;

    @FindBy(how = How.XPATH, using ="/html/body/app-root/div/div/ct-main/versia-ui-hidden-side-nav/div/ct-category-filter/div/div/div/versia-kendo-multiselect/kendo-multiselect/div/kendo-searchbar/input")
    private WebElement categoryDropdown;

    @FindBy(how = How.XPATH, using ="/html/body/app-root/kendo-popup/div/div/kendo-list/div/ul/li[1]/span")
    private WebElement test1Filter;

    @FindBy(how = How.XPATH, using ="//*[contains(text(),'Error')]")
    private WebElement errorAlertCantBeDeleted;

    @FindBy(how = How.XPATH, using ="//button[contains(text(),'Ok')]")
    private WebElement errorAlertCantBeDeletedAcceptButton;

    @FindBy(how = How.XPATH, using ="//h4[contains(text(),'Confirmation')]")
    private WebElement confirmationWindowsOpenTittle;

    @FindBy(how = How.XPATH, using ="//button[contains(text(),'No')]")
    private WebElement confirmationWindowsOpenNoButton;

    @FindBy(how = How.XPATH, using ="//button[contains(text(),'Yes')]")
    private WebElement confirmationWindowsOpenYesButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menuRepeaterPanel\"]/div/div/div[1]")
    private WebElement leftButton;
    /*Methods*/


    public void isDisplayedTheTittle(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        titleSupplementaryTests.isDisplayed();
        driver.switchTo().parentFrame();
    }

    public void isDisplayedMenuButton(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        MenuButton.isDisplayed();
        driver.switchTo().parentFrame();
    }

    public void openMenu(){
        driver.switchTo().frame(0);
        click(MenuButton);
        driver.switchTo().parentFrame();
    }
    public void createComplementaryTest(){
        driver.switchTo().frame(0);
        click(CreateButton);
        driver.switchTo().parentFrame();
    }
    public void filterComplementaryTest(){
        driver.switchTo().frame(0);
        click(FilterButton);
        driver.switchTo().parentFrame();
    }
    public void filterDropDownButton(){
        driver.switchTo().frame(0);
        click(categoryDropdown);
        driver.switchTo().parentFrame();
    }
    public void filterDropDownTest1(){
        driver.switchTo().frame(0);
        click(test1Filter);
        driver.switchTo().parentFrame();
    }

    public void writeReceptionDate(String receptionDate){
        driver.switchTo().frame("frmContenido");
        InputReception.sendKeys(Keys.HOME);
        write(InputReception,receptionDate);
        driver.switchTo().parentFrame();

    }

    public void writeDateOfRecord(String dateOfRecord){
        driver.switchTo().frame("frmContenido");
        InputDateOfRecord.sendKeys(Keys.HOME);
        write(InputDateOfRecord,dateOfRecord);
        driver.switchTo().parentFrame();

    }

    public void resetReceptionDate(){
        driver.switchTo().frame("frmContenido");
        InputDateOfRecord.sendKeys(Keys.CONTROL + "a");
        InputDateOfRecord.sendKeys(Keys.DELETE);
        InputDateOfRecord.sendKeys(Keys.ENTER);
        driver.switchTo().parentFrame();

    }

    public void clickMenuTestButton(){
        driver.switchTo().frame("frmContenido");
        click(MenuTestButton);
        driver.switchTo().parentFrame();
    }
    public void selectTest(){
        driver.switchTo().frame("frmContenido");
        click(anemiaTest);
        driver.switchTo().parentFrame();
    }

    public void writeDescription(String description){
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame(0);
        inputTextDescription.sendKeys(Keys.CONTROL + "a");
        inputTextDescription.sendKeys(Keys.DELETE);
        write(inputTextDescription,description);
        driver.switchTo().parentFrame();
    }
    public void clickSaveButton() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(this.saveButton);
        driver.switchTo().parentFrame();
        pause(100);
        click(leftButton);

    }
    public void isDisplayedDescription() throws InterruptedException {
        pause(2000);
        driver.switchTo().frame("frmContenido");
        descriptionQA.isDisplayed();
        driver.switchTo().parentFrame();
    }



    public void clickEditButton() throws InterruptedException {
        pause(200);
        driver.switchTo().frame(0);
        click(this.editButton);
        driver.switchTo().parentFrame();
    }

    public void deleteLastCreationTest() throws InterruptedException {

            driver.switchTo().parentFrame();
            driver.switchTo().frame(0);
            click(buttonDeleteLastCreation);
            pause(1000);
            buttonConfirmDelete.click();
            waitElements(noDataFoundText);
            driver.switchTo().parentFrame();

    }

    public void NoDataFoundTextDisplayed(){

        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        waitElements(noDataFoundText);
        driver.switchTo().parentFrame();

    }
    public void pushDeleteSupplementaryTestButton(){

        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(buttonDeleteLastCreation);
        driver.switchTo().parentFrame();

    }
    public void confirmationWidowOpenAndPushNo(){

        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        confirmationWindowsOpenTittle.isDisplayed();
        click(confirmationWindowsOpenNoButton);
        driver.switchTo().parentFrame();

    }
    public void confirmationWidowOpenAndPushYes(){

        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        confirmationWindowsOpenTittle.isDisplayed();
        click(confirmationWindowsOpenYesButton);
        driver.switchTo().parentFrame();

    }

    public void deleteTwoLastCreationTest() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(buttonDeleteLastCreation);
        pause(1000);
        buttonConfirmDelete.click();
        pause(1000);
        click(buttonDeleteLastCreation);
        pause(1000);
        buttonConfirmDelete.click();
        pause(1000);
        waitElements(noDataFoundText);
        driver.switchTo().parentFrame();
    }
    public void deleteSupplementaryTestCreation() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(buttonDeleteLastCreationWithAccesses);
        pause(1000);
        buttonConfirmDelete.click();
    }
    public void errorCantBeDeletedIsVisible() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        pause(1000);
        errorAlertCantBeDeleted.isDisplayed();
        click(errorAlertCantBeDeletedAcceptButton);
        driver.switchTo().parentFrame();
    }

    public void clickCancelButton(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(buttonCancelTestCreation);
        driver.switchTo().parentFrame();
    }
    public void noDataFoundDisplayed() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        pause(3000);
        noDataFoundText.isDisplayed();
        driver.switchTo().parentFrame();
    }



    public void isDisplayedDescriptionEdit() throws InterruptedException {
        pause(2000);
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        descriptionQAEdit.isDisplayed();
        driver.switchTo().parentFrame();
    }
    public void isDisplayedDescriptionAttached() throws InterruptedException {
        pause(2000);
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        descriptionQATestAttached.isDisplayed();
        driver.switchTo().parentFrame();
    }

    public void isDisplayedAlert(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        alertDateOfRecord.isDisplayed();
        driver.switchTo().parentFrame();
    }
    public void acceptLinkComplementaryTestToThisAccess(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(buttonConfirmDelete);
        driver.switchTo().parentFrame();
    }

    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********







}
