package Tescases;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DROPDOWN2 {
	
	@Test
	public void dropDownTc(){
		String baseURL="https://www.facebook.com";
		System.setProperty("webdriver.firefox.marionette","Macintosh\\Users\\metootopa\\Downloads\\geckodriver.tar");
		WebDriver driver= new FirefoxDriver();
		driver.get(baseURL);
		
		WebElement birt_Month = driver.findElement(By.id("month" ));
		Select select=new Select(birt_Month);
		select.selectByIndex(1);
		
		WebElement selectedOption=select.getFirstSelectedOption();
		String SelectedValue=selectedOption.getText();
		List<WebElement> selectedOptions=select.getAllSelectedOptions();
		
		for(WebElement options :selectedOptions ){
			
			options.getText();
		}
		
		List<WebElement> dropDownList= select.getOptions();		
		
		int DropDownsize=dropDownList.size();
		
		
		//by index
		for(int i=0;i<DropDownsize;i++){
			String option=dropDownList.get(i).getText();
			System.out.println(option);
			}
		
		//by index value
		for(WebElement options : dropDownList){
			String eachOption=options.getText();
			System.out.println(eachOption);
		}
		driver.quit();	
		
	
		
		
	}

}
