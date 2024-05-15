package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.ProductStorePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_002_LogInStepDefinitions {

    public static ProductStorePage page = new ProductStorePage();

    @Given("It is verified that the Log in link in the footer is visible.")
    public void it_is_verified_that_the_log_in_link_in_the_footer_is_visible() {
        Assert.assertTrue(page.logInBox.isDisplayed());

    }

    @Given("Click on the Log in link.")
    public void click_on_the_log_in_link() {
        page.logInBox.click();

    }

    @Given("Username textbox should be displayed on the page that opens.")
    public void username_textbox_should_be_displayed_on_the_page_that_opens() {
        ReusableMethods.wait(1);
        Assert.assertTrue(page.logInUsername.isDisplayed());

    }

    @Given("Password textbox should be displayed on the page that opens.")
    public void password_textbox_should_be_displayed_on_the_page_that_opens() {
        Assert.assertTrue(page.logInPassword.isDisplayed());

    }

    @Given("Enter user name in Username box.")
    public void enter_user_name_in_username_box() {
        page.logInUsername.sendKeys(ConfigReader.getProperty("ProductStoreUsername"));

    }

    @Given("Enter password in Password box.")
    public void enter_password_in_password_box() {
            page.logInPassword.sendKeys(ConfigReader.getProperty("ProductStorePassword"));

    }

    @Given("Log in button should be displayed")
    public void log_in_button_should_be_displayed() {
        Assert.assertTrue(page.logInButton.isDisplayed());

    }

    @Given("Log in button should be clicked.")
    public void log_in_button_should_be_clicked() {
        page.logInButton.click();

    }

    @Given("The Log out link in the footer section should be displayed and successful login should be verified.")
    public void the_log_out_link_in_the_footer_section_should_be_displayed_and_successful_login_should_be_verified() {
        ReusableMethods.wait(2);
        Assert.assertTrue(page.logOutBox.isDisplayed());
    }
}
