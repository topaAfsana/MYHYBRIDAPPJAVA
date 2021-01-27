package Tescases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EbayApp {
@Test
public void TestCase(){
	
	Reporter report = null;
	String baseURL="https://www.ebay.com/";
	System.setProperty("webdriver.firefox.marionette","Macintosh\\Users\\metootopa\\Downloads\\geckodriver.tar");
	WebDriver driver= new FirefoxDriver();
	driver.get(baseURL);
	report.log("BROWSER STARTED");
	//driver.findElement(By.cssSelector)
	/*
    boolean checkbox=driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div[1]/div/ul/li[1]/span[2]")).isSelected();
    System.out.println(checkbox);*/
	report.log("CLICKED ON REGISTER");
	driver.findElement(By.cssSelector("#gh-ug-flex>a")).click();
	report.log("CLICK ON A FEILD");
	driver.findElement(By.cssSelector("#firstname")).click();
	report.log("CLICK ANOTHER FEILD WITHOUT FILLING OUT PREVIOUS ONE");
	driver.findElement(By.cssSelector("#lastname")).click();
	report.log("COMPARING ACTUAL AND EXPECTED");
	String Actual=driver.findElement(By.cssSelector("#firstname_w")).getText();
	String Expected="Please enter your first name.";
	Assert.assertEquals(Actual,Expected);
	System.out.println("The message is dispalyed for leaving a feild blank  or reminder to filling up the feild : PASSED ");
	
	driver.findElement(By.cssSelector("#firstname_w")).getText();
	
	report.log("BROWSER CLOSED");
	driver.quit();
}
}
