package PageFactory;

import click.webelement.pagefactory.parameterized.DefaultParameterProvider;
import click.webelement.pagefactory.parameterized.FindByParameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainPageWorkObject extends BasePage{


    @FindBy(xpath = "//div[@id='sidebar']//div[text()='Extra Search']")
    WebElement extraSearchMenuPoint;

    @FindBy(xpath = "//div[@id='workObjectExtraSearch']")
    WebElement workObjectMenuPoint;

    @FindByParameterized(xpath = "//input[@id='{wec:id.text}']")
    WebElement workObject;

    @FindBy(xpath = "//div[@id='worker-card-container']//div[@class='worker-card']")
    List<WebElement> workers;

    public MainPageWorkObject(String workObject) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT, POLLING));
        DefaultParameterProvider.properties.set(Map.of("id.text", workObject));
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    }

    public int returnNumberOfWorkersWhereProfessionIsAppeared() {
        return workers.size();
    }

    public void clickOnExtraSearchMenuPoint(){
        extraSearchMenuPoint.click();
    }

    public void clickOnWorkObjectMenuPoint(){
        workObjectMenuPoint.click();
    }

    public void clickOnRadioButton(){
        workObject.click();
        wait.until(ExpectedConditions.elementSelectionStateToBe(workObject, true));
    }
}
