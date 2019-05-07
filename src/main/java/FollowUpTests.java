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

public class FollowUpTests {

    WebDriver webDriver;
    WebDriverWait wait;
    JsiSite site;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, 30);

        site = new JsiSite(webDriver);

        webDriver.get("http://95.213.252.23:3000/follow-up/604e775ae45943c458606587f49cbfba");
    }

    @Test
    public void testScheduleCall() throws InterruptedException
    {
        site.followUpPage().wait500ms();
        site.followUpPage().clickScheduleCall();
        site.followUpPage().confirmPhoneNumber("7 904 322 2367");
        site.followUpPage().setDate("05/23/19");
        site.followUpPage().setTime("UTC-8");
        site.followUpPage().setBestTime("Afternoon");
        site.followUpPage().submitCall();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//h2[contains(.,' Call Scheduled')]")));
        Assert.assertTrue("Date is wrong", webDriver.findElement(By.xpath("//p[contains(.,'You scheduled a call by 05/23/19, afternoon. A consultant will contact you to follow the next steps, stay tuned!')]"))
                            .getText().substring(24, 32).compareTo("05/23/19") == 0);
        Assert.assertTrue("Time of day is wrong", webDriver.findElement(By.xpath("//p[contains(.,'You scheduled a call by 05/23/19, afternoon. A consultant will contact you to follow the next steps, stay tuned!')]"))
                .getText().substring(34, 43).compareTo("afternoon") == 0);
        site.followUpPage().wait1000ms();
        site.followUpPage().backButtonClick();
        Assert.assertTrue("No error if special symbols was entered", site.followUpPage().isElementPresent("//h2[contains(.,'Tell Us About Your Project')]"));
    }

    @Test
    public void testSendMessage() throws InterruptedException
    {
        site.followUpPage().wait500ms();
        site.followUpPage().clickSendAMessage();
        site.followUpPage().enterMessage("");
        site.followUpPage().submitButtonClick();
        Assert.assertTrue("No error if message field is empty", site.followUpPage().isElementPresent("//p[contains(.,'\"Message\" is not allowed to be empty')]"));
        site.followUpPage().enterMessage("Need a help");
        site.followUpPage().submitButtonClick();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//h2[contains(.,' Message Submitted')]")));
        site.followUpPage().backButtonClick();
        Assert.assertTrue("No error if special symbols was entered", site.followUpPage().isElementPresent("//h2[contains(.,'Tell Us About Your Project')]"));
    }

    @Test
    public void submitActivity()
    {
        Assert.assertFalse("Submit active but it doesn't supposed to", site.followUpPage().isSubmitActive());
        site.followUpPage().enterThemeScratcher("Black Friday");
        Assert.assertTrue("Submit don't active but it supposed to",site.followUpPage().isSubmitActive());
    }

    @Test
    public void prizesQuantityCorrect()
    {
        site.followUpPage().enterBulkPrize1("appartment", "50");
        Assert.assertFalse("Error that prizes quantity is more than cards quantity", site.followUpPage().isElementPresent("//div[3]/div[4]"));
        Assert.assertTrue("Submit doesn't active but it supposed to", site.followUpPage().isSubmitActive());
        site.followUpPage().enterBulkPrize1("", "1");
        Assert.assertTrue("No error that prizes quantity is more than cards quantity", site.followUpPage().isElementPresent("//div[3]/div[4]"));
        Assert.assertFalse("Submit active but it doesn't supposed to", site.followUpPage().isSubmitActive());
    }

    @Test
    public void goldPrizeQuantityCorrect()
    {
        site.followUpPage().enterGoldPrize("car", "2");
        Assert.assertFalse("Error that gold prizes quantity is more than 25", webDriver.findElement(By.xpath("//div/div[5]")).getText()
                .compareTo("Your limit is exceeded. You may choose up to 25 gold cards.") == 0);
        Assert.assertTrue("Submit doesn't active but it supposed to", site.followUpPage().isSubmitActive());
        site.followUpPage().enterGoldPrize("", "6");
        Assert.assertTrue("No error that prizes quantity is more than cards quantity", webDriver.findElement(By.xpath("//div/div[5]")).getText()
                .compareTo("Your limit is exceeded. You may choose up to 25 gold cards.") == 0);
        Assert.assertFalse("Submit active but it doesn't supposed to", site.followUpPage().isSubmitActive());
    }

    @After
    public void cleanUp()
    {
        if (webDriver != null)
            webDriver.quit();
    }
}
