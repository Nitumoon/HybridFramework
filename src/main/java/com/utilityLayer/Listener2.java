package com.utilityLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listener2 extends ExtentReportSetup implements ITestListener {
//	ExtentSparkReporter esp;
//	ExtentReports er;
	ExtentTest et;

	@Override
	public void onStart(ITestContext context) {
//		esp = new ExtentSparkReporter(System.getProperty("user.dir") + "\\Reports\\2.html");
//		er = new ExtentReports();
//		er.attachReporter(esp);
//		esp.config().setTheme(Theme.DARK);

		// call ExtentReportSetup class method
		ExtentReportSetup.eSetup();
	}

	@Override
	public void onTestStart(ITestResult result) {
		et = er.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// et = er.createTest(result.getMethod().getMethodName());
		et.log(Status.PASS, "Test case pass ->" + result.getMethod().getMethodName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// et = er.createTest(result.getMethod().getMethodName());
		et.log(Status.FAIL, "test case fail ->" + result.getMethod().getMethodName());
		// throw exception if test case is getting failed
		et.log(Status.FAIL, result.getThrowable());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		et.log(Status.SKIP, "test case skip ->" + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onFinish(ITestContext context) {
		er.flush();
	}

}
