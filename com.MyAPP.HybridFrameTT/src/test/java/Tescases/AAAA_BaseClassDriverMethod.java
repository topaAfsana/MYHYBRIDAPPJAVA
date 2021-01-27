package Tescases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AAAA_BaseClassDriverMethod {
	
	public void driverStart() {
		String baseURL="http://www.facebook.com";
		System.setProperty("webdriver.firefox.marionette","Macintosh\\Users\\metootopa\\Downloads\\geckodriver.tar");
		WebDriver driver= new FirefoxDriver();
		driver.get(baseURL);
	}

}
