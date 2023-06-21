package com.testLayer;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;

import com.baseLayer.CogmentoBaseClass;

public class WindowHandleTest extends CogmentoBaseClass {
	public static ArrayList<String> handleWindow() throws InterruptedException {

		driver.findElement(By.partialLinkText("HRM")).click();
		Set<String> ls = driver.getWindowHandles();
		ArrayList<String> arr = WindowHandleTest.handleWindow();

		String a = arr.get(0);
		driver.switchTo().window(a);
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("oogle")).click();
		ls = driver.getWindowHandles();
		arr = WindowHandleTest.handleWindow();
		String b = arr.get(2);
		driver.switchTo().window(b);
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(arr.get(0));
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("book")).click();

		ls = driver.getWindowHandles();
		arr = WindowHandleTest.handleWindow();
		;
		String c = arr.get(3);
		driver.switchTo().window(c);
		System.out.println(driver.getCurrentUrl());
		return arr;

	}
}
