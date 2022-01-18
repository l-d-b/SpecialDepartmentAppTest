package PageFactory;

import click.webelement.pagefactory.parameterized.DefaultParameterProvider;
import click.webelement.pagefactory.parameterized.FindByParameterized;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.Map;


public class MainPage extends BasePage {

    @FindBy(xpath = "//div[@id='sidebar']//div[text()='Professions']")
    WebElement professionsMenuPoint;

    @FindByParameterized(xpath = "//div[@id='sidebar']//div[text()='Professions']//following-sibling::ul//li[text()='{wec:li.text}']")
    public WebElement profession;

    public MainPage(String profession) {
        DefaultParameterProvider.properties.set(Map.of("li.text", profession));
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    }

    public void navigateToMainPage(){
        driver.navigate().to("http://localhost:3000/");
    }

    public void clickOnProfessionsMenuPoint(){
        professionsMenuPoint.click();
    }
}
