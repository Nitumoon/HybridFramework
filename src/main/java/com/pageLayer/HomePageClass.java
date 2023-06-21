package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseLayer.CogmentoBaseClass;

public class HomePageClass extends CogmentoBaseClass {

	By logo = By.xpath("//div[@class=\"header item\"]");
	By verifyUname = By.xpath("//span[@class=\"user-display\"]");

	// constructor
	public HomePageClass(WebDriver driver) {
		super.driver = driver;

	}

	// Associated method for every webelement
	// verify home page title

	public String homePageTitle() {
		return driver.getTitle();

	}

	// verify home page url
	public String homePageUrl() {
		return driver.getCurrentUrl();
	}

	// verify userneme logo is display or not
	public boolean checkLogoIsDisplayed() {

		return driver.findElement(logo).isDisplayed();
	}

	// verify UserName Text available on Home Page
	public String getUserName() {
		WebElement uname = driver.findElement(verifyUname);
		if (uname.isDisplayed()) {
			return uname.getText();

		}
		return null;
	}

}
