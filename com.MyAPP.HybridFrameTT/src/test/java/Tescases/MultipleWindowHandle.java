package Tescases;

import java.util.Iterator;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWindowHandle {
	
	
	@Test

public void handlingMultipleWindow(){
		
		
		System.setProperty("webdriver.firefox.marionette","Macintosh\\Users\\metootopa\\Downloads\\geckodriver.tar");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://naukri.com");
		
		
		
		//STEP1: GETTING CURRENT WINDOW NAME AS PARENT WINDOW
		String parentWindow=driver.getWindowHandle();
		System.out.println(driver.getTitle()); 
		System.out.println(parentWindow);
		
		
		

		//EASY WAY 
		//STEP2: LIST ALL THE WINDOW IN A SET COLLECTION IN THE MEMORY
		/*Set<String> allWindow= driver.getWindowHandles();
		System.out.println(allWindow);
		int numOfallWindow= allWindow.size();
		System.out.println(numOfallWindow);
		
		//STEP 3: DO FOR LOOP ALL THE WINDOW 
		for (String childWindow:allWindow)
		{
		//STEP 4: WHILE LOOPING IF THE CHILD WINDOW NAME IS DIFFERENT THEN PARENT WINDOW NAME THEN SWITCH THE CONTROL TO THE CHILD NOMINATED WINDOW AND PERFORM OPERTAION ON THAT UNTIL LOOP ENDS
			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				 driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle()); 
				 driver.close();
			}
			
		}
		*/
		
		
		
		//HARD WAY 
		
		//STEP2: LIST ALL THE WINDOW IN A SET COLLECTION IN THE MEMORY
		Set<String> allWindow= driver.getWindowHandles();
		
		//STEP 3: DO FOR LOOP ALL THE WINDOW USING ITERATOR CLASS OBJECT 
		Iterator<String> forLoopingIterat=allWindow.iterator();
		//STEP 4: ITERATE ALL THE WINDOW AND EACH WINDOW IS CONSIDERED AS CHILD WIND IN EACH LOOP
		while (forLoopingIterat.hasNext()){
			String childWindow = forLoopingIterat.next();
			
			//STEP 5: WHILE LOOPING IF THE CHILD WINDOW NAME IS DIFFERENT THEN PARENT WINDOW NAME THEN SWITCH THE CONTROL TO THE CHILD NOMINATED WINDOW AND PERFORM OPERTAION ON THAT UNTIL LOOP ENDS
			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				 driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle()); 
				 driver.close();
			}
			
		}
		
		
		
		
		
		
		
		
		driver.quit();
		
		
		
	
}
}