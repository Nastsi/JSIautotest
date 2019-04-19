package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
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

    @FindBy(className = "order-summary__description")
    WebElement summaryDescription;

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

    @FindBy(id = "order_summary_quantity")
    WebElement quantitySummary;

    @FindBy(id = "order_summary_size")
    WebElement sizeSummary;

    @FindBy(id = "order_summary_production")
    WebElement planSummary;

    @FindBy(xpath = "//div/span[2]")
    WebElement priceOfCards;

    @FindBy(xpath = "//div[2]/span[2]")
    WebElement priceofDiscount;

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

    @FindBy(xpath = "//div[3]/div/div/div/div/div/div")
    WebElement nameBillingConfirm;

    @FindBy(xpath = "//div[3]/div/div/div/div/div/div[2]")
    WebElement companyBillingConfirm;

    @FindBy(xpath = "//div[3]/div/div/div/div/div/div[3]")
    WebElement addressBillingConfirm;

    @FindBy(xpath = "//div[3]/div/div/div/div/div/div[4]")
    WebElement cityStateBillingConfirm;

    @FindBy(xpath = "//div/div/div[2]/div/div/div")
    WebElement nameShippingConfirm;

    @FindBy(xpath = "//div/div/div[2]/div/div/div[2]")
    WebElement companyShippingConfirm;

    @FindBy(xpath = "//div/div/div[2]/div/div/div[3]")
    WebElement addressShippingConfirm;

    @FindBy(css = ".order-form__column:nth-child(2) div:nth-child(4)")
    WebElement cityStateShippingConfirm;

    @FindBy(xpath = "//label/span")
    WebElement expressDesign;

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
    WebElement dicountCode;

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

    public void returnToHomePage()
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
        Assert.assertEquals("Sum of elements isn't equal to total price", total, cards + disc + extra + ship, 0.001);
    }

    public void checkSummaryOrderReview(String quantitySelected, String sizeSelected, String planSelected, boolean extra1Selected, boolean extra2Selected, boolean extra3Selected, String shippingSelected, String discountSelected)
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

    public void checkSummaryPayment (String quantitySelected, String sizeSelected, String city, String shippingSelected, String discountSelected)
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


    public void enterCredentialsBilling(String country, String city) throws InterruptedException
    {
        firstNameBilling.sendKeys("Amelia");
        lastNameBilling.sendKeys("Pond");
        companyBilling.sendKeys("Atlass Industries");
        emailBilling.sendKeys("amelia@teamdoctor.com");
        address1Billing.sendKeys("123 street, 54");
        address2Billing.sendKeys("456 street, 5");

        if (country.compareTo("United States") == 0)
        {
            chooseCountryUSABilling();
            synchronized (wait) {
                wait.wait(10000);
            }
            cityBilling.sendKeys(city);
            cityBilling.sendKeys(Keys.ENTER);
        }
        else
        {
            chooseCountryCanadaBilling();
            synchronized (wait) {
                wait.wait(6000);
            }
            cityBilling.sendKeys(city);
            cityBilling.sendKeys(Keys.ENTER);

        }

        zipBilling.sendKeys("1234567");
        phoneBilling.sendKeys("79043222367");
    }

    public void confirmShippingAndBillingIfNoShipping(String country)
    {
        Assert.assertTrue("Wrong name", nameBillingConfirm.getText().compareTo("Amelia Pond") == 0);
        Assert.assertTrue("Wrong company", companyBillingConfirm.getText().compareTo("Atlass Industries") == 0);
        Assert.assertTrue("Wrong address", addressBillingConfirm.getText().compareTo("123 street, 54, 456 street, 5") == 0);
        if (country.compareTo("United States") == 0)
        {
            Assert.assertTrue("Wrong city or state", cityStateBillingConfirm.getText().compareTo("New York New York 1234567") == 0);
        }
        else
        {
            Assert.assertTrue("Wrong city or state", cityStateBillingConfirm.getText().compareTo("Quatsino British Columbia 1234567") == 0);
        }

    }

    public void enterCredentialShipping(String country) throws InterruptedException
    {
        firstNameShipping.sendKeys("Rory");
        lastNameShipping.sendKeys("Williams");
        companyShipping.sendKeys("Team Doctor");
        emailShipping.sendKeys("rory@teamdoctor.com");
        address1Shipping.sendKeys("456 street, 78");
        address2Shipping.sendKeys("Baker street 50");

        if (country.compareTo("United States") == 0)
        {
            chooseCountryUSAShipping();
            synchronized (wait) {
                wait.wait(5000);
            }
            cityShipping.sendKeys("Yale");
            cityShipping.sendKeys(Keys.ENTER);
        }
        else
        {
            chooseCountryCanadaShipping();
            synchronized (wait) {
                wait.wait(5000);
            }
            cityShipping.sendKeys("Ulverton");
            cityShipping.sendKeys(Keys.ENTER);
        }

        zipShipping.sendKeys("7894561");
        phoneShipping.sendKeys("79515879564");
    }

    public void confirmShippingAndBillingWithShipping(String countryBilling, String countryShipping)
    {
        Assert.assertTrue("Wrong billing name", nameBillingConfirm.getText().compareTo("Amelia Pond") == 0);
        Assert.assertTrue("Wrong billing company", companyBillingConfirm.getText().compareTo("Atlass Industries") == 0);
        Assert.assertTrue("Wrong billing address", addressBillingConfirm.getText().compareTo("123 street, 54, 456 street, 5") == 0);
        if (countryBilling.compareTo("United States") == 0)
        {
            Assert.assertTrue("Wrong billing city or state", cityStateBillingConfirm.getText().compareTo("New York New York 1234567") == 0);
        }
        else
        {
            Assert.assertTrue("Wrong billing city or state", cityStateBillingConfirm.getText().compareTo("Quatsino British Columbia 1234567") == 0);
        }

        Assert.assertTrue("Wrong shipping name", nameShippingConfirm.getText().compareTo("Rory Williams") == 0);
        Assert.assertTrue("Wrong shipping company", companyShippingConfirm.getText().compareTo("Team Doctor") == 0);
        Assert.assertTrue("Wrong shipping address", addressShippingConfirm.getText().compareTo("456 street, 78, Baker street 50") == 0);
        if (countryShipping.compareTo("United states") == 0)
        {
            Assert.assertTrue("Wrong city or state", cityStateShippingConfirm.getText().compareTo("Yale Iowa 7894561") == 0);
        }
        else
        {
            Assert.assertTrue("Wrong shipping city or state", cityStateShippingConfirm.getText().compareTo("Ulverton Quebec 7894561") == 0);
        }
    }

    public void enterCardCredential()
    {
        creditCardName.sendKeys("Amelia");
        creditCardNumber.sendKeys("4276450018854261");
        Select month = new Select (creditCardMonth);
        month.selectByVisibleText("01");
        Select year = new Select(creditCardYear);
        year.selectByVisibleText("2020");
        creditCardCVV.sendKeys("587");
        acceptCheckbox.click();
        clickConfirm();
    }

    public void chooseExtra(boolean extra1, boolean extra2, boolean extra3)
    {
        if (extra1) expressDesign.click();
        if (extra2) extraPrizes.click();
        if (extra3) variableData.click();
    }

    public void chooseShipping(String shipping)
    {
        if ((shipping.compareTo("2-day USA JSI") == 0) || (shipping.compareTo("2-day Canada JSI") == 0)) firstShippingChoise.click();
        else if ((shipping.compareTo("Overnight USA JSI") == 0) || (shipping.compareTo("Priority Canada JSI") == 0)) secondShippingChoise.click();
        else if ((shipping.compareTo("Ground Hi & AK JSI") == 0) || (shipping.compareTo("Ground 48 States JSI") == 0) || (shipping.compareTo("Ground Canada JSI") == 0)) thirdShippingChoise.click();
    }

    public void enterPromoCode(String promoCode)
    {
        if (promoCode.compareTo("none") != 0) {
            dicountCode.sendKeys(promoCode);
            applyButton.click();
        }
    }

    public void chooseCountryUSABilling()
    {
        Select select = new Select (countryBilling);
        select.selectByVisibleText("United States");
    }

    public void chooseCountryCanadaBilling()
    {
        Select select = new Select (countryBilling);
        select.selectByVisibleText("Canada");
    }

    public void chooseCountryUSAShipping()
    {
        Select select = new Select (countryBilling);
        select.selectByVisibleText("United States");
    }

    public void chooseCountryCanadaShipping()
    {
        Select select = new Select (countryBilling);
        select.selectByVisibleText("Canada");
    }

    public void clickNext()
    {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();", nextButton);
    }

    public void clickConfirm()
    {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();", confirmButton);
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

    public void checkEmail()
    {
        Assert.assertTrue("Emails aren't equal", emailDesignDetails.getText().compareTo("amelia@teamdoctor.com") == 0);
    }

    public String getOrderNumber ()
    {
        return orderNumber.getText();
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
