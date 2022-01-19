package PageFactory;

import click.webelement.pagefactory.parameterized.DefaultParameterProvider;
import click.webelement.pagefactory.parameterized.FindByParameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

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



    public MainPageWorkObject(String workObject) {
        DefaultParameterProvider.properties.set(Map.of("id.text", workObject));
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    }

    public int returnNumberOfWorkersWhereProfessionIsAppeared(){
        List<WebElement> workers = driver.findElements(By.xpath("//div[@class='worker-card']"));
        return workers.size();
    }

    public void clickOnExtraSearchMenuPoint(){
        extraSearchMenuPoint.click();
    }

    public void clickOnWorkObjectMenuPoint(){
        driver.findElement(By.xpath("//div[@id='workObjectExtraSearch']")).click();
    }

    public void clickOnRadioButton(){
        Actions actions = new Actions(driver);
        actions.moveToElement(workObject).click().perform();
    }
}
