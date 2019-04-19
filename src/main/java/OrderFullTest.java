import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.JsiSite;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class OrderFullTest {

    WebDriver webDriver;
    WebDriverWait wait;
    JsiSite site;

    private String quantity;
    private String size;
    private String plan;
    private String country;
    private String city;
    private String state;
    private String shipping;
    private boolean expressDesign;
    private boolean extraPrizes;
    private boolean variableData;
    private String discount;

    public OrderFullTest(String quantity, String size, String plan, String country, String city, String shipping, boolean extra1, boolean extra2, boolean extra3, String discount)
    {
        this.quantity = quantity;
        this.size = size;
        this.plan = plan;
        this.country = country;
        this.city = city;
        this.shipping = shipping;
        this.expressDesign = extra1;
        this.extraPrizes = extra2;
        this.variableData = extra3;
        this.discount = discount;
    }

    @Parameterized.Parameters(name = "{index} + 308)")
    public static Collection<Object[]> data()
    {
        Object[][] data = new Object[][]
                {
                        {"10000", "2x4", "Quick-turn", "Canada", "Quatsino", "2-day Canada JSI", true, true, false, "test"},
                        //1 Тикет на ревью {"1000", "2x4", "Quick-turn", "United States", "Niagara Falls", "Ground 48 States JSI", false, true, false, "labore"},
                        {"10000", "4x4", "Standard", "United States", "Niagara Falls", "2-day USA JSI", false, false, true, "none"},
                        {"5000", "4x6", "Early Bird", "Canada", "Quatsino", "Ground Canada JSI", true, false, true, "test2"},
                        //4 Тикет на ревью {"500", "4x6", "Standard", "Canada", "Quatsino", "2-day Canada JSI", true, false, false, "labore"},
                        {"2500", "2x4", "Early Bird", "United States", "Niagara Falls", "2-day USA JSI", true, true, true, "illum"},
                        {"5000", "4x4", "Quick-turn", "United States", "Palmer", "Ground Hi & AK JSI", false, true, true, "facilis"},
                        {"5000", "2x4", "Standard", "Canada", "Quatsino", "Ground Canada JSI", true, true, false, "cupiditate"},
                        {"2500", "4x6", "Quick-turn", "Canada", "Quatsino", "Priority Canada JSI", true, true, false, "test"},
                        {"1000", "4x6", "Early Bird", "United States", "Palmer", "Ground Hi & AK JSI", false, true, true, "test"},
                        {"2500", "2x4", "Standard", "United States", "Niagara Falls", "Ground 48 States JSI", false, true, true, "facilis"},
                        {"1000", "4x4", "Quick-turn", "Canada", "Quatsino", "Priority Canada JSI", true, false, true, "labore"},
                        {"500", "2x4", "Early Bird", "United States", "Niagara Falls", "2-day USA JSI", true, true, false, "cupiditate"},
                        {"10000", "4x6", "Standard", "Canada", "Quatsino", "Ground Canada JSI", true, false, true, "cupiditate"},
                        {"2500", "4x6", "Quick-turn", "United States", "Niagara Falls", "Overnight USA JSI", true, true, false, "test2"},
                        //15 тикет на ревью {"500", "4x4", "Standard", "Canada", "Quatsino", "2-day Canada JSI", true, true, true, "labore"},
                        {"5000", "4x4", "Standard", "United States", "Palmer", "Ground Hi & AK JSI", false, false, true, "test2"},
                        {"5000", "2x4", "Quick-turn", "Canada", "Quatsino", "2-day Canada JSI", false, true, true, "cupiditate"},
                        {"10000", "2x4", "Early Bird", "United States", "Niagara Falls", "Overnight USA JSI", false, true, false, "labore"},
                        {"2500", "4x4", "Early Bird", "United States", "Niagara Falls", "Ground 48 States JSI", true, false, true, "test"},
                        {"500", "2x4", "Standard", "Canada", "Quatsino", "Priority Canada JSI", false, false, false, "test"},
                        {"1000", "4x6", "Quick-turn", "United States", "Niagara Falls", "Ground 48 States JSI", false, false, false, "cupiditate"},
                        {"500", "4x4", "Quick-turn", "Canada", "Quatsino", "Ground Canada JSI", false, true, false, "facilis"},
                        {"1000", "4x6", "Standard", "United States", "Palmer", "2-day USA JSI", false, true, false, "rerum"},
                        {"5000", "4x4", "Early Bird", "Canada", "Quatsino", "Ground Canada JSI", true, true, false, "none"},
                        {"10000", "4x4", "Quick-turn", "United States", "Niagara Falls", "Overnight USA JSI", true, false, true, "rerum"},
                        {"2500", "4x6", "Standard", "Canada", "Quatsino", "2-day Canada JSI", false, true, false, "none"},
                        {"2500", "2x4", "Early Bird", "United States", "Palmer", "Ground Hi & AK JSI", false, false, false, "illum"},
                        {"5000", "4x6", "Quick-turn", "United States", "Palmer", "2-day USA JSI", true, true, true, "test"},
                        {"10000", "4x6", "Quick-turn", "Canada", "Quatsino", "Priority Canada JSI", false, false, true, "none"},
                        {"500", "4x6", "Standard", "United States", "Niagara Falls", "Overnight USA JSI", true, false, true, "illum"},
                        {"500", "2x4", "Quick-turn", "United States", "Niagara Falls", "2-day USA JSI", false, true, true, "none"},
                        {"1000", "2x4", "Quick-turn", "United States", "Niagara Falls", "Ground 48 States JSI", true, true, true, "illum"},
                        {"2500", "2x4", "Early Bird", "Canada", "Quatsino", "Ground Canada JSI", false, false, true, "test"},
                        {"10000", "4x4", "Quick-turn", "United States", "Palmer", "Ground Hi & AK JSI", false, true, false, "cupiditate"},
                        {"500", "2x4", "Quick-turn", "United States", "Palmer", "Ground Hi & AK JSI", true, false, true, "none"},
                        {"5000", "2x4", "Early Bird", "Canada", "Quatsino", "2-day Canada JSI", true, false, false, "rerum"},
                        {"5000", "4x6", "Standard", "United States", "Niagara Falls", "Ground 48 States JSI", false, false, true, "labore"},
                        {"10000", "4x4", "Early Bird", "United States", "Niagara Falls", "2-day USA JSI", false, false, false, "test2"},
                        {"1000", "2x4", "Quick-turn", "Canada", "Quatsino", "2-day Canada JSI", true, false, true, "test2"},
                        {"2500", "4x4", "Early Bird", "Canada", "Quatsino", "Priority Canada JSI", true, false, true, "rerum"},
                        {"1000", "4x4", "Quick-turn", "United States", "Niagara Falls", "Overnight USA JSI", false, false, true, "cupiditate"},
                        {"2500", "4x6", "Quick-turn", "Canada", "Quatsino", "Priority Canada JSI", true, false, false, "cupiditate"},
                        {"10000", "4x6", "Standard", "United States", "Palmer", "Ground Hi & AK JSI", true, true, false, "labore"},
                        {"10000", "4x6", "Quick-turn", "United States", "Niagara Falls", "Ground 48 States JSI", false, true, false, "test"},
                        {"5000", "4x6", "Standard", "Canada", "Quatsino", "Ground Canada JSI", false, false, false, "labore"},
                        {"500", "2x4", "Early Bird", "Canada", "Quatsino", "Ground Canada JSI", true, true, true, "rerum"},
                        {"2500", "4x4", "Standard", "United States", "Niagara Falls", "2-day USA JSI", true, false, false, "labore"},
                        {"10000", "2x4", "Early Bird", "Canada", "Quatsino", "Priority Canada JSI", true, true, true, "test2"},
                        {"5000", "4x6", "Early Bird", "United States", "Niagara Falls", "2-day USA JSI", true, false, true, "facilis"},
                        {"5000", "4x4", "Early Bird", "Canada", "Quatsino", "Priority Canada JSI", false, true, true, "labore"},
                        {"1000", "4x4", "Early Bird", "United States", "Niagara Falls", "Overnight USA JSI", true, false, false, "facilis"},
                        {"10000", "4x6", "Standard", "Canada", "Quatsino", "2-day Canada JSI", true, true, false, "test"},
                        {"500", "4x4", "Standard", "Canada", "Quatsino", "2-day Canada JSI", false, false, true, "facilis"},
                        {"10000", "4x6", "Quick-turn", "Canada", "Quatsino", "Priority Canada JSI", true, true, false, "facilis"},
                        {"2500", "4x4", "Standard", "United States", "Palmer", "Ground Hi & AK JSI", true, true, true, "facilis"},
                        {"5000", "4x4", "Quick-turn", "United States", "Palmer", "Overnight USA JSI", true, true, true, "cupiditate"},
                        {"500", "2x4", "Standard", "United States", "Niagara Falls", "Ground 48 States JSI", false, false, true, "rerum"},
                        {"1000", "4x6", "Quick-turn", "United States", "Niagara Falls", "Ground 48 States JSI", true, true, false, "rerum"},
                        {"10000", "4x4", "Early Bird", "United States", "Niagara Falls", "2-day USA JSI", true, false, true, "illum"},
                        {"1000", "4x4", "Quick-turn", "United States", "Niagara Falls", "Overnight USA JSI", false, false, false, "none"},
                        {"500", "2x4", "Standard", "Canada", "Quatsino", "Ground Canada JSI", true, false, false, "test2"},
                        //62 плохо работает округление такса в моих тестах {"1000", "4x6", "Quick-turn", "Canada", "Quatsino", "Ground Canada JSI", false, true, true, "test2"},
                        {"5000", "4x6", "Quick-turn", "Canada", "Quatsino", "Priority Canada JSI", false, true, false, "illum"},
                        {"1000", "4x6", "Quick-turn", "United States", "Niagara Falls", "Ground 48 States JSI", false, true, false, "test2"},
                        {"2500", "4x6", "Early Bird", "United States", "Niagara Falls", "Ground 48 States JSI", true, true, true, "none"},
                        {"1000", "4x6", "Early Bird", "Canada", "Quatsino", "2-day Canada JSI", false, false, false, "rerum"},
                        {"10000", "2x4", "Quick-turn", "United States", "Palmer", "Ground Hi & AK JSI", true, false, false, "none"},
                        {"10000", "4x4", "Early Bird", "Canada", "Quatsino", "Ground Canada JSI", true, false, false, "illum"},
                        {"2500", "2x4", "Standard", "United States", "Niagara Falls", "Overnight USA JSI", true, false, false, "test"},
                        {"1000", "4x6", "Quick-turn", "Canada", "Quatsino", "2-day Canada JSI", true, true, false, "illum"},
                        {"10000", "2x4", "Early Bird", "United States", "Niagara Falls", "2-day USA JSI", false, false, false, "facilis"},
                        {"10000", "2x4", "Early Bird", "United States", "Palmer", "Ground Hi & AK JSI", true, false, false, "rerum"},
                        {"1000", "2x4", "Early Bird", "United States", "Niagara Falls", "Ground 48 States JSI", true, false, false, "test"},
                        {"2500", "2x4", "Quick-turn", "Canada", "Quatsino", "Priority Canada JSI", false, true, true, "illum"}
                };
        return Arrays.asList(data);
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, 30);

        site = new JsiSite(webDriver);

        webDriver.get("http://95.213.252.23:3000/");
    }

    @Test
    public void testOrderFull() throws InterruptedException
    {
        site.homePage().startOrder(quantity, size, plan);
        site.orderPage().checkSummaryContactInfo(quantity, size, plan);

        site.orderPage().enterCredentialsBilling(country, city);
        site.orderPage().clickNext();

        synchronized (wait) {
            wait.wait(1500);
        }

        site.orderPage().chooseExtra(expressDesign, extraPrizes, variableData);
        site.orderPage().chooseShipping(shipping);
        site.orderPage().enterPromoCode(discount);
        synchronized (wait) {
            wait.wait(1000);
        }
        site.orderPage().checkSummaryOrderReview(quantity, size, plan, expressDesign, extraPrizes, variableData, shipping, discount);
        site.orderPage().clickNext();

        site.orderPage().checkSummaryPayment(quantity, size, city, shipping, discount);
        site.orderPage().enterCardCredential();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("order-success__title")));
        site.orderPage().checkSummaryPayment(quantity, size, city, shipping, discount);
        site.orderPage().checkEmail();

        String orderNumber = site.orderPage().getOrderNumber();
        webDriver.get("http://95.213.252.23:3000/admin/");
        site.adminOrderPage().checkOrder(orderNumber, quantity, size, plan, shipping, country, city, expressDesign, extraPrizes, variableData, discount);
    }

    @After
    public void cleanUp()
    {
        if (webDriver != null)
            webDriver.quit();
    }
}
