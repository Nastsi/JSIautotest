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
public class FollowUpWithoutExtraTests {

    WebDriver webDriver;
    WebDriverWait wait;
    JsiSite site;

    private String goalOfScratcher;
    private String otherGoal;
    private String themeOfScratcher;
    private String targetMarket;
    private String distributed;
    private String styleToMatch;
    private String orientation;
    private String infoOnDesign;
    private String listSpecificText;
    private String scratchOff;
    private String customScratchOff;
    private int prizes;
    private int goldPrize;
    private boolean skipDesign;
    private boolean skipScratch;
    private boolean skipPrizes;
    private boolean skipUpload;


    public FollowUpWithoutExtraTests(String goalOfScratcher,  String otherGoal, String themeOfScratcher, String targetMarket, String distributed, String styleToMatch, String orientation, String infoOnDesign,
                                     String listSpecificText, String scratchOff, String customScratchOff, int prizes, int goldPrize, boolean skipDesign, boolean skipScratch, boolean skipPrizes, boolean skipUpload)
    {
        this.goalOfScratcher = goalOfScratcher;
        this.otherGoal = otherGoal;
        this.themeOfScratcher = themeOfScratcher;
        this.targetMarket = targetMarket;
        this.distributed = distributed;
        this.styleToMatch = styleToMatch;
        this.orientation = orientation;
        this.infoOnDesign = infoOnDesign;
        this.listSpecificText = listSpecificText;
        this.scratchOff = scratchOff;
        this.customScratchOff = customScratchOff;
        this.prizes = prizes;
        this.goldPrize = goldPrize;
        this.skipDesign = skipDesign;
        this.skipScratch = skipScratch;
        this.skipPrizes = skipPrizes;
        this.skipUpload = skipUpload;
    }

    @Parameterized.Parameters(name = "")
    public static Collection<Object[]> data()
    {
        Object[][] data = new Object[][]
                {
                        {"Incentive program", "none", "Young", "With purchase", "Match website", "none", "Location", "Discounts are for old only", "none", "none", 1, 25, true, false, false, false, false},
                        {"Sales promotion", "none", "Black Friday", "Young", "none", "Designer's choice", "Designer's choice", "Basic contact info", "none", "Custom", "Scratch all",  1, 1, true, true, false, false, true},
                        {"none", "none", "none", "Young", "With purchase", "none", "Portrait/Vertical", "Basic contact info", "Discounts are for old only", "none", "none", 10, 0, true, false, false, true, true},
                        {"none", "none", "none", "none", "none", "Match Supplied Artwork", "Designer's choice", "Second chance", "none", "Scratch one", "none", 5, 1, true, false, true, true},
                        {"Sales promotion", "none", "none", "none", "none", "Match Supplied Artwork", "Landscape/Horizontal", "none", "Discounts are for old only", "Match&Win", "none", 1, 0, false, true, false, true,
                                false},
                        {"Incentive program", "none", "none", "Young", "With purchase", "none", "Landscape/Horizontal", "Terms and conditions", "Discounts are for old only", "Custom", "Scratch all", 0, 5, false, false,
                                false, true, false},
                        {"Sales promotion", "none", "none", "Young", "none", "Designer's choice", "Designer's choice", "Social media", "none", "Scratch one", "none", 0, 25, true, true, false, false, true},
                        {"Other", "4 of July", "Black Friday", "Young", "none", "none", "none", "Recipient contact field", "Discounts are for old only", "Custom", "Scratch all", 1, 5, false, true, false, false, true},
                        {"none", "none", "none", "Young", "With purchase", "Match website", "Landscape/Horizontal", "Your logo", "Discounts are for old only", "none", "none", 5, 0, false, true, false, true, false},
                        {"Incentive program", "none", "Black Friday", "none", "none",  "Match website", "Designer's choice", "none", "Discounts are for old only", "Match&Win", "none", 10, 25, false, true, false, false,
                                true},
                        {"none", "none", "none", "none", "none", "Match website", "Designer's choice", "Location", "Discounts are for old only", "Scratch one", "none", 0, 0, false, false, false, true, false},
                        {"Event promotion", "none", "none", "Young", "none", "Match website", "none", "Terms and conditions", "none", "Match&Win", "none", 10, 1, false, true, false, true, false},
                        {"Event promotion", "none", "Black Friday", "none", "none", "none", "none", "Basic contact info", "Discounts are for old only", "Scratch one", "none", 5, 25, false, true, false, false, true},
                        {"Incentive program", "none", "Black Friday", "Young", "With purchase", "none", "Designer's choice", "Your logo", "Discounts are for old only", "Scratch one", "none", 1, 25, false, false, false,
                                true, false},
                        {"Sales promotion", "none", "Black Friday", "Young", "none", "Designer's choice", "Landscape/Horizontal", "Second chance", "none", "none", "none", 1, 1, true, false, false, false, false},
                        {"Other", "4 of July", "Black Friday", "none", "With purchase", "Designer's choice", "Landscape/Horizontal", "Recipient contact field", "none", "none", "none", 10, 5, true, true, false, false, true},
                        {"none", "none", "Black Friday", "Young", "none", "none", "none", "Social media", "Discounts are for old only", "none", "none", 5, 1, true, false, false, false, false},
                        {"Other", "4 of July", "none", "none", "With purchase", "Match Supplied Artwork", "Portrait/Vertical", "Social media", "none", "Match&Win", "none", 10, 5, false, false, false, true, false},
                        {"Other", "4 of July", "none", "Young", "none", "Match website", "Designer's choice", "Terms and conditions", "Discounts are for old only", "Custom", "Scratch all", 0, 1, true, false, false, false,
                                false},
                        {"Other", "4 of July", "Black Friday", "Black Friday", "Young", "With purchase", "none", "Portrait/Vertical", "none", "Discounts are for old only", "Match&Win", "none", 0, 1, true, false, false,
                                false, false},
                        {"none", "none", "Black Friday", "Young", "none", "none", "Landscape/Horizontal", "Recipient contact field", "Discounts are for old only", "none", "none", 0, 25, true, false, false, true, true},
                        {"none", "none", "Black Friday", "Young", "none", "Match website", "Portrait/Vertical", "Second chance", "none", "none", "none", 10, 25, true, false, false, false, false}
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

        site.homePage().startOrder("5000", "2x4", "Early Bird");
        site.orderPage().enterCredentialsBilling("Amelia", "Pond", "Atlass Industries", "amelia@teamdoctor.com", "123 street, 54", "456 street, 5",
                "United States", "New York", "1234567", "79043222367");
        site.orderPage().clickNext();
        site.orderPage().wait1000ms();
        site.orderPage().chooseShipping("2-day USA JSI");
        site.orderPage().clickNext();
        site.orderPage().wait500ms();
        site.orderPage().enterCardCredential("Amelia", "4276450018854261", "01", "2020", "587");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("order-success__title")));
        site.orderPage().redirectToFollowUp();
    }

    @Test
    public void testWithoutExtras()
    {
        site.followUpPage().enterGoal(goalOfScratcher, otherGoal);
        site.followUpPage().enterThemeScratcher(themeOfScratcher);
        site.followUpPage().enterTargetMarket(targetMarket);
        site.followUpPage().enterDistributed(distributed);
        site.followUpPage().enterBrandingStyle(styleToMatch);
        site.followUpPage().enterOrientation(orientation);
        site.followUpPage().enterInformation(infoOnDesign);
        site.followUpPage().enterSpecificNotes(listSpecificText);
        site.followUpPage().enterScratchOff(scratchOff, customScratchOff);

        
    }

    @After
    public void cleanUp()
    {
        if (webDriver != null)
            webDriver.quit();
    }
}
