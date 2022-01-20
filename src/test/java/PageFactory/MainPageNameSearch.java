package PageFactory;

import net.bytebuddy.implementation.bytecode.ShiftRight;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class MainPageNameSearch extends BasePage{

    @FindBy(xpath = "//input[@id='nameSearch']")
    WebElement searchField;

    @FindBy(xpath = "//p[@id='no-worker-found']")
    WebElement noWorkerFoundMessage;


    public MainPageNameSearch() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    }


    public void sendKeyToSearchField(String name){
        searchField.sendKeys(name);
    }

    public String getWorkerName(String input) {
        try {
            return driver.findElement(By.xpath("//div[@id='worker-card-container']//div[@class='worker-card']//h3[contains(text(),'" + input + "')]")).getText();
        } catch (NoSuchElementException e) {
            System.out.println("Element not exists");
            return getNoWorkerFoundMessage();
        }
    }

    public String getNoWorkerFoundMessage() {
        return noWorkerFoundMessage.getText();
    }

    public String actualWorker(String name){
        if(getWorkerName(name).contains(name)){
            return getWorkerName(name);

        } else {
            return getNoWorkerFoundMessage();
        }
    }

}
