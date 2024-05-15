package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.ProductStorePage;
import utilities.ReusableMethods;

public class US_003_ContactStepDefinitions {

    ProductStorePage page=new ProductStorePage();

    @Given("It should be verified that the Contact link on the footer is visible and clicked.")
    public void it_should_be_verified_that_the_contact_link_on_the_footer_is_visible_and_clicked() {
        Assert.assertTrue(page.contactMenu.isDisplayed());
        page.contactMenu.click();
        ReusableMethods.wait(2);
    }


    @Given("It should be verified that the New message title is visible on the page that opens.")
    public void it_should_be_verified_that_the_new_message_title_is_visible_on_the_page_that_opens() {

        Assert.assertTrue(page.contactNewMessageText.isDisplayed());
    }


    @Given("Contact Email and textbox should be visible.")
    public void contact_email_and_textbox_should_be_visible() {

        Assert.assertTrue(page.contactEmailText.isDisplayed());
        Assert.assertTrue(page.contactEmailTextBox.isDisplayed());
    }


    @Given("{string} must be entered in the textbox.")
    public void must_be_entered_in_the_textbox(String mail) {
        page.contactEmailTextBox.sendKeys(mail);

    }


    @Given("Contact Name and textbox must be visible.")
    public void contact_name_and_textbox_must_be_visible() {
        Assert.assertTrue(page.contactNameText.isDisplayed());
        Assert.assertTrue(page.contactNameTextBox.isDisplayed());

    }


    @Given("Enter {string} in the name textbox.")
    public void enter_in_the_name_textbox(String name) {
        page.contactNameTextBox.sendKeys(name);

    }


    @Given("Message and textbox must be visible.")
    public void message_and_textbox_must_be_visible() {
        Assert.assertTrue(page.contactMessageText.isDisplayed());
        Assert.assertTrue(page.contactMessageTextBox.isDisplayed());

    }

    @Given("Enter {string} in the message textbox.")
    public void enter_in_the_name_message_textbox(String message) {
        page.contactMessageTextBox.sendKeys(message);

    }


    @Given("Send message button should be visible and clicked.")
    public void send_message_button_should_be_visible_and_clicked() {
        Assert.assertTrue(page.contactSendMessage.isDisplayed());
        page.contactSendMessage.click();

    }


    @Given("It should be verified that Thanks for the message!! is displayed on the screen that opens.")
    public void it_should_be_verified_that_thanks_for_the_message_is_displayed_on_the_screen_that_opens() {
        page.contactAlert();

    }


    @Given("Click OK button on the screen that opens.")
    public void click_ok_button_on_the_screen_that_opens() {
            page.contactAlertAccept();

    }
}
