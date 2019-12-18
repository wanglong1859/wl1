package com.io;

import java.io.File;

public class E_715 {

	public static void main(String[] args) {
		File file=new File("E:\\java基础");
		fileDir(file);
	}
	public static void fileDir(File file) {
		File[] listFiles=file.listFiles();
		for(File files:listFiles) {
			if (files.isDirectory()) {
				fileDir(files);
			}
			System.out.println(files);
		}
	}

}
