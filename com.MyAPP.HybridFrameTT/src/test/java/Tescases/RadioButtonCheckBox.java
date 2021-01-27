package Tescases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonCheckBox {
	

@Test
public void RadioButtonCheckBox() {
	System.setProperty("webdriver.firefox.marionette","Macintosh\\Users\\metootopa\\Downloads\\geckodriver.tar");
	WebDriver driver= new FirefoxDriver();
	driver.get("http://www.facebook.com");
	
	WebElement radioButton=driver.findElement(By.xpath(".//*[@id='u_0_6']"));

	
	/*WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedCondition.visibilityOf(radioButtonElm))*/
	
	
	Assert.assertFalse(radioButton.isSelected());
	Assert.assertFalse(radioButton.isEnabled());
	Assert.assertFalse(radioButton.isDisplayed());

	radioButton.click();
	radioButton.isSelected();
	/*System.out.println(radioButton.getText());
	System.out.println(radioButton.getSize());*/
	Boolean radiopVerify= radioButton.isSelected();
	/*if (radiopVerify=true) {
		System.out.println("true hoise");
	} OR*/
	
	Assert.assertTrue(radioButton.isSelected());

//assert.assertTrue(radiopVerify, true);
	/*String actual=System.out.println(radiopVerify);
	
	System.out.println(radiopVerify);
	assert.assertEquals(actual, true);
	assert.assertTrue(radiopVerify);
	
	List <WebElement> radioButon=driver.findElements(By.xpath("xpathExpression"));
	radioButton.getText();
	
	for (int i;i<radioButton.getSize();i++){
		radioButton.get().getAttribute(checked)
	}*/
	
	driver.quit();
	
}
}
