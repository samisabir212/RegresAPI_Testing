package Steps;

import Services.CreateUser;
import cucumber.api.java.en.Then;

public class CreateUserSteps {
	
	
	
	@Then("^execute create user webservice and validate the user was created successfully \"([^\"]*)\"$")
	public void execute_CreateUser_webservice_successfully(String testname) {
		
		System.out.println(testname);
		CreateUser.createUser(testname);
	
	}

}
