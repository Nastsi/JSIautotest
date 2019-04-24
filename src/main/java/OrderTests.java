import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        site.homePage().startOrder("500", "2x4", "Early Bird");
    }

    @Test
    public void testContactInfoValidation() throws InterruptedException {

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
    public void testReturnToHomePageFromOrder() {
        site.orderPage().goBackButton();
        String url = webDriver.getCurrentUrl();
        Assert.assertTrue("Didn't return to home page", url.compareTo("http://95.213.252.23:3000/") == 0);
    }

    @Test
    public void testContactInfoOnlyBilling() {
        site.orderPage().checkStep("Contact Info");

        String state = site.orderPage().enterCredentialsBilling("Amelia", "Pond", "Atlass Industries", "amelia@teamdoctor.com", "123 street, 54", "456 street, 5",
                "United States", "New York", "1234567", "79043222367");
        site.orderPage().clickNext();

        site.orderPage().checkStep("Order Review");
        site.orderPage().checkStepDone("Contact Info");
        site.orderPage().confirmShippingAndBillingIfNoShipping("Amelia Pond", "Atlass Industries", "123 street, 54 ,", "456 street, 5", "New York", state, "1234567");
    }

    @Test
    public void testContactInfoWithShipping() {
        site.orderPage().checkStep("Contact Info");

        String stateBilling = site.orderPage().enterCredentialsBilling("Amelia", "Pond", "Atlass Industries", "amelia@teamdoctor.com", "123 street, 54", "456 street, 5",
                "United States", "New York", "1234567", "79043222367");
        site.orderPage().uncheckUseAsShipping();
        String stateShipping = site.orderPage().enterCredentialShipping("Rory", "Williams", "Team Doctor", "rory@teamdoctor.com", "456 street, 78", "Baker street 50",
                "Canada", "Ulverton", "7894561", "79515879564");
        site.orderPage().clickNext();

        site.orderPage().checkStep("Order Review");
        site.orderPage().checkStepDone("Contact Info");
        site.orderPage().confirmShippingAndBillingWithShipping("Amelia Pond", "Atlass Industries", "123 street, 54 ,", "456 street, 5","New York",
                stateBilling, "1234567", "Rory Williams", "Team Doctor", "456 street, 78 ,", "Baker street 50", "Ulverton",
                stateShipping, "7894561");
    }

    @Test
    public void testOrderReview() throws InterruptedException {
        String state = site.orderPage().enterCredentialsBilling("Amelia", "Pond", "Atlass Industries", "amelia@teamdoctor.com", "123 street, 54", "456 street, 5",
                "United States", "New York", "1234567", "79043222367");
        site.orderPage().clickNext();

        site.orderPage().checkStep("Order Review");
        site.orderPage().checkStepDone("Contact Info");
        site.orderPage().confirmShippingAndBillingIfNoShipping("Amelia Pond", "Atlass Industries", "123 street, 54 ,", "456 street, 5", "New York", state, "1234567");

        site.orderPage().chooseExtra(true, true, true);
        site.orderPage().chooseShipping("2-day USA JSI");
        site.orderPage().enterPromoCode("test");
        site.orderPage().wait1000ms();
        String cards = site.orderPage().getPricingOfCards();
        String disc = site.orderPage().getPricingOfDiscount();
        String extra = site.orderPage().getPricingOfExtras();
        String ship = site.orderPage().getPricingOfShipping();
        site.orderPage().goBackButton();

        site.orderPage().checkStep("Contact Info");
        site.orderPage().checkSummaryContactInfoAfterReview(cards, disc, extra, ship);
    }

    @Test
    public void testPayment() throws InterruptedException {
        site.orderPage().enterCredentialsBilling("Amelia", "Pond", "Atlass Industries", "amelia@teamdoctor.com", "123 street, 54", "456 street, 5",
                "United States", "New York", "1234567", "79043222367");
        site.orderPage().clickNext();

        site.orderPage().wait1000ms();

        site.orderPage().chooseShipping("2-day USA JSI");
        site.orderPage().clickNext();

        site.orderPage().wait1000ms();

        site.orderPage().checkStepDone("Contact Info");
        site.orderPage().checkStep("Payment");

        site.orderPage().cardNameValidation();
        site.orderPage().cardNumberValidation();
        site.orderPage().cardCVVValidation();
        site.orderPage().cardMonthEnter("05");
        site.orderPage().cardYearEnter("2021");
        site.orderPage().clickConfirm();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("order-success__title")));
    }

    @Test
    public void testEmailChange() throws InterruptedException {
        site.orderPage().enterCredentialsBilling("Amelia", "Pond", "Atlass Industries", "amelia@teamdoctor.com", "123 street, 54", "456 street, 5",
                "United States", "New York", "1234567", "79043222367");
        site.orderPage().clickNext();

        site.orderPage().wait1000ms();

        site.orderPage().chooseShipping("2-day USA JSI");
        site.orderPage().clickNext();

        site.orderPage().wait1000ms();

        site.orderPage().enterCardCredential("Amelia", "4276450018854261", "01", "2020", "587");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("order-success__title")));

        site.orderPage().checkEmail("amelia@teamdoctor.com");
        site.orderPage().enterNewEmail("test123@mail.ru");
        synchronized (wait) {
            wait.wait(4500);
        }
        site.orderPage().checkEmail("test123@mail.ru");
    }

    @Test
    public void testDesignOnly() throws InterruptedException {
        site.orderPage().goBackButton();
        site.homePage().startOrder("", "", "Design only");

        site.orderPage().checkPlanName();
        site.orderPage().checkCardPrice("", "", "Design only");
        String state = site.orderPage().enterCredentialsBilling("Amelia", "Pond", "Atlass Industries", "amelia@teamdoctor.com", "123 street, 54", "456 street, 5",
                "United States", "New York Mills", "1234567", "79043222367");
        site.orderPage().clickNext();

        site.orderPage().wait1000ms();

        site.orderPage().checkHeadlineAgreement();
        site.orderPage().clickAgreement();
        site.orderPage().checkCardPrice("", "", "Design only");
        site.orderPage().clickNext();

        site.orderPage().enterCardCredential("Amelia", "4276450018854261", "01", "2020", "587");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("order-success__title")));
        site.orderPage().isElementPresent("//h2[contains(.,'Payment Successfull.')]");
        site.orderPage().checkCardPrice("", "", "Design only");

        String orderNumber = site.orderPage().getOrderNumber();
        webDriver.get("http://95.213.252.23:3000/admin/");
        site.adminOrderPage().checkOrder(orderNumber, "0", "0", "Design only", "", "United States", "New York Mills", state,false, false,
                false, "none");
    }

    @Test
    public void testDesignOnlyWithExtra() throws InterruptedException {
        site.orderPage().goBackButton();
        site.homePage().startOrder("", "", "Design only");

        site.orderPage().checkPlanName();
        site.orderPage().checkCardPrice("", "", "Design only");
        String state = site.orderPage().enterCredentialsBilling("Amelia", "Pond", "Atlass Industries", "amelia@teamdoctor.com", "123 street, 54", "456 street, 5",
                "United States", "New York", "1234567", "79043222367");
        site.orderPage().clickNext();

        site.orderPage().wait1000ms();

        site.orderPage().checkHeadlineAgreement();
        site.orderPage().chooseExtraDesignOnly(true);
        site.orderPage().clickAgreement();
        site.orderPage().checkSummaryReviewDesignOnly();
        site.orderPage().clickNext();

        site.orderPage().wait1000ms();

        site.orderPage().checkSummaryPaymentDesignOnly("New York");
        site.orderPage().enterCardCredential("Amelia", "4276450018854261", "01", "2020", "587");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("order-success__title")));
        site.orderPage().isElementPresent("//h2[contains(.,'Payment Successfull.')]");

        String orderNumber = site.orderPage().getOrderNumber();
        webDriver.get("http://95.213.252.23:3000/admin/");
        site.adminOrderPage().checkOrder(orderNumber, "", "", "Design only", "", "United States", "New York Mills", state, true, false,
                false, "none");

    }

    @Test
    public void testOrderInAdminWithShipping() throws InterruptedException
    {
        String stateBilling = site.orderPage().enterCredentialsBilling("Amelia", "Pond", "Atlass Industries", "amelia@teamdoctor.com", "123 street, 54", "456 street, 5",
                "United States", "New York", "1234567", "79043222367");
        site.orderPage().uncheckUseAsShipping();
        String stateShipping = site.orderPage().enterCredentialShipping("Rory", "Williams", "Team Doctor", "rory@teamdoctor.com", "456 street, 78", "Baker street 50",
                "United States", "Niagara Falls", "7894561", "79515879564");
        site.orderPage().clickNext();

        site.orderPage().wait1000ms();

        site.orderPage().chooseShipping("2-day USA JSI");
        site.orderPage().clickNext();

        site.orderPage().wait1000ms();

        site.orderPage().enterCardCredential("Amelia", "4276450018854261", "01", "2020", "587");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("order-success__title")));

        String orderNumber = site.orderPage().getOrderNumber();
        webDriver.get("http://95.213.252.23:3000/admin/");
        site.adminOrderPage().checkOrder(orderNumber, "500", "2x4", "Early Bird", "2-day USA JSI", "United States", "New York", stateBilling, false,
                false, false, "none");
        site.adminOrderPage().checkOrderShipping("United States", "Niagara Falls", stateShipping);
    }

    @After
    public void cleanUp()
    {
        if (webDriver != null)
            webDriver.quit();
    }
}
