package com.testLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.utilityLayer.ReadConfigFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseExample {
	protected static WebDriver driver;
	// public static WebDriver driver;

	// create method for initialization for browser start
	@Test
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

		ReadConfigFile rcf = new ReadConfigFile();
		// open url
		driver.get(rcf.getUrl());
		driver.findElement(By.name("email")).sendKeys(rcf.getUsername());
		driver.findElement(By.name("password")).sendKeys(rcf.getPassword());
		driver.findElement(By.xpath("//div[text()='Login']")).click();

	}

}
