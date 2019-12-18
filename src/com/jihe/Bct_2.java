package com.jihe;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Bct_2 {
	public static void main(String[] args) {
		Map<String, String> tmap=new TreeMap<String, String>();
		tmap.put("1", "Lucy");
		tmap.put("2", "John");
		tmap.put("3", "Smith");
		tmap.put("4", "Aimee");
		tmap.put("5", "Amanda");
		System.out.println("用键集遍历双列集合的键和值");
		Set<String> keySet=tmap.keySet();
		Iterator<String> it=keySet.iterator();
		while (it.hasNext()) {
			Object key = (Object) it.next();
			Object value=tmap.get(key);
			System.out.println(key+":"+value);
		}
	}
}
