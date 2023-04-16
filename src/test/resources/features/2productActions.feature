# language: en

@fullTest
Feature: Add/Remove Product to/from Cart


  @add-product
  Scenario Outline: User adds a product to the cart
    Given I am logged in with username "<email>" and password "<pass>"
    When I am on the home page
    And I click on any product on the homepage
    And I click the add to cart button
    Then the product should be added to the cart with a count of 1

    Examples:
      | email         | pass         |
      | standard_user | secret_sauce |

  @remove-product
  Scenario Outline: User removes a product from the cart
    Given I am logged in with username "<email>" and password "<pass>"
    And I am on the home page
    And I click on any product on the homepage
    And I click the add to cart button
    When I click the cart icon
    And I click the remove button next to the product in the cart
    Then the product should be removed from the cart

    Examples:
      | email         | pass         |
      | standard_user | secret_sauce |