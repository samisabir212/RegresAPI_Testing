package Services;



import org.json.JSONObject;
import org.testng.Assert;

import Constants.Constants;
import Lib.Lib;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Login extends Constants {
	
	
	public static void Successful_Login_webservice(String email, String password, String testname) {
		
		
		RestAssured.baseURI = "https://reqres.in/api/login";
		
		RequestSpecification httpRequest = RestAssured.given().log().all();
		
		
		JSONObject requstBody = new JSONObject();
		
		httpRequest.header("Content-Type", "application/json");
		
		requstBody.put("email", email);
		requstBody.put("password", password);
		
		httpRequest.body(requstBody.toString());
		
		Response response = httpRequest.post();
		
		String responseBody = response.getBody().asString();
		
		int actualResponseStatusCode = response.getStatusCode();
	
		System.out.println("testname : "+ testname);
		System.out.println("actual response status code : "+actualResponseStatusCode);
		System.out.println("response body : "+ responseBody);
		
		JsonPath jspath = response.jsonPath();
		
		String accessToken = jspath.get("token");
		
		System.out.println("accessToken : "+ accessToken);
		
		
		expectedResponseStatusCode = 200;
		
		if(expectedResponseStatusCode==actualResponseStatusCode&&responseBody.contains("token")) {
			
			Status = "Passed";
			System.out.println("Status : "+Status);

		}else {
			
			Status = "Failed";
			System.out.println("Status : "+Status);
			
			try {
				Assert.assertEquals(actualResponseStatusCode, expectedResponseStatusCode);
				Assert.assertEquals(true, responseBody.contains("token"));
			}catch(java.lang.AssertionError e) {
				
				System.out.println("Assertion Exception : "+e.getMessage());
				
			}
		}
		
		
		//write results to excel
		//Lib.excelwrite(Filename, ob);
		
		
		
	}

}
