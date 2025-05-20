package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class PDPrescriptionPage extends BasePage<PDPrescriptionPage>{


    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Prescription')]")
    private WebElement titlePrescription;



    public void isDisplayedTheTittle(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        waitElements(titlePrescription);
        titlePrescription.isDisplayed();
        driver.switchTo().parentFrame();
    }


    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********







}
