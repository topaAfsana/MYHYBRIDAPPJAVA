package Tescases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","\\Users\\metootopa\\Desktop\\ECLIPSE_TEST\\com.MyAPP.HybridFrameTT\\chromedriver-3.tar");
WebDriver driver=new ChromeDriver();
System.out.println("ITS WORKING");
driver.quit();
	}

}
