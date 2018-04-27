Feature: My First cucumber test
  @wip
  Scenario: Google search, using selenium
    Given I have navigated to google
    When I search for "selenium"
    Then the page title should be selenium - Google Search