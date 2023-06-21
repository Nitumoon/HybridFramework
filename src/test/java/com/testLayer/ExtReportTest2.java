package com.testLayer;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtReportTest2 {
	// globle Declaration of all extent reporter classes
	ExtentSparkReporter esr;
	ExtentReports er;
	ExtentTest et;

	@BeforeClass
	public void setup() {
		// to create path for extent report
		esr = new ExtentSparkReporter(System.getProperty("user.dir") + "//Reports//a.html");
		// to start generating the report
		er = new ExtentReports();
		// attach report
		er.attachReporter(esr);
		System.out.println("Before Class");
	}

	@Test
	public void nitesh() {
		// create test
		et = er.createTest("nitesh");
		// generate log file for this test
		et.log(Status.PASS, "Test case pass");
		System.out.println("nitesh method");
	}

	@Test
	public void samir() throws InterruptedException {
		// create test
		et = er.createTest("samir");
		AssertJUnit.assertEquals(10, 20);
		// generate log file for this test
		et.log(Status.FAIL, "test case is fail");
		System.out.println("samir method");
	}

	@Test
	public void nama() {
		// crete test
		et = er.createTest("nama");
		// generate logfile for this test
		et.log(Status.PASS, "Test case is pass");
		System.out.println("nama method");

	}

	@AfterMethod
	@AfterClass
	public void tearDown() {
		System.out.println("After class");
		// stop generating report
		er.flush();
	}

}
