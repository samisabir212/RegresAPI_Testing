package Services;

import org.json.simple.JSONObject;

import Constants.Constants;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UpdateUser extends Constants {
	
	
	public static void updateUser() {
		
		RestAssured.baseURI = "https://reqres.in//api/users/2";
		httpRequest = RestAssured.given();
		
		JSONObject jsonRequestBody = new JSONObject();
		
		jsonRequestBody.put("name", "sami sabir-idrissi");
		jsonRequestBody.put("job","Automation Manager");
		
		httpRequest.body(jsonRequestBody.toJSONString());
		
		Response response = httpRequest.put();		
		
		responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
	}

}
