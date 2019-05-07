package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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

    @FindBy(xpath = "//div[2]/div/div/span")
    WebElement numberOfOrder;

    @FindBy(xpath = "//li")
    WebElement quantityOfOrder;

    @FindBy(xpath = "//li[2]")
    WebElement sizeOfOrder;

    @FindBy(xpath = "//li[3]")
    WebElement planOfOrder;

    @FindBy(xpath = "//li[4]")
    WebElement shippingOfOrder;

    @FindBy(xpath = "//button[contains(.,'Schedule Call')]")
    WebElement scheduleCallButton;

    @FindBy(xpath = "//button[contains(.,'Send Us a Message')]")
    WebElement sendMessageButton;

    @FindBy(id = "follow_up_goals")
    WebElement goalOfScratcher;

    @FindBy(id = "scratcher_goal_other")
    WebElement goalOfScratcherOther;

    @FindBy(id = "follow_up_theme")
    WebElement themeOfScratcher;

    @FindBy(id = "target_market")
    WebElement targetMarket;

    @FindBy(id = "follow_up_distribution")
    WebElement distribution;

    @FindBy(id = "follow_up_style")
    WebElement brandingStyle;

    @FindBy(id = "follow_up_orientation")
    WebElement orientation;

    @FindBy(xpath = "//label/span")
    WebElement yourLogoCheckbox;

    @FindBy(xpath = "//label[2]/span")
    WebElement locationCheckbox;

    @FindBy(xpath = "//label[3]/span")
    WebElement contactInfoCheckbox;

    @FindBy(xpath = "//label[4]/span")
    WebElement secondChanceCheckbox;

    @FindBy(xpath = "//div[2]/label/span")
    WebElement socialMediaCheckbox;

    @FindBy(xpath = "//div[2]/label[2]/span")
    WebElement termsAndConditionCheckbox;

    @FindBy(xpath = "//div[2]/label[3]/span")
    WebElement recipientContactFieldsCheckbox;

    @FindBy(id = "follow_up_design_spec")
    WebElement textForDesign;

    @FindBy(xpath = "//section[2]/div[2]/label/span")
    WebElement designSpecSkip;

    @FindBy(xpath = "//li/label/span")
    WebElement matchAndWin;

    @FindBy(xpath = "//li[2]/label/span")
    WebElement scratchOne;

    @FindBy(xpath = "//li[3]/label/span")
    WebElement custom;

    @FindBy(id = "follow_up_custom_description")
    WebElement customDescription;

    @FindBy(xpath = "//section[3]/div[2]/label/span")
    WebElement scratchOffTypeSkip;

    @FindBy(id = "variable_data_notes")
    WebElement variableDataNotes;

    @FindBy(xpath = "//section[4]/div[2]/label/span")
    WebElement variableDataSkip;

    @FindBy(xpath = "//section[5]/div/div/div/button")
    WebElement addAnotherButton;

    @FindBy(xpath = "//div/div/div/div/input")
    WebElement bulkPrize1Description;

    @FindBy(xpath = "//div[2]/div/input")
    WebElement bulkPrize1Quantity;

    @FindBy(xpath = "//div[2]/div/div/input")
    WebElement bulkPrize2Description;

    @FindBy(xpath = "//div[2]/div[2]/div/input")
    WebElement bulkPrize2Quantity;

    @FindBy(xpath = "//div[3]/div/div/input")
    WebElement bulkPrize3Description;

    @FindBy(xpath = "//div[3]/div[2]/div/input")
    WebElement bulkPrize3Quantity;

    @FindBy(xpath = "//div[4]/div/div/input")
    WebElement bulkPrize4Description;

    @FindBy(xpath = "//div[4]/div[2]/div/input")
    WebElement bulkPrize4Quantity;

    @FindBy(xpath = "//div[5]/div/div/input")
    WebElement bulkPrize5Description;

    @FindBy(xpath = "//div[5]/div[2]/div/input")
    WebElement bulkPrize5Quantity;

    @FindBy(xpath = "//div[6]/div/div/input")
    WebElement bulkPrize6Description;

    @FindBy(xpath = "//div[6]/div[2]/div/input")
    WebElement bulkPrize6Quantity;

    @FindBy(xpath = "//div[7]/div/div/input")
    WebElement bulkPrize7Description;

    @FindBy(xpath = "//div[7]/div[2]/div/input")
    WebElement bulkPrize7Quantity;

    @FindBy(xpath = "//div[8]/div/div/input")
    WebElement bulkPrize8Description;

    @FindBy(xpath = "//div[8]/div[2]/div/input")
    WebElement bulkPrize8Quantity;

    @FindBy(xpath = "//div[9]/div/div/input")
    WebElement bulkPrize9Description;

    @FindBy(xpath = "//div[9]/div[2]/div/input")
    WebElement bulkPrize9Quantity;

    @FindBy(xpath = "//div[10]/div/div/input")
    WebElement bulkPrize10Description;

    @FindBy(xpath = "//div[10]/div[2]/div/input")
    WebElement bulkPrize10Quantity;

    @FindBy(xpath = "//div[11]/div/div/input")
    WebElement bulkPrize11Description;

    @FindBy(xpath = "//div[11]/div[2]/div/input")
    WebElement bulkPrize11Quantity;

    @FindBy(xpath = "//div[12]/div/div/input")
    WebElement bulkPrize12Description;

    @FindBy(xpath = "//div[12]/div[2]/div/input")
    WebElement bulkPrize12Quantity;

    @FindBy(xpath = "//div[13]/div/div/input")
    WebElement bulkPrize13Description;

    @FindBy(xpath = "//div[13]/div[2]/div/input")
    WebElement bulkPrize13Quantity;

    @FindBy(xpath = "//div[14]/div/div/input")
    WebElement bulkPrize14Description;

    @FindBy(xpath = "//div[14]/div[2]/div/input")
    WebElement bulkPrize14Quantity;

    @FindBy(xpath = "//div[15]/div/div/input")
    WebElement bulkPrize15Description;

    @FindBy(xpath = "//div[15]/div[2]/div/input")
    WebElement bulkPrize15Quantity;

    @FindBy(xpath = "//div[16]/div/div/input")
    WebElement bulkPrize16Description;

    @FindBy(xpath = "//div[16]/div[2]/div/input")
    WebElement bulkPrize16Quantity;

    @FindBy(xpath = "//div[17]/div/div/input")
    WebElement bulkPrize17Description;

    @FindBy(xpath = "//div[17]/div[2]/div/input")
    WebElement bulkPrize17Quantity;

    @FindBy(xpath = "//div[18]/div/div/input")
    WebElement bulkPrize18Description;

    @FindBy(xpath = "//div[18]/div[2]/div/input")
    WebElement bulkPrize18Quantity;

    @FindBy(xpath = "//div[19]/div/div/input")
    WebElement bulkPrize19Description;

    @FindBy(xpath = "//div[19]/div[2]/div/input")
    WebElement bulkPrize19Quantity;

    @FindBy(xpath = "//div[20]/div/div/input")
    WebElement bulkPrize20Description;

    @FindBy(xpath = "//div[20]/div[2]/div/input")
    WebElement bulkPrize20Quantity;

    @FindBy(xpath = "//div[4]/div/div/div/input")
    WebElement goldPrizeDescription;

    @FindBy(xpath = "//div[4]/div/div[2]/div/input")
    WebElement goldPrizeQuantity;

    @FindBy(xpath = "//section[5]/div[2]/label/span")
    WebElement prizesSkip;

    @FindBy(xpath = "//section[6]/div[2]/label/span")
    WebElement uploadFilesSkip;

    @FindBy(xpath = "//button[contains(.,'Submit')]")
    WebElement submitButton;

    @FindBy(name = "phone_number")
    WebElement phoneNumber;

    @FindBy(name = "date")
    WebElement dateOfCall;

    @FindBy(name = "timezone_id")
    WebElement timeZoneCall;

    @FindBy(xpath = "//label/span")
    WebElement morning;

    @FindBy(xpath = "//li[2]/label/span")
    WebElement afternoon;

    @FindBy(xpath = "//button[contains(.,'Schedule')]")
    WebElement scheduleCall;

    @FindBy(xpath = "//span[contains(.,' Go back')]")
    WebElement goBackButton;

    @FindBy(name = "message")
    WebElement messageEnter;

    public void clickScheduleCall()
    {
        scheduleCallButton.click();
    }

    public void confirmPhoneNumber(String number)
    {
        String numberAutoEntered = phoneNumber.getAttribute("value");
        Assert.assertTrue("Phone number is wrong", number.compareTo(numberAutoEntered) == 0);
    }

    public void setDate(String date)
    {
        dateOfCall.sendKeys(date);
    }

    public void setTime(String time)
    {
        Select timeZone = new Select (timeZoneCall);
        timeZone.selectByVisibleText(time);
    }

    public void submitCall()
    {
        scheduleCall.click();
    }

    public void setBestTime(String time)
    {
        if (time.compareTo("Morning") == 0)
        {
            morning.click();
        }
        else
        {
            afternoon.click();
        }
    }

    public void clickSendAMessage()
    {
        sendMessageButton.click();
    }

    public void enterMessage(String message)
    {
        messageEnter.sendKeys(message);
    }

    public void submitButtonClick()
    {
        submitButton.click();
    }

    public boolean isSubmitActive()
    {
        return submitButton.isEnabled();
    }

    public void enterGoal(String string, String other)
    {
        Select select = new Select (goalOfScratcher);
        select.selectByVisibleText(string);
        if (string.compareTo("Other") == 0) goalOfScratcherOther.sendKeys(other);
    }

    public void enterThemeScratcher(String string)
    {
        themeOfScratcher.sendKeys(string);
    }

    public void enterTargetMarket(String string){targetMarket.sendKeys(string);}

    public void enterDistributed(String string) {distribution.sendKeys(string);}

    public void enterBrandingStyle(String string)
    {
        Select select = new Select (brandingStyle);
        select.selectByVisibleText(string);
    }

    public void enterOrientation(String string)
    {
        Select select = new Select (orientation);
        select.selectByVisibleText(string);
    }

    public void enterInformation(String string)
    {
        if (string.compareTo("Your logo") == 0) yourLogoCheckbox.click();
        else if (string.compareTo("Location") == 0) locationCheckbox.click();
        else if (string.compareTo("Basic contact info") == 0) contactInfoCheckbox.click();
        else if (string.compareTo("Second chance") == 0) secondChanceCheckbox.click();
        else if (string.compareTo("Social media") == 0) socialMediaCheckbox.click();
        else if (string.compareTo("Terms and conditions") == 0) termsAndConditionCheckbox.click();
        else if (string.compareTo("Recipient contact field") == 0) recipientContactFieldsCheckbox.click();
    }

    public void enterSpecificNotes(String string)
    {
        textForDesign.sendKeys(string);
    }

    public void enterScratchOff(String string, String customDesc)
    {
        if (string.compareTo("Match&Win") == 0) matchAndWin.click();
        else if (string.compareTo("Scratch one") == 0) scratchOne.click();
        else if (string.compareTo("Custom") == 0)
        {
            custom.click();
            customDescription.sendKeys(customDesc);
        }
    }

    public void enterVariableNotes(String string) {variableDataNotes.sendKeys(string);}

    public void enterBulkPrize1(String description, String quantity)
    {
        bulkPrize1Description.sendKeys(description);
        bulkPrize1Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize2(String description, String quantity)
    {
        bulkPrize2Description.sendKeys(description);
        bulkPrize2Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize3(String description, String quantity)
    {
        bulkPrize3Description.sendKeys(description);
        bulkPrize3Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize4(String description, String quantity)
    {
        bulkPrize4Description.sendKeys(description);
        bulkPrize4Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize5(String description, String quantity)
    {
        bulkPrize5Description.sendKeys(description);
        bulkPrize5Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize6(String description, String quantity)
    {
        bulkPrize6Description.sendKeys(description);
        bulkPrize6Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize7(String description, String quantity)
    {
        bulkPrize7Description.sendKeys(description);
        bulkPrize7Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize8(String description, String quantity)
    {
        bulkPrize8Description.sendKeys(description);
        bulkPrize8Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize9(String description, String quantity)
    {
        bulkPrize9Description.sendKeys(description);
        bulkPrize9Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize10(String description, String quantity)
    {
        bulkPrize10Description.sendKeys(description);
        bulkPrize10Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize11(String description, String quantity)
    {
        bulkPrize11Description.sendKeys(description);
        bulkPrize11Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize12(String description, String quantity)
    {
        bulkPrize12Description.sendKeys(description);
        bulkPrize12Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize13(String description, String quantity)
    {
        bulkPrize13Description.sendKeys(description);
        bulkPrize13Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize14(String description, String quantity)
    {
        bulkPrize14Description.sendKeys(description);
        bulkPrize14Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize15(String description, String quantity)
    {
        bulkPrize15Description.sendKeys(description);
        bulkPrize15Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize16(String description, String quantity)
    {
        bulkPrize16Description.sendKeys(description);
        bulkPrize16Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize17(String description, String quantity)
    {
        bulkPrize17Description.sendKeys(description);
        bulkPrize17Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize18(String description, String quantity)
    {
        bulkPrize18Description.sendKeys(description);
        bulkPrize18Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize19(String description, String quantity)
    {
        bulkPrize19Description.sendKeys(description);
        bulkPrize19Quantity.sendKeys(quantity);
    }

    public void enterBulkPrize20(String description, String quantity)
    {
        bulkPrize20Description.sendKeys(description);
        bulkPrize20Quantity.sendKeys(quantity);
    }

    public void enterGoldPrize(String description, String quantity)
    {
        goldPrizeDescription.sendKeys(description);
        goldPrizeQuantity.sendKeys(quantity);
    }

    public void addAnotherClick() {addAnotherButton.click();}

    public void skipSections(boolean design, boolean scratch, boolean variable, boolean prizes, boolean files)
    {
        if (design) designSpecSkip.click();
        if (scratch) scratchOffTypeSkip.click();
        if (variable) variableDataSkip.click();
        if (prizes) prizesSkip.click();
        if (files) uploadFilesSkip.click();
    }

    public void backButtonClick()
    {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();", goBackButton);
    }

    public void wait500ms() throws InterruptedException
    {
        synchronized (wait) {
            wait.wait(500);
        }
    }

    public void wait1000ms() throws InterruptedException
    {
        synchronized (wait) {
            wait.wait(1000);
        }
    }

    public boolean isElementPresent(String locator) {
        try {
            webDriver.findElement(By.xpath(locator));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
