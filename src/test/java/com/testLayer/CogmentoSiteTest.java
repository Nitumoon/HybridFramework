package com.testLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseLayer.CogmentoBaseClass;

public class CogmentoSiteTest extends LoginTestClass {
	

	@BeforeClass
	public void init() {
		CogmentoBaseClass.initialization();
	}

	@Test
	public void LoginFunctionality() {
		LoginTestClass lp = new LoginTestClass();
		lp.enterEmail("prafulp1010@gmail.com");
		lp.enterPassword("Pr@ful0812");
		lp.clickOnLoginButton();
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
	}

}
