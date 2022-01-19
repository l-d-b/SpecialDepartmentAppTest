package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public static WebDriver driver;
    protected WebDriverWait wait;
    protected static final int TIMEOUT = 5;
    protected static final int POLLING = 100;

    public BasePage() {

        if (driver == null) {
            //Set the path for chromedriver
            System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT, POLLING));
            driver.manage().window().maximize();
        }
    }

    public void switchToAlert() {
        driver.switchTo().alert().accept();
    }

    public void tearDown() {
        driver.quit();
        driver = null;
    }
}


