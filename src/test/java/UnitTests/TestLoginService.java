package UnitTests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import Services.Login;

public class TestLoginService {

	
	@Test(enabled = true)
	public void testLogin() throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		
		Login.Successful_Login_webservice("peter@klaven", "cityslicka","Successful_Login");
		
		
		
		
	}
	
}
