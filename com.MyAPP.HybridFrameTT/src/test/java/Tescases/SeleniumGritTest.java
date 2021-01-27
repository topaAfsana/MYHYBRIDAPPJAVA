package Tescases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGritTest {

	public static void main(String[] args) throws MalformedURLException {
		
		System.setProperty("webdriver.firefox.marionette","Macintosh\\Users\\metootopa\\Desktop\\ALL_JARS\\SELENIUM GRID\\geckodriver.tar");
	
		//System.setProperty("webdriver.chrome.driver","Macintosh\\Users\\metootopa/Desktop\\ALL_JARS\\SELENIUMGRID\\chromedriver-3.tar");
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setPlatform(Platform.MAC);
		
		
		
		// hub url where you want to execute your test on available niode 
		URL url= new URL ("http://localhost:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(url,cap);
		
		System.out.println("workedddddd");
		driver.quit();
		
		

	}

}
