package Tescases;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Factory.BrowserFactory;

public class DropDown {
	
	
	WebDriver driver;
	
	@Test
	public void dropDownTest() throws Exception{
	WebDriver driver=BrowserFactory.getBrwoser("firefox");
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	//1.identify elemnt
  WebElement  MonthDditem=driver.findElement(By.xpath(".//*[@id='month']"));
 
  //2.create select handle to select item
  Select select=new Select(MonthDditem);


  //select.selectByIndex(2);
  //3.make a list of all item by select handle
  List<WebElement> list=select.getOptions();
  
  
  //4.get numbers of item
int itemNumber=list.size();
  //4.For loop all item and get text
  for(int i=0;i<itemNumber;i++){
	 String  ListItems=list.get(i).getText();
	 System.out.println( ListItems);
	  
  }
  
  
  
	
	
	}
	
	@AfterMethod
	public void tearDown(){

		BrowserFactory.CloseBrowser(driver);
		
		
	}

}
