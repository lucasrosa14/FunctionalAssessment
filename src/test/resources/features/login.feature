# language: en

@fullTest
Feature: Login

  @login
  Scenario Outline: User logs in
    Given I am on the Saucedemo login page
    When I enter username "<email>" and password "<pass>"
    And I click the Login button
    Then I should be redirected to the homepage

    Examples:
      | email         | pass         |
      | standard_user | secret_sauce |


#
#  @remove-product
#  Scenario: User removes a product from the cart
#    Given I am on the home page
#    When I click the cart icon
#    And I click the remove button next to the product in the cart
#    Then the product should be removed from the cart
#
#  @sort-product
#  Scenario Outline: User sorts products by: <name>
#    Given I am logged in to the website
#    When I click the filter dropdown
#    And I select "<ordination>"
#    Then the products should be sorted by <order>
#
#    Examples:
#      | ordination          | order                              | name                |
#      | Price (low to high) | price from low to high             | Price (low to high) |
#      | Price (high to low) | price from high to low             | Price (high to low) |
#      | Name (A to Z)       | name in alphabetical order         | Name (A to Z)       |
#      | Name (Z to A)       | name in reverse alphabetical order | Name (Z to A)       |
#
#  @checkout
#  Scenario: User checks out and places an order
#    Given I am logged in to the website
#    When I add a product to the cart
#    And I click the cart icon
#    And I click the checkout button
#    And I enter the required shipping information
#    And I click the continue button
#    And I enter the payment information
#    And I click the finish button
#    Then the order should be successfully placed