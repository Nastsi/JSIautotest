package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public OrderPage(WebDriver driver)
    {
        webDriver = driver;
        wait = new WebDriverWait(webDriver, 30);

        PageFactory.initElements(webDriver, this);
    }

    @FindBy(className = "header__back-link")
    WebElement backButton;

    @FindBy(className = "order-steps__item--current")
    WebElement orderStepStatusCurrent;

    @FindBy(className = "order-steps__item--done")
    WebElement orderStepStatusDone;

    @FindBy(xpath = "//div[@id='root']/div/div/main/div/div[2]/div/div[2]/div/button")
    WebElement nextButton;

    @FindBy(id = "billing_order_first_name")
    WebElement firstNameBilling;

    @FindBy(id = "billing_order_last_name")
    WebElement lastNameBilling;

    @FindBy(id = "billing_order_company_name")
    WebElement companyBilling;

    @FindBy(id = "billing_order_email")
    WebElement emailBilling;

    @FindBy(id = "billing_order_address_1")
    WebElement address1Billing;

    @FindBy(id = "billing_order_address_2")
    WebElement address2Billing;

    @FindBy(id = "billing_order_country")
    WebElement countryBilling;

    @FindBy(name = "state_id")
    WebElement stateBilling;

    @FindBy(name = "city")
    WebElement cityBilling;

    @FindBy(id = "billing_order_zip")
    WebElement zipBilling;

    @FindBy(id = "billing_order_phone")
    WebElement phoneBilling;

    @FindBy(xpath = "//label/span")
    WebElement unlockShippingCheckbox;

    @FindBy(id = "shipping_order_first_name")
    WebElement firstNameShipping;

    @FindBy(id = "shipping_order_last_name")
    WebElement lastNameShipping;

    @FindBy(id = "shipping_order_company_name")
    WebElement companyShipping;

    @FindBy(id = "shipping_order_email")
    WebElement emailShipping;

    @FindBy(id = "shipping_order_address_1")
    WebElement address1Shipping;

    @FindBy(id = "shipping_order_address_2")
    WebElement address2Shipping;

    @FindBy(id = "shipping_order_country")
    WebElement countryShipping;

    @FindBy(xpath = "//div[2]/div/div[7]/div/div/div/input")
    WebElement cityShipping;

    @FindBy(xpath = "//div[2]/div/div[7]/div[2]/div/div/input")
    WebElement stateShipping;

    @FindBy(id = "shipping_order_zip")
    WebElement zipShipping;

    @FindBy(id = "shipping_order_phone")
    WebElement phoneShipping;

    @FindBy(xpath = "//div/span[2]")
    WebElement priceOfCards;

    @FindBy(xpath = "//div[2]/span[2]")
    WebElement priceofDiscount;

    @FindBy(xpath = "//div[2]/span[2]")
    WebElement priceOfExtraDesignOnly;

    @FindBy(xpath = "//div[2]/span[2]")
    WebElement priceOfTaxDesignOnly;

    @FindBy(xpath = "//div[3]/span[2]")
    WebElement priceOfExtras;

    @FindBy(xpath = "//div[4]/span[2]")
    WebElement priceofShipping;

    @FindBy(xpath = "//div[2]/div/div[3]/span[2]")
    WebElement priceOfTax;

    @FindBy(xpath = "//div[2]/div/div/span[2]")
    WebElement subtotalPrice;

    @FindBy(xpath = "//div[2]/div/div/div[2]/span[2]")
    WebElement totalPrice;

    @FindBy(xpath = "//div[2]/div[2]/span[2]")
    WebElement totalPriceDesignOnly;

    @FindBy(xpath = "//div[3]/div/div/div/div/div/div")
    WebElement nameBillingConfirm;

    @FindBy(xpath = "//div[3]/div/div/div/div/div/div[2]")
    WebElement companyBillingConfirm;

    @FindBy(xpath = "//div[3]/div/div/div/div/div/div[3]")
    WebElement addressBillingConfirm;

    @FindBy(xpath = "//div[3]/div/div/div/div/div/div[4]")
    WebElement address2BillingConfirm;

    @FindBy(xpath = "//div/div[5]")
    WebElement cityStateBillingConfirm;

    @FindBy(xpath = "//div/div/div[2]/div/div/div")
    WebElement nameShippingConfirm;

    @FindBy(xpath = "//div/div/div[2]/div/div/div[2]")
    WebElement companyShippingConfirm;

    @FindBy(xpath = "//div/div/div[2]/div/div/div[3]")
    WebElement addressShippingConfirm;

    @FindBy(xpath = "//div[2]/div/div/div[4]")
    WebElement address2ShippingConfirm;

    @FindBy(xpath = "//div[2]/div/div/div[5]")
    WebElement cityStateShippingConfirm;

    @FindBy(xpath = "//label/span")
    WebElement expressDesign;

    @FindBy(xpath = "//div[2]/div/div/div/div/label/span")
    WebElement expressDesignDesignOnly;

    @FindBy(xpath = "//div[2]/div/label/span")
    WebElement extraPrizes;

    @FindBy(xpath = "//div[3]/div/label/span")
    WebElement variableData;

    @FindBy(xpath = "//div[2]/div/div/div/div/label/span")
    WebElement firstShippingChoise;

    @FindBy(xpath = "//div[2]/div/div/div[2]/div/label/span")
    WebElement secondShippingChoise;

    @FindBy(xpath = "//div[2]/div/div/div[3]/div/label/span")
    WebElement thirdShippingChoise;

    @FindBy(xpath = "//div/input")
    WebElement discountCode;

    @FindBy(xpath = "//button[contains(.,'Apply')]")
    WebElement applyButton;

    @FindBy(id = "order_payment_name")
    WebElement creditCardName;

    @FindBy(id = "order_payment_card")
    WebElement creditCardNumber;

    @FindBy(id = "order_payment_month")
    WebElement creditCardMonth;

    @FindBy(id = "order_payment_year")
    WebElement creditCardYear;

    @FindBy(id = "order_payment_cvv")
    WebElement creditCardCVV;

    @FindBy(xpath = "//label/span")
    WebElement acceptCheckbox;

    @FindBy(xpath = "//div[@id='root']/div/div/main/div/div[2]/div/div[2]/div/div[3]/button")
    WebElement confirmButton;

    @FindBy(xpath = "//div[2]/span")
    WebElement emailDesignDetails;

    @FindBy(className = "order-success__number")
    WebElement orderNumber;

    @FindBy(id = "email_change")
    WebElement changeEmailField;

    @FindBy(xpath = "//button[contains(.,'Change Email')]")
    WebElement changeEmailButton;

    @FindBy(xpath = "//div[2]/div/div/span")
    WebElement planDisplayed;

    @FindBy(xpath = "//label/span")
    WebElement checkboxAgreement;

    @FindBy(css = ".text-green:nth-child(1)")
    WebElement headlineAgreement;

    @FindBy(xpath = "//div[2]/div/button")
    WebElement toFollowUpButton;

    public void firstNameBillingValidation()
    {
        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"First Name\" is required')]"));

        firstNameBilling.sendKeys("1234567890");
        clickNext();

        Assert.assertTrue("No error if numbers was entered", isElementPresent("//p[contains(.,'\"First Name\" is required')]"));

        firstNameBilling.sendKeys("!@#$%^&*()_=+[]{};:'\"");
        clickNext();

        Assert.assertTrue("No error if special symbols was entered", isElementPresent("//p[contains(.,'\"First Name\" is required')]"));

        firstNameBilling.sendKeys("Anastacia");
        clickNext();

        Assert.assertFalse("Error if right name was entered", isElementPresent("//p[contains(.,'\"First Name\" length must be at least 3 characters long')]"));
        Assert.assertFalse("Error if right name was entered", isElementPresent("//p[contains(.,'\"First Name\" is required')]"));

    }

    public void lastNameBillingValidation()
    {
        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"Last Name\" is required')]"));

        lastNameBilling.sendKeys("1234567890");
        clickNext();

        Assert.assertTrue("No error if numbers was entered", isElementPresent("//p[contains(.,'\"Last Name\" is required')]"));

        lastNameBilling.sendKeys("!@#$%^&*()_+={}[];:'\",./<>?*|");
        clickNext();

        Assert.assertTrue("No error if special symbols was entered", isElementPresent("//p[contains(.,'\"Last Name\" is required')]"));

        lastNameBilling.sendKeys("Pischikova");
        clickNext();

        Assert.assertFalse("Error if right name was entered", isElementPresent("//p[contains(.,'\"Last Name\" length must be at least 3 characters long')]"));
        Assert.assertFalse("Error if right name was entered", isElementPresent("//p[contains(.,'\"Last Name\" is required')]"));
    }

    public void companyBillingValidation()
    {
        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"Company\" is required')]"));

        companyBilling.sendKeys("Beetsoft");
        clickNext();

        Assert.assertFalse("Error if right name was entered", isElementPresent("//p[contains(.,'\"Company\" length must be at least 3 characters long')]"));
        Assert.assertFalse("Error if right name was entered", isElementPresent("//p[contains(.,'\"Company\" is required')]"));
    }

    public void emailBillingValidation ()
    {
        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"Email\" is required')]"));

        emailBilling.sendKeys("test123");
        clickNext();

        Assert.assertTrue("No error if email not valid", isElementPresent("//p[contains(.,'\"Email\" must be a valid email')]"));

        emailBilling.clear();
        emailBilling.sendKeys("test@mail");
        clickNext();

        Assert.assertTrue("No error if email not valid", isElementPresent("//p[contains(.,'\"Email\" must be a valid email')]"));

        emailBilling.clear();
        emailBilling.sendKeys("test@");
        clickNext();

        Assert.assertTrue("No error if email not valid", isElementPresent("//p[contains(.,'\"Email\" must be a valid email')]"));

        emailBilling.clear();
        emailBilling.sendKeys("@test");
        clickNext();

        Assert.assertTrue("No error if email not valid", isElementPresent("//p[contains(.,'\"Email\" must be a valid email')]"));

        emailBilling.clear();
        emailBilling.sendKeys("test test@mail.ru");
        clickNext();

        Assert.assertTrue("No error if email not valid", isElementPresent("//p[contains(.,'\"Email\" must be a valid email')]"));

        emailBilling.clear();
        emailBilling.sendKeys("test@test .ru");
        clickNext();

        Assert.assertTrue("No error if email not valid", isElementPresent("//p[contains(.,'\"Email\" must be a valid email')]"));

        emailBilling.clear();
        emailBilling.sendKeys("test123@mail.ru");

        Assert.assertFalse("Error if right email was entered", isElementPresent("//p[contains(.,'\"Email\" length must be at least 3 characters long')]"));
        Assert.assertFalse("Error if right email was entered", isElementPresent("//p[contains(.,'\"Email\" is required')]"));
        Assert.assertFalse("Error if right email was entered", isElementPresent("//p[contains(.,'\"Email\" must be a valid email')]"));
    }

    public void address1BillingValidation()
    {
        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"Address 1\" is required')]"));

        address1Billing.sendKeys("Krasnoflotskaya, 15");
        clickNext();

        Assert.assertFalse("Error if right address was entered", isElementPresent("//p[contains(.,'\"Address 1\" length must be at least 3 characters long')]"));
        Assert.assertFalse("Error if right address was entered", isElementPresent("//p[contains(.,'\"Address 1\" is required')]"));
    }

    public void countryBillingValidation()
    {
        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"Country\" is required')]"));

        Select select = new Select (countryBilling);
        select.selectByVisibleText("Canada");

        Assert.assertFalse("Error if country was selected", isElementPresent("//p[contains(.,'\"Country\" is required')]"));
    }

    public void cityBillingValidation() throws InterruptedException
    {
        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"City\" is required')]"));

        synchronized (wait) {
            wait.wait(4000);
        }
        cityBilling.sendKeys("Unity");
        cityBilling.sendKeys(Keys.ENTER);

        Assert.assertFalse("Error if city was entered", isElementPresent("//p[contains(.,'\"City\" is required')]"));
    }

    public void stateBillingValidation()
    {
        Assert.assertTrue("Error if right state was autocompleted", stateBilling.getAttribute("value").toString().compareTo("Saskatchewan") == 0);
        for (int i = 0; i <= 12; i++) {
            stateBilling.sendKeys(Keys.BACK_SPACE);
        }
        stateBilling.sendKeys(Keys.ENTER);

        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"State\" is required')]"));

        stateBilling.sendKeys("Omskaya");
        clickNext();
        Assert.assertTrue("No error if non-existing state was entered", isElementPresent("//p[contains(.,'\"State\" is required')]"));

        for (int i = 0; i <= 7; i++) {
            stateBilling.sendKeys(Keys.BACK_SPACE);
        }

        stateBilling.sendKeys("Saskatchewan");
        stateBilling.sendKeys(Keys.ENTER);

        Assert.assertFalse("Error if right state was entered", isElementPresent("//p[contains(.,'\"State\" is required')]"));
    }

    public void zipBillingValidation ()
    {
        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"ZIP/Postal Code\" is required')]"));

        zipBilling.sendKeys("123456");
        clickNext();
        Assert.assertFalse("Error if right zip was entered", isElementPresent("//p[contains(.,'\"ZIP/Postal Code\" is required')]"));
    }

    public void phoneBillingValidation()
    {
        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"Phone Number\" is required')]"));

        phoneBilling.clear();
        phoneBilling.sendKeys("qwertyuiopasdfghjklzxcvbnm");
        clickNext();

        Assert.assertTrue("No error if letters in Phone number was entered", isElementPresent("//p[contains(.,'\"Phone Number\" is required')]"));

        phoneBilling.clear();
        phoneBilling.sendKeys("!@#$%^&*()_+={}[];:'\",./<>?*|");
        clickNext();

        Assert.assertTrue("No error if special symbols in Phone number was entered", isElementPresent("//p[contains(.,'\"Phone Number\" is required')]"));

        phoneBilling.clear();
        phoneBilling.sendKeys("79043222367");

        Assert.assertFalse("Error if right phone number was entered", isElementPresent("//p[contains(.,'\"Phone Number\" is required')]"));
    }

    public void uncheckUseAsShipping()
    {
        unlockShippingCheckbox.click();
    }

    public void firstNameShippingValidation()
    {
        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"First Name\" is required')]"));

        firstNameShipping.sendKeys("1234567890");
        clickNext();

        Assert.assertTrue("No error if numbers was entered", isElementPresent("//p[contains(.,'\"First Name\" is required')]"));

        firstNameShipping.sendKeys("!@#$%^&*()_=+[]{};:'\"");
        clickNext();

        Assert.assertTrue("No error if special symbols was entered", isElementPresent("//p[contains(.,'\"First Name\" is required')]"));

        firstNameShipping.sendKeys("Anton");
        clickNext();

        Assert.assertFalse("Error if right name was entered", isElementPresent("//p[contains(.,'\"First Name\" length must be at least 3 characters long')]"));
        Assert.assertFalse("Error if right name was entered", isElementPresent("//p[contains(.,'\"First Name\" is required')]"));

    }

    public void lastNameShippingValidation()
    {
        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"Last Name\" is required')]"));

        lastNameShipping.sendKeys("1234567890");
        clickNext();

        Assert.assertTrue("No error if numbers was entered", isElementPresent("//p[contains(.,'\"Last Name\" is required')]"));

        lastNameShipping.sendKeys("!@#$%^&*()_+={}[];:'\",./<>?*|");
        clickNext();

        Assert.assertTrue("No error if special symbols was entered", isElementPresent("//p[contains(.,'\"Last Name\" is required')]"));

        lastNameShipping.sendKeys("Spitsyn");
        clickNext();

        Assert.assertFalse("Error if right name was entered", isElementPresent("//p[contains(.,'\"Last Name\" length must be at least 3 characters long')]"));
        Assert.assertFalse("Error if right name was entered", isElementPresent("//p[contains(.,'\"Last Name\" is required')]"));
    }

    public void companyShippingValidation()
    {
        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"Company\" is required')]"));

        companyShipping.sendKeys("RS-consult");
        clickNext();

        Assert.assertFalse("Error if right name was entered", isElementPresent("//p[contains(.,'\"Company\" length must be at least 3 characters long')]"));
        Assert.assertFalse("Error if right name was entered", isElementPresent("//p[contains(.,'\"Company\" is required')]"));
    }

    public void emailShippingValidation ()
    {
        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"Email\" is required')]"));

        emailShipping.sendKeys("test123");
        clickNext();

        Assert.assertTrue("No error if email not valid", isElementPresent("//p[contains(.,'\"Email\" must be a valid email')]"));

        emailShipping.clear();
        emailShipping.sendKeys("test@mail");
        clickNext();

        Assert.assertTrue("No error if email not valid", isElementPresent("//p[contains(.,'\"Email\" must be a valid email')]"));

        emailShipping.clear();
        emailShipping.sendKeys("test@");
        clickNext();

        Assert.assertTrue("No error if email not valid", isElementPresent("//p[contains(.,'\"Email\" must be a valid email')]"));

        emailShipping.clear();
        emailShipping.sendKeys("@test");
        clickNext();

        Assert.assertTrue("No error if email not valid", isElementPresent("//p[contains(.,'\"Email\" must be a valid email')]"));

        emailShipping.clear();
        emailShipping.sendKeys("test test@mail.ru");
        clickNext();

        Assert.assertTrue("No error if email not valid", isElementPresent("//p[contains(.,'\"Email\" must be a valid email')]"));

        emailShipping.clear();
        emailShipping.sendKeys("test@test .ru");
        clickNext();

        Assert.assertTrue("No error if email not valid", isElementPresent("//p[contains(.,'\"Email\" must be a valid email')]"));

        emailShipping.clear();
        emailShipping.sendKeys("test1234@mail.ru");

        Assert.assertFalse("Error if right email was entered", isElementPresent("//p[contains(.,'\"Email\" length must be at least 3 characters long')]"));
        Assert.assertFalse("Error if right email was entered", isElementPresent("//p[contains(.,'\"Email\" is required')]"));
        Assert.assertFalse("Error if right email was entered", isElementPresent("//p[contains(.,'\"Email\" must be a valid email')]"));
    }

    public void address1ShippingValidation()
    {
        clickNext();
        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"Address 1\" is required')]"));

        address1Shipping.sendKeys("10 years of October, 193");
        clickNext();

        Assert.assertFalse("Error if right address was entered", isElementPresent("//p[contains(.,'\"Address 1\" length must be at least 3 characters long')]"));
        Assert.assertFalse("Error if right address was entered", isElementPresent("//p[contains(.,'\"Address 1\" is required')]"));
    }

    public void countryShippingValidation()
    {
        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"Country\" is required')]"));

        Select select = new Select (countryShipping);
        select.selectByVisibleText("Canada");

        Assert.assertFalse("Error if country was selected", isElementPresent("//p[contains(.,'\"Country\" is required')]"));
    }

    public void cityShippingValidation() throws InterruptedException
    {
        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"City\" is required')]"));

        synchronized (wait) {
            wait.wait(4000);
        }
        cityShipping.sendKeys("Erickson");
        cityShipping.sendKeys(Keys.ENTER);

        Assert.assertFalse("Error if city was entered", isElementPresent("//p[contains(.,'\"City\" is required')]"));
    }

    public void stateShippingValidation()
    {
        Assert.assertTrue("Error if right state was autocompleted", stateShipping.getAttribute("value").toString().compareTo("British Columbia") == 0);
        for (int i = 0; i <= 16; i++) {
            stateShipping.sendKeys(Keys.BACK_SPACE);
        }
        stateShipping.sendKeys(Keys.ENTER);

        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"State\" is required')]"));

        stateShipping.sendKeys("Omskaya");
        clickNext();
        Assert.assertTrue("No error if non-existing state was entered", isElementPresent("//p[contains(.,'\"State\" is required')]"));

        for (int i = 0; i <= 7; i++) {
            stateShipping.sendKeys(Keys.BACK_SPACE);
        }

        stateShipping.sendKeys("British Columbia");
        stateShipping.sendKeys(Keys.ENTER);

        Assert.assertFalse("Error if right state was entered", isElementPresent("//p[contains(.,'\"State\" is required')]"));
    }

    public void zipShippingValidation ()
    {
        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"ZIP/Postal Code\" is required')]"));

        zipShipping.sendKeys("123456");
        clickNext();
        Assert.assertFalse("Error if right zip was entered", isElementPresent("//p[contains(.,'\"ZIP/Postal Code\" is required')]"));
    }

    public void phoneShippingValidation()
    {
        clickNext();

        Assert.assertTrue("No error if nothing was entered", isElementPresent("//p[contains(.,'\"Phone Number\" is required')]"));

        phoneShipping.clear();
        phoneShipping.sendKeys("qwertyuiopasdfghjklzxcvbnm");
        clickNext();

        Assert.assertTrue("No error if letters in Phone number was entered", isElementPresent("//p[contains(.,'\"Phone Number\" is required')]"));

        phoneShipping.clear();
        phoneShipping.sendKeys("!@#$%^&*()_+={}[];:'\",./<>?*|");
        clickNext();

        Assert.assertTrue("No error if special symbols in Phone number was entered", isElementPresent("//p[contains(.,'\"Phone Number\" is required')]"));

        phoneShipping.clear();
        phoneShipping.sendKeys("79511415689");

        Assert.assertFalse("Error if right phone number was entered", isElementPresent("//p[contains(.,'\"Phone Number\" is required')]"));
    }

    public void goBackButton()
    {
        backButton.click();
    }

    public void checkStep(String step)
    {
        Assert.assertTrue("There's not the right step is displayed in header", orderStepStatusCurrent.getText().compareTo(step) == 0);
    }
    public void checkStepDone(String done)
    {
        Assert.assertTrue("The step that was done is wrong", orderStepStatusDone.getText().compareTo(done) == 0);
    }

    public void checkSummaryContactInfo(String quantitySelected, String sizeSelected, String planSelected)
    {
        checkCardPrice(quantitySelected, sizeSelected, planSelected);
        float cards = Float.parseFloat(priceOfCards.getText().substring(1));
        Assert.assertTrue("Price of discount is wrong", priceofDiscount.getText().compareTo("-$00.00") == 0);
        float disc = Float.parseFloat(priceofDiscount.getText().substring(2));
        Assert.assertTrue("Price of extras is wrong", priceOfExtras.getText().compareTo("$00.00") == 0);
        float extra = Float.parseFloat(priceOfExtras.getText().substring(1));
        Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$00.00") == 0);
        float ship = Float.parseFloat(priceofShipping.getText().substring(1));
        Assert.assertTrue("Total price is wrong", totalPrice.getText().compareTo(priceOfCards.getText()) == 0);
        float total = Float.parseFloat(totalPrice.getText().substring(1));
        Assert.assertEquals("Sum of elements isn't equal to total price", total, cards - disc + extra + ship, 0.001);
    }

    public void checkSummaryContactInfoAfterReview(String cards, String disc, String extra, String ship)
    {
        Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo(cards) == 0);
        float cardsNow = Float.parseFloat(priceOfCards.getText().substring(1));
        Assert.assertTrue("Price of discount is wrong", priceofDiscount.getText().compareTo(disc) == 0);
        float discNow = Float.parseFloat(priceofDiscount.getText().substring(2));
        Assert.assertTrue("Price of extras is wrong", priceOfExtras.getText().compareTo(extra) == 0);
        float extraNow = Float.parseFloat(priceOfExtras.getText().substring(1));
        Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo(ship) == 0);
        float shipNow = Float.parseFloat(priceofShipping.getText().substring(1));

        float total = Float.parseFloat(totalPrice.getText().substring(1));
        Assert.assertEquals("Sum of elements isn't equal to total price", total, cardsNow - discNow + extraNow + shipNow, 0.001);
    }

    public String getPricingOfCards()
    {
        return priceOfCards.getText();
    }

    public String getPricingOfDiscount()
    {
        return priceofDiscount.getText();
    }

    public String getPricingOfExtras()
    {
        return priceOfExtras.getText();
    }

    public String getPricingOfShipping()
    {
        return priceofShipping.getText();
    }

    public void checkSummaryOrderReview(String quantitySelected, String sizeSelected, String planSelected, boolean extra1Selected, boolean extra2Selected, boolean extra3Selected, String shippingSelected,
                                        String discountSelected)
    {
        checkCardPrice(quantitySelected, sizeSelected, planSelected);
        float cards = Float.parseFloat(priceOfCards.getText().substring(1));
        checkDiscount(discountSelected);
        float disc = Float.parseFloat(priceofDiscount.getText().substring(2));
        checkExtra(extra1Selected, extra2Selected, extra3Selected);
        float extra = Float.parseFloat(priceOfExtras.getText().substring(1));
        checkShipping(quantitySelected, sizeSelected, shippingSelected);
        float ship = Float.parseFloat(priceofShipping.getText().substring(1));
        float total = Float.parseFloat(totalPrice.getText().substring(1));

        Assert.assertEquals("Sum of elements isn't equal to total price", total, cards - disc + extra + ship, 0.001);
    }

    public void checkSummaryPayment (String quantitySelected, String sizeSelected, String city, String shippingSelected)
    {
        float subtotal = Float.parseFloat(subtotalPrice.getText().substring(1));
        float disc = Float.parseFloat(webDriver.findElement(By.xpath("//div[2]/div/div[2]/span[2]")).getText().substring(2));
        checkShipping(quantitySelected, sizeSelected, shippingSelected);
        float ship = Float.parseFloat(priceofShipping.getText().substring(1));
        checkTax(city);
        float tax = Float.parseFloat(priceOfTax.getText().substring(1));
        float total = Float.parseFloat(totalPrice.getText().substring(1));

        Assert.assertEquals("Sum of elements isn't equal to total price", total, subtotal - disc + ship + tax, 0.001);
    }

    public String enterCredentialsBilling(String firstName, String lastName, String company, String email, String address1, String address2, String country, String city, String zip, String phone)
    {
        firstNameBilling.sendKeys(firstName);
        lastNameBilling.sendKeys(lastName);
        companyBilling.sendKeys(company);
        emailBilling.sendKeys(email);
        address1Billing.sendKeys(address1);
        address2Billing.sendKeys(address2);

        chooseCountryBilling(country);
        wait.until(ExpectedConditions.elementToBeClickable(cityBilling));

        cityBilling.sendKeys(city);
        cityBilling.sendKeys(Keys.ENTER);

        zipBilling.sendKeys(zip);
        phoneBilling.sendKeys(phone);

        return stateBilling.getAttribute("value");
    }

    public void confirmShippingAndBillingIfNoShipping(String name, String company, String address1, String address2, String city, String state, String zip)
    {
        Assert.assertTrue("Wrong name", nameBillingConfirm.getText().compareTo(name) == 0);
        Assert.assertTrue("Wrong company", companyBillingConfirm.getText().compareTo(company) == 0);
        Assert.assertTrue("Wrong address", addressBillingConfirm.getText().compareTo(address1) == 0);
        Assert.assertTrue("Wrong address 2", address2BillingConfirm.getText().compareTo(address2) == 0);
        Assert.assertTrue("Wrong city or state", cityStateBillingConfirm.getText().compareTo(city + ", " + state + ", " + zip) == 0);

        Assert.assertTrue("Wrong shipping name", nameShippingConfirm.getText().compareTo(name) == 0);
        Assert.assertTrue("Wrong shipping company", companyShippingConfirm.getText().compareTo(company) == 0);
        Assert.assertTrue("Wrong shipping address", addressShippingConfirm.getText().compareTo(address1) == 0);
        Assert.assertTrue("Wrong shipping address", address2ShippingConfirm.getText().compareTo(address2) == 0);
        Assert.assertTrue("Wrong shipping city or state", cityStateShippingConfirm.getText().compareTo(city + ", " + state + ", " + zip) == 0);
    }

    public String enterCredentialShipping(String firstName, String lastName, String company, String email, String address1, String address2, String country, String city, String zip, String phone)
    {
        firstNameShipping.sendKeys(firstName);
        lastNameShipping.sendKeys(lastName);
        companyShipping.sendKeys(company);
        emailShipping.sendKeys(email);
        address1Shipping.sendKeys(address1);
        address2Shipping.sendKeys(address2);

        chooseCountryShipping(country);
        wait.until(ExpectedConditions.elementToBeClickable(cityShipping));

        cityShipping.sendKeys(city);
        cityShipping.sendKeys(Keys.ENTER);

        zipShipping.sendKeys(zip);
        phoneShipping.sendKeys(phone);

        return stateShipping.getAttribute("value");
    }

    public void confirmShippingAndBillingWithShipping(String nameBilling, String companyBilling, String address1Billing, String address2Billing, String cityBilling, String stateBilling, String zipBilling,
                                                      String nameShipping, String companyShipping, String address1Shipping, String address2Shipping, String cityShipping, String stateShipping, String zipShipping)
    {
        Assert.assertTrue("Wrong billing name", nameBillingConfirm.getText().compareTo(nameBilling) == 0);
        Assert.assertTrue("Wrong billing company", companyBillingConfirm.getText().compareTo(companyBilling) == 0);
        Assert.assertTrue("Wrong billing address", addressBillingConfirm.getText().compareTo(address1Billing) == 0);
        Assert.assertTrue("Wrong billing address", address2BillingConfirm.getText().compareTo(address2Billing) == 0);
        Assert.assertTrue("Wrong billing city or state", cityStateBillingConfirm.getText().compareTo(cityBilling + ", " + stateBilling + ", " + zipBilling) == 0);


        Assert.assertTrue("Wrong shipping name", nameShippingConfirm.getText().compareTo(nameShipping) == 0);
        Assert.assertTrue("Wrong shipping company", companyShippingConfirm.getText().compareTo(companyShipping) == 0);
        Assert.assertTrue("Wrong shipping address", addressShippingConfirm.getText().compareTo(address1Shipping) == 0);
        Assert.assertTrue("Wrong shipping address", address2ShippingConfirm.getText().compareTo(address2Shipping) == 0);
        Assert.assertTrue("Wrong shipping city or state", cityStateShippingConfirm.getText().compareTo(cityShipping + ", " + stateShipping + ", " + zipShipping) == 0);
    }

    public void enterCardCredential(String name, String number, String month, String year, String cvv)
    {
        creditCardName.sendKeys(name);
        creditCardNumber.sendKeys(number);
        cardMonthEnter(month);
        cardYearEnter(year);
        creditCardCVV.sendKeys(cvv);
        clickConfirm();
    }

    public void cardNameValidation() throws InterruptedException
    {
        wait.until(ExpectedConditions.elementToBeClickable(creditCardCVV));

        creditCardName.sendKeys("1234567890");
        clickConfirm();
        wait1000ms();

        Assert.assertTrue("No error if numbers in name are entered", isElementPresent("//p[contains(.,'The order payment name field is required.')]"));

        creditCardName.sendKeys("!@#$%^&*()_=+[]{};:'\"");
        clickConfirm();
        wait1000ms();

        Assert.assertTrue("No error if special symbols in name are entered", isElementPresent("//p[contains(.,'The order payment name field is required.')]"));

        creditCardName.sendKeys("Anastacia Pischikova");
        clickConfirm();
        wait1000ms();

        Assert.assertFalse("Error if right name was entered", isElementPresent("//p[contains(.,'The order payment name field is required.')]"));
    }

    public void cardNumberValidation() throws InterruptedException
    {
        creditCardNumber.sendKeys("!@#$%^&*()_=+[]{};:'\"");
        clickConfirm();
        wait1000ms();

        Assert.assertTrue("No error if special symbols in number are entered", isElementPresent("//p[contains(.,'The order payment card field is required.')]"));

        creditCardNumber.sendKeys("qwertyuiopasdfghjklzxcvbnm");
        clickConfirm();
        wait1000ms();

        Assert.assertTrue("No error if letters in number are entered", isElementPresent("//p[contains(.,'The order payment card field is required.')]"));

        creditCardNumber.sendKeys("4111111111111111");
        clickConfirm();

        wait1000ms();

        Assert.assertFalse("Error if right number was entered", isElementPresent("//p[contains(.,'The order payment card field is required.')]"));
    }

    public void cardCVVValidation() throws InterruptedException
    {
        creditCardCVV.sendKeys("qwertyuiopasdfghjklzxcvbnm");
        clickConfirm();
        wait1000ms();

        Assert.assertTrue("No error if letters in cvv are entered", isElementPresent("//p[contains(.,'The order payment cvv field is required.')]"));

        creditCardCVV.sendKeys("!@#$%^&*()_=+[]{};:'\"");
        clickConfirm();
        wait1000ms();

        Assert.assertTrue("No error if special symbols in cvv are entered", isElementPresent("//p[contains(.,'The order payment cvv field is required.')]"));

        creditCardCVV.sendKeys("54345234");
        clickConfirm();
        wait1000ms();

        Assert.assertTrue("No error if special symbols in cvv are entered", isElementPresent("//p[contains(.,'The order payment cvv must be between 3 and 4 digits')]"));

        creditCardCVV.clear();
        creditCardCVV.sendKeys("54");
        clickConfirm();
        wait1000ms();

        Assert.assertTrue("No error if special symbols in cvv are entered", isElementPresent("//p[contains(.,'The order payment cvv must be between 3 and 4 digits')]"));

        creditCardCVV.clear();
        creditCardCVV.sendKeys("545");

        wait1000ms();

        Assert.assertFalse("Error if right number was entered", isElementPresent("//p[contains(.,'The order payment cvv field is required.')]"));
        Assert.assertFalse("Error if right number was entered", isElementPresent("//p[contains(.,'The order payment cvv must be between 3 and 4 digits')]"));
    }

    public void cardMonthEnter(String monthSelected)
    {
        Select month = new Select (creditCardMonth);
        month.selectByVisibleText(monthSelected);
    }

    public void cardYearEnter(String yearSelected)
    {
        Select month = new Select (creditCardYear);
        month.selectByVisibleText(yearSelected);
    }

    public void chooseExtra(boolean extra1, boolean extra2, boolean extra3)
    {
        wait.until(ExpectedConditions.elementToBeClickable(variableData));
        if (extra1) expressDesign.click();
        if (extra2) extraPrizes.click();
        if (extra3) variableData.click();
    }

    public void chooseShipping(String shipping)
    {
        wait.until(ExpectedConditions.elementToBeClickable(thirdShippingChoise));
        if ((shipping.compareTo("2-day USA JSI") == 0) || (shipping.compareTo("2-day Canada JSI") == 0)) firstShippingChoise.click();
        else if ((shipping.compareTo("Overnight USA JSI") == 0) || (shipping.compareTo("Priority Canada JSI") == 0)) secondShippingChoise.click();
        else if ((shipping.compareTo("Ground Hi & AK JSI") == 0) || (shipping.compareTo("Ground 48 States JSI") == 0) || (shipping.compareTo("Ground Canada JSI") == 0)) thirdShippingChoise.click();
    }

    public void enterPromoCode(String promoCode)
    {
        if (promoCode.compareTo("none") != 0) {
            discountCode.sendKeys(promoCode);
            applyButton.click();
        }
    }

    public void chooseCountryBilling(String country)
    {
        Select select = new Select (countryBilling);
        select.selectByVisibleText(country);
    }

    public void chooseCountryShipping(String country)
    {
        Select select = new Select (countryShipping);
        select.selectByVisibleText(country);
    }

    public void clickNext()
    {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();", nextButton);
    }

    public void clickConfirm()
    {
        if (confirmButton.isEnabled()) {
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            js.executeScript("arguments[0].click();", confirmButton);
        }
        else
        {
            acceptCheckbox.click();
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            js.executeScript("arguments[0].click();", confirmButton);
        }
    }

    public void checkCardPrice(String quantitySelected, String sizeSelected, String planSelected)
    {
        if (quantitySelected == "500" && sizeSelected == "2x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$395.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "2x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$495.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "2x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$595.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "2x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$795.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "2x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1195.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "2x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$598.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "2x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$698.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "2x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$798.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "2x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1098.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "2x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1698.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "2x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$689.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "2x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$769.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "2x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$879.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "2x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1199.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "2x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1869.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$595.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$695.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$795.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1095.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1595.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$798.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$898.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$998.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1398.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1998.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$879.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$989.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1099.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1499.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$2199.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x6" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$795.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x6" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$895.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x6" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$995.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x6" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1395.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x6" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1895.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x6" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$898.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x6" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$998.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x6" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1098.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x6" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1698.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x6" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$2398.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x6" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$989.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x6" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1099.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x6" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1199.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x6" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1869.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x6" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$2599.00") == 0);
        else if (planSelected == "Design only") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$69.00") == 0);
    }

    public void checkDiscount(String discount)
    {
        float cards = Float.parseFloat(priceOfCards.getText().substring(1));
        if (discount.compareTo("test") == 0) Assert.assertTrue("Price of discount during order is wrong",priceofDiscount.getText().compareTo("-$10.00") == 0);
        else if (discount.compareTo("labore") == 0 && cards > 936) Assert.assertTrue("Price of discount during order is wrong",priceofDiscount.getText().compareTo("-$936.00") == 0);
        else if (discount.compareTo("labore") == 0 && cards < 936) Assert.assertTrue("Price of discount during order is wrong",priceofDiscount.getText().compareTo("-" + priceOfCards.getText()) == 0);
        else if (discount.compareTo("facilis") == 0 && cards > 241) Assert.assertTrue("Price of discount during order is wrong",priceofDiscount.getText().compareTo("-$241.00") == 0);
        else if (discount.compareTo("facilis") == 0 && cards < 241) Assert.assertTrue("Price of discount during order is wrong",priceofDiscount.getText().compareTo("-" + priceOfCards.getText()) == 0);
        else if (discount.compareTo("test2") == 0) Assert.assertTrue("Price of discount during order is wrong",priceofDiscount.getText().compareTo("-" + priceOfCards.getText()) == 0);
        else if (discount.compareTo("illum") == 0)
        {
            double percent = cards * 0.50;
            String s = String.format("%.2f", percent);
            s = s.replace(",", ".");
            Assert.assertTrue("Price of discount during order is wrong",priceofDiscount.getText().compareTo("-$" + s) == 0);
        }
        else if (discount.compareTo("cupiditate") == 0)
        {
            double percent = cards * 0.48;
            String s = String.format("%.2f", percent);
            s = s.replace(",", ".");
            Assert.assertTrue("Price of discount during order is wrong",priceofDiscount.getText().compareTo("-$" + s) == 0);
        }
        else if (discount.compareTo("rerum") == 0)
        {
            double percent = cards * 0.19;
            String s = String.format("%.2f", percent);
            s = s.replace(",", ".");
            Assert.assertTrue("Price of discount during order is wrong",priceofDiscount.getText().compareTo("-$" + s) == 0);
        }
        else if (discount.compareTo("none") == 0) Assert.assertTrue("Price of discount during order is wrong",priceofDiscount.getText().compareTo("-$00.00") == 0);
    }

    public void checkExtra(boolean extra1, boolean extra2, boolean extra3)
    {
        if (extra1 == false && extra2 == false && extra3 == false) Assert.assertTrue("Price of extra is wrong",priceOfExtras.getText().compareTo("$00.00") == 0);
        else if (extra1 == true && extra2 == false && extra3 == false) Assert.assertTrue("Price of extra is wrong",priceOfExtras.getText().compareTo("$29.00") == 0);
        else if (extra1 == false && extra2 == true && extra3 == false) Assert.assertTrue("Price of extra is wrong",priceOfExtras.getText().compareTo("$50.00") == 0);
        else if (extra1 == false && extra2 == false && extra3 == true) Assert.assertTrue("Price of extra is wrong",priceOfExtras.getText().compareTo("$75.00") == 0);
        else if (extra1 == true && extra2 == true && extra3 == false) Assert.assertTrue("Price of extra is wrong",priceOfExtras.getText().compareTo("$79.00") == 0);
        else if (extra1 == true && extra2 == false && extra3 == true) Assert.assertTrue("Price of extra is wrong",priceOfExtras.getText().compareTo("$104.00") == 0);
        else if (extra1 == false && extra2 == true && extra3 == true) Assert.assertTrue("Price of extra is wrong",priceOfExtras.getText().compareTo("$125.00") == 0);
        else if (extra1 == true && extra2 == true && extra3 == true) Assert.assertTrue("Price of extra is wrong",priceOfExtras.getText().compareTo("$154.00") == 0);
    }

    public void checkShipping (String quantitySelected, String sizeSelected, String shipping)
    {
        if (quantitySelected == "500" && sizeSelected == "2x4" && shipping == "Ground 48 States JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$23.25") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "2x4" && shipping == "Ground 48 States JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$27.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "2x4" && shipping == "Ground 48 States JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$29.25") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "2x4" && shipping == "Ground 48 States JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$44.25") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "2x4" && shipping == "Ground 48 States JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$66.75") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x4" && shipping == "Ground 48 States JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$27.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x4" && shipping == "Ground 48 States JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$30.75") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x4" && shipping == "Ground 48 States JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$44.25") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x4" && shipping == "Ground 48 States JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$78.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x4" && shipping == "Ground 48 States JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$100.50") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x6" && shipping == "Ground 48 States JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$28.50") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x6" && shipping == "Ground 48 States JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$35.25") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x6" && shipping == "Ground 48 States JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$62.25") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x6" && shipping == "Ground 48 States JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$105.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x6" && shipping == "Ground 48 States JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$126.00") == 0);
        if (quantitySelected == "500" && sizeSelected == "2x4" && shipping == "Ground Hi & AK JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$51.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "2x4" && shipping == "Ground Hi & AK JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$60.75") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "2x4" && shipping == "Ground Hi & AK JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$82.50") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "2x4" && shipping == "Ground Hi & AK JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$118.50") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "2x4" && shipping == "Ground Hi & AK JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$183.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x4" && shipping == "Ground Hi & AK JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$60.75") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x4" && shipping == "Ground Hi & AK JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$75.75") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x4" && shipping == "Ground Hi & AK JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$118.50") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x4" && shipping == "Ground Hi & AK JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$183.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x4" && shipping == "Ground Hi & AK JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$315.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x6" && shipping == "Ground Hi & AK JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$66.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x6" && shipping == "Ground Hi & AK JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$87.75") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x6" && shipping == "Ground Hi & AK JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$153.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x6" && shipping == "Ground Hi & AK JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$255.75") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x6" && shipping == "Ground Hi & AK JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$447.75") == 0);
        if (quantitySelected == "500" && sizeSelected == "2x4" && shipping == "Overnight USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$91.50") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "2x4" && shipping == "Overnight USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$109.50") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "2x4" && shipping == "Overnight USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$150.75") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "2x4" && shipping == "Overnight USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$211.50") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "2x4" && shipping == "Overnight USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$330.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x4" && shipping == "Overnight USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$109.50") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x4" && shipping == "Overnight USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$133.50") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x4" && shipping == "Overnight USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$211.50") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x4" && shipping == "Overnight USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$310.50") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x4" && shipping == "Overnight USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$572.25") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x6" && shipping == "Overnight USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$111.75") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x6" && shipping == "Overnight USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$153.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x6" && shipping == "Overnight USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$267.75") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x6" && shipping == "Overnight USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$435.75") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x6" && shipping == "Overnight USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$849.00") == 0);
        if (quantitySelected == "500" && sizeSelected == "2x4" && shipping == "2-day USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$43.50") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "2x4" && shipping == "2-day USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$56.25") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "2x4" && shipping == "2-day USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$93.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "2x4" && shipping == "2-day USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$146.25") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "2x4" && shipping == "2-day USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$247.50") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x4" && shipping == "2-day USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$53.25") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x4" && shipping == "2-day USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$77.25") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x4" && shipping == "2-day USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$146.25") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x4" && shipping == "2-day USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$247.50") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x4" && shipping == "2-day USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$429.75") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x6" && shipping == "2-day USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$63.75") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x6" && shipping == "2-day USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$100.50") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x6" && shipping == "2-day USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$200.25") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x6" && shipping == "2-day USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$345.75") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x6" && shipping == "2-day USA JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$632.25") == 0);
        if (quantitySelected == "500" && sizeSelected == "2x4" && shipping == "Ground Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$52.50") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "2x4" && shipping == "Ground Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$57.75") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "2x4" && shipping == "Ground Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$65.25") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "2x4" && shipping == "Ground Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$81.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "2x4" && shipping == "Ground Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$120.75") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x4" && shipping == "Ground Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$57.75") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x4" && shipping == "Ground Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$62.25") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x4" && shipping == "Ground Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$81.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x4" && shipping == "Ground Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$120.75") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x4" && shipping == "Ground Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$187.50") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x6" && shipping == "Ground Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$58.50") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x6" && shipping == "Ground Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$67.50") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x6" && shipping == "Ground Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$100.50") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x6" && shipping == "Ground Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$160.50") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x6" && shipping == "Ground Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$252.00") == 0);
        if (quantitySelected == "500" && sizeSelected == "2x4" && shipping == "Priority Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$120.75") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "2x4" && shipping == "Priority Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$146.25") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "2x4" && shipping == "Priority Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$164.25") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "2x4" && shipping == "Priority Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$252.75") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "2x4" && shipping == "Priority Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$398.25") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x4" && shipping == "Priority Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$146.25") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x4" && shipping == "Priority Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$189.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x4" && shipping == "Priority Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$287.25") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x4" && shipping == "Priority Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$446.25") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x4" && shipping == "Priority Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$663.75") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x6" && shipping == "Priority Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$120.75") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x6" && shipping == "Priority Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$146.25") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x6" && shipping == "Priority Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$164.25") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x6" && shipping == "Priority Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$252.75") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x6" && shipping == "Priority Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$398.25") == 0);
        if (quantitySelected == "500" && sizeSelected == "2x4" && shipping == "2-day Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$111.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "2x4" && shipping == "2-day Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$129.75") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "2x4" && shipping == "2-day Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$173.25") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "2x4" && shipping == "2-day Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$227.25") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "2x4" && shipping == "2-day Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$367.50") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x4" && shipping == "2-day Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$129.75") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x4" && shipping == "2-day Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$159.75") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x4" && shipping == "2-day Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$227.25") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x4" && shipping == "2-day Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$367.50") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x4" && shipping == "2-day Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$419.25") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x6" && shipping == "2-day Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$159.75") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x6" && shipping == "2-day Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$179.25") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x6" && shipping == "2-day Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$288.75") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x6" && shipping == "2-day Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$469.50") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x6" && shipping == "2-day Canada JSI") Assert.assertTrue("Price of shipping is wrong", priceofShipping.getText().compareTo("$618.00") == 0);

    }

    public void checkTax (String city)
    {
        float subtotal = Float.parseFloat(subtotalPrice.getText().substring(1));
        float disc = Float.parseFloat(webDriver.findElement(By.xpath("//div[2]/div/div[2]/span[2]")).getText().substring(2));
        float tax = Float.parseFloat(priceOfTax.getText().substring(1));

        if (city.compareTo("Quatsino") == 0)
        {
            double expected = (subtotal - disc) * 0.0326;
            double round = Math.round(expected * 100.0) / 100.0;
            Assert.assertEquals("Tax is wrong", round, tax, 0.001);
        }
        else if (city.compareTo("New York") == 0)
        {
            double expected = (subtotal - disc) * 0.0779;
            double round = Math.round(expected * 100.0) / 100.0;
            Assert.assertEquals("Tax is wrong", round, tax, 0.001);
        }
        else if (city.compareTo("Palmer") == 0)
        {
            double expected = (subtotal - disc) * 0.0861;
            double round = Math.round(expected * 100.0) / 100.0;
            Assert.assertEquals("Tax is wrong", round, tax, 0.001);
        }
    }

    public void checkEmail(String email)
    {
        Assert.assertTrue("Emails aren't equal", emailDesignDetails.getText().compareTo(email) == 0);
    }

    public void enterNewEmail(String email)
    {
        changeEmailField.sendKeys(email);
        changeEmailButton.click();
    }

    public String getOrderNumber ()
    {
        return orderNumber.getText();
    }

    public void checkPlanName()
    {
        planDisplayed.getText().compareTo("Design only:");
    }

    public void chooseExtraDesignOnly (boolean extra)
    {
        if (extra) expressDesignDesignOnly.click();
    }

    public void clickAgreement()
    {
        checkboxAgreement.click();
    }

    public void checkSummaryReviewDesignOnly()
    {
        Assert.assertTrue("", priceOfExtraDesignOnly.getText().compareTo("$29.00") == 0);
        checkCardPrice("", "", "Design only");
    }

    public void checkSummaryPaymentDesignOnly(String city)
    {
        Assert.assertTrue("", subtotalPrice.getText().compareTo("$98.00") == 0);

        float subtotal = Float.parseFloat(subtotalPrice.getText().substring(1));
        float tax = Float.parseFloat(priceOfTaxDesignOnly.getText().substring(1));
        float total = Float.parseFloat(totalPriceDesignOnly.getText().substring(1));

        if (city.compareTo("Quatsino") == 0)
        {
            double expected = subtotal * 0.0326;
            double round = Math.round(expected * 100.0) / 100.0;
            Assert.assertEquals("Tax is wrong", round, tax, 0.001);
        }
        else if (city.compareTo("New York") == 0)
        {
            double expected = subtotal * 0.0779;
            double round = Math.round(expected * 100.0) / 100.0;
            Assert.assertEquals("Tax is wrong", round, tax, 0.001);
        }
        else if (city.compareTo("Palmer") == 0)
        {
            double expected = subtotal * 0.0861;
            double round = Math.round(expected * 100.0) / 100.0;
            Assert.assertEquals("Tax is wrong", round, tax, 0.001);
        }

        Assert.assertEquals("Sum of elements isn't equal to total price", total, subtotal + tax, 0.001);
    }

    public void checkHeadlineAgreement()
    {
        Assert.assertTrue("No headline on Order review", headlineAgreement.getText().compareTo("Confidentiality / Nondisclosure Agreement") == 0);
    }

    public void redirectToFollowUp()
    {
        toFollowUpButton.click();
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
