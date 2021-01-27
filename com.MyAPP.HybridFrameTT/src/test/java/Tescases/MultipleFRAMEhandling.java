package Tescases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleFRAMEhandling {
	
	public void handlingFrames() {
	WebDriver driver= new FirefoxDriver();
	driver.get("http:YOURWEBADDRESS");
	
	
	
	//Frame is derived from HTML <IFRAME> Tag
	
	

	 //******************************************
	//1.Identify Number of frames in a webPage
	//Get the list of all frame available in the web page
	List<WebElement> frameList= driver.findElements(By.tagName("iframe"));
	// get the number of how many frame in that list by size() method
	 int frameNumber=frameList.size();
	 //print the frame number 
	System.out.println(frameNumber);
	
	
	

	 //******************************************
	//2.HANDLING ELEMENTS THAT ARE INSIDE THE FRAME
	//If any element is inside the frame to handle thgen firts control has to be switch to the targeted frame using SitchTo() method
	driver.switchTo().frame(1);//switchTo() by frame number
	//or
	driver.switchTo().frame("frameName");//switchTo() by frame name
	//or
	driver.switchTo().frame("xpath");//switchTo() by frame xpath 
	
	
	
	
	//3.After switching to a frame selenium will be able to operate any operation on that element ex:
	driver.findElement(By.id("")).sendKeys("value");
	}

	

}
