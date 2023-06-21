package com.baseLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonBaseClass {
	// intialize WebDriver interface globlly
	protected static WebDriver driver;

	public static void startBrowser() {
		// create webDriverManagerclass
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("-Disable-Notifications");
		// create instance of webDriver
		driver = new ChromeDriver(co);
		// maximize Browser
		driver.manage().window().maximize();
		// add implicitely wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// add page load time
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		// delete cookies
		driver.manage().deleteAllCookies();
		// open url
		driver.get("https://www.amazon.com/");
	}

}
