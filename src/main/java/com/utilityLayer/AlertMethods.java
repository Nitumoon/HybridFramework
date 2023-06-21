package com.utilityLayer;

import com.baseLayer.CogmentoBaseClass;

public class AlertMethods extends CogmentoBaseClass {
	public static void clickOnOkButton() {
		driver.switchTo().alert().accept();
	}

	public static void clickOnCancelButton() {
		driver.switchTo().alert().dismiss();
	}

	public static void enterDataInAlert(String value) {
		driver.switchTo().alert().sendKeys(value);
	}

	public static String captureAlertText() {
		return driver.switchTo().alert().getText();
	}

}
