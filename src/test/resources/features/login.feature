# language: en

@fullTest
Feature: Login

  Background:
    Given I am on the Saucedemo login page

  @login
  Scenario: User logs in
    When I enter username "standard_user" and password "secret_sauce"
    And I click the Login button
    Then I should be redirected to the homepage

  @add-product
  Scenario: User adds a product to the cart
    Given I am logged in with username "standard_user" and password "secret_sauce"
    When I am on the home page
    And I click on any product on the homepage
    And I click the add to cart button
    Then the product should be added to the cart with a count of 1
#
#  @remove-product
#  Scenario: User removes a product from the cart
#    Given I am on the home page
#    When I click the cart icon
#    And I click the "REMOVE" button next to the product in the cart
#    Then the product should be removed from the cart
#
#  @sort-product
#  Scenario Template: User sorts products by: <name>
#    Given I am logged in to the website
#    When I click the "FILTER" dropdown
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
#    And I click the "CHECKOUT" button
#    And I enter the required shipping information
#    And I click the "CONTINUE" button
#    And I enter the payment information
#    And I click the "FINISH" button
#    Then the order should be successfully placed