package com.testng;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteUsingPOI {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("My Test");

		Row row1 = sh.createRow(0);

		row1.createCell(0).setCellValue("Sno");
		row1.createCell(1).setCellValue("Name");
		row1.createCell(2).setCellValue("Qualification");
		row1.createCell(3).setCellValue("Mobile Number");

		Row row2 = sh.createRow(1);

		row2.createCell(0).setCellValue("1");
		row2.createCell(1).setCellValue("Srinivas");
		row2.createCell(2).setCellValue("M.Tech");
		row2.createCell(3).setCellValue("9542 336 206");

		String path = "D:\\eclipse-workspace\\Selenium_Project\\PersonDetails.xlsx";
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		wb.close();

		System.out.println("Work Done ");
	}

}
