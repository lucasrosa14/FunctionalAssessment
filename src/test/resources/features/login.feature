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
