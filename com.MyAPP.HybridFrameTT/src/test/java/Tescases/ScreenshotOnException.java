package Tescases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeTest;

public class ScreenshotOnException {
	
	@BeforeTest
	public void SetUp() {
	WebDriver driver=new FirefoxDriver();
	EventFiringWebDriver eventFire=new EventFiringWebDriver(driver);
	}
	
	
}