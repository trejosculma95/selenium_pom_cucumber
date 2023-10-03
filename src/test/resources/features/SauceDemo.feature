@BuyTest
Feature: Test different actions on the shopping page.

  Scenario: As a user I want to add some items to the cart
    Given I navigate to the sauce demo initial page
    When I login into the webpage with regular credentials
    And I add some items to the cart
    Then I should see the added items on the cart