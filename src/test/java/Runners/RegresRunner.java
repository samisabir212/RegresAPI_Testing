package Runners;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Lib.Lib;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "/Users/sami/Desktop/eclipse-workspace2k19/RegresAPI_Testing/src/resources/java/Features", glue = "Steps", tags = {"@Login"}, format = {
		"pretty", "html:target/site/cucumber-pretty" })
public class RegresRunner extends AbstractTestNGCucumberTests {

	@BeforeSuite
	public void beforeSuite() throws IOException {

		System.out.println("@beforeSuite ---- 1");
		System.out.println("i will execute before the whole test suite \n"
				+ "meaning I will do something for you before all the features are executed");

		
//		String projpath = "/Users/sami/Desktop/Automation/sidrissi/Reqres/Runs/";
//
//		// create reqresAPI results folder
//		String runsFolderPath = createRunResultFolder(projpath);
//
//		// create log folder
//		String logFolderPath = Lib.createLogFolder(runsFolderPath);
//
//		String LoginLogFolder = logFolderPath + "/Login";
//		String loginLogFolderPath = Lib.createLogFolder_for_Service(LoginLogFolder, "Login");
//		System.out.println("Login Log folder path : " + loginLogFolderPath);
//
//		// create excel sheet with columns
//		Constants.Constants.excelResultsPath = runsFolderPath+"/RunResults_Reqres.xlsx";
//		
//		Lib.create_SetupExcelResultsSheet(Constants.Constants.excelResultsPath);
		

	}

	// @Parameters() you can pass paramters into this beforeClass method to give you
	// more control of your framework logic
	@BeforeClass
	public void beforeClass() {

		System.out.println("@BeforeClass ---- 2");

		System.out.println("i will execute after the beforeSuite executes... \n");
		System.out.println("I will do something before each feature is executed");

	}

	@AfterClass()
	public void afterClass() {

		System.out.println("@AfterClass ---- 3");

		System.out.println("I will do something after each feature is executed");

	}

	@AfterSuite()
	public void afterSuite() {

		System.out.println("@AfterClass ---- 4");

		System.out.println("I will run after the whole suite executes meaning after all the features are executed \n"
				+ "meaning im going to do something after all the tests run \n"
				+ "such as moving files from one folder to another folder \n"
				+ "counting an excel sheets passed and failed columns and check how many failed and how many passed and get the total count for you");

	}

	public static String createRunResultFolder(String runsFolderPath) throws IOException {


		File dir = new File(runsFolderPath + Lib.getcurrentdatefolder());

		dir.mkdir();

		return dir.getAbsolutePath();
	}
	

}
