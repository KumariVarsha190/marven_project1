package READING;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingexcel {
	public static void main(String[] args) throws IOException {
		FileInputStream file =new FileInputStream(System.getProperty("user.dir")+"\\data1.xlsx");
		XSSFWorkbook work =new XSSFWorkbook(file);
		XSSFSheet sheet =work.getSheet("sheet1");
		int totalrows =sheet.getLastRowNum();
		int totalcells =sheet.getRow(1).getLastCellNum();
		System.out.println("No. of rows:"+totalrows);
		System.out.println("No of column:"+totalcells);
		
		for(int r=0;r<=totalrows;r++) {
		XSSFRow currentRow =sheet.getRow(r);
		for (int c=0;c<totalcells;c++) {
			String value =currentRow.getCell(c).toString();
			System.out.println(value+" ");
			
			
		}
	}
	System.out.println();
	work.close();
	file.close();
	

}
}
