package PageFactory;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BasePage {

    @FindBy(xpath="//a[@href='/login']") WebElement logButton;

    @FindBy(xpath="//*[@class='logged-user']") WebElement loggedUser;

    public MainPage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT, POLLING));
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    }

    public void navigateToMainPage(){
        driver.navigate().to("http://localhost:3000/");
    }


    public void pressLogoutButton() {
        wait.until(ExpectedConditions.visibilityOf(logButton));
        logButton.click();
    }

    public String getLoggedUser() {
        return loggedUser.getText();
    }

    public String getLoggingButtonText() {
        return logButton.getText();
    }

    public boolean loggedUserIsVisible() {
        try {
            System.out.println(loggedUser.getText());
            return loggedUser.isDisplayed();

        } catch (NoSuchElementException e) {
            System.out.println("Element not exists");
            return false;
        }

    }
}
