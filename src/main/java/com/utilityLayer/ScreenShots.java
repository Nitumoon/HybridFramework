package com.utilityLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseLayer.CogmentoBaseClass;

public class ScreenShots extends CogmentoBaseClass {
	// Code for passed screenshot

	public static String takeSceenshot(String methodname) {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File f = ts.getScreenshotAs(OutputType.FILE);

		String date = new SimpleDateFormat("_ddMMyyyy_HHmmss").format(new Date());

		// we have to add destination location in actual report, so return location

		String distpath = System.getProperty("user.dir") + "//PassScreenshot//" + methodname + date + ".png";

		File dist = new File(distpath);

		try {
			FileUtils.copyFile(f, dist);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return distpath;

	}
}