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

public class Input_test {

	public static void main(String[] args) throws Exception {
		File file=new File("E://java基础//tice");
		File[] wenjian_jihe=file.listFiles();
		System.out.println(wenjian_jihe.length);
		for (File file2 : wenjian_jihe) {
			System.out.println(file2);
			if(file2.getName().endsWith("xlsx")) {
				dxj_xlsx(file2);
			}else if(file2.getName().endsWith("xls")) {
				dxj_xls(file2);
			}
		}
	}
	public static void dxj_xlsx(File shili) throws Exception {
		FileInputStream fin=new FileInputStream("shili.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		for(int i = 0 ; i < rows ; i++) {
			XSSFRow row=sheet.getRow(i);
			
			XSSFCell cell=row.getCell(4);
			
			String xuehao=cell.getStringCellValue();
			//System.out.println(xuehao);
			
			XSSFCell cell16=row.getCell(15);
			String zuo_shili=cell16.getStringCellValue();
			//System.out.println(zuo_shili);
			
			XSSFCell cell17=row.getCell(16);
			String you_shili=cell17.getStringCellValue();
			//System.out.println(you_shili);
			Class.forName("com.mysql.jdbc.Driver");
Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=utf8","root","12345678.W");
			//Statement yuju=lianjie.createStatement();
PreparedStatement ydy_yuju=lianjie.prepareStatement(
		""+"update 18rj2 set``=?,``=? where ``=?");
			ydy_yuju.setString(1, zuo_shili);
			ydy_yuju.setString(2, you_shili);
			ydy_yuju.setString(3, xuehao);
			//ydy_yuju.executeUpdate();
			//System.out.println(sql);
			//yuju.execute(sql);
		}
	}
	public static void dxj_xls(File shili) throws Exception {
		FileInputStream fin=new FileInputStream("shili.xlsx");
		HSSFWorkbook workbook=new HSSFWorkbook(fin);
		HSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		for(int i = 0 ; i < rows ; i++) {
			HSSFRow row=sheet.getRow(i);
			
			HSSFCell cell=row.getCell(4);
			
			String xuehao=cell.getStringCellValue();
			//System.out.println(xuehao);
			
			HSSFCell cell16=row.getCell(19);
			String zuo_shili=cell16.getStringCellValue();
			//System.out.println(zuo_shili);
			
			HSSFCell cell17=row.getCell(20);
			String you_shili=cell17.getStringCellValue();
			//System.out.println(you_shili);
			Class.forName("com.mysql.jdbc.Driver");
Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=utf8","root","12345678.W");
			//Statement yuju=lianjie.createStatement();
PreparedStatement ydy_yuju=lianjie.prepareStatement(
		""+"update 18rj2 set`左眼裸眼视力`=?,``=? where `右眼裸眼视力`=?");
			ydy_yuju.setString(1, zuo_shili);
			ydy_yuju.setString(2, you_shili);
			ydy_yuju.setString(3, xuehao);
			ydy_yuju.executeUpdate();
			//System.out.println(sql);
			//yuju.execute(sql);
		}
	}
}