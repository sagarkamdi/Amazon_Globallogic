#Author: Sagar Kamdi
Feature: To Verify Amazon LogIn

  Scenario: Amazon LogIn
    Given Open the browser
    When Enter valid username "username" and Password "password"
    Then LogIn successful

  Scenario: Amazon Search/Add2cart
    Given Open the browser
    When Enter valid productName "pName" for search and add2cart
    Then Add2cart successful

  Scenario: Amazon Checkout
    Given Open the browser
    When Enter valid details for checkout and card "CardNo"
    Then Checkout successful
