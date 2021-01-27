package Tescases;

import java.io.IOException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Factory.BrowserFactory;

public class WebdriverHandleMultipleElement {
	
	@Test
	public void webTableTest() throws IOException{
		
		
		//1.Open Browser
		WebDriver driver=BrowserFactory.getBrwoser("firefox");
		//2.Navigate to url and sign in
		driver.get("https://calendar.google.com");
		driver.findElement(By.id("Email")).sendKeys("afsanakhantopa333@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.xpath("//label[text()='Password']/following::input")).clear();
		driver.findElement(By.xpath("//label[text()='Password']/following::input")).sendKeys("Loveme890!");
		driver.findElement(By.id("signIn")).click();
		
		
		
		//3.Write xpath to get the table data and make a list of them by LIST 
		List<WebElement> tableData=	driver.findElements(By.xpath(".//*[@id='dp_0_tbl']/tbody/tr[4]/td"));
		
		//4.Get tyhe size or item of the list
	    int dataNumber=tableData.size();
		
		//5.Implement For loop to get in some point and apply If condition BREAK to stop on that data
		for(int i=0; i<= dataNumber;i++){
			//6.get data
			String data=tableData.get(i).getText();
			
			if(data.equals("13")){
				tableData.get(i).click();
				break;
				
			}
			
		}
		
	}

}
