package Utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotFactory {
	
	public static String currentDateTime() {
		   DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		    
			//SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy:hh_mm");
			Calendar cal = Calendar.getInstance();
		    
		    String cal1 = dateFormat.format(cal.getTime());
			//String cal1 = formater.format(cal.getTime());
		    return cal1;
		}
	
	public static void captureScreenShot(WebDriver driver,String testcaseName){
		
		File imageFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String datetime = currentDateTime();
		try {
			FileUtils.copyFile(imageFile, new File(".//ScreenShotFolder//"+testcaseName+ datetime+System.currentTimeMillis()+".png"));
		} catch (IOException e) {
			System.out.println("ScreenShot is not captured"+e.getMessage());
		}
		
	}
	

}
