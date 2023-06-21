package com.utilityLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerClass3 implements ITestListener {
	ExtentReports er;
	ExtentSparkReporter esp;
	ExtentTest et;

	@Override
	public void onTestStart(ITestResult result) {
		et = er.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		et.log(Status.PASS, "Test case pass = " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		et.log(Status.FAIL, "Test case Fail = " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		et.log(Status.SKIP, "Test case Skipp = " + result.getMethod().getMethodName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		SimpleDateFormat date = new SimpleDateFormat("ddMMyy_HHmmss");
		String dFormat = date.format(new Date());
		esp = new ExtentSparkReporter(System.getProperty("user.dir") + "\\Reports\\" + dFormat + ".html");

		er = new ExtentReports();
		er.attachReporter(esp);
		esp.config().setTheme(Theme.DARK);
	}

	@Override
	public void onFinish(ITestContext context) {
		er.flush();
	}

}
