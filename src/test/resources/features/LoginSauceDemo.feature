@Login
Feature: Test different Logins into the shopping page.

  Scenario Outline: As a user I want to verify different user level of login.
    Given I am in the initial page
    When I want to log in the webpage with <username> and <password>
    Then I should join the Sauce Demo page

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | usernormal              | 123          |