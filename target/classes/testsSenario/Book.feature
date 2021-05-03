Feature: book test

  Scenario: open home page
    Given launch home page
    When the button "book" entered
    Then result for "book" are show

    Scenario Outline: open book page
      Given launch book page
      When the button "title" entered
      Then result for "title" are shown
      When the phrase "test" added to title
      And  the phrase "1994" added to year
      And the button "save" entered
      Then result for "book" are show

      Examples:
      | title|
      | edit |
      | creat|
  Scenario: open book page
    Given launch book page
    When the button "delete" entered
    Then result for "book" id are disapper