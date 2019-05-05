Feature: GetListOfUsers

	GetListOfUsers service returns a list of users

Scenario Outline: 

	Given I send a request to get a list of users
	Then I validate that the response 
	
	Examples: 
	
	| Testname   |
	| Successful |
