Feature: Login Functionality

  Scenario: Valid login
    Given I open Chrome browser
    When I open login page
    And I enter username and password
    Then I should see the homepage
