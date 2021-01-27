package Tescases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cityBankApp {
	
	
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
	
	/*
	userId.clear();
	userId.sendKeys("TopaAfsana");
	passWord.clear();
	passWord.sendKeys("Bangladesh#1");
	
	//driver.findElement(By.id("signInBtn")).click();
	//String homePageTitleActual=driver.getTitle();
	//System.out.println(homePageTitleActual);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement userId =driver.findElement(By.xpath("//input[@id='sign'][@type='hidden'][@name='sign']"));
	String script="arguements[0].sendKeys()";
	js.executeScript(script,userId);
	
	
	//System.out.println(driver.findElement(By.xpath("//input[@id='sign'][@type='hidden'][@name='sign']")).getTagName());
	//driver.findElement(By.xpath("//input[@id='sign'][@type='hidden'][@name='sign']")).sendKeys("abc");
	WebElement passWord=driver.findElement(By.id("password"));
	System.out.println(passWord.getText());
	passWord.sendKeys("Bangladesh#1");
	String signIn=driver.findElement(By.id("signInBtn")).getAttribute("value");
	System.out.println(signIn);*/
	
	System.out.println(driver.findElement(By.cssSelector("#usernameMasked")).getTagName());

	driver.findElement(By.cssSelector("#usernameMasked")).sendKeys("TopaAfsana");
	WebElement passWord=driver.findElement(By.id("password"));
	System.out.println(passWord.getText());
	passWord.sendKeys("Bangladesh#1");
	driver.findElement(By.id("signInBtn")).click();
	
	driver.findElement(By.cssSelector(".signOffBtn")).click();
	//Thread.sleep(2000);
	/*WebElement checkBox=driver.findElement(By.cssSelector("#rememberUidLabel"));
	System.out.println(checkBox.getTagName());
	checkBox.click();
	System.out.println(checkBox.isSelected());*/
	
	//driver.quit();
}
}
