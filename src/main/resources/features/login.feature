Feature: Login page scenarios

  Scenario: Verify Homeworks and Meetings links navigation buttons
    Given I navigate to LoginPage
    When I input "username" as "adrio@hotmail.com"
    And I input "password" as "12345"
    And I click Login button
    Then Title of the page should be Home Page