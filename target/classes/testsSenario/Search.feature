Feature: search test

  Scenario: open search page
    Given lunch home page
    When the phrase "test" added
    And the button "search" entered
    Then result for "search" are show

