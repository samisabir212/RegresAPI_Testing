Feature: Login Feature for reqres.in

	User should not be able to login with invalid credentials


@Negative
Scenario Outline: Negative testCases For Login Feature

	Then execute login service for negative testcases "<Testname>"
	

	Examples:
	
	| Testname 	      |
	| InvalidEmail    |
	| InvalidPassword |
	| BlankEmail      |
	| BlankPassword   |
	| NoEmail         |
	| NoPassword      |