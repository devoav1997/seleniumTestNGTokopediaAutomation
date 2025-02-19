Feature: Tokopedia Search and Add to Cart

  Scenario: Search and add a product to the cart
    Given User is on Tokopedia homepage
    When User enters "iPhone" in search box
    And User presses Enter
    And User clicks on the first product
    And User adds the product to cart
    Then Product should be added to cart successfully
