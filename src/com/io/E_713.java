package com.io;

import java.io.File;
import java.util.Arrays;

public class E_713 {

	public static void main(String[] args) {
		File file=new File("d:\\文件夹");
		if (file.isDirectory()) {
			String[] fileNames=file.list((dir,name)->name.endsWith(".txt"));
			Arrays.stream(fileNames).forEach(f->System.out.println(f));
		}		
	}
}
