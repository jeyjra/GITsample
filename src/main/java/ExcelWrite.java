import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		
		File  excelLoc = new File("C:\\Users\\hp\\eclipse-workspace\\FrameWork6.30\\ExcelData\\DataSheet1.xlsx");
		
		Workbook w = new XSSFWorkbook();
		
		Sheet s = w.createSheet();

		Row r = s.createRow(4);

		
		Cell c = r.createCell(5);
		
		
		c.setCellValue("Selenium");
		
		FileOutputStream fOutput = new FileOutputStream(excelLoc);
		
		w.write(fOutput);

		System.out.println("done");
		
	}
				
	}


