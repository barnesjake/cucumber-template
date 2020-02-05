Feature: My First cucumber test

  Scenario: Google search, using selenium
    Given I have navigated to google
    When I search for 'scala'
    Then the page title should be scala - Google Search