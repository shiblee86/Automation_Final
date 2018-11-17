@smoke @TS_1023
Feature: Payment function validation 

Description: User able to pay with valid payment options

Scenario: User able to buy product with any valid payment options
	Given Loging GCRshop with valid credentials
	Then Click the cart and validate shampoo inside
	When  Update shampoo number three
	And  click checkout
	Then validate address box is there or not
	And check the shipping method
	When add comment to "call my phone before delivery" and Click continue
	And select payment options- cash delivery and continue
	And take a screen shot of your order
	And confirmed your order
	 	 