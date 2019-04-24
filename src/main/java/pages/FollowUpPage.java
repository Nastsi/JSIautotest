package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FollowUpPage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public FollowUpPage(WebDriver driver)
    {
        webDriver = driver;
        wait = new WebDriverWait(webDriver, 30);

        PageFactory.initElements(webDriver, this);
    }
}
