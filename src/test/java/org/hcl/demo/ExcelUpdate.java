package org.hcl.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
	
	public static void main(String[] args) throws IOException {
		
		
		File excelLoc = new File("C:\\Users\\hp\\eclipse-workspace\\FrameWork6.30\\ExcelData\\DataSheet.xlsx");
		
		
		FileInputStream fINput = new FileInputStream(excelLoc);
		
		Workbook w = new XSSFWorkbook(fINput);
		
		Sheet s = w.getSheet("Adactin");
		
		Row r = s.getRow(3);
		
	    Cell c = r.getCell(0);
	    
	    
	    String cellValue = c.getStringCellValue();
		
	  if (cellValue.equals("Hotels") ) {
  
	  c.setCellValue("Resturant");
	  
	  } 
	  
	  FileOutputStream foutput = new FileOutputStream(excelLoc);
	  
	  w.write(foutput);
	  
	  System.out.println("Done");
	  
	}

}
