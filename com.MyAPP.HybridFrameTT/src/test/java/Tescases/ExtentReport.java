package Tescases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.helper;

public class ExtentReport {
	
 WebDriver driver;
 ExtentReports report;
 ExtentTest logger;
	
	
	@Test
	public void CreatingAccWithOutEmail(){
		
		report=new ExtentReports("./Reports/MyReport.html",true);
		logger=report.startTest("STARTED MY TEST CASES");
		System.setProperty("webdriver.firefox.marionette","Macintosh\\Users\\metootopa\\Downloads\\geckodriver.tar");
		driver=new FirefoxDriver();
		logger.log(LogStatus.INFO, "Launch the browser and APPLUCATION IS UP AND RUNNING");
		
		driver.get("http://www.facebook.com");
		logger.log(LogStatus.INFO, "FACEBOOK IS OPEN");

		driver.findElement(By.id("u_0_1")).sendKeys("Blue");
		logger.log(LogStatus.INFO, "ENTERED FIRST NAME");
		driver.findElement(By.id("u_0_3")).sendKeys("Bird");
		logger.log(LogStatus.INFO, "ENTERED LAST NAME");
		driver.findElement(By.id("u_0_f")).click();
		logger.log(LogStatus.INFO, "CLICKED ON CREATE ACCOUNT BUTTON");
		String URL=driver.findElement(By.className("accessible_elem layer_close_elem")).getText();
		logger.log(LogStatus.INFO, "GETING URL OF THE PAGE");
		
		System.out.println(URL);
		
	
		Assert.assertEquals(URL, "You'll use this when you log in and if you ever need to reset your password.");
		logger.log(LogStatus.PASS, "VERIFY URL-PASSED");
		
		}
	
	
	
	@AfterMethod
	public void tearDown(ITestResult result){
		
		
		
		if(result.getStatus()==ITestResult.FAILURE){
			String SS_path=helper.captureScreenshot(driver, result.getName());
			
			logger.log(LogStatus.FAIL, "VERIFICATION FAILED",logger.addScreenCapture(SS_path));
		}
		
		
		driver.quit();
		
		report.endTest(logger);

		report.flush();
		
	}
	

}
