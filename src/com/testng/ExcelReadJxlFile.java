package com.testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReadJxlFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\eclipse-workspace\\Selenium_Project\\My Team.xls");
		@SuppressWarnings("resource")
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sh = wb.getSheet("Ancient");

		int rows = sh.getLastRowNum();
		int cols = sh.getRow(0).getLastCellNum();

		System.out.println("Number of Rows are :  " + rows);
		System.out.println("Number of Columns are :  " + cols);
		// System.out.println(sh.getRow(0).getCell(3).getStringCellValue());

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				System.out.println(sh.getRow(r).getCell(c).toString());
			}

		}

	}

}
