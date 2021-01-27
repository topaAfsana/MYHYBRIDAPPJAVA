package Tescases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CHECKBOX_RADIO_BUTTON {
	@Test
	public void logInTestCase() throws InterruptedException{
		System.setProperty("webdriver.firefox.marionette","Macintosh\\Users\\metootopa\\Downloads\\geckodriver.tar");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://online.citi.com/US/login.do");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		String actualPageTitle=driver.getTitle();
		String expectedPageTitle="Banking with Citi | Citi.com";
		System.out.println(actualPageTitle);
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
		
	
	    Thread.sleep(2000);
	    
	    
	    //CHECKBOX
		WebElement checkBox=driver.findElement(By.cssSelector("#rememberUidLabel"));
		System.out.println(checkBox.getTagName());
		checkBox.click();
		System.out.println(checkBox.isSelected());
		
		driver.quit();
	}
}
