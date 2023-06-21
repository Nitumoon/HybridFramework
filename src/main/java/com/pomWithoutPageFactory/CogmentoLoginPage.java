package com.pomWithoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseLayer.CogmentoBaseClass;

public class CogmentoLoginPage extends CogmentoBaseClass {
	// declare globally
	// create object of Properties file

	// POM without Page Factory
	public By email = By.name("email");
	public By password = By.name("password");
	public By login = By.xpath("//div[text()='Login']");

	// create constructor
	public CogmentoLoginPage(WebDriver driver) {

		super.driver = driver;
	}

	// Associate method for ech and every object
	public void enterEmail(String emailid) {
		WebElement eid = driver.findElement(email);
		if ((eid.isDisplayed() && (eid.isEnabled()))) {
			eid.sendKeys(emailid);
		}
	}

	public void enterPassword(String Pass) {
		WebElement epass = driver.findElement(password);
		if ((epass.isDisplayed() && (epass.isEnabled()))) {
			epass.sendKeys(Pass);

		}
	}

	public void clickOnLoginButton() {
		WebElement clogin = driver.findElement(login);
		if ((clogin.isDisplayed()) && (clogin.isEnabled())) {
			clogin.click();
		}
	}
}
