package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.ProductStorePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import java.util.List;

public class US_001_SignUpStepdefinitions {
    public static ProductStorePage page = new ProductStorePage();

    @Given("As a visitor, you are navigated to the Product Store home page.")
    public void as_a_visitor_you_are_navigated_to_the_product_store_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("ProductStoreUrl"));
    }

    @Given("The destination URL is verified as {string}.")
    public void the_destination_url_is_verified_as(String ProductStoreUrl) {
        Assert.assertEquals(ConfigReader.getProperty("ProductStoreUrl"),Driver.getDriver().getCurrentUrl());
    }

    @Given("It is verified that the Sign up link in the footer section is visible.")
    public void it_is_verified_that_the_sign_up_link_in_the_footer_section_is_visible() {
        ReusableMethods.wait(3);
        Assert.assertTrue(page.signInBox.isDisplayed());
    }

    @Given("Click on the Sign up link.")
    public void click_on_the_sign_up_link() {
        page.signInBox.click();

    }

    @Given("The Username box should appear on the page that opens.")
    public void the_username_box_should_appear_on_the_page_that_opens() {
        ReusableMethods.wait(3);
        Assert.assertTrue(page.usernameBox.isDisplayed());
    }

    @Given("Password box should be displayed on the page that opens.")
    public void password_box_should_be_displayed_on_the_page_that_opens() {
        Assert.assertTrue(page.passwordBox.isDisplayed());
    }

    @Given("A username must be entered in the Username box.")
    public void a_username_must_be_entered_in_the_username_box() {
        Faker faker=new Faker();
        page.usernameBox.sendKeys(faker.name().username());

    }

    @Given("A password must be entered in the password box.")
    public void a_password_must_be_entered_in_the_password_box() {
        Faker faker=new Faker();
        page.passwordBox.sendKeys(faker.internet().password());
    }

    @Given("The Sign up button should appear")
    public void the_sign_up_button_should_appear() {
        Assert.assertTrue(page.signUpButton.isDisplayed());

    }

    @Given("The sign up button should be clicked.")
    public void the_sign_up_button_should_be_clicked() {
        page.signUpButton.click();

    }

    @Given("In the alert that opens, Sign up successful. text should be displayed.")
    public void in_the_alert_that_opens_sign_up_successful_text_should_be_displayed() {

        page.acceptSignUpAlert();
    }

    @Given("The OK button in the Alert should be clicked.")
    public void the_ok_button_in_the_alert_should_be_clicked() {
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    @Given("The Sign in link should appear and confirm successful registration.")
    public void the_sign_in_link_should_appear_and_confirm_successful_registration() {
        Assert.assertTrue(page.signInBox.isDisplayed());
    }

    @Given("Close the page.")
    public void close_the_page() {

       Driver.closeDriver();
    }

}
