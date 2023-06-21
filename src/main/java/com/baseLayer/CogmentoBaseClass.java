package com.baseLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.utilityLayer.ReadConfigFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CogmentoBaseClass {

	protected static WebDriver driver;
	// public static WebDriver driver;

	// create method for initialization for browser start
	public static void initialization() {

		// create browser instance
		WebDriverManager.chromedriver().setup();
		// make connection using chromeOption
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		// create webDriver instance
		driver = new ChromeDriver(co);
		// maximize window
		driver.manage().window().maximize();
		// add implicitely wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// clear cookies
		driver.manage().deleteAllCookies();
		// create object of ReadConfigFile class
		ReadConfigFile rcf = new ReadConfigFile();
		// open url
//		driver.get("https://ui.cogmento.com/");
		driver.get(rcf.getUrl());

	}

}
