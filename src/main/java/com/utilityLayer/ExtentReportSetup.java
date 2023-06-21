package com.utilityLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportSetup {
	// Globl Declaration for ExtentReports class
	public static ExtentReports er;

	/*
	 * eSetup means ExtentReportSetup() method we create here
	 */
	public static ExtentReports eSetup() {
		// create Object of SimpleDateFormat class
//		SimpleDateFormat dFormat = new SimpleDateFormat("dd/mm/yyyy/_HH:mm:ss");
//		String date = dFormat.format(new Date());
		String date = new SimpleDateFormat("dd_mm_yyyy_hhmmss").format(new Date());

		/*
		 * to save extent report we create user directory path for store all extent
		 * reports using ExtentSparkReporter class
		 */

		ExtentSparkReporter esp = new ExtentSparkReporter(
				System.getProperty("user.dir") + "//Reports//" + date + ".html");

		// call constructor of ExtentReport class
		er = new ExtentReports();

		// attach Extent Reports using attachReports() method
		er.attachReporter(esp);

		esp.config().setTheme(Theme.DARK);

		// return ExtentReports
		return er;

	}

}
