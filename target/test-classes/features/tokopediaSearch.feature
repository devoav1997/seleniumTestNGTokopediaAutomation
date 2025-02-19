Feature: Tokopedia Search Feature
  Scenario: Search for a product
    Given User is on Tokopedia homepage
    When User enters "iPhone" in search box
    And User presses Enter
    Then Search results for "iPhone" are displayed
