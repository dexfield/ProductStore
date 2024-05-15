Feature: US_003 Test sending a message via the Contact page.

  Background: Login Access
    * The user logs in to the site.

  Scenario: Send a message to a registered user using the Contact menu.

    * It should be verified that the Contact link on the footer is visible and clicked.
    * It should be verified that the New message title is visible on the page that opens.
    * Contact Email and textbox should be visible.
    * "random mail" must be entered in the textbox.
    * Contact Name and textbox must be visible.
    * Enter "random name" in the name textbox.
    * Message and textbox must be visible.
    * Enter "random message" in the message textbox.
    * Send message button should be visible and clicked.
    * It should be verified that Thanks for the message!! is displayed on the screen that opens.
    * Click OK button on the screen that opens.
    * Close the page.