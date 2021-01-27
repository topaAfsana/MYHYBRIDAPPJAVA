package Tescases;

import org.testng.annotations.Test;

public class EXCEPTIONhANDLINGTryCatch {
	@Test
	public void testcaseTRYcATCH() {
		try{
			System.out.println("MY ACTION STATEMENT");
			//MAIN CODE TO PERFORM THAT SUSPECTED TO BE OCCURING EXCEOTION.
		}
		catch(Exception e){
			//IF EXCEPTION OCCURS THEN TRY BLOCK IS TERMINATED AND IT THROWS EXCEPTION
			System.out.println(e.getMessage());
		}
		finally{
			//THIS PART OF BLOCK WILL BE EXECUTED IN REGARDLESS OF ANY EXCEPTION OCCURING
		//ex: Close the browser/driver
			
		}
	}

}
