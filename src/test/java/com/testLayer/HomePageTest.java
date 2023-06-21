package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseLayer.CogmentoBaseClass;
import com.pageLayer.HomePageClass;

public class HomePageTest extends CogmentoBaseClass {
	private HomePageClass homepage;

	@Test
	public void validateHomePageTitle() {
		homepage = new HomePageClass(driver);
//		Assert.assertEquals("Cogmento CRM", homepage.homePageTitle());
//		Assert.assertEquals(true, homepage.homePageTitle().contains("CRM"));
		Assert.assertTrue(homepage.homePageTitle().contains("CRM"));
	}

	@Test
	public void validateHomePageUrl() {
		Assert.assertTrue(homepage.homePageUrl().contains("cogmento"));
	}

	@Test
	public void validateHomepageLogo() {
		Assert.assertTrue(homepage.checkLogoIsDisplayed());
	}

	@Test
	public void validateHomePageUsrName() {
		Assert.assertEquals("Praful Pawar", homepage.getUserName());
	}

}
