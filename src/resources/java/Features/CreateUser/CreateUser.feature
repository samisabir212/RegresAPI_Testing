Feature: CreateUser

	CreateUser service creates a new user in the system

Scenario: 

	Given I send a request to create a new user
	Then I validate that the user was created
	
	
