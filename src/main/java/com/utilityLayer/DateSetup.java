package com.utilityLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class DateSetup {
	public static ExtentReports er;
	public static ExtentSparkReporter esp;

	public static ExtentReports DateSetup() {
//		SimpleDateFormat date=new SimpleDateFormat("ddMMyyyy_HHmmss");
//		String a = date.format(new Date());

		String a = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());

		esp = new ExtentSparkReporter(System.getProperty("user.dir") + "//Reports//" + a + ".html");

		er = new ExtentReports();
		er.attachReporter(esp);
		return er;
	}

}
