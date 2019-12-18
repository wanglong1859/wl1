package com.jihe;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_test2 {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		Collections.addAll(list, -3,2,9,5,8);
		System.out.println("集合中的元素:"+list);
		System.out.println("集合中最大的元素:"+Collections.max(list));
		System.out.println("集合中最小的元素:"+Collections.min(list));
		Collections.replaceAll(list, 8, 2);
		System.out.println("替换后的集合:"+list);
		Collections.sort(list);
		System.out.println("集合排序后为:"+list);
		int index=Collections.binarySearch(list, 9);
		System.out.println("集合通过二分查找方法查找元素9所在角标为:"+index);
	}

}
