package Tescases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Verification {
	@Test
	public void testCase1() {
		System.setProperty("webdriver.firefox.marionette","Macintosh\\Users\\metootopa\\Downloads\\geckodriver.tar");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");

		//Assert.assertEquals("(1) Afsana Khan", driver.getTitle());
		Assert.assertTrue(false, driver.getTitle());
		//Assert.assertTrue(radioButton.isSelected);
		
		/*Assert.assertFalse(radioButton.isSelected());
		Assert.assertFalse(radioButton.isEnabled());
		Assert.assertFalse(radioButton.isDisplayed());*/
		//Assert.assertEquals(actual, expected);
		driver.quit();
}
}
