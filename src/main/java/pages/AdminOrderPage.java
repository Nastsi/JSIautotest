package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminOrderPage {

    private WebDriver webDriver;
    private WebDriverWait wait;

    public AdminOrderPage(WebDriver driver)
    {
        webDriver = driver;
        wait = new WebDriverWait(webDriver, 30);

        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "exampleInputEmail1")
    WebElement login;

    @FindBy(id = "exampleInputPassword1")
    WebElement password;

    @FindBy(id = "form_submit")
    WebElement loginButton;

    @FindBy(xpath = "//div[5]/p")
    WebElement quantity;

    @FindBy(xpath = "//div[6]/p")
    WebElement size;

    @FindBy(xpath = "//div[4]/p")
    WebElement plan;

    @FindBy(xpath = "//div[7]/p")
    WebElement shipping;

    @FindBy(xpath = "//div[2]/div/div/div/div/p")
    WebElement firstNameBilling;

    @FindBy(xpath = "//div[2]/div/div/div/div[2]/p")
    WebElement lastNameBilling;

    @FindBy(xpath = "//div[3]/p")
    WebElement companyBilling;

    @FindBy(xpath = "//div[2]/div/div/div/div[4]/p")
    WebElement emailBilling;

    @FindBy(xpath = "//div[2]/div[2]/p")
    WebElement addressBilling;

    @FindBy(xpath = "//div[2]/div/div/div/div[5]/p")
    WebElement countryBilling;

    @FindBy(xpath = "//div[2]/div/p")
    WebElement cityBilling;

    @FindBy(xpath = "//div[2]/div/div/div/div[6]/p")
    WebElement stateBilling;

    @FindBy(xpath = "//div[2]/div[4]/p")
    WebElement zipBilling;

    @FindBy(xpath = "//div[2]/div[5]/p")
    WebElement phoneBilling;

    @FindBy(xpath = "//div[3]/div[2]/div/div/div/div/p")
    WebElement firstNameShipping;

    @FindBy(xpath = "//div[3]/div[2]/div/div/div/div[2]/p")
    WebElement lastNameShipping;

    @FindBy(xpath = "//div[3]/div[2]/div/div/div/div[3]/p")
    WebElement companyShipping;

    @FindBy(xpath = "//div[3]/div[2]/div/div/div/div[4]/p")
    WebElement emailShipping;

    @FindBy(xpath = "//div[3]/div[2]/div/div/div/div[5]/p")
    WebElement countryShipping;

    @FindBy(xpath = "//div[3]/div[2]/div/div/div/div[6]/p")
    WebElement stateShipping;

    @FindBy(xpath = "//div[3]/div[2]/div/div/div[2]/div/p")
    WebElement cityShipping;

    @FindBy(xpath = "//div[3]/div[2]/div/div/div[2]/div[2]/p")
    WebElement addressShipping;

    @FindBy(xpath = "//div[3]/div[2]/div/div/div[2]/div[3]/p")
    WebElement address2Shipping;

    @FindBy(xpath = "//div[3]/div[2]/div/div/div[2]/div[4]/p")
    WebElement zipShipping;

    @FindBy(xpath = "//div[3]/div[2]/div/div/div[2]/div[5]/p")
    WebElement phoneShipping;

    @FindBy(xpath = "//div[2]/div/div/div/p")
    WebElement priceOfCards;

    @FindBy(xpath = "//div[2]/div/div/div[2]/p")
    WebElement priceOfDiscount;

    @FindBy(xpath = "//div[2]/div/div/div[3]/p")
    WebElement priceOfTax;

    @FindBy(xpath = "//div[2]/div/div/div[4]/p")
    WebElement priceofShipping;

    @FindBy(xpath = "//div[2]/div/div/div[5]/p")
    WebElement priceOfExtra;

    @FindBy(xpath = "//div[2]/div/div/div[6]/p")
    WebElement totalPrice;

    @FindBy(xpath = "//div[4]/div[2]/div/div/p")
    WebElement payment;

    @FindBy(xpath = "//div[2]/div/a")
    WebElement billToButton;

    @FindBy(xpath = "//div[3]/div/a")
    WebElement shipToButton;

    @FindBy(xpath = "//div[5]/div/a")
    WebElement amountButton;

    @FindBy(xpath = "//div[4]/div/a")
    WebElement paymentInfoButton;

    @FindBy(xpath = "//div[4]/div[2]/div/div[4]/p")
    WebElement paymentStatus;

    public void checkOrder(String number, String quantityOrder, String sizeOrder, String planOrder, String shippingOrder, String country, String city, String state, boolean expressDesign, boolean extraPrizes, boolean variableData, String discount) throws  InterruptedException
    {
        login.sendKeys("admin@admin.com");
        password.sendKeys("jsi");
        synchronized (wait) {
            wait.wait(500);
        }
        loginButton.click();

        webDriver.get("http://95.213.252.23:3000/admin/orders/" + number.substring(1) + "/edit");

        Assert.assertTrue("Quantity does not match", quantity.getText().compareTo(quantityOrder) == 0);
        if (sizeOrder.compareTo("2x4") == 0) Assert.assertTrue("Size does not match", size.getText().compareTo("2”x4” Standard Size") == 0);
        else if (sizeOrder.compareTo("4x4") == 0) Assert.assertTrue("Size does not match", size.getText().compareTo("4”x4” Square Size") == 0);
        else if (sizeOrder.compareTo("4x6") == 0) Assert.assertTrue("Size does not match", size.getText().compareTo("4”x6” Postcard Size") == 0);
        Assert.assertTrue("Plan does not match", plan.getText().compareTo(planOrder) == 0);
        Assert.assertTrue("Shipping method does not match", shipping.getText().compareTo(shippingOrder) == 0);
        synchronized (wait) {
            wait.wait(500);
        }
        billToButton.click();
        synchronized (wait) {
            wait.wait(500);
        }
        Assert.assertTrue("First name does not match", firstNameBilling.getText().compareTo("Amelia") == 0);
        Assert.assertTrue("Last name does not match", lastNameBilling.getText().compareTo("Pond") == 0);
        Assert.assertTrue("Company does not match", companyBilling.getText().compareTo("Atlass Industries") == 0);
        Assert.assertTrue("Email does not match", emailBilling.getText().compareTo("amelia@teamdoctor.com") == 0);
        Assert.assertTrue("Address does not match", addressBilling.getText().compareTo("123 street, 54") == 0);
        Assert.assertTrue("Country does not match", countryBilling.getText().compareTo(country) == 0);
        Assert.assertTrue("City does not match", cityBilling.getText().compareTo(city) == 0);
        Assert.assertTrue("State does not match", stateBilling.getText().compareTo(state) == 0);
        Assert.assertTrue("Zip does not match", zipBilling.getText().compareTo("1234567") == 0);
        Assert.assertTrue("Phone does not match", phoneBilling.getText().compareTo("79043222367") == 0);
        if (city.compareTo("Quatsino") == 0) Assert.assertTrue("City or state or zip does not match", stateBilling.getText().compareTo("British Columbia") == 0);
        else if (city.compareTo("Palmer") == 0) Assert.assertTrue("City or state or zip does not match", stateBilling.getText().compareTo("Alaska") == 0);
        else if (city.compareTo("New York") == 0) Assert.assertTrue("City or state or zip does not match", stateBilling.getText().compareTo("New York") == 0);
        synchronized (wait) {
            wait.wait(500);
        }
        amountButton.click();
        synchronized (wait) {
            wait.wait(500);
        }
        checkCardPrice(quantityOrder, sizeOrder, planOrder);
        double disc = checkDiscountAndTax(discount, city);
        checkExtra(expressDesign, extraPrizes, variableData);
        checkShipping(quantityOrder, sizeOrder, shippingOrder);
        String substring;
        float cards;
        if (priceOfCards.getText().length() > 7)
        {
            substring = priceOfCards.getText().substring(1, 2) + priceOfCards.getText().substring(3);
            cards = Float.parseFloat(substring);
        }
        else
        {
            cards = Float.parseFloat(priceOfCards.getText().substring(1));
        }
        float extra = Float.parseFloat(priceOfExtra.getText().substring(1));
        float tax = Float.parseFloat(priceOfTax.getText().substring(1));
        float shipping = Float.parseFloat(priceofShipping.getText().substring(1));
        double expected = cards - disc + tax + shipping + extra;
        double total;
        if (totalPrice.getText().length() > 7)
        {
            substring = totalPrice.getText().substring(1, 2) + totalPrice.getText().substring(3);
            total = Double.parseDouble(substring);
        }
        else
        {
            total = Double.parseDouble(totalPrice.getText().substring(1));
        }
        Assert.assertEquals("Total price is wrong", expected, total, 0.001);
        synchronized (wait) {
            wait.wait(500);
        }
        paymentInfoButton.click();
        synchronized (wait) {
            wait.wait(500);
        }
        double pay = Double.parseDouble(payment.getText());
        Assert.assertEquals("Payment in Payment info and Total in Amount does not match", total, pay, 0.001);
        Assert.assertTrue("Payment status is wrong", paymentStatus.getText().compareTo("Successful.") == 0);
    }

    public void checkOrderShipping(String country, String city, String state) throws InterruptedException
    {
        synchronized (wait) {
            wait.wait(500);
        }
        shipToButton.click();
        Assert.assertTrue("First name does not match", firstNameShipping.getText().compareTo("Rory") == 0);
        Assert.assertTrue("Last name does not match", lastNameShipping.getText().compareTo("Williams") == 0);
        Assert.assertTrue("Company does not match", companyShipping.getText().compareTo("Team Doctor") == 0);
        Assert.assertTrue("Email does not match", emailShipping.getText().compareTo("rory@teamdoctor.com") == 0);
        Assert.assertTrue("Address does not match", addressShipping.getText().compareTo("456 street, 78") == 0);
        Assert.assertTrue("Address does not match", address2Shipping.getText().compareTo("Baker street 50") == 0);
        Assert.assertTrue("Country does not match", countryShipping.getText().compareTo(country) == 0);
        Assert.assertTrue("City does not match", cityShipping.getText().compareTo(city) == 0);
        Assert.assertTrue("State does not match", stateShipping.getText().compareTo(state) == 0);
        Assert.assertTrue("Zip does not match", zipShipping.getText().compareTo("7894561") == 0);
        Assert.assertTrue("Phone does not match", phoneShipping.getText().compareTo("79515879564") == 0);
    }

    public void checkCardPrice(String quantitySelected, String sizeSelected, String planSelected)
    {
        if (quantitySelected == "500" && sizeSelected == "2x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$395.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "2x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$495.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "2x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$595.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "2x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$795.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "2x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1,195.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "2x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$598.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "2x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$698.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "2x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$798.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "2x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1,098.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "2x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1,698.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "2x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$689.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "2x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$769.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "2x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$879.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "2x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1,199.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "2x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1,869.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$595.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$695.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$795.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1,095.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x4" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1,595.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$798.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$898.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$998.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1,398.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x4" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1,998.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$879.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$989.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1,099.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1,499.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x4" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$2,199.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x6" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$795.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x6" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$895.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x6" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$995.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x6" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1,395.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x6" && planSelected == "Early Bird") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1,895.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x6" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$898.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x6" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$998.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x6" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1,098.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x6" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1,698.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x6" && planSelected == "Standard") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$2,398.00") == 0);
        else if (quantitySelected == "500" && sizeSelected == "4x6" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$989.00") == 0);
        else if (quantitySelected == "1000" && sizeSelected == "4x6" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1,099.00") == 0);
        else if (quantitySelected == "2500" && sizeSelected == "4x6" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1,199.00") == 0);
        else if (quantitySelected == "5000" && sizeSelected == "4x6" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$1,869.00") == 0);
        else if (quantitySelected == "10000" && sizeSelected == "4x6" && planSelected == "Quick-turn") Assert.assertTrue("Price of cards is wrong", priceOfCards.getText().compareTo("$2,599.00") == 0);
    }

    public void calculatingTax(String city, float cards, double disc, float extra, float tax)
    {
        if (city.compareTo("Quatsino") == 0) {
            double expected = (cards - disc + extra) * 0.0326;
            double round = Math.round(expected * 100.0) / 100.0;
            Assert.assertEquals("Tax is wrong", round, tax, 0.001);
        }
        else if (city.compareTo("Niagara Falls") == 0)
        {
            double expected = (cards - disc + extra) * 0.0779;
            double round = Math.round(expected * 100.0) / 100.0;
            Assert.assertEquals("Tax is wrong", round, tax, 0.001);
        }
        else if (city.compareTo("Palmer") == 0)
        {
            double expected = (cards - disc + extra) * 0.0861;
            double round = Math.round(expected * 100.0) / 100.0;
            Assert.assertEquals("Tax is wrong", round, tax, 0.001);
        }
    }

    public double checkDiscountAndTax(String discount, String city)
    {
        String substring = " ";
        float cards;
        if (priceOfCards.getText().length() > 7)
        {
            substring = priceOfCards.getText().substring(1, 2) + priceOfCards.getText().substring(3);
            cards = Float.parseFloat(substring);
        }
        else
        {
            cards = Float.parseFloat(priceOfCards.getText().substring(1));
            substring = priceOfCards.getText().substring(1);
        }
        double disc;
        float extra = Float.parseFloat(priceOfExtra.getText().substring(1));
        float tax = Float.parseFloat(priceOfTax.getText().substring(1));
        if (discount.compareTo("test") == 0)
        {
            Assert.assertTrue("Price of discount is wrong",priceOfDiscount.getText().compareTo("$10") == 0);
            disc = Float.parseFloat(priceOfDiscount.getText().substring(1));
            calculatingTax(city, cards, disc, extra, tax);
            return disc;
        }
        else if (discount.compareTo("labore") == 0)
        {
            if (cards > 936) Assert.assertTrue("Price of discount is wrong",priceOfDiscount.getText().compareTo("$936") == 0);
            else Assert.assertTrue("Price of discount is wrong",priceOfDiscount.getText().compareTo(priceOfCards.getText()) == 0);
            disc = Float.parseFloat(priceOfDiscount.getText().substring(1));
            calculatingTax(city, cards, disc, extra, tax);
            return disc;
        }
        else if (discount.compareTo("facilis") == 0)
        {
            if (cards > 241) Assert.assertTrue("Price of discount is wrong",priceOfDiscount.getText().compareTo("$241") == 0);
            else Assert.assertTrue("Price of discount is wrong",priceOfDiscount.getText().compareTo(priceOfCards.getText()) == 0);
            disc = Float.parseFloat(priceOfDiscount.getText().substring(1));
            calculatingTax(city, cards, disc, extra, tax);
            return disc;
        }
        else if (discount.compareTo("test2") == 0)
        {
            Assert.assertTrue("Price of discount is wrong", priceOfDiscount.getText().compareTo("100%") == 0);
            disc = cards;
            calculatingTax(city, cards, disc, extra, tax);
            return disc;
        }
        else if (discount.compareTo("illum") == 0)
        {
            Assert.assertTrue("Price of discount is wrong", priceOfDiscount.getText().compareTo("50%") == 0);
            disc = cards;
            double discTrue = disc * 0.5;
            calculatingTax(city, cards, discTrue, extra, tax);
            return discTrue;
        }
        else if (discount.compareTo("cupiditate") == 0)
        {
            Assert.assertTrue("Price of discount is wrong",priceOfDiscount.getText().compareTo("48%") == 0);
            disc = cards;
            double discTrue = disc * 0.48;
            calculatingTax(city, cards, discTrue, extra, tax);
            return discTrue;
        }
        else if (discount.compareTo("rerum") == 0)
        {
            Assert.assertTrue("Price of discount is wrong",priceOfDiscount.getText().compareTo("19%") == 0);
            disc = cards;
            double discTrue = disc * 0.19;
            calculatingTax(city, cards, discTrue, extra, tax);
            return discTrue;
        }
        else if (discount.compareTo("none") == 0)
        {
            Assert.assertTrue("Price of discount is wrong",priceOfDiscount.getText().compareTo("$0.00") == 0);
            if (city.compareTo("Quatsino") == 0) {
                double expected = (cards + extra) * 0.0326;
                double round = Math.round(expected * 100.0) / 100.0;
                Assert.assertEquals("Tax is wrong", round, tax, 0.001);
            }
            else if (city.compareTo("Niagara Falls") == 0)
            {
                double expected = (cards + extra) * 0.0779;
                double round = Math.round(expected * 100.0) / 100.0;
                Assert.assertEquals("Tax is wrong", round, tax, 0.001);
            }
            else if (city.compareTo("Palmer") == 0)
            {
                double expected = (cards + extra) * 0.0861;
                double round = Math.round(expected * 100.0) / 100.0;
                Assert.assertEquals("Tax is wrong", round, tax, 0.001);
            }
        }
        return 0;
    }

    public void checkExtra(boolean extra1, boolean extra2, boolean extra3)
    {
        if (extra1 == false && extra2 == false && extra3 == false) Assert.assertTrue("Price of extra is wrong",priceOfExtra.getText().compareTo("$0.00") == 0);
        else if (extra1 == true && extra2 == false && extra3 == false) Assert.assertTrue("Price of extra is wrong",priceOfExtra.getText().compareTo("$29.00") == 0);
        else if (extra1 == false && extra2 == true && extra3 == false) Assert.assertTrue("Price of extra is wrong",priceOfExtra.getText().compareTo("$50.00") == 0);
        else if (extra1 == false && extra2 == false && extra3 == true) Assert.assertTrue("Price of extra is wrong",priceOfExtra.getText().compareTo("$75.00") == 0);
        else if (extra1 == true && extra2 == true && extra3 == false) Assert.assertTrue("Price of extra is wrong",priceOfExtra.getText().compareTo("$79.00") == 0);
        else if (extra1 == true && extra2 == false && extra3 == true) Assert.assertTrue("Price of extra is wrong",priceOfExtra.getText().compareTo("$104.00") == 0);
        else if (extra1 == false && extra2 == true && extra3 == true) Assert.assertTrue("Price of extra is wrong",priceOfExtra.getText().compareTo("$125.00") == 0);
        else if (extra1 == true && extra2 == true && extra3 == true) Assert.assertTrue("Price of extra is wrong",priceOfExtra.getText().compareTo("$154.00") == 0);
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
}
