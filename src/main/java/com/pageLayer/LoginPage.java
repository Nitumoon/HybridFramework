package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseLayer.AmazonBaseClass;

public class LoginPage extends AmazonBaseClass {
	// POM without page factory

	// find elements for email text box
	protected By email = By.name("email");
	// find elements for password text box
	protected By password = By.name("password");
	// find elements for loginbutton
	protected By loginbutton = By.xpath("//div[text()='Login']");

	public void loginPage(WebDriver driver) {
		// access super class veriable using super keyword
		super.driver = driver;
	}

	// Associated method for each and every object
	public void enterEmail(String emailId) {
		// enter Email
		WebElement emid = driver.findElement(email);
		if ((emid.isDisplayed()) && (emid.isEnabled())) {
			emid.sendKeys(emailId);
		}
	}

	public void enterPassword(String psw) {
		// enter password
		WebElement pswd = driver.findElement(password);
		if ((pswd.isDisplayed()) && (pswd.isEnabled())) {
			pswd.sendKeys(psw);
		}
	}

	public void clickOnLoginButton() {
		WebElement lbtn = driver.findElement(loginbutton);
		if ((lbtn.isDisplayed()) && (lbtn.isEnabled())) {
			lbtn.click();
		}
	}
}
