package Tescases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgannotation {

	
	
	@BeforeClass
	public void methodBeforeAllTest(){
		System.out.println("THIS IS THE @BeforeClass METHOD THAT RUN BEFORE ALL TEST");
	}
	
	
	
	@BeforeMethod
	public void methodBeforeEachTest(){
		System.out.println("THIS IS THE @BeforeMethod  METHOD THAT RUN BEFORE EACH TEST");}
	
	@Test
	public void method1(){
		System.out.println("THIS IS THE @Test METHOD 1 ");}
		
		
		@Test
		public void method2(){
			System.out.println("THIS IS THE @Test METHOD 2");}
			
		@Test
			public void method3(){
				System.out.println("THIS IS THE @Test METHOD 3");}
		
		@AfterMethod
		public void methodAfterEachTest(){
			System.out.println("THIS IS THE @AfterMethod METHOD THAT RUN AFTER EACH TEST");}
		
			@AfterClass
			public void methodAfterAllTest(){
				System.out.println("THIS IS THE  @AfterClass METHOD THAT RUN AFTER ALL TEST");
	
}}
