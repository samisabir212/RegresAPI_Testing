package Services;


import org.json.simple.JSONObject;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Constants.Constants;
import Runners.RegresRunner;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateUser extends Constants {
	
	
	public static void createUser(String testname) {
		
		ExtentTest logger = RegresRunner.extent.createTest(testname);

		endpoint = "https://reqres.in/api/users";
		
		RestAssured.baseURI = endpoint;
		logger.info("Endpoint : "+endpoint);
		httpRequest = RestAssured.given();
		
		JSONObject jsonRequestBody = new JSONObject();
		jsonRequestBody.put("name", "sami sabir-idrissi");
		jsonRequestBody.put("job","SDET");
		
		httpRequest.body(jsonRequestBody.toJSONString());
		logger.log(Status.INFO, "Request body : "+jsonRequestBody.toJSONString());
		Response response = httpRequest.post();		
		
		responseBody = response.getBody().asString();
		System.out.println(responseBody);		
		logger.info("Response body : "+responseBody);
		JsonPath jspath = response.jsonPath();
		
		String id = jspath.get("id");
		System.out.println("id : "+ id);
		
		
		
	}

}
