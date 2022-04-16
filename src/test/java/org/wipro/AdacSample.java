 package org.wipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdacSample {
	
	@Parameters({"username","password","location","hotels","room_type","room_nos","adult_room","child_room","first_name",
		"last_name","address","cc_num","cardtype","expireyMonth","expireyYear","cvv",})

	
	@Test	
	public void test(String s1, String s2,String s3,
			 String s4,String s5,String s6,
			String s7,String s8,String s9, String s10,
			String s11,String s12,
			String s13,String s14,String s15,String s16) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://adactinhotelapp.com/");
	
	driver.manage().window().maximize();
		
	 WebElement txtUser = driver.findElement(By.id("username"));
	
	 txtUser.sendKeys(s1);
	
	 WebElement txtPass = driver.findElement(By.id("password"));
		
     txtPass.sendKeys(s2);
		
     WebElement btnLogin = driver.findElement(By.id("login"));
		
     btnLogin.click();
		
     WebElement hptLoc = driver.findElement(By.id("location"));
     
     hptLoc.sendKeys(s3);
   
   WebElement hotlesSlect = driver.findElement(By.id("hotels"));
   
   hotlesSlect.sendKeys(s4);
   
   WebElement hotlesRoom = driver.findElement(By.id("room_type"));
   
   hotlesRoom.sendKeys(s5);
   
   WebElement noOFRoom = driver.findElement(By.id("room_nos"));
   
   noOFRoom.sendKeys(s6);
   
  WebElement adultRoom = driver.findElement(By.id("adult_room"));
   
   adultRoom.sendKeys(s7);
   
  WebElement childRoom = driver.findElement(By.id("child_room"));
   
   childRoom.sendKeys(s8);
   
   WebElement searchLogin = driver.findElement(By.id("Submit"));
     
   searchLogin.click();
   
   WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
   
   radioBtn.click();
   
   WebElement continueBtn = driver.findElement(By.id("continue"));
   
   continueBtn.click();
   
    WebElement firstName = driver.findElement(By.id("first_name"));
    
    firstName.sendKeys(s9);
    
     WebElement lastName = driver.findElement(By.id("last_name"));
    
    lastName.sendKeys(s10);
    
     WebElement address = driver.findElement(By.id("address"));
    
     address.sendKeys(s11);
    
     WebElement cardNumber = driver.findElement(By.id("cc_num"));
     
     cardNumber.sendKeys(s12);
    
      WebElement cardType = driver.findElement(By.id("cc_type"));
     
      cardType.sendKeys(s13);
    
      WebElement expireyMonth = driver.findElement(By.id("cc_exp_month"));
      
      expireyMonth.sendKeys(s14);
    
      WebElement expireyYear = driver.findElement(By.id("cc_exp_year"));
       
      expireyYear.sendKeys(s15);
    
       WebElement cvvNumber = driver.findElement(By.id("cc_cvv"));
      
       cvvNumber.sendKeys(s16);
    
       WebElement bookNow = driver.findElement(By.id("book_now"));
   
       bookNow.click();
       
       Thread.sleep(8000);
       WebElement orderNo = driver.findElement(By.id("order_no"));
   
       String orderId = orderNo.getAttribute("value");
      
        System.out.println(orderId);
   
   
   
   
   
   
   
   
   
   
   
   
   
		
		
	}
	

}
