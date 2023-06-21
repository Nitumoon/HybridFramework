package com.testLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTest {
	// global declaration of all extent report classes
	ExtentSparkReporter esp;
	ExtentReports er;
	ExtentTest et;

	@BeforeClass
	public void setup() {
		// to create path for extent report
		esp = new ExtentSparkReporter("C:\\Users\\nites\\eclipse-workspace\\HybridFramework\\Reports\\a.html");
		// to start generating report
		er = new ExtentReports();
		// attach report
		er.attachReporter(esp);
		System.out.println("Before Class");

	}

	@Test
	public void abc() {
		et = er.createTest("abc");
		et.log(Status.PASS, "Test case pass");

		System.out.println("abc method");

	}

	@Test
	public void xyz() {
		System.out.println("xyz method");
	}

	@Test
	public void pqr() {
		System.out.println("pqr method");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("After class");
		// stop generating report
		er.flush();
	}

}