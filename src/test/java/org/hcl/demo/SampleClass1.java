package org.hcl.demo;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SampleClass1 {
	

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {

	
		BaseClass1 b   = new BaseClass1();
		
		WebDriver driver = b.lanchBrowser();
		b.lanchUrl("https://adactinhotelapp.com/");
		
	PojoClass pc = new PojoClass();
	
	WebElement userName = pc.getUsername();
	
	 b.type(userName, b.getDataFromeExcel("C:\\Users\\hp\\eclipse-workspace\\FrameWork6.30\\ExcelData\\DataSheet1.xlsx", "Adactin", 0, 1));
	
	WebElement passWord = pc.getPassword();
	b.type(passWord, b.getDataFromeExcel("C:\\Users\\hp\\eclipse-workspace\\FrameWork6.30\\ExcelData\\DataSheet1.xlsx", "Adactin", 1, 1));
	
	WebElement logIn = pc.getLogin();
	
	b.btnClick(logIn);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
