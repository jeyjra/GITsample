package org.hcl.demo;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample {

	
		public static void main(String[] args) throws IOException, InterruptedException, AWTException {

			BaseClass1 b = new BaseClass1();
			
			WebDriver driver = b.lanchBrowser();
			//Thread.sleep(5000);
			b.lanchUrl("https://adactinhotelapp.com/");
			
	WebElement userName = driver.findElement(By.id("username"));
	   b.type(userName,b.getDataFromeExcel("C:\\Users\\hp\\eclipse-workspace\\FrameWork6.30\\ExcelData\\DataSheet1.xlsx",
	        		"Adactin", 0, 1));
   WebElement passWord = driver.findElement(By.id("password"));
	   b.type(passWord, b.getDataFromeExcel("C:\\Users\\hp\\eclipse-workspace\\FrameWork6.30\\ExcelData\\DataSheet1.xlsx",
        		"Adactin", 1, 1));
	   WebElement btnLogin = driver.findElement(By.id("login"));
	   b.btnClick(btnLogin);
	 		
		Thread.sleep(3000);
		WebElement hotLoc = driver.findElement(By.id("location"));
		
		b.type(hotLoc, b.getDataFromeExcel("C:\\Users\\hp\\eclipse-workspace\\FrameWork6.30\\ExcelData\\DataSheet1.xlsx", "Adactin", 2, 1));
		
		b.keyPress(hotLoc);
		
		
		WebElement hotelSelc = driver.findElement(By.id("hotels"));
		
		b.type(hotelSelc, b.getDataFromeExcel("C:\\Users\\hp\\eclipse-workspace\\FrameWork6.30\\ExcelData\\DataSheet1.xlsx", "Adactin", 3, 1));
		
		b.keyPress(hotelSelc);
		
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		
		b.type(roomType, b.getDataFromeExcel("C:\\Users\\hp\\eclipse-workspace\\FrameWork6.30\\ExcelData\\DataSheet1.xlsx", "Adactin", 4, 1));
		
		b.keyPress(roomType);
		
		WebElement noOfRooms = driver.findElement(By.id("room_nos"));
		
		b.type(noOfRooms, b.getDataFromeExcel("C:\\Users\\hp\\eclipse-workspace\\FrameWork6.30\\ExcelData\\DataSheet1.xlsx","Adactin",5,1));
		
		b.keyPress(noOfRooms);

		
		
		
		
		
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		
		b.Index(adultRoom, 1);
		
		
		WebElement childRoom = driver.findElement(By.id("child_room"));
		
		b.Index(childRoom, 1);
		WebElement submitBtn = driver.findElement(By.id("Submit"));
		
		b.btnClick(submitBtn);
		
		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		
		b.btnClick(radioBtn);
	
		
       WebElement contBtn = driver.findElement(By.id("continue"));
		
		b.btnClick(contBtn);
		

		WebElement firstName = driver.findElement(By.id("first_name"));
		
		b.type(firstName, b.getDataFromeExcel("C:\\Users\\hp\\eclipse-workspace\\FrameWork6.30\\ExcelData\\DataSheet1.xlsx","Adactin",8,1));
		
      WebElement lastName = driver.findElement(By.id("last_name"));
		
		b.type(lastName, b.getDataFromeExcel("C:\\Users\\hp\\eclipse-workspace\\FrameWork6.30\\ExcelData\\DataSheet1.xlsx","Adactin",9,1));
		
		
       WebElement adress = driver.findElement(By.id("address"));
		
		b.type(adress, b.getDataFromeExcel("C:\\Users\\hp\\eclipse-workspace\\FrameWork6.30\\ExcelData\\DataSheet1.xlsx","Adactin",10,1));
		

	       WebElement cardNumber = driver.findElement(By.id("cc_num"));
			
			b.type(cardNumber, b.getDataFromeExcel("C:\\Users\\hp\\eclipse-workspace\\FrameWork6.30\\ExcelData\\DataSheet1.xlsx","Adactin",11,1));
			Thread.sleep(2500);
		       WebElement cardType = driver.findElement(By.id("cc_type"));
				
			    b.Index(cardType, 2);
			    
			   WebElement cardMonth = driver.findElement(By.id("cc_exp_month"));
			b.Index(cardMonth, 11);   
			Thread.sleep(3500);
			
			WebElement cardYear = driver.findElement(By.id("cc_exp_year"));
			
		      b.Index(cardYear, 5);

		       WebElement cardCVV = driver.findElement(By.id("cc_cvv"));
				
				b.type(cardCVV, b.getDataFromeExcel("C:\\Users\\hp\\eclipse-workspace\\FrameWork6.30\\ExcelData\\DataSheet1.xlsx","Adactin",12,1));
				
          WebElement bookSatus = driver.findElement(By.id("book_now"));
			 b.btnClick(bookSatus); 
			 Thread.sleep(8000);
			   
			 WebElement orderId = driver.findElement(By.id("order_no"));
			 
			String order = orderId.getAttribute("value");
			System.out.println(order);
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

}

