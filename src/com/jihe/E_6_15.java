package com.jihe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class E_6_15 {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("1", "Jack");
		map.put("2", "Rose");
		map.put("3", "Lucy");
		System.out.println(map);
		Set<String> keySet=map.keySet();
		Iterator<String> it=keySet.iterator();
		while (it.hasNext()) {
			Object key = (Object) it.next();
			Object value=map.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println("用键值对集遍历双列集合的键和值");
		Set<?> jianzhiduiji=map.entrySet();
		Iterator<?> diedai=jianzhiduiji.iterator();
		while (diedai.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry jianzhidui = (Map.Entry) diedai.next();
			Object key=jianzhidui.getKey();
			Object value =jianzhidui.getValue();
			System.out.println(key+":"+value);
		}
		System.out.println("用foreach键值对集遍历双列集合的键和值");
		map.forEach((key,value)->System.out.println(key+":"+value));
		
		System.out.println("用foreach键值对集遍历双列集合的所有值");
		Collection<String> zhiji=map.values();
		zhiji.forEach(value->System.out.println(value));
		
		System.out.println("=================");
		Map<String, String> map2=new LinkedHashMap<String, String>();
		map2.put("2", "Rose");
		map2.put("1", "Jack");
		map2.put("3", "Lucy");
		map2.forEach((key,value)->System.out.println(key+":"+value));
	}
}
