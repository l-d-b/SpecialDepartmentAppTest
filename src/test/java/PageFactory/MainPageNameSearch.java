package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class MainPageNameSearch extends BasePage{

    @FindBy(xpath = "//div[@id='sidebar']//div[text()='Extra Search']")
    WebElement extraSearchMenuPoint;

    @FindBy(xpath = "//input[@id='nameSearch']")
    WebElement searchField;

    @FindBy(xpath = "//div[@id='worker-card-container']//div[@class='worker-card']")
    WebElement worker;


    public MainPageNameSearch() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    }
}
