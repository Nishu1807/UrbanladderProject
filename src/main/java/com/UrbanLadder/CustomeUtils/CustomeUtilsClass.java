package com.UrbanLadder.CustomeUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CustomeUtilsClass {
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	
	public static String testdatasheetpath="C:\\Users\\ashwi\\eclipse\\com.Flipkart\\src\\main\\java\\testdata\\logindata.xlsx";
	public static Object[][] getTestData(String sheetName) throws EncryptedDocumentException, InvalidFormatException {
		
		FileInputStream file=null;
		try {
			file=new FileInputStream("testdatasheetpath");
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}
		try {
			book=(XSSFWorkbook) WorkbookFactory.create(file);
		}catch(IOException e) {
			e.printStackTrace();
		}
		sheet=(XSSFSheet) book.getSheet(sheetName);
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
			}
		}
		
		return data;
		
	}
}
