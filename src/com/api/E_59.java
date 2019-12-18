package com.api;

import java.util.*;

public class E_59 {
	public static void main(String[] args) {
		//获取房钱系统属性
		Properties properties =System.getProperties();
		System.out.println(properties);
		//获取所有系统属性的key(属性名),返回Set对象
		Set<String>propertyName=properties.stringPropertyNames();
		for(String key : propertyName) {
			//获取当前键key(属性名)所对应的值(属性值)
			String value =System.getProperty(key);
			System.out.println(key + "--->"+value);
		}
	}
}
