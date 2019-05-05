package UnitTests;

import org.testng.annotations.Test;

import Services.Login;

public class TestLoginService {

	
	@Test(enabled = true)
	public void testLogin() {
		
		
		Login.Successful_Login_webservice("peter@klaven", "cityslicka","Successful_Login");
		
		
		
		
	}
	
}
