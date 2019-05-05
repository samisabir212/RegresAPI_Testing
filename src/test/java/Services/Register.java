package Services;

import org.json.simple.JSONObject;

import Constants.Constants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Register extends Constants {
	
	public static void registerUser() {
		
		
		String resource = "/api/login";
		RestAssured.baseURI = "https://reqres.in"+resource;
		
		RequestSpecification httpRequest = RestAssured.given().log().all();
				
		JSONObject requstBody = new JSONObject();
		
		httpRequest.header("Content-Type", "application/json");
		
		requstBody.put("email", "sydney@fife");
		requstBody.put("password", "pistol");
		
		httpRequest.body(requstBody.toString());
		
		Response response = httpRequest.post();
		
		String responseBody = response.getBody().asString();
		
		int actualResponseStatusCode = response.getStatusCode();
	
		System.out.println("actual response status code : "+actualResponseStatusCode);
		System.out.println("response body : "+ responseBody);
		
//		JsonPath jspath = response.jsonPath();
//		
//		String accessToken = jspath.get("token");
//		
//		System.out.println("accessToken : "+ accessToken);
//		
		
	}
	

}
