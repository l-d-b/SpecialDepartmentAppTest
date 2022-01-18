package PageFactory;

import click.webelement.pagefactory.parameterized.DefaultParameterProvider;
import click.webelement.pagefactory.parameterized.FindByParameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainPageProfession extends BasePage {
    private List<WebElement> professions = new ArrayList<>();

    @FindBy(xpath = "//div[@id='sidebar']//div[text()='Professions']")
    WebElement professionsMenuPoint;

    @FindByParameterized(xpath = "//div[@id='sidebar']//div[text()='Professions']//following-sibling::ul//li[contains(text(),'{wec:li.text}')]")
    public WebElement professionMenuPoint;

    public MainPageProfession(String professionMenuPoint) {
        DefaultParameterProvider.properties.set(Map.of("li.text", professionMenuPoint));
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    }

    public void navigateToMainPage(){
        driver.navigate().to("http://localhost:3000/");
    }

    public void clickOnProfessionsMenuPoint(){
        professionsMenuPoint.click();
    }

    public int returnNumberOfWorkersWhereProfessionIsAppeared(String input){
        professions = driver.findElements(By.xpath("//span[@class='professions']//span[contains(text(),'" + input + "')]"));
        return professions.size();
    }
}
