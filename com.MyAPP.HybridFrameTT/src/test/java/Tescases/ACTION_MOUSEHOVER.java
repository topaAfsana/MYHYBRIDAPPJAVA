package Tescases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ACTION_MOUSEHOVER {
	WebDriver driver;
	/*@BeforeTest
	public void startBrowser() {
		System.setProperty("webdriver.firefox.marionette","Macintosh\\Users\\metootopa\\Downloads\\geckodriver.tar");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.myntra.com");
		
	}
	*/
	
	
	
	
	@Test
	public void rightClickAction() {
		System.setProperty("webdriver.firefox.marionette","Macintosh\\Users\\metootopa\\Downloads\\geckodriver.tar");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement ele=driver.findElement(By.id("u_0_j"));
		Actions act= new Actions(driver);
		act.contextClick(ele).build().perform();
		act.click().sendKeys(Keys.COMMAND);
		driver.quit();
	}
	
	
	
	
	@Test
	public void actionTestCases() {


		String  parentWindow= driver.getWindowHandle();
		
		Set <String> allWindow= driver.getWindowHandles();
		
		for(String child : allWindow ){
			if (!parentWindow.equalsIgnoreCase(child)){
			
				driver.switchTo().window(child);
	driver.close();
	}
			
		}
		
		driver.switchTo().window(parentWindow);
		
		
		Actions act=new Actions(driver);
		WebElement  HoverEle= driver.findElement(By.xpath(".//*[@id='desktop-header-cnt']/div[2]/nav/div/div[4]/div/a"));
		WebElement  MoveEle= driver.findElement(By.xpath(".//*[@id='desktop-header-cnt']/div[2]/nav/div/div[4]/div/div/div/ul[4]/li[2]/a"));
		
		act.moveToElement(HoverEle).build().perform();
		act.moveToElement(MoveEle).build().perform();
		act.moveToElement(MoveEle).click().build().perform();
		
		String actual=MoveEle.getText();
		System.out.print(actual);
		Assert.assertEquals(actual, "T-Shirts");
		
		
		
		
		
		
		driver.findElement(By.xpath(".//*[@id='desktop-header-cnt']/div[2]/div[3]/input")).sendKeys("topa");

	
		driver.findElement(By.xpath("	.//*[@id='desktop-header-cnt']/div[2]/div[3]/a/span")).click();
		
		
		
		
		
		
		
	}
	@Test
	public void testcase3() {
		
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("topbest1@live.com");
		WebElement logInPassword = driver.findElement(By.xpath(".//*[@id='pass']"));
		logInPassword.clear();
		logInPassword.sendKeys("imnotgood");
		driver.findElement(By.xpath(".//*[@type='submit'][@value='Log In']")).click();
		
		driver.findElement(By.xpath(".//*[@id='js_ki']/form")).click();
		driver.findElement(By.xpath(".//*[@id='js_ki']/form")).sendKeys("topa");
		
		//MOUSE HOVER
		Actions myAction= new Actions(driver);
		 
	/*myAction.moveToElement(hoverElement).perform();
	myAction.moveToElement(clickElement).click().perform(); */
		
		
		
		
	
		
		driver.findElement(By.xpath(".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[18]/a")).click();
		
		//driver.quit();
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}}

