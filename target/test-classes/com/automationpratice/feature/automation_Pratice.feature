Feature: Order Dress in Automation Practice Website

Scenario: signIn With Credentials

Given user Launch The URL
Then user Click The SignIn Button

Scenario: enter The Credentials To SignIn

Given user Enter The Email Address In The Field
And user Enter The Password In The Password Field
Then user Click The SignIn Button And Navigate To Home Page

Scenario: choose The Field Of Dress

Given user Click The Women Dress Field

Scenario: choose The Dress And Add To Cart

Given user To Choose The Perfect Dress And Click Add To Cart
Then user Get Proceed The Cart And Navigate To Next Page

Scenario: proceed To Check Out

Given user Verify The Product And Proceed To Check Out

Scenario: choose The Quantitiy Of Dress

Given user Enter The Quantity Of Dress
Then user Click The Proceed Button

Scenario: enter The Address

Given user Verify The Address And Click Proceed To Check Out

Scenario: Order Details

Given user Click The Agree Button For Terms Of Service
Then user Click The Proceed To Check Out Button 

Scenario: payment Methods To Choose

Given user Click The Payment Method To Use Pay Amount

Scenario: conform Order

Given user Click The Confirm Order Button
Then user Click The SignOut Button