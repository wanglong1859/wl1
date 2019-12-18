package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Shuju_shuru {
	static Connection lianjie =null;
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		lianjie =(Connection) DriverManager
				 .getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=utf8",
				"root", "12345678.W");
		File mulu = new File("E:\\java基础\\tice");
		File[] files = mulu.listFiles();
		System.out.println("一共有" + files.length + "个文件");
		for (File file : files) {
			System.out.println(file);
			if (file.getName().endsWith("xlsx")) {
				read_xlsx_and_write_to_db(file);
			} else if (file.getName().endsWith("xls")) {
				read_xls_and_write_to_db(file);

			}

		}

	}

	public static void read_xls_and_write_to_db(File file) throws Exception {
		FileInputStream fin = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(fin);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		for (int i = 0; i < rows; i++) {
			HSSFRow row = sheet.getRow(i);

			HSSFCell cell = row.getCell(3);

			String xuehao = cell.getStringCellValue();
			// System.out.println(xuehao);

			HSSFCell cell20 = row.getCell(19);			
			HSSFCell cell21 = row.getCell(20);
			if (cell20!=null && cell21!=null) {
				
			
			String zuo_shili = cell20.getStringCellValue();
			// System.out.println(zuo_shili);			
			String you_shili = cell21.getStringCellValue();
			// System.out.println(you_shili);			
			// Statement yuju=lianjie.createStatement();
			PreparedStatement ydy_yuju = lianjie.prepareCall("UPDATE sheet SET `左眼裸眼视力`=?,`右眼裸眼视力`=? WHERE `学号`=?");
			ydy_yuju.setString(1, zuo_shili);
			ydy_yuju.setString(2, you_shili);
			ydy_yuju.setString(3, xuehao);
			ydy_yuju.executeUpdate();
			// System.out.println(sql);
			// yuju.execute(sql);
		}
	}
	}
	private static void read_xlsx_and_write_to_db(File file) throws Exception {
		FileInputStream fin = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		for (int i = 0; i < rows; i++) {
			XSSFRow row = sheet.getRow(i);

			XSSFCell cell = row.getCell(3);

			String xuehao = cell.getStringCellValue();
			// System.out.println(xuehao);			
			XSSFCell cell20 = row.getCell(19);
			XSSFCell cell21 = row.getCell(20);
			if (cell20 !=null && cell21 !=null) {
			String zuo_shili = cell20.getStringCellValue();
			// System.out.println(zuo_shili);			
			String you_shili = cell21.getStringCellValue();
			// System.out.println(you_shili);
			
			// Statement yuju=lianjie.createStatement();
			PreparedStatement ydy_yuju = lianjie.prepareCall("UPDATE sheet SET `左眼裸眼视力`=?,`右眼裸眼视力`=? WHERE `学号`=?");
			ydy_yuju.setString(1, zuo_shili);
			ydy_yuju.setString(2, you_shili);
			ydy_yuju.setString(3, xuehao);
			 ydy_yuju.executeUpdate();
			// System.out.println(sql);
			// yuju.execute(sql);
		}
	}
}
}