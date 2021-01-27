package Tescases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FB_CSS {
	@Test
	public void cssLocator(){
		System.setProperty("webdriver.firefox.marionette","Macintosh\\Users\\metootopa\\Downloads\\geckodriver.tar");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("topbest1@live.com");
		WebElement logInPassword = driver.findElement(By.xpath(".//*[@id='pass']"));
		logInPassword.clear();
		logInPassword.sendKeys("imnotgood");
		driver.findElement(By.xpath(".//*[@type='submit'][@value='Log In']")).click();
		driver.findElement(By.cssSelector("#userNavigationLabel")).click();
		driver.findElement(By.xpath(".//*[@type='submit'][@value='Log In']")).click();
		
	}

}
