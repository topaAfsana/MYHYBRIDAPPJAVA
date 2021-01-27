package Tescases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class handlingWebTable_stat_dyn {
	
	public void handlingClenderTable() {
		WebDriver driver= new FirefoxDriver();
		driver.get("http:YOURWEBADDRESS");
		
		
		//WebTable is created with <Table><tbody><tr><td></td></tr></tbody></Table> tag in HTML
		
		
		
		

		 //******************************************
		//1. STATIC /CONSTANT ROW /COL NUM
		//ITERATEe through all the rows and and inside that the column.first rows then column of that rows
		//a.iterate rows
		 for (int rowNum=1;rowNum< 5; rowNum++) {
		//b.iterate col	  
			 for (int colNum=1;colNum< 3; colNum++) {
				 //c. PRINT THE ALL ELEMENT
				 System.out.println(driver.findElement(By.xpath("//div[@id='main']/table[1]/tbody/tr["+rowNum+"]/th["+colNum+"]")));
			 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 //******************************************
		 
		 //2.DYNAMICALLY CHANGING WEBTABLE WHERE ROWNUM AND COLUMN NUM WILL NOT BE STATIC,MEANS WILL BE UNKNOWN
		 
		 // A. LOCATE HTML TABLE 
		 WebElement htmlTable=driver.findElement(By.xpath("//*[@id='main']/table[1]/tbody"));
		 
		 //B. List all the rows in that table and get the size of rows
		 List <WebElement> makeListOfRows= htmlTable.findElements(By.tagName("tr"));
		 //C.GET THE ROW NUMBER
		int totalRowNumber=makeListOfRows.size();
		
		//D.ITERATE THROUGH THE ROWS AND GET THE COLUMN
		for (int iterateRows =0; iterateRows <totalRowNumber; iterateRows++ )
		{
		//E.after iterating and holding all the rows in memory then look for all column get the list of column and get the number of col
		 List <WebElement> makeListOfCol= makeListOfRows.get(iterateRows).findElements(By.tagName("th"));
		 //F.GET THE COLUMN NUMBER
		 int totalColNumber= makeListOfCol.size();
		 //G.Now iterate all the column
		 for (int iterateCol=0; iterateCol< totalColNumber; iterateCol++) 
		 {
		//H.GET the column value
			 System.out.println(makeListOfCol.get(iterateCol));
			 
		 }
		}
		
		
		
		
		
		
		
	}

}
