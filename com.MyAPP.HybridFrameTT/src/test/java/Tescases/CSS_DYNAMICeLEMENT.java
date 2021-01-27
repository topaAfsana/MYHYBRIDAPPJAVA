package Tescases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CSS_DYNAMICeLEMENT {
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
		
		//CSS SELECTOR
		
		System.out.println(driver.findElement(By.cssSelector("#usernameMasked")).getTagName());
		driver.findElement(By.cssSelector("#usernameMasked")).sendKeys("TopaAfsana");
		WebElement passWord=driver.findElement(By.id("password"));
		System.out.println(passWord.getText());
		passWord.sendKeys("Bangladesh#1");
		driver.findElement(By.id("signInBtn")).click();
		
		driver.findElement(By.cssSelector(".signOffBtn")).click();
		
		
		
		driver.quit();
	}
}
