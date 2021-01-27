package Tescases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahoomailApp {
	WebDriver driver;
	@BeforeClass
	public void yahooStartUpTestCase() throws InterruptedException{
		String baseURL="https://www.yahoo.com/";
		System.setProperty("webdriver.firefox.marionette","Macintosh\\Users\\metootopa\\Downloads\\geckodriver.tar");
		driver= new FirefoxDriver();
		driver.get(baseURL);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		Reporter.log("BROWSER STARTED");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String pageTitle=driver.getTitle();
		System.out.println("Home apge title is "+pageTitle);
		
		System.out.println("BEFORE Class EXECUTED");
		
		
	}
	@Test
	public void yahooSignInTestCase() throws InterruptedException{
		
		
Reporter.log("SIGN IN");
		
		
		//driver.findElement(By.cssSelector("#login-passwd")).click();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("CLICK SIGN IN LINK");
		driver.findElement(By.cssSelector("#uh-signin")).click();
		Reporter.log("CLICKED SIGN IN LINK");
		System.out.println("CLICKED ON SIGN IN");
		Reporter.log("SIGN IN PAGE APPEARED");
		System.out.println("SIGN IN PAGE APPEARED");
		driver.findElement(By.cssSelector("#login-username")).sendKeys("topa2018@yahoo.com");
		driver.findElement(By.cssSelector("#login-signin")).click();
		driver.findElement(By.cssSelector("#login-passwd")).sendKeys("toma123@A");
		driver.findElement(By.cssSelector("#login-signin")).click();
		
      Reporter.log("SIGNED IN");
      System.out.println("SIGNED IN");
		

		
		
		Reporter.log("CLICKED ON MAIL LINK");
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/div[1]/ul/li[2]/a")).click();
		String logInPageTitle=driver.getTitle();
		System.out.println("logInPageTitle is "+logInPageTitle);
		System.out.println("Clicked in MAIL");
		
		
		//driver.findElement(By.cssSelector("#login-passwd")).click();
		
		/*Reporter.log("DELETE MESSAGE ");
		System.out.println("MESSAGE DELETE FUNCTION");
		driver.findElement(By.cssSelector("html/body/div[1]/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div/div/div[2]/ul[1]/li/a/div[1]/div[1]/button")).click();
		driver.findElement(By.cssSelector("//button[@class='c27KHO0_n b_0 M_0 i_0 I_T y_ZwubDW A_6EqO r_P C_q cvhIH6_T ir3_1IO2sY P_eo6'][@title='Delete the selected messages']")).click();
		System.out.println("MESSAGE DELETED");*/
		
		
		Reporter.log("CLICK ON SIGN OUT");
		driver.findElement(By.cssSelector("._yb_14ac9._yb_1e0bf._yb_h704n._yb_yp3xk._yb_ew0a2")).click();
		driver.findElement(By.cssSelector("._yb_ew0a2._yb_suzra._yb_h704n")).click();
		System.out.println("SUCCESSFULLY SIGNED OUT");
	
		
		
		System.out.println("TEST PASSED");
		
	
		

	}
	
	
	
	
	@AfterClass
	public void yahooTearDown(){
		driver.quit();
		System.out.println("AFTER METHOD EXECUTED");
	}

}
