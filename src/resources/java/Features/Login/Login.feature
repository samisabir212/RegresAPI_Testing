Feature: Login feature webservice


	as a user i want to login so i can access the application
	therefor when a user logs in the user should get an access token.
	 	

@Login
Scenario Outline:

	User should get an access token after loggining in
	
	Then execute login webservice and login successfully "<Testname>" 
	
	Examples:
	
	|Testname 	      |
	|successful_login |
	
	

	