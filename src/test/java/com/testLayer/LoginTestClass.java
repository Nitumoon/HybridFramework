package com.testLayer;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pageLayer.LoginPage;

public class LoginTestClass extends LoginPage {
//	@BeforeClass
//	public void setUp() {
//		BaseClass.initialization();
//	}

//	@Test
//	public void loginPage(WebDriver driver) {
//		// access super class veriable using super keyword
//		super.driver = driver;
//	}

	// Associated method for each and every object
	@Test
	public void enterEmail(String emailId) {
		// enter Email
		WebElement emid = driver.findElement(email);
		if ((emid.isDisplayed()) && (emid.isEnabled())) {
			emid.sendKeys(emailId);
		}
	}

	@Test
	public void enterPassword(String psw) {
		// enter password
		WebElement pswd = driver.findElement(password);
		if ((pswd.isDisplayed()) && (pswd.isEnabled())) {
			pswd.sendKeys(psw);
		}
	}

	@Test
	public void clickOnLoginButton() {
		WebElement lbtn = driver.findElement(loginbutton);
		if ((lbtn.isDisplayed()) && (lbtn.isEnabled())) {
			lbtn.click();
		}
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
		Thread.sleep(1000);
		driver.close();
	}

}
