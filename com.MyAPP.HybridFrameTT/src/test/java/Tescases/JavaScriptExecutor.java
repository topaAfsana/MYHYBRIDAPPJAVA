package Tescases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Factory.BrowserFactory;

public class JavaScriptExecutor {
	
	
	@Test
	public void javaScriptexecuterTestCase() throws IOException{
		WebDriver driver=BrowserFactory.getBrwoser("firefox");
		driver.get("http://www.facebook.com");
		

		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//1.generate pop up alert
		//js.executeScript("alert('HELLO WORLD')");
		
		js.executeScript("arguments[0].click();",driver.findElement(By.id("u_0_t")));
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-250)", "");
		
		driver.quit();
//		===========


		//1.ENTER VALUE/TEXT IN AN INPUT FIELD
		js.executeScript("document.getElementById('email').value= 'your input text'") ;
		// OR
		js.executeScript("document.querySelector(\“input[placeholder=‘First Name’]\”).value='your enter text'")
		//2.How to get the text of particular webElement/TEXT AREA:
		String fetchedText=js.executeScript("return document.getElementById('email').innerHTML").toString();
		//	OR
		String fetchedText=js.executeScript("return document.getElementById('email').value");
		//Print fetchedText
		System.out.PrintLn(fetchedText)

		//3. How to scroll vertically by pixel
		js.executeScript("window.scrollBy(0,500)")
		//4. How to scroll till the bottom of the page
		js.executeScript("window.scrollBy(0,documnet.body.scrollHeight()"))
		//5. How to scroll to a particular element
		WebElement element=driver.findElement(By.id("u_0_t"));
		js.executeScript("document.getElementById('id').ScrollIntoView();",element))


//		============

		//Others:
//		How to click a button: document.getElementById(‘ButtonId’).Click();
//		How to get the title of webpage : String title=js.executeScript(“return document.title”).toString(); System.out.PrintLn(title)
//		How to re-fresh a window: Interact with a web page itself then : js.executeScript(history.go(0))
//		How to navigate back to page : js.executeScript(“window.history.back()”)
//		How to navigate to next page: js.executeScript(“window.history.forward()”)

//		Script start from > window, document
//		Method-
//		ScrollBy
//		getElementById
//		querySelector





	}

}
