package UnitTests;

import org.testng.annotations.Test;

import Constants.Constants;
import Services.CreateUser;

public class TestCreateUser extends Constants {
	
	@Test(enabled = true)
	public void testCreateUser() {
		
		CreateUser.createUser("successfulTest");
	}

}
