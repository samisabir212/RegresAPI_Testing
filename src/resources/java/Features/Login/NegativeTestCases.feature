Feature: Login Feature for reqres.in

	User should not be able to login with invalid credentials


@Negative
Scenario Outline: Negative testCases For Login Feature

	Then execute login service for negative testcases "<Testname>" "<expectedErrorMessage>"
	

	Examples:
	
	| Testname 	      | expectedErrorMessage      |
	| InvalidEmail    | user not found            |
	| InvalidPassword | invalid password          |
	| BlankEmail      | Missing email or username |
	| BlankPassword   | Missing password          |
	| NoEmail         | Missing email or username |
	| NoPassword      | user not found            |