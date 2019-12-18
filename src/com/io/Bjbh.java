package com.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Bjbh {

	public static void main(String[] args) throws Exception{
		Path wj=Paths.get("E:\\java基础\\班级信息.txt");
		Path wj2=Paths.get("E:\\java基础\\求班级编号.txt");
		Path bjbh=Paths.get("E:\\java基础\\班级编号.txt");
		List<String> neirong=new ArrayList<>();
		Files.createFile(bjbh);
		List<String> lines=Files.readAllLines(wj);
		List<String> names=Files.readAllLines(wj2);
		/*System.out.println("文件内容为"+lines);
		System.out.println("文件大小为"+Files.size(wj)+"个字节");
		for(String line:lines) {
			String[] zfcsz=line.split("	");
			System.out.println("班级编号:"+zfcsz[0]);
			System.out.println("班级名称:"+zfcsz[1]);
		}*/
		for(String name:names) {
			for(String line:lines) {
				String[] zfcsz=line.split("\t");
				if (name.equals(zfcsz[1])) {
					System.out.println(zfcsz[0]);
					neirong.add(zfcsz[0]);
				}
			}			
		}
		System.out.println(neirong.size());
		for(String bianhao:neirong) {
			System.out.println(bianhao);
		}
		Files.write(bjbh, neirong, StandardOpenOption.APPEND);
	}

}
