package Tescases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Factory.BrowserFactory;
import Utility.helper;

public class WAIT {
	WebDriver driver;
	
	ExtentReports myReport;
	ExtentTest myLogger;
	@Test
	public void waitTest() throws IOException
	{
		ExtentReports myReport=new ExtentReports("./Reports/waitReport.html");
		ExtentTest myLogger=myReport.startTest("REPORT AND LOG SATRT");
		
		WebDriver driver=BrowserFactory.getBrwoser("firefox");
		myLogger.log(LogStatus.INFO, "WEB BROWSER IS UP AND RUNNING");
		driver.get("http://www.facebook.com");
		myLogger.log(LogStatus.INFO, "NAVIGATED TO URL");
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//PAGE LOAD TIME OUT 
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//ADVANCE WAIT:EXPLICIT WAIT
		  //1.
		  WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='u_0_f']")));
		 
		  String data=myDynamicElement.getText();
		  System.out.println(data);
		  Assert.assertEquals(data, "Create Account");
		  myLogger.log(LogStatus.PASS, "ADVANCE WAIT PASSED");
		  myLogger.log(LogStatus.INFO, myLogger.addScreenCapture(helper.captureScreenshot(driver, "waitScreenShot")));
		  
		  
		  //2.
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='u_0_f']")));

		  String data2=element.getText();
		  System.out.println(data2);
		  Assert.assertEquals(data2, "Create Account");
		  myLogger.log(LogStatus.PASS, "ADVANCE WAIT PASSED");
		  
		  
		  
		/*  WebDriverWait Mywait=new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.)*/
		  
		  
		  
		  
	}
	
	
	@AfterMethod
	public void tearDown(){

		BrowserFactory.CloseBrowser(driver);
		

		
		
	}


}
