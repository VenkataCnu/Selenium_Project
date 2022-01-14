package com.testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelUsingPOI {

	public static void main(String[] args) throws IOException {
		String path = "D:\\eclipse-workspace\\Selenium_Project\\Cricketers.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Ancient");
		// System.out.println(sh.getRow(0).getCell(2).getStringCellValue());
		// System.out.println("Work Done");

		int rc = sh.getLastRowNum();
		int cc = sh.getRow(0).getLastCellNum();

		for (int r = 0; r < rc; r++) {
			for (int c = 0; c < cc; c++) {
				System.out.println(sh.getRow(r).getCell(c).toString());
			}
		}
		wb.close();
	}
}
