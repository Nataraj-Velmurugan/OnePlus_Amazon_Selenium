package com.qa.AppSpecifics;

import java.io.IOException;
import java.util.Random;
import java.io.IOException;
import java.util.Random;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.source.base.SeleniumBase;

import utils.DataLibrary;

public class ProjectSpecific extends SeleniumBase {

	
String excelFileName ="";
	
@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}

	@BeforeTest
	public void reporting() {
		reportSetup("QA", "Nataraj Velmurugan", "chrome"); 
	}
	
	@BeforeMethod
	public void beforeMethod() {
	  startApp("chrome", "https://www.amazon.in/");
	}
	
  
	@AfterMethod
	public void afterMethod(ITestResult result) throws InterruptedException {
	  if(result.getStatus()== ITestResult.FAILURE) {
		  test.log(Status.FAIL, "Test case failed is"+result.getName()); //to add name in the extent report
	  }else if(result.getStatus()==ITestResult.SKIP){
		  test.log(Status.SKIP, "Test case skipped is"+result.getName()); 
	  }else if(result.getStatus()==ITestResult.SUCCESS){
		  test.log(Status.PASS, "Test case passed is"+result.getName()); 
	  }
	  
	  close();
	  Thread.sleep(3000);
	  extent.flush();
  }}