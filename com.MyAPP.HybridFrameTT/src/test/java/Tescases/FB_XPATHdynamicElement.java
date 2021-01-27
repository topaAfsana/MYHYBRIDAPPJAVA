package Tescases;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class FB_XPATHdynamicElement{

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","Macintosh\\Users\\metootopa\\Downloads\\geckodriver.tar");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");


 assertTrue(driver.getPageSource().contains("facebook"));
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("topbest1@live.com");
		WebElement logInPassword = driver.findElement(By.xpath(".//*[@id='pass']"));
		logInPassword.clear();
		logInPassword.sendKeys("imnotgood");
		driver.findElement(By.xpath(".//*[@type='submit'][@value='Log In']")).click();
		
		
		//Assert.assertEquals("(1) Afsana Khan", driver.getTitle());
		
		
		driver.findElement(By.xpath(".//*[@id='u_0_4']/div[1]/div[1]/div/a")).click();
		//driver.findElement(By.className("_2s25")).click();

		//driver.findElement(By.xpath("a[@class='_2s25']")).click();
		System.out.println(driver.getTitle());
		
		

		driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();	
		//*******************************
		// dynamic logout xpath -DYNAMIC ELEMENT
		driver.findElement(By.xpath(".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[18]/a")).click();
		
		
		
		
		
		
		driver.quit();

	}

}
