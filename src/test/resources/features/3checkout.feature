# language: en

@fullTest
Feature: Checkout

  @checkout
  Scenario Outline: User checks out and places an order
    Given I am logged in to the website with "<user>" and "<pass>"
    When I add a product to the cart and click the cart button
    And I click the checkout button
    And I enter the required shipping information
    And I click the continue button
    And I see the payment information
    And I click the finish button
    Then the order should be successfully placed

    Examples:
      | user          | pass         |
      | standard_user | secret_sauce |