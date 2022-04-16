package org.wipro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest{
	 public static WebDriver driver;
	@Parameters("browserName")
	@Test
	public void test(String bName) {
		
		if (bName.contains("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
              driver.get("https://www.facebook.com/");
			 
		}
	else if (bName.equalsIgnoreCase("fierFox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		  driver.get("https://www.facebook.com/");
	}
	
	else if (bName.equalsIgnoreCase("ie")) {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		  driver.get("https://www.facebook.com/");
	}
	
	else if (bName.equalsIgnoreCase("opera")) {
		WebDriverManager.operadriver().setup();
		driver = new OperaDriver();
		  driver.get("https://www.facebook.com/");

	}
	else {
		
		System.out.println("Invaild Browser");
	}
	
	
	}	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


