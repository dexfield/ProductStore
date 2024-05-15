package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ProductStorePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;

public class Us_004_PurchasingProduct {
    ProductStorePage page=new ProductStorePage();

    @Given("The user logs in to the site.")
    public void the_user_logs_in_to_the_site() {

        page.loginToWebsite();
    }

    @Given("Click on the Monitors link from the Categories menu on the home page.")
    public void click_on_the_monitors_link_from_the_categories_menu_on_the_home_page() {
        page.monitorsMenu.click();

    }

    @Given("Save the name and price of the Apple brand product on the page that opens.")
    public void save_the_name_and_price_of_the_apple_brand_product_on_the_page_that_opens() {
        page.appleMonitor.click();

    }

    @Given("On the page that opens, verify that the product name is Apple monitor 24.")
    public void on_the_page_that_opens_verify_that_the_product_name_is_apple_monitor_24() {
        Assert.assertEquals(ConfigReader.getProperty("appleMonitor"),page.productNameInTheCart.getText());
        ReusableMethods.wait(1);
    }

    @Given("On the page that opens, verify that the product price is $400.")
    public void on_the_page_that_opens_verify_that_the_product_price_is_$400() {
        String x=page.productPriceInTheCart.getText();
        String actualProductPrice=x.replaceAll("\\D","");
        Assert.assertEquals(ConfigReader.getProperty("appleMonitorPrice"),actualProductPrice);

    }

    @Given("It is verified that the Add to cart button is displayed.")
    public void it_is_verified_that_the_add_to_cart_button_is_displayed() {
        Assert.assertTrue(page.addToCartButton.isDisplayed());

    }

    @Given("Click on the Add to cart button.")
    public void click_on_the_add_to_cart_button() {
        page.addToCartButton.click();

    }

    @Given("Product added is displayed and it is confirmed that the product is added to the cart.")
    public void product_added_is_displayed_and_it_is_confirmed_that_the_product_is_added_to_the_cart() {
        page.verifyAddToCartAlert();

    }

    @Given("Click OK button on the alert screen that appears.")
    public void click_ok_button_on_the_alert_screen_that_appears() {
        page.acceptAddToCartAlert();

    }

    @Given("Click on the Cart text in the footer section.")
    public void click_on_the_cart_text_in_the_footer_section() {

        page.cartMenu.click();
    }
    @Given("Verify that the URL of the page opened is Product Store - Cart.")
    public void verify_that_the_url_of_the_page_opened_is_product_store_cart() {

    }
    @Given("Verify that the product name is Apple monitor 24.")
    public void verify_that_the_product_name_is_apple_monitor_24() {
        Assert.assertEquals(ConfigReader.getProperty("appleMonitor"),page.productNameInCart.getText());

    }


    @Given("It is confirmed that the price of the product named Apple monitor 24 on the main page is 400$.")
    public void it_is_confirmed_that_the_price_of_the_product_named_apple_monitor_24_on_the_main_page_is_400$() {
        Assert.assertEquals(ConfigReader.getProperty("appleMonitorPrice"),page.productPriceInCart.getText());

    }

    @Given("It is verified that the total basket amount is 400$.")
    public void it_is_verified_that_the_total_basket_amount_is_$() {
        Assert.assertEquals(ConfigReader.getProperty("appleMonitorPrice"),page.productTotalPriceInCart.getText());

    }

    @Given("The Place Order button is verified and clicked.")
    public void the_place_order_button_is_verified_and_clicked() {
        Assert.assertTrue(page.placeOrderButton.isDisplayed());
        page.placeOrderButton.click();
    }

    @Given("On the page that opens, type the name in the {string} text box.")
    public void on_the_page_that_opens_type_the_name_in_the_text_box(String name) {
        page.nameTextBox.sendKeys(name);

    }

    @Given("On the page that opens, enter the country in the {string} text box.")
    public void on_the_page_that_opens_enter_the_country_in_the_text_box(String country) {
            page.countryTextBox.sendKeys(country);
    }

    @Given("On the page that opens, enter the city in the {string} text box.")
    public void on_the_page_that_opens_enter_the_city_in_the_text_box(String city) {

        page.cityTextBox.sendKeys(city);
    }

    @Given("On the page that opens, enter a 16 digit credit card number in the {string} text box.")
    public void on_the_page_that_opens_enter_a_digit_credit_card_number_in_the_text_box(String number) {

        page.cardTextBox.sendKeys(number);

    }

    @Given("On the opened page, enter a 2 digit month in the {string} text box.")
    public void on_the_opened_page_enter_a_digit_month_in_the_text_box(String month) {

        page.monthTextBox.sendKeys(month);

    }


    @Given("On the page that opens, enter a 2 digit year in the {string} text box.")
    public void on_the_page_that_opens_enter_a_digit_year_in_the_text_box(String year) {

        page.yearTextBox.sendKeys(year);

    }

    @Given("Click on the Purchase button.")
    public void click_on_the_purchase_button() {
        ReusableMethods.wait(3);
        page.purchaseButton.click();

    }



    @Given("Thank you for your purchase! is displayed.")
    public void thank_you_for_your_purchase_is_displayed() {

        Assert.assertTrue(page.thankYouPurchaseText.isDisplayed());

    }
    @Given("Click on the OK button and confirm that the order has been placed successfully.")
    public void click_on_the_ok_button_and_confirm_that_the_order_has_been_placed_successfully() {
            ReusableMethods.wait(2);
        page.okPurchase.click();

    }
}
