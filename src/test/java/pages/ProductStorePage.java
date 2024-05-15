package pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class ProductStorePage {

    public ProductStorePage(){
        PageFactory.initElements(Driver.getDriver(),this);}



    @FindBy(id = "signin2")
    public WebElement signInBox;

    @FindBy(id = "login2")
    public WebElement logInBox;

    @FindBy(id = "loginusername")
    public WebElement logInUsername;

    @FindBy(id = "loginpassword")
    public WebElement logInPassword;

    @FindBy(xpath = "//*[@onclick=\"logIn()\"]")
    public WebElement logInButton;

    @FindBy(id = "logout2")
    public WebElement logOutBox;


    @FindBy(xpath = "//*[@id=\"sign-username\"]")
    public WebElement usernameBox;

    @FindBy(id = "sign-password")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@onclick=\"register()\"]")
    public WebElement signUpButton;

    public String expectedSignUpAlertText="Sign up successful.";

    public void acceptSignUpAlert(){
        ReusableMethods.wait(3);
        Alert alert = Driver.getDriver().switchTo().alert();
        String actualAlert= alert.getText();
        Assert.assertEquals(ConfigReader.getProperty("AlertSignUpText"),actualAlert);
    }

    public void loginToWebsite() {
        Driver.getDriver().get(ConfigReader.getProperty("ProductStoreUrl"));
        logInBox.click();
        ReusableMethods.wait(1);
        logInUsername.sendKeys(ConfigReader.getProperty("ProductStoreUsername"));
        logInPassword.sendKeys(ConfigReader.getProperty("ProductStorePassword"));
        logInButton.click();
        ReusableMethods.wait(4);

    }

    @FindBy(xpath = "//*[text()='Phones']")
    public WebElement phonesMenu;

    @FindBy(xpath = "//*[text()='Laptops']")
    public WebElement laptopsMenu;

    @FindBy(xpath = "//*[text()='Monitors']")
    public WebElement monitorsMenu;

    @FindBy(xpath = "//*[text()='Apple monitor 24']")
    public WebElement appleMonitor;

    @FindBy(xpath = "//*[@class=\"name\"]")
    public WebElement productNameInTheCart;

    @FindBy(xpath = "//*[@class=\"price-container\"]")
    public WebElement productPriceInTheCart;

    @FindBy(xpath = "//*[text()='Add to cart']")
    public WebElement addToCartButton;

    public void verifyAddToCartAlert(){
        ReusableMethods.wait(3);
        Alert alert = Driver.getDriver().switchTo().alert();
        String actualAlert= alert.getText();
        Assert.assertEquals(ConfigReader.getProperty("AlertAddToCartText"),actualAlert);
    }

    public void acceptAddToCartAlert(){
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    @FindBy(xpath = "//*[text()='Cart']")
    public WebElement cartMenu;

    @FindBy(xpath = "(//table//tr[1]/td[2])[1]")
    public WebElement productNameInCart;

    @FindBy(xpath = "//table//tr[1]/td[3]")
    public WebElement productPriceInCart;

    @FindBy(id = "totalp")
    public WebElement productTotalPriceInCart;

    @FindBy(xpath = "//*[@class=\"btn btn-success\"]")
    public WebElement placeOrderButton;

    @FindBy(id = "name")
    public WebElement nameTextBox;

    @FindBy(id = "country")
    public WebElement countryTextBox;

    @FindBy(id = "city")
    public WebElement cityTextBox;

    @FindBy(id = "card")
    public WebElement cardTextBox;

    @FindBy(id = "month")
    public WebElement monthTextBox;

    @FindBy(id = "year")
    public WebElement yearTextBox;

    @FindBy(xpath = "//*[@onclick=\"purchaseOrder()\"]")
    public WebElement purchaseButton;

    @FindBy(xpath = "//*[text()='Thank you for your purchase!']")
    public WebElement thankYouPurchaseText;

    @FindBy(xpath = "//*[@tabindex=\"1\"]")
    public WebElement okPurchase;

    @FindBy(xpath = "//*[text()='Contact']")
    public  WebElement contactMenu;

    @FindBy(id = "exampleModalLabel")
    public WebElement contactNewMessageText;

    @FindBy(xpath = "(//*[@class=\"form-control-label\"])[1]")
    public WebElement contactEmailText;

    @FindBy(xpath = "(//*[@class=\"form-control-label\"])[2]")
    public WebElement contactNameText;

    @FindBy(xpath = "(//*[@class=\"form-control-label\"])[3]")
    public WebElement contactMessageText;

    @FindBy(xpath = "//*[@onclick=\"send()\"]")
    public WebElement contactSendMessage;

    @FindBy(xpath = "(//*[@class=\"form-control\"])[1]")
    public WebElement contactEmailTextBox;

    @FindBy(xpath = "(//*[@class=\"form-control\"])[2]")
    public WebElement contactNameTextBox;

    @FindBy(xpath = "(//*[@class=\"form-control\"])[3]")
    public WebElement contactMessageTextBox;

    public void contactAlert(){
        ReusableMethods.wait(3);
        Alert alert = Driver.getDriver().switchTo().alert();
        String actualAlert= alert.getText();
        Assert.assertEquals(ConfigReader.getProperty("ContactThanksText"),actualAlert);
    }

    public void contactAlertAccept(){
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }














}
