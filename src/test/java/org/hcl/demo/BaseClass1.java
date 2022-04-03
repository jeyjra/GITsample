package org.hcl.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass1 {
	WebDriver driver;

	public WebDriver lanchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\FrameWork6.30\\Driver\\chromedriver.exe");
		
	 driver = new ChromeDriver();
		
		return driver;	
	}
	
	public void lanchUrl(String url) {

		driver.get(url);
		driver.manage().window().maximize();
	}

	public String getPageUrl() {
		
		String url = driver.getCurrentUrl();
		return url;
	
	}
	
	public void type(WebElement e,String data) {
		
		e.sendKeys(data);

	}
	

	public void keyPress(WebElement e) throws AWTException {
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
	}
	public void btnClick(WebElement e) {
		e.click();

	}
	
	
		public String getDataFromeExcel(String excelLoc,String sName,int rNO,int cNO) throws IOException {
 
			String s = null;
			
		File f = new File(excelLoc);
		
		FileInputStream fI = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fI);
		
		Sheet sheet = w.getSheet(sName);
		
		Row row = sheet.getRow(rNO);
		
		Cell cell = row.getCell(cNO);
		
		
		int type = cell.getCellType();
		
		if(type==1)
		{
		 s = cell.getStringCellValue();
		}
		else if(type==0)
		{
			if(DateUtil.isCellDateFormatted(cell))
			{
			Date date = cell.getDateCellValue();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyy");
		
		 s = sdf.format(date);
				
		}
			else
			{
				double d = cell.getNumericCellValue();
				
				long l =(long)d;
				
				 s = String.valueOf(l);
				
			}
	
		
		}
		return s;
		
		}
		
		public void dropDown(WebElement e, String data) {
			
          Select s = new Select(e);
          
          s.selectByValue(data);
          s.deselectByVisibleText(data);

		}
		
		public void Index(WebElement e, int data) {
			
	          Select s1 = new Select(e);
	        
	          s1.selectByIndex(data);
		}			
		
		public String getAttribute(WebElement e,String data) {
			
			String attribute = e.getAttribute(data);
			
			return attribute;
			

		}

		
			
		
}