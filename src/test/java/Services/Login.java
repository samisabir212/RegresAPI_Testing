package Services;



import java.util.HashMap;

import org.json.JSONObject;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Constants.Constants;
import Runners.RegresRunner;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Login extends Constants {
	
	
	public static void Successful_Login_webservice(String email, String password, String testname) {
		
	
	    
        // call createTest method and pass the name of TestCase- Based on your requirement
	    ExtentTest logger = RegresRunner.extent.createTest("LoginTest","this is a description of the test");
	    
		
		RestAssured.baseURI = "https://reqres.in/api/login";
		
		RequestSpecification httpRequest = RestAssured.given().log().all();
		
		
		JSONObject requstBody = new JSONObject();
		
		httpRequest.header("Content-Type", "application/json");
		
		requstBody.put("email", email);
		requstBody.put("password", password);
		
		httpRequest.body(requstBody.toString());
		
		Response response = httpRequest.post();
		
		String responseBody = response.getBody().asString();
		logger.info(testname+ " response body : "+ responseBody);
		
		int actualResponseStatusCode = response.getStatusCode();
		logger.info(testname+ " response status code : "+ actualResponseStatusCode);

		System.out.println("testname : "+ testname);
		System.out.println("actual response status code : "+actualResponseStatusCode);
		System.out.println("response body : "+ responseBody);
		
		JsonPath jspath = response.jsonPath();
		
		String accessToken = jspath.get("token");
		
		System.out.println("accessToken : "+ accessToken);
		
		
		expectedResponseStatusCode = 200;
		
		if(expectedResponseStatusCode==actualResponseStatusCode&&responseBody.contains("token")) {
			
			tStatus = "Passed";
			System.out.println("Status : "+tStatus);
			logger.log(Status.PASS, testname+ " : "+tStatus);
		    
		}else {
			
			tStatus = "Failed";
			System.out.println("Status : "+tStatus);
			logger.log(Status.FAIL, testname+ " : "+tStatus);

			try {
				Assert.assertEquals(actualResponseStatusCode, expectedResponseStatusCode);
				Assert.assertEquals(true, responseBody.contains("token"));
			}catch(java.lang.AssertionError e) {
				
				System.out.println("Assertion Exception : "+e.getMessage());
				logger.log(Status.INFO, "Assertion Failed : "+e.getMessage());

			}
		}
		
		
		//write results to excel
		//Lib.excelwrite(Filename, ob);
		
		
		
	}

	
	public static void NegativeTestCases_For_Login_webservice(String email, String password, String testname) {
		
		
		
		 // call createTest method and pass the name of TestCase- Based on your requirement
	    ExtentTest logger = RegresRunner.extent.createTest(testname);
	    		
		RestAssured.baseURI = "https://reqres.in/api/login";	
		RequestSpecification httpRequest = RestAssured.given().log().all();		
		JSONObject requstBody = new JSONObject();
		HashMap<String,String> headersMap = new HashMap<String,String>();
		headersMap.put("Content-Type", "application/json");
		
		httpRequest.header("Content-Type", "application/json");
	
		if(testname.equalsIgnoreCase("InvalidEmail")) {
			
			requstBody.put("email", "inval212@gmail.com");
			requstBody.put("password", password);
			
			//expecting  {"error":"user not found"}
			
		}else if(testname.equalsIgnoreCase("InvalidPassword")) {
			
			requstBody.put("email", email);
			requstBody.put("password", "randomPass212");
			//actual {"token":"QpwL5tke4Pnpja7X4"}
			//expecting invalid password
			
		}else if(testname.equalsIgnoreCase("BlankEmail")) {
			
			requstBody.put("email", "");
			requstBody.put("password", password);
			
			//expecting {"error":"Missing email or username"}
			
		}else if(testname.equalsIgnoreCase("BlankPassword")) {
			
			requstBody.put("email", email);
			requstBody.put("password", "");
			
			// expecting{"error":"Missing password"}
			
		}else if(testname.equalsIgnoreCase("NoEmail")) {
			
			//requstBody.put("email", "inval212@gmail.com");
			requstBody.put("password", password);
			
			// expecting {"error":"Missing email or username"}
			
		}else if(testname.equalsIgnoreCase("NoPassword")) {
			
			requstBody.put("email", "inval212@gmail.com");
			requstBody.put("password", password);
			
			// expecting {"error":"user not found"}
			
		}
		
		logger.log(Status.INFO, "Request Headers : "+headersMap.toString());
		logger.log(Status.INFO, "Request body :"+requstBody.toString());
		
		httpRequest.body(requstBody.toString());
		
		Response response = httpRequest.post();
		int actualresponseStatusCode = response.getStatusCode();
		String responseBody = response.getBody().asString();
		
		logger.log(Status.INFO, "response status code : "+actualresponseStatusCode);
		logger.log(Status.INFO, "response body : "+responseBody);

		
		
		
	}
	
	
	
}
