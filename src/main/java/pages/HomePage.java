package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver)
    {
        webDriver = driver;
        wait = new WebDriverWait(webDriver, 10);

        PageFactory.initElements(webDriver, this);
    }

    @FindBy (className = "footer-subscribe__submit")
    WebElement subscribeButton;

    @FindBy (xpath = "//section[5]/div/div/div/div[2]/div/button")
    WebElement quantitySelector;

    @FindBy(xpath = "//section[5]/div/div/div/div[2]/div/ul/li")
    WebElement quantity500;

    @FindBy(xpath = "//section[5]/div/div/div/div[2]/div/ul/li[2]")
    WebElement quantity1000;

    @FindBy(xpath = "//section[5]/div/div/div/div[2]/div/ul/li[3]")
    WebElement quantity2500;

    @FindBy(xpath = "//div[2]/div/ul/li[4]")
    WebElement quantity5000;

    @FindBy(xpath = "//div[2]/div/ul/li[5]")
    WebElement quantity10000;

    @FindBy (xpath = "//div/div[3]/div/button")
    WebElement sizeSelector;

    @FindBy(xpath = "//div[3]/div/ul/li")
    WebElement size2x4;

    @FindBy(xpath = "//div[3]/div/ul/li[2]")
    WebElement size4x4;

    @FindBy(xpath = "//div[3]/div/ul/li[3]")
    WebElement size4x6;

    @FindBy (xpath = "//div[2]/div/div/div[2]/a")
    WebElement buttonDesignOnly;

    @FindBy (css = ".order-now-plan--red .button")
    WebElement buttonEarlyBird;

    @FindBy (css = ".order-now-plan--green .button")
    WebElement buttonStandart;

    @FindBy (css = ".order-now__plans-column:nth-child(4) .button")
    WebElement buttonQuickTurn;

    public void startOrder(String quantity, String size, String plan) {
        if (plan.compareTo("Design only") == 0) buttonDesignOnly.click();
        else {
            quantitySelector.click();
            if (quantity.compareTo("500") == 0) quantity500.click();
            else if (quantity.compareTo("1000") == 0) quantity1000.click();
            else if (quantity.compareTo("2500") == 0) quantity2500.click();
            else if (quantity.compareTo("5000") == 0) quantity5000.click();
            else if (quantity.compareTo("10000") == 0) quantity10000.click();

            sizeSelector.click();
            if (size.compareTo("2x4") == 0) size2x4.click();
            else if (size.compareTo("4x4") == 0) size4x4.click();
            else if (size.compareTo("4x6") == 0) size4x6.click();

            JavascriptExecutor js = (JavascriptExecutor) webDriver;

            if (plan.compareTo("Early Bird") == 0) js.executeScript("arguments[0].click();", buttonEarlyBird);
            else if (plan.compareTo("Standard") == 0) js.executeScript("arguments[0].click();", buttonStandart);
            else if (plan.compareTo("Quick-turn") == 0) js.executeScript("arguments[0].click();", buttonQuickTurn);
        }
    }

    public void clickSubscribeSubmit() {
        subscribeButton.click();
    }
}
