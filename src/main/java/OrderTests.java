import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.JsiSite;

public class OrderTests {

    WebDriver webDriver;
    WebDriverWait wait;
    JsiSite site;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, 30);

        site = new JsiSite(webDriver);

        webDriver.get("http://95.213.252.23:3000/");
    }

    @Test
    public void testValidation() throws InterruptedException {
        site.homePage().startOrder("500", "2x4", "Early Bird");

        site.orderPage().firstNameBillingValidation();
        site.orderPage().lastNameBillingValidation();
        site.orderPage().companyBillingValidation();
        site.orderPage().emailBillingValidation();
        site.orderPage().address1BillingValidation();
        site.orderPage().countryBillingValidation();
        site.orderPage().cityBillingValidation();
        site.orderPage().stateBillingValidation();
        site.orderPage().zipBillingValidation();
        site.orderPage().phoneBillingValidation();

        site.orderPage().uncheckUseAsShipping();

        site.orderPage().firstNameShippingValidation();
        site.orderPage().lastNameShippingValidation();
        site.orderPage().companyShippingValidation();
        site.orderPage().emailShippingValidation();
        site.orderPage().address1ShippingValidation();
        site.orderPage().countryShippingValidation();
        site.orderPage().cityShippingValidation();
        site.orderPage().stateShippingValidation();
        site.orderPage().zipShippingValidation();
        site.orderPage().phoneShippingValidation();
    }

    @Test
    public void testReturnToHomePageFromOrder()
    {
        site.homePage().startOrder("500", "2x4", "Early Bird");
        site.orderPage().returnToHomePage();
        String url = webDriver.getCurrentUrl();
        Assert.assertTrue("Didn't return to home page", url.compareTo("http://95.213.252.23:3000/") == 0);
    }

    @Test
    public void testContactInfoOnlyBilling() throws InterruptedException
    {
        site.homePage().startOrder("500", "2x4", "Early Bird");

        site.orderPage().checkStep("Contact Info");

        site.orderPage().enterCredentialsBilling("United States", "New York");
        site.orderPage().clickNext();

        site.orderPage().checkStep("Order Review");
        site.orderPage().checkStepDone("Contact Info");
        site.orderPage().confirmShippingAndBillingIfNoShipping("United States");
    }

    @Test
    public void testContactInfoWithShipping() throws InterruptedException
    {
        site.homePage().startOrder("500", "2x4", "Early Bird");

        site.orderPage().checkStep("Contact Info");

        site.orderPage().enterCredentialsBilling("United States", "New York");
        site.orderPage().uncheckUseAsShipping();
        site.orderPage().enterCredentialShipping("Canada");
        site.orderPage().clickNext();

        site.orderPage().checkStep("Order review");
        site.orderPage().checkStepDone("Contact Info");
        site.orderPage().confirmShippingAndBillingWithShipping("United States", "Canada");
    }

    @Test
    public void testOrderReview()
    {

    }

    @Test
    public void testPaymentValidation()
    {

    }

    @Test
    public void testPayment()
    {

    }

    @Test
    public void testDesignDetails()
    {

    }

    @Test
    public void testDesignOnly()
    {

    }

    @After
    public void cleanUp()
    {
        if (webDriver != null)
            webDriver.quit();
    }
}
