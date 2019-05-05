package Steps;

import Services.Login;
import cucumber.api.java.en.Then;

public class LoginSteps {

	
	@Then("^execute login webservice and login successfully \"([^\"]*)\"$")
	public static void execute_login_webservice_and_login_successfully(String testname) {
		
		System.out.println(testname);
		Login.Successful_Login_webservice("samisabir212@gmail.com", "testing", testname);
		
	
	}
	
}
