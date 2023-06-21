package com.utilityLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listener1 extends ExtentReportSetup implements ITestListener {
	ExtentSparkReporter esr;
	ExtentReports er;
	ExtentTest et;

	@Override
	public void onTestStart(ITestResult result) {
		et = er.createTest(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		et.log(Status.PASS, "Test case pass -> " + result.getMethod().getMethodName());
		ScreenShots.takeSceenshot(result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		et.log(Status.FAIL, "Test case fail -> " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		et.log(Status.SKIP, "Test case skip -> " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		// to create path for extent report
		esr = new ExtentSparkReporter(System.getProperty("user.dir") + "//Reports//k.html");
		// to start generating the report
		er = new ExtentReports();
		// attach report
		er.attachReporter(esr);
	}

	@Override
	public void onFinish(ITestContext context) {
		// stop generating report
		er.flush();
	}

}
