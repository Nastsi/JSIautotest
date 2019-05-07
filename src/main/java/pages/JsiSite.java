package pages;

import org.openqa.selenium.WebDriver;

public class JsiSite {
    WebDriver webDriver;

    public JsiSite(WebDriver driver)
    {
        webDriver = driver;
    }

    public HomePage homePage() {return new HomePage((webDriver));}
    public OrderPage orderPage() {return new OrderPage(webDriver);}
    public AdminOrderPage adminOrderPage() {return new AdminOrderPage(webDriver);}
    public FollowUpPage followUpPage() {return new FollowUpPage(webDriver);}
    public SamplesPage samplesPage() {return new SamplesPage();}
}
