package Tescases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Factory.BrowserFactory;
import Factory.DataProviderFactory;

public class NevigateMethod {
	
	@Test
	public void HomepageTest() throws Throwable{
	WebDriver driver=BrowserFactory.getBrwoser("firefox");
	
//go to facebook
	  driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	
	//then go to yahoo
	  driver.navigate().to("http://www.yahoo.com");
	  
	  
	  //then get back to facebook
	  driver.navigate().back();
	  
	  driver.quit();
	  
	  
	
	
	}

}
