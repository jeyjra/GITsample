package org.hcl.demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class JunitAssert  {
	
@Test
	
   public void testCase() {
  
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://adactinhotelapp.com/");

	driver.manage().window().maximize();
	
 // String url = getCurrentUrl();
  //boolean b = url.contains("adactin");
  
   Assert.assertTrue("verifyurl", driver.getCurrentUrl().contains("adactin"));
  
	WebElement txtUser = driver.findElement(By.id("username"));
	txtUser.sendKeys("stephen29");
	
	WebElement txtPass = driver.findElement(By.id("password"));
	
	txtPass.sendKeys("Stephen@adacin"); 
	
	String aT = txtPass.getAttribute("value");
	
	Assert.assertEquals("verify password", "Stephen", aT);
	
	WebElement btnLogin = driver.findElement(By.id("login"));
	
	 btnLogin.click();

}
}
