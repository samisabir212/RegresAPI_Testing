package Services;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.json.JSONObject;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Constants.Constants;
import Lib.Lib;
import Runners.RegresRunner;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Login extends Constants {

	public static void Successful_Login_webservice(String email, String password, String testname)
			throws EncryptedDocumentException, InvalidFormatException, IOException {

		// call createTest method and pass the name of TestCase- Based on your
		// requirement
		ExtentTest logger = RegresRunner.extent.createTest(testname, "this is a description of the test");

		endpoint = "https://reqres.in/api/login";
		RestAssured.baseURI = endpoint;

		RequestSpecification httpRequest = RestAssured.given().log().all();

		JSONObject requstBody = new JSONObject();

		httpRequest.header("Content-Type", "application/json");

		requstBody.put("email", email);
		requstBody.put("password", password);

		httpRequest.body(requstBody.toString());

		Response response = httpRequest.post();

		String responseBody = response.getBody().asString();
		logger.info(testname + " response body : " + responseBody);

		int actualResponseStatusCode = response.getStatusCode();
		logger.info(testname + " response status code : " + actualResponseStatusCode);

		System.out.println("testname : " + testname);
		System.out.println("actual response status code : " + actualResponseStatusCode);
		System.out.println("response body : " + responseBody);

		JsonPath jspath = response.jsonPath();

		String accessToken = jspath.get("token");

		System.out.println("accessToken : " + accessToken);

		expectedResponseStatusCode = 200;

		if (expectedResponseStatusCode == actualResponseStatusCode && responseBody.contains("token")) {

			tStatus = "Passed";
			System.out.println("Status : " + tStatus);
			logger.log(Status.PASS, testname + " : " + tStatus);
			comment = null;
		} else {

			tStatus = "Failed";
			System.out.println("Status : " + tStatus);
			logger.log(Status.FAIL, testname + " : " + tStatus);

			try {
				Assert.assertEquals(actualResponseStatusCode, expectedResponseStatusCode);
				Assert.assertEquals(true, responseBody.contains("token"));
			} catch (java.lang.AssertionError e) {

				System.out.println("Assertion Exception : " + e.getMessage());
				logger.log(Status.INFO, "Assertion Failed : " + e.getMessage());
				comment = e.getMessage();

			}
		}

//		Lib.excelwrite(excelResultsPath, new Object[] { Lib.getcurrentdate(), Environment, "Reqres",
//				Constants.ACCOUNTSTATUS, "Login", testname, tStatus, "n/a", "RC-8989", "1.0", comment });

	}

	public static void NegativeTestCases_For_Login_webservice(String email, String password, String testname,
			String expectedErrorMessage) {

		// call createTest method and pass the name of TestCase- Based on your
		// requirement
		ExtentTest logger = RegresRunner.extent.createTest(testname);

		endpoint = "https://reqres.in/api/login";
		RestAssured.baseURI = endpoint;

		RequestSpecification httpRequest = RestAssured.given().log().all();
		JSONObject requstBody = new JSONObject();
		HashMap<String, String> headersMap = new HashMap<String, String>();
		headersMap.put("Content-Type", "application/json");

		httpRequest.header("Content-Type", "application/json");

		if (testname.equalsIgnoreCase("InvalidEmail")) {

			requstBody.put("email", "inval212@gmail.com");
			requstBody.put("password", password);
			httpRequest.body(requstBody.toString());
			Response response = httpRequest.post();
			JsonPath jspath = response.jsonPath();

			actualErrorMessage = jspath.get("error");
			actualResponseStatusCode = response.getStatusCode();
			responseBody = response.getBody().asString();

			// expecting {"error":"user not found"}

			expectedResponseStatusCode = 400;

			if (actualResponseStatusCode == expectedResponseStatusCode
					&& actualErrorMessage.equalsIgnoreCase(expectedErrorMessage)) {

				tStatus = "Passed";
				System.out.println("Status : " + tStatus);
				logger.log(Status.PASS, testname + " : " + tStatus);

			} else {

				tStatus = "Failed";
				System.out.println("Status : " + tStatus);
				logger.log(Status.FAIL, testname + " : " + tStatus);

				try {
					Assert.assertEquals(actualResponseStatusCode, expectedResponseStatusCode);
					Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

				} catch (java.lang.AssertionError e) {

					System.out.println("Assertion Exception : " + e.getMessage());
					logger.log(Status.INFO, "Assertion Failed : " + e.getMessage());

				}
			}

		} else if (testname.equalsIgnoreCase("InvalidPassword")) {

			requstBody.put("email", email);
			requstBody.put("password", "randomPass212");

			httpRequest.body(requstBody.toString());
			Response response = httpRequest.post();
			JsonPath jspath = response.jsonPath();

			actualErrorMessage = jspath.get("error");

			actualResponseStatusCode = response.getStatusCode();
			responseBody = response.getBody().asString();

			expectedResponseStatusCode = 400;

			// expecting invalid password
			System.out.println("actualErrorMessage " + actualErrorMessage);
			System.out.println("actualResponseStatusCode " + actualResponseStatusCode);
			System.out.println("expectedResponseStatusCode " + expectedResponseStatusCode);
			System.out.println("expectedErrorMessage " + expectedErrorMessage);

			if (actualResponseStatusCode == expectedResponseStatusCode
					&& actualErrorMessage.equalsIgnoreCase(expectedErrorMessage)) {

				tStatus = "Passed";
				System.out.println("Status : " + tStatus);
				logger.log(Status.PASS, testname + " : " + tStatus);

			} else {

				tStatus = "Failed";
				System.out.println("Status : " + tStatus);
				logger.log(Status.FAIL, testname + " : " + tStatus);

				try {
					Assert.assertEquals(actualResponseStatusCode, expectedResponseStatusCode);
					Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

				} catch (java.lang.AssertionError e) {

					System.out.println("Assertion Exception : " + e.getMessage());
					logger.log(Status.INFO, "Assertion Failed : " + e.getMessage());

				}
			}

		} else if (testname.equalsIgnoreCase("BlankEmail")) {

			requstBody.put("email", "");
			requstBody.put("password", password);

			httpRequest.body(requstBody.toString());
			Response response = httpRequest.post();
			JsonPath jspath = response.jsonPath();

			actualErrorMessage = jspath.get("error");

			actualResponseStatusCode = response.getStatusCode();
			responseBody = response.getBody().asString();

			expectedResponseStatusCode = 400;

			// expecting {"error":"Missing email or username"}

			if (actualResponseStatusCode == expectedResponseStatusCode
					&& actualErrorMessage.equalsIgnoreCase(expectedErrorMessage)) {

				tStatus = "Passed";
				System.out.println("Status : " + tStatus);
				logger.log(Status.PASS, testname + " : " + tStatus);

			} else {

				tStatus = "Failed";
				System.out.println("Status : " + tStatus);
				logger.log(Status.FAIL, testname + " : " + tStatus);

				try {
					Assert.assertEquals(actualResponseStatusCode, expectedResponseStatusCode);
					Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

				} catch (java.lang.AssertionError e) {

					System.out.println("Assertion Exception : " + e.getMessage());
					logger.log(Status.INFO, "Assertion Failed : " + e.getMessage());

				}
			}

		} else if (testname.equalsIgnoreCase("BlankPassword")) {

			requstBody.put("email", email);
			requstBody.put("password", "");

			httpRequest.body(requstBody.toString());
			Response response = httpRequest.post();
			JsonPath jspath = response.jsonPath();

			actualErrorMessage = jspath.get("error");

			actualResponseStatusCode = response.getStatusCode();
			responseBody = response.getBody().asString();

			expectedResponseStatusCode = 400;

			// expecting{"error":"Missing password"}

			if (actualResponseStatusCode == expectedResponseStatusCode
					&& actualErrorMessage.equalsIgnoreCase(expectedErrorMessage)) {

				tStatus = "Passed";
				System.out.println("Status : " + tStatus);
				logger.log(Status.PASS, testname + " : " + tStatus);

			} else {

				tStatus = "Failed";
				System.out.println("Status : " + tStatus);
				logger.log(Status.FAIL, testname + " : " + tStatus);

				try {
					Assert.assertEquals(actualResponseStatusCode, expectedResponseStatusCode);
					Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

				} catch (java.lang.AssertionError e) {

					System.out.println("Assertion Exception : " + e.getMessage());
					logger.log(Status.INFO, "Assertion Failed : " + e.getMessage());

				}
			}

		} else if (testname.equalsIgnoreCase("NoEmail")) {

			// requstBody.put("email", "inval212@gmail.com");
			requstBody.put("password", password);

			httpRequest.body(requstBody.toString());
			Response response = httpRequest.post();
			JsonPath jspath = response.jsonPath();

			actualResponseStatusCode = response.getStatusCode();
			responseBody = response.getBody().asString();

			expectedResponseStatusCode = 400;

			actualErrorMessage = jspath.get("error");

			// expecting {"error":"Missing email or username"}

			if (actualResponseStatusCode == expectedResponseStatusCode
					&& actualErrorMessage.equalsIgnoreCase(expectedErrorMessage)) {

				tStatus = "Passed";
				System.out.println("Status : " + tStatus);
				logger.log(Status.PASS, testname + " : " + tStatus);

			} else {

				tStatus = "Failed";
				System.out.println("Status : " + tStatus);
				logger.log(Status.FAIL, testname + " : " + tStatus);

				try {
					Assert.assertEquals(actualResponseStatusCode, expectedResponseStatusCode);
					Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

				} catch (java.lang.AssertionError e) {

					System.out.println("Assertion Exception : " + e.getMessage());
					logger.log(Status.INFO, "Assertion Failed : " + e.getMessage());

				}
			}

		} else if (testname.equalsIgnoreCase("NoPassword")) {

			requstBody.put("email", "inval212@gmail.com");
			requstBody.put("password", password);

			httpRequest.body(requstBody.toString());
			Response response = httpRequest.post();
			JsonPath jspath = response.jsonPath();

			actualResponseStatusCode = response.getStatusCode();
			responseBody = response.getBody().asString();
			expectedResponseStatusCode = 400;

			// expecting {"error":"user not found"}
			actualErrorMessage = jspath.get("error");

			if (actualResponseStatusCode == expectedResponseStatusCode
					&& actualErrorMessage.equalsIgnoreCase(expectedErrorMessage)) {

				tStatus = "Passed";
				System.out.println("Status : " + tStatus);
				logger.log(Status.PASS, testname + " : " + tStatus);

			} else {

				tStatus = "Failed";
				System.out.println("Status : " + tStatus);
				logger.log(Status.FAIL, testname + " : " + tStatus);

				try {
					Assert.assertEquals(actualResponseStatusCode, expectedResponseStatusCode);
					Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

				} catch (java.lang.AssertionError e) {

					System.out.println("Assertion Exception : " + e.getMessage());
					logger.log(Status.INFO, "Assertion Failed : " + e.getMessage());

				}
			}

		}

		logger.info("Endpoint : " + endpoint);
		logger.log(Status.INFO, "Request Headers : " + headersMap.toString());
		logger.log(Status.INFO, "Request body :" + requstBody.toString());

		httpRequest.body(requstBody.toString());

		logger.log(Status.INFO, "response status code : " + actualResponseStatusCode);
		logger.log(Status.INFO, "response body : " + responseBody);

	}

}
