package org.wipro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class JeyJra {

	@BeforeClass
	
	private void beforeMethod() {
	System.out.println("lanchBrowser");

	}
	 
	@AfterClass
	
	private void afterClass() {
		
      System.out.println("Quit Browser");
	}
	
    @AfterMethod
   
	private void afterMetod() {
    System.out.println("End Time");
     }
	
	@BeforeMethod
	
	private void BeforeMethod() {
    System.out.println("Start Time");
    }
	
	
	@Test
	
	private void test1() {
		
		System.out.println("test1");
	}
	
	
  @Test
	
	private void test2() {
		
		System.out.println("test2");
	}
		
	
  @Test

   private void test3() {
	
	System.out.println("test3");
  }


  @Test

  private void test4() {
	
	System.out.println("test4");
 }



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
