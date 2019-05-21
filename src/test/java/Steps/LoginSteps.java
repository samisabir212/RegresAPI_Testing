package Steps;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Services.Login;
import cucumber.api.java.en.Then;

public class LoginSteps {

	
	@Then("^execute login webservice and login successfully \"([^\"]*)\"$")
	public void execute_login_webservice_and_login_successfully(String testname) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		System.out.println(testname);
		Login.Successful_Login_webservice("eve.holt@reqres.in", "cityslicka", testname);
		
	
	}
	
	
	@Then("^execute login service for negative testcases \"([^\"]*)\" \"([^\"]*)\"$")
	public void execute_login_service_for_negative_testcases(String testname,String expectedErrorMessage) {
		
		System.out.println("Look here!");
		System.out.println(expectedErrorMessage);
		Login.NegativeTestCases_For_Login_webservice("eve.holt@reqres.in", "cityslicka", testname, expectedErrorMessage);
		
		
	}
	
}
