Feature: OrangeHRM Login

  Scenario: Logo Presence on OrangeHRM home page
    Given I launch chrome browser
    When I open orange hrm homepage
    Then I verify that the logo presence on page
    And close browser