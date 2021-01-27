package Tescases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Factory.BrowserFactory;

public class JavaScriptExecutor {
	
	
	@Test
	public void javaScriptexecuterTestCase() throws IOException{
		WebDriver driver=BrowserFactory.getBrwoser("firefox");
		driver.get("http://www.facebook.com");
		

		JavascriptExecutor js=(JavascriptExecutor )driver;
		
		//1.generate pop up alert
		//js.executeScript("alert('HELLO WORLD')");
		
		js.executeScript("arguments[0].click();",driver.findElement(By.id("u_0_t")));
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-250)", "");
		
		driver.quit();
		
	}

}
