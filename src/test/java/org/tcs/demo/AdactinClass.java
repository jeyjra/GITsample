package org.tcs.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinClass {
	
	@Test
	
	    public void test() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
