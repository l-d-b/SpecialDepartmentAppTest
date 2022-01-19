package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage extends BasePage {

    @FindBy (xpath="//input[@id='firstName']") WebElement firstName;
    @FindBy (xpath="//input[@id='lastName']") WebElement lastName;
    @FindBy (xpath="//input[@id='email']") WebElement email;
    @FindBy (xpath="//input[@id='userBirthOfDate']") WebElement birthDate;
    @FindBy (xpath="//input[@id='password']") WebElement password;
    @FindBy (xpath="//input[@id='passwordAgain']") WebElement passwordAgain;
    @FindBy (xpath="//input[@id='USER']") WebElement userRadio;
    @FindBy (xpath="//input[@id='WORKER']") WebElement workerRadio;
    @FindBy (xpath="//button[text()='Submit']") WebElement submitButton;

    @FindBy (xpath="//h2[text()='Description']//following::textarea")
    WebElement description;

    @FindBy (xpath="//input[@name='phoneNumber']") WebElement phoneNumber;
    @FindBy (xpath="//button[@id='actionButtons']") WebElement detailsSubmit;

    public RegistrationPage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT, POLLING));
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    }
}
