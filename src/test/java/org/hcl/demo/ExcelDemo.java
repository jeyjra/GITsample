package org.hcl.demo;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDemo {
	
	public static void main(String[] args) throws IOException {
		
	  File  excel = new File("C:\\Users\\hp\\eclipse-workspace\\FrameWork6.30\\ExcelData\\DataSheet1.xlsx");
	  
	  Workbook w = new XSSFWorkbook();
	  
	  Sheet s = w.createSheet();
	  
	  Row r = s.createRow(4);
	  
	  Cell c = r.createCell(0);
		
		c.setCellValue("ammu");
		
		
      FileOutputStream fInput = new FileOutputStream(excel);
      
      w.write(fInput);
		
        System.out.println("done");
        
      	
		
		
		
		
	}
		
	}