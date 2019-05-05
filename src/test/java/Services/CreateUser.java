package Services;


import org.json.simple.JSONObject;

import Constants.Constants;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateUser extends Constants {
	
	
	public static void createUser() {
		
		RestAssured.baseURI ="https://reqres.in/api/users";
		
		httpRequest = RestAssured.given();
		
		JSONObject jsonRequestBody = new JSONObject();
		jsonRequestBody.put("name", "sami sabir-idrissi");
		jsonRequestBody.put("job","SDET");
		
		httpRequest.body(jsonRequestBody.toJSONString());
		Response response = httpRequest.post();		
		
		responseBody = response.getBody().asString();
		System.out.println(responseBody);		
		
		JsonPath jspath = response.jsonPath();
		
		String id = jspath.get("id");
		System.out.println("id : "+ id);
	}

}
