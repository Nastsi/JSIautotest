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
public class FollowUpTests {

    WebDriver webDriver;
    WebDriverWait wait;
    JsiSite site;

    private String quantity;

    public FollowUpTests(String quantity)
    {
        this.quantity = quantity;
    }

    @Parameterized.Parameters(name = "")
    public static Collection<Object[]> data()
    {
        Object[][] data = new Object[][]
                {
                        {"5000"},
                };
        return Arrays.asList(data);
    }

    @Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, 30);

        site = new JsiSite(webDriver);

        webDriver.get("http://95.213.252.23:3000/");

        site.homePage().startOrder(quantity, "2x4", "Early Bird");
        site.orderPage().enterCredentialsBilling("Amelia", "Pond", "Atlass Industries", "amelia@teamdoctor.com", "123 street, 54", "456 street, 5",
                "United States", "New York", "1234567", "79043222367");
        site.orderPage().clickNext();
        site.orderPage().wait1000ms();
        site.orderPage().chooseShipping("2-day USA JSI");
    }

    @Test
    public void testWithoutExtras() throws InterruptedException
    {
        site.orderPage().clickNext();
        site.orderPage().wait500ms();
        site.orderPage().enterCardCredential("Amelia", "4276450018854261", "01", "2020", "587");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("order-success__title")));
        site.orderPage().redirectToFollowUp();
    }

    @Test
    public void testWithExtraPrizes() throws InterruptedException
    {
        site.orderPage().chooseExtra(false, true, false);
        site.orderPage().clickNext();
        site.orderPage().wait500ms();
        site.orderPage().enterCardCredential("Amelia", "4276450018854261", "01", "2020", "587");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("order-success__title")));
        site.orderPage().redirectToFollowUp();
    }

    @Test
    public void testWithVariableData() throws InterruptedException
    {
        site.orderPage().chooseExtra(false, false, true);
        site.orderPage().clickNext();
        site.orderPage().wait500ms();
        site.orderPage().enterCardCredential("Amelia", "4276450018854261", "01", "2020", "587");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("order-success__title")));
        site.orderPage().redirectToFollowUp();
    }

    @Test
    public void testWithExtraPrizesAndVariableData() throws InterruptedException
    {
        site.orderPage().chooseExtra(false, true, true);
        site.orderPage().clickNext();
        site.orderPage().wait500ms();
        site.orderPage().enterCardCredential("Amelia", "4276450018854261", "01", "2020", "587");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("order-success__title")));
        site.orderPage().redirectToFollowUp();
    }

    @After
    public void cleanUp()
    {
        if (webDriver != null)
            webDriver.quit();
    }
}
