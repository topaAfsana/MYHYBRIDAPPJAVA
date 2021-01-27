package Tescases;
import java.sql.*;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DatabaseTesting {
	
	
	@Test
	public void databaseTestCase()
	{
		

		 //******************************************
//@@@@@@@@@@@ : PART 1 : "INPUT TEST DATA" FROM WEB APPLICATION (INTO DATABASE) :@@@@@@@@@@@@@@@@//
		WebDriver driver=new FirefoxDriver();
		driver.get("url");
		//INPUT DATA IN THE WEB FORM 
		driver.findElement(By.id("Nmae")).sendKeys("YOUR DATA VALUE");
		driver.findElement(By.id("Email")).sendKeys("YOUR DATA VALUE");
		driver.findElement(By.id("SignUp")).click();
		
		
		
		
		

		 //******************************************
//@@@@@@@@@@@ : PART 2 : CONNECTION TO DATABASE AND EXECUTE QUERY :@@@@@@@@@@@@@@@@//
		
		//PRE-REQ: DOWNLOAD MYSQL AND CREATE DATABASE WITH A TABLE WITH COLUMN
		//A.DOWNLOAD MYSQL JDBC DRIVER JAR FILE AND ADD INTO BUILD PATH
		
		
		//B.DECLARE VARIABLE FOR REQUIRED CONNECTION and MAKE CONNECTION AND ACCESS AND QUERY
		//	Make INSCTANCE OF CONNECTION CLASS
		
//1.***IMPORTANT:"ESTABLISH CONNECTION "CREATE CONNECTION OBJECT
		Connection con = null;
		
		
//2.DECLARE VARIABLE OF STORE ACCESS INFORMATION INTO STRING
		String url="jdbc:mysql://localhost:3306/";
		String DataBaseName="mydatabase";
		String username="root";
		String password="root";
		
		
		
//TRY BLOCK START:main connection commands with in try and catch block
		try{
		
			
//3.***IMPORTANT:DECLARE THE JDBC DRIVER class
		Class.forName("com.mysql.jdbc.driver");
		//C.PERFORM COMMAND WITH GET CONNECTION TO CONNECT THE DATABASE with DRIVER MANAGER class

//4.***IMPORTANT:GET CONNECTED WITH DATABASE DriverManager.getConnection()
		con=(Connection) DriverManager.getConnection(url+DataBaseName, username, password);
		//Got connected
		
		
//5.NOW WRITE ANY QUERY INTRO A STRING VARIABLE in that database(QUERY:GET THE LATEST INPUT DATA ONLY)
	String sqlQuery="Select * from mytable ORDER BY IDNO DESC LIMIT 1";
		
//6.***IMPORTANT:CREATE A STATEMENT OBJECT 
	Statement statement=(Statement) con.createStatement();
		
	
//7.***IMPORTANT:CRAETE A RESULTSET OBJECT TO GET THE RESULT OF THE QUERY BY EXECUTE QUERY COMAND
	ResultSet result=statement.executeQuery(sqlQuery);

//8.***IMPORTANT:USE THIS TO GO ONE AFTER ONE
	result.next();
	
//9.PRINT THE RESULT VALUE WITH GETSTRING COMMAND ALL THE COLUMN IN THAT TABLE
	System.out.println(result.getString("YOUR COLUMN NAME1:ex-ID"));
	System.out.println(result.getString("YOUR COLUMN NAME2: ex-NAME"));
	System.out.println(result.getString("YOUR COLUMN NAME3: ex-EMAIL "));
	

	
	
	

	
	
	
	 //******************************************
//@@@@@@@@@@@ : PART 3 : CONNECTION TO DATABASE AND EXECUTE QUERY :@@@@@@@@@@@@@@@@//
	
	//10.VERIFY IF INPUTED DATA HAS STRORE INTO DATABASE CORRECTLY BY MATCHING THE DATA GOT FROM ABOVE QUERY
		//NAME COLUMN VERIFY
		if (result.getString("YourcolumnName: ex-NAME").equals("Your inputed value also expected into the database")){
			System.out.println("The value is stored correctly");
			
		}
		else{
			System.out.println("The value is stored incorrectly");
			
		}
		//EMAIL COLUMN VERIFY
				if (result.getString("YourcolumnName: ex-EMAIL").equals("Your inputed value also expected into the database")){
					System.out.println("The value is stored correctly");
					
				}
				else{
					System.out.println("The value is stored incorrectly");
					
				}
		}
		//TRY BLOCK  END 
		//CATCH BLOCK START: IF TRY BLOCK GOPT EXCEPTION AND INTERUPTED
				catch(Exception e){
					System.out.println(e.getMessage());
					
				}
		
		
		
//@@@@@@@@@@@ : PART 4 : DISCONNECT FROM DATABASE :@@@@@@@@@@@@@@@@//		
		
		finally{
			if(con!=null){
				con=null;
			}
		}
		
		
	}

}
