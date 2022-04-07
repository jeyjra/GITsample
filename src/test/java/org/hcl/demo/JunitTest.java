package org.hcl.demo;

import java.sql.Date;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class JunitTest  {
      static WebDriver driver;
	
   @BeforeClass
	 public static void beforeClass() {
	    WebDriverManager.chromedriver().setup();
	   
	    driver = new ChromeDriver();
	   
	   driver.get("https://adactinhotelapp.com/");
		  

	   driver.manage().window().maximize();
	}
 
   @Test
   
   public void test() {
	  BaseClass b= new BaseClass();
	  
	  WebElement txtPass = driver.findElement(By.id("username"));
	  b.type(txtPass, "stephen29");
	  
	WebElement txtUser = driver.findElement(By.id("password"));
	  b.type(txtUser, "Stephen@adacin");
	  
	  WebElement login = driver.findElement(By.id("login"));
	b.btnClick(login);
}
   @Before
   
   public void before() {
	  

}
   
	@AfterClass
  public static void afterClass() {
		
	driver.close();
}
  
	
	
}
