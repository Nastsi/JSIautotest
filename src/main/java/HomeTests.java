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

public class HomeTests {
    WebDriver webDriver;
    WebDriverWait wait;
    JsiSite website;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, 10);

        website = new JsiSite(webDriver);

        webDriver.get("http://95.213.252.23:3000/");
    }

    @Test
    public void testSubscribe() throws Exception
    {
        webDriver.findElement(By.className("footer-subscribe__input")).sendKeys(("f474qww6556ere23rt@mail.ru"));
        website.homePage().clickSubscribeSubmit();


        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("footer-subscribe__submit")));
        String text = webDriver.findElement(By.className("footer-subscribe__title")).getText();
        Assert.assertTrue(text.compareTo("Thanks for subscribing!") == 0);
        //Assert.assertEquals(0, webDriver.findElements(By.className("footer-subscribe__submit")).size());
    }

    @After
    public void cleanUp()
    {
        if (webDriver != null)
        webDriver.quit();
    }
}
