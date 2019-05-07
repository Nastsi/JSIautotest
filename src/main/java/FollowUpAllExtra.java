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
public class FollowUpAllExtra {

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
    private String variableData;
    private int prizes;
    private int goldPrize;
    private boolean skipDesign;
    private boolean skipScratch;
    private boolean skipVariable;
    private boolean skipPrizes;
    private boolean skipUpload;


    public FollowUpAllExtra(String goalOfScratcher, String otherGoal, String themeOfScratcher, String targetMarket, String distributed, String styleToMatch, String orientation, String infoOnDesign, String listSpecificText,
                            String scratchOff, String customScratchOff, String variableData, int prizes, int goldPrize, boolean skipDesign, boolean skipScratch, boolean skipVariable, boolean skipPrizes, boolean skipUpload)
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
        this.variableData = variableData;
        this.prizes = prizes;
        this.goldPrize = goldPrize;
        this.skipDesign = skipDesign;
        this.skipScratch = skipScratch;
        this.skipVariable = skipVariable;
        this.skipPrizes = skipPrizes;
        this.skipUpload = skipUpload;
    }

    @Parameterized.Parameters(name = "")
    public static Collection<Object[]> data()
    {
        Object[][] data = new Object[][]
                {
                        {"Event promotion", "none", "Black Friday", "Young", "none", "none", "Designer's choice", "Recipient contact fields", "Discounts are for old only", "Match&Win", "none", "none", 15, 0, true, false,
                                true, false, false},
                        {"Sales promotion", "none", "none", "none", "With purchase", "Designer's choice", "Landscape/Horizontal", "Location", "none", "none", "none", "I have some variable data. 4 of it", 10, 1, false, true,
                                true, false, true},
                        {"none", "none", "Black Friday", "none", "none", "Match website", "Portrait/Vertical", "none", "Discounts are for old only", "Custom", "Scratch all", "I have some variable data. 4 of it", 5, 25,
                                true, true, false, false, true},
                        {"Other", "4 of July", "Young", "With purchase", "Match Supplied Artwork", "none", "none", "none", "Scratch one", "none", "none", 20, 5, false, false, false, false, false},
                        {"Incentive program", "none", "Black Friday", "none", "none", "Match Supplied Artwork", "Portrait/Vertical", "Second chance", "Discounts are for old only", "Scratch one", "none",
                                "I have some variable data. 4 of it", 0, 0, false, true, true, false, true},
                        {"Event promotion", "none", "none", "none", "With purchase", "none", "Landscape/Horizontal", "Second chance", "none", "Match&Win", "none", "I have some variable data. 4 of it", 15, 5, true, true,
                                true, false, false, true},
                        {"Other", "4 of July", "Black Friday", "none", "none", "Designer's choice", "none", "Your logo", "Discounts are for old only", "Match&Win", "none", "I have some variable data. 4 of it", 0, 1, false,
                                false, false, false, false},
                        {"Other", "4 of July", "Black Friday", "Young", "With purchase", "Match website", "Designer's choice", "Second chance", "none", "Custom", "Scratch all", "I have some variable data. 4 of it", 20, 25,
                                false, true, false, true, false},
                        {"Event promotion", "none", "Black Friday", "none", "none", "Match website", "Landscape/Horizontal", "Recipient contact field", "none", "Scratch one", "none", "I have some variable data. 4 of it", 10,
                                25, false, false, false, false, false},
                        {"Event promotion", "none", "Black Friday", "none", "none", "Designer's choice", "Portrait/Vertical", "none", "none", "none", "none", "none", 15, 1, false, false, true, true, false},
                        {"none", "none", "Black Friday", "none", "none", "Designer's choice", "none", "Second chance", "none", "Match&Win", "none", "I have some variable data. 4 of it", 20, 0, false, false, true, true, false},
                        {"Incentive program", "none", "Black Friday", "Young", "none", "Designer's choice", "Portrait/Vertical", "Location", "none", "Match&Win", "none", "I have some variable data. 4 of it", 5, 5, true,
                                false, true, true, true},
                        {"Other", "4 of July", "Black Friday", "none", "With purchase", "Match Supplied Artwork", "none", "Terms and conditions", "none", "none", "none", "I have some variable data. 4 of it", 5, 0, true,
                                true, false, false, true},
                        {"Sales promotion", "none", "none", "none", "none", "none", "none", "location", "none", "Scratch one", "none", "I have some variable data. 4 of it", 15, 5, false, true, false, true, false},
                        {"Incentive program", "none", "none", "none", "With purchase", "none", "Portrait/Vertical", "Recipient contact field", "Discounts are for old only", "none", "none",
                                "I have some variable data. 4 of it", 20, 1, false, true, false, true, false},
                        {"none", "none", "none", "none", "With purchase", "Match website", "Designer's choice", "Basic contact info", "Discounts are for old only", "none", "none", "I have some variable data. 4 of it", 1,
                                5, false, false, false, false, false},
                        {"Event promotion", "none", "none", "none", "With purchase", "Match Supplied Artwork", "Portrait/Vertical", "Your logo", "none", "Custom", "Scratch all", "I have some variable data. 4 of it", 10,
                                5, true, false, true, false, false},
                        {"Sales promotion", "none", "Black Friday", "none", "none", "Match Supplied Artwork", "Landscape/Horizontal", "Recipient contact fields", "Discounts are for old only", "Match&Win", "none",
                                "I have some variable data. 4 of it", 5, 25, false, false, true, true, false},
                        {"Other", "4 of July", "Black Friday", "none", "none", "Match website", "none", "none", "Discounts are for old only", "Custom", "Scratch all", "I have some variable data. 4 of it", 15, 25, true,
                                false, true, true, true},
                        {"Sales promotion", "none", "none", "none", "none", "Match website", "Portrait/Vertical", "Terms and conditions", "Discounts are for old only", "scratch one", "none",
                                "I have some variable data. 4 of it", 1, 25, true, false, true, true, true},
                        {"Event promotion", "none", "Black Friday", "none", "With purchase", "Landscape/Horizontal", "Social media", "Discounts are for old only", "Custom", "Scratch all",
                                "I have some variable data. 4 of it", 20, 0, true, false, true, true, true},
                        {"Other", "4 of July", "none", "none", "With purchase", "Match Supplied Artwork", "Portrait/Vertical", "Location", "none", "Custom", "Scratch all", "none", 15, 0, false, false, false, false, false},
                        {"Event promotion", "none", "none", "none", "With purchase", "Designer's choice", "Landscape/Horizontal", "Basic contact info", "Discounts are for old only", "none", "none",
                                "I have some variable data. 4 of it", 0, 25, false, true, false, true, false},
                        {"Incentive program", "none", "Black Friday", "none", "With purchase", "Designer's choice", "Designer's choice", "Terms and conditions", "none", "Scratch one", "none",
                                "I have some variable data. 4 of it", 15, 25, false, false, false, false, false},
                        {"Other", "4 of July", "Black Friday", "Young", "With purchase", "Match Supplied Artwork", "Landscape/Horizontal", "Basic contact info", "Discounts are for old only", "Scratch one", "none", "none",
                                20, 5, true, false, true, false, false},
                        {"Sales promotion", "none", "Black Friday", "Young", "With purchase", "none", "none", "Second chance", "Discounts are for old only", "Scratch one", "none", "I have some variable data. 4 of it", 5,
                                1, false, false, false, false, false},
                        {"Incentive program", "none", "none", "Young", "none", "none", "Portrait/Vertical", "Basic contact info", "none", "Match&Win", "none", "I have some variable data. 4 of it", 15, 0, false, false,
                                true, true, false},
                        {"Event promotion", "none", "none", "Young", "With purchase", "Designer's choice", "none", "Social media", "Discounts are for old only", "Match&Win", "none", "I have some variable data. 4 of it",
                                1, 25, false, true, false, true, false},
                        {"none", "none", "Black Friday", "Young", "With purchase", "Match Supplied Artwork", "Landscape/Horizontal", "Terms and conditions", "none", "none", "none", "I have some variable data. 4 of it",
                                20, 0, false, true, true, false, true},
                        {"Sales promotion", "none", "Black Friday", "none", "none", "Match Supplied Artwork", "Designer's choice", "Your logo", "Discounts are for old only", "Scratch one", "none",
                                "I have some variable data. 4 of it", 20, 25, true, true, false, false, true},
                        {"none", "none", "none", "Young", "With purchase", "Match Supplied Artwork", "none", "Social media", "Discounts are for old only", "Custom", "Scratch all", "none", 15, 5, false, false, false,
                                false, false},
                        {"Incentive program", "none", "Black Friday", "Young", "none", "Match Supplied Artwork", "none", "Location", "Discounts are for old only", "Match&Win", "none", "I have some variable data. 4 of it",
                                20, 5, true, true, false, false, true},
                        {"Other", "4 of July", "Black Friday", "none", "With purchase", "Match Supplied Artwork", "none", "Your logo", "none", "Custom", "Scratch all", "none", 15, 5, false, true, true, false, false},
                        {"Sales promotion", "none", "none", "none", "With purchase", "none", "Portrait/Vertical", "Your logo", "Discounts are for old only", "none", "none", "none", 20, 1, true, false, true, true, true},
                        {"Event promotion", "none", "Black Friday", "Young", "With purchase", "Match website", "Landscape/Horizontal",  "Location", "none", "none", "none", "I have some variable data. 4 of it", 15, 1, false,
                                false, true, true, false}

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
