package PageFactory;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage{

    @FindBy(id="email") WebElement email;
    @FindBy(id="password") WebElement password;
    @FindBy(xpath="//button[text()='Submit']")WebElement loginSubmit;
    @FindBy(id="errorMessage")WebElement warning;
    @FindBy(xpath="//*[@class='login-block']") WebElement loginBlock;


    public LoginPage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT, POLLING));
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    }

    public void navigateToLoginPage() {
        driver.navigate().to("http://localhost:3000/login");
    }

    public void loginCorrectly(String emailInput) {
        driver.navigate().to("http://localhost:3000/login");
        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys(emailInput);
        wait.withTimeout(Duration.ofSeconds(2));
        password.sendKeys("1234");
        loginSubmit.click();
    }

    public boolean loginBlockIsVisible() {
        return loginBlock.isDisplayed();
    }

    public void setEmail(String usernameInput) {
        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys(usernameInput);
    }

    public void setPassword(String passwordInput) {
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(passwordInput);
    }

    public void pressSubmit() {
        wait.withTimeout(Duration.ofSeconds(2));
        loginSubmit.click();
    }

    public String getWarning() {
        return warning.getText();
    }

}
