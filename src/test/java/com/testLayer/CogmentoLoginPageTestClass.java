package com.testLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseLayer.CogmentoBaseClass;
import com.pomWithoutPageFactory.CogmentoLoginPage;

public class CogmentoLoginPageTestClass extends CogmentoBaseClass {
	@BeforeClass
	public void startBrowser() {
		CogmentoBaseClass.initialization();

	}

	@Test
	public void performLoginActivity() {
		CogmentoLoginPage cl = new CogmentoLoginPage(driver);
		cl.enterEmail("prafulp1010@gmail.com");
		cl.enterPassword("Pr@ful0812");
		cl.clickOnLoginButton();

	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
