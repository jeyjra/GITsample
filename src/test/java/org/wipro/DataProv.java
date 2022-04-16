package org.wipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProv {
	
	
	@Test(dataProvider="jey")
	   private void test(String s1,String s2,String s3,String s4,String s5,String s6) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("username")).sendKeys(s1);
		 driver.findElement(By.id("password")).sendKeys(s2);
		 
		 driver.findElement(By.id("login")).click();
	
		  
		 WebElement hptLoc = driver.findElement(By.id("location"));
		 
		 Select loc = new Select(hptLoc);
		 
		 loc.selectByValue(s3);
		
		  
		 WebElement hotel = driver.findElement(By.id("hotels"));
		 
		 Select hotel1 = new Select(hotel);
		 
		 hotel1.selectByValue(s4);
		
         WebElement room = driver.findElement(By.id("room_type"));
		 
		 Select roomType = new Select(room);
		 
		 roomType.selectByValue(s5);
		 
         WebElement noOfRoom = driver.findElement(By.id("room_nos"));
		 
		 Select noOfRooms = new Select(noOfRoom);
		 
		 roomType.selectByValue(s5);
		 
         WebElement adult = driver.findElement(By.id("adult_room"));
		 
		 Select adultRoom = new Select(adult);
		 
		 adultRoom.selectByValue(s6);
		 
         WebElement child = driver.findElement(By.id("child_room"));
		 
		 Select childRoom = new Select(child);
		 
		 adultRoom.selectByValue(s6);
		 
		
		
		
		
	}
	
	@DataProvider(name="jey")
	public Object[][] name() {
		
		Object obj [][]= new Object[][] { {"stephen29","Stephen@adacin", "Sydney", "Hotel Sunshine",
			"Deluxe","1","0"}};
		
		return obj;
		
	}	
		
		
		
		
		
		
		
		
		
		
		
	}


