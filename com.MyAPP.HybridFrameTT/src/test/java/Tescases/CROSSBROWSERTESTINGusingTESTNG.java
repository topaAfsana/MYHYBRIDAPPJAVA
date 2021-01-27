package Tescases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CROSSBROWSERTESTINGusingTESTNG {
	
	WebDriver  driver;
	
	
	
	@Test
	@Parameters("browsers")
	public void verifyPageTitle(String browserName) {
		
		
		driver.get("http://www.facebook.com");
		
		
		
		
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.marionette","Macintosh\\Users\\metootopa\\Downloads\\geckodriver.tar");
			driver= new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","Macintosh\\Users\\metootopa\\Downloads\\geckodriver.tar");
			driver= new ChromeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.IE.driver","Macintosh\\Users\\metootopa\\Downloads\\geckodriver.tar");
			driver= new InternetExplorerDriver();
		}
		
		
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.getTitle();
		driver.quit();
		
		
		//Right click on the java class> testNg>Convert To TestNg to create a xml file
	}

}
