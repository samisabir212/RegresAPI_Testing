package Steps;

import Services.Login;
import cucumber.api.java.en.Then;

public class LoginSteps {

	
	@Then("^execute login webservice and login successfully \"([^\"]*)\"$")
	public void execute_login_webservice_and_login_successfully(String testname) {
		
		System.out.println(testname);
		Login.Successful_Login_webservice("eve.holt@reqres.in", "cityslicka", testname);
		
	
	}
	
	
	@Then("^execute login service for negative testcases \"([^\"]*)\"$")
	public void execute_login_service_for_negative_testcases(String testname) {
		
		
		Login.NegativeTestCases_For_Login_webservice("eve.holt@reqres.in", "cityslicka", testname);
		
		
	}
	
}
