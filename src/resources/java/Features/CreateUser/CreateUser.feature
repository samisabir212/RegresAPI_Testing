Feature: CreateUser

	CreateUser service creates a new user in the system

@CREATEUSER
Scenario Outline: 

	Then execute create user webservice and validate the user was created successfully "<Testname>"
	
	
	Examples:
	
	|Testname 			  |
	|SuccessfulCreateUser |
	
