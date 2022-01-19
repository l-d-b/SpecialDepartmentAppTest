package PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    public void navigateToRegistrationPage(){
        driver.navigate().to("http://localhost:3000/registration");
    }

    public void setFirstName(String firstNameInput) {
        wait.until(ExpectedConditions.visibilityOf(firstName));
        firstName.sendKeys(firstNameInput);
    }

    public void setLastName(String lastNameInput) {
        lastName.sendKeys(lastNameInput);
    }

    public void setEmail(String emailInput) {
        email.sendKeys(emailInput);
    }

    public void setBirthDate(String birthDateInput) {
        String month = birthDateInput.substring(0, 2);
        System.out.println(month);
        String day = birthDateInput.substring(2, 4);
        System.out.println(day);
        String year = birthDateInput.substring(4);
        System.out.println(year);
        birthDate.click();
        birthDate.sendKeys(Keys.ARROW_LEFT);
        birthDate.sendKeys(Keys.ARROW_LEFT);
        birthDate.sendKeys(month);
        wait.withTimeout(Duration.ofSeconds(3));
        birthDate.sendKeys(day);
        wait.withTimeout(Duration.ofSeconds(3));
        birthDate.sendKeys(year);
        birthDate.sendKeys(Keys.TAB);
        wait.withTimeout(Duration.ofSeconds(3));

    }

    public void setPassword(String passwordInput) {
        password.sendKeys(passwordInput);
    }

    public void setPasswordAgain(String passwordAgainInput) {
        passwordAgain.sendKeys(passwordAgainInput);
    }

    public void setRadioButton(String userType) {
        switch (userType) {
            case "USER" -> userRadio.click();
            case "WORKER" -> workerRadio.click();
        }
    }

    public void clickSubmit() {
        submitButton.click();
    }

    public void clickDetailSubmit() {
        detailsSubmit.click();
    }

    public void setDescription(String descriptionInput) {
        description.sendKeys(descriptionInput);
    }

    public void setPhoneNumber(String phoneNumberInput) {
        phoneNumber.sendKeys(phoneNumberInput);
    }
}
