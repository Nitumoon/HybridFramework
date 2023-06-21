package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void mno() {
		Assert.assertEquals(10, 10);
	}

	@Test
	public void asd() {
		Assert.assertEquals(14, 15);

	}

	@Test(dependsOnMethods = "asd")
	public void opq() {
		Assert.assertEquals("java", "java");
	}

}
