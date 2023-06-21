package com.testLayer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseLayer.CogmentoBaseClass;
import com.pomWithoutPageFactory.CogmentoLoginPage;

public class ConfigFileTest {

	WebDriver driver;

	CogmentoLoginPage cg;

	@BeforeClass
	public void setUp() {
		CogmentoBaseClass.initialization();
	}

//	@Test
//	public void enterEmail(String emailId) {
//		// enter Email
//		WebElement emid = driver.findElement(cg.email);
//		if ((emid.isDisplayed()) && (emid.isEnabled())) {
//			emid.sendKeys(rfc.getUsername());
//		}
//	}
//
//	@Test
//	public void enterPassword(String psw) {
//		// enter password
//		WebElement pswd = driver.findElement(cg.password);
//		if ((pswd.isDisplayed()) && (pswd.isEnabled())) {
//			pswd.sendKeys(rfc.getPassword());
//		}
//	}
//
//	@Test
//	public void clickOnLoginButton() {
//		WebElement lbtn = driver.findElement(cg.login);
//		if ((lbtn.isDisplayed()) && (lbtn.isEnabled())) {
//			lbtn.click();
//		}
//	}

	@Test
	public void LoginFunctionality() {
		LoginTestClass lp = new LoginTestClass();
		lp.enterEmail("prafulp1010@gmail.com");
		lp.enterPassword("Pr@ful0812");
		lp.clickOnLoginButton();

	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}

}
