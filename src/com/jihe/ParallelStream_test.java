package com.jihe;

import java.util.*;
import java.util.stream.Stream;

public class ParallelStream_test {

	public static void main(String[] args) {
		//创建一个List集合数据源
		List<String>list=Arrays.asList("张三","李四","张小明","张阳");
		//1.直接使用Collection借口的parallelStream()创建并行
		Stream<String>parallelStream=list.parallelStream();
		System.out.println(parallelStream.isParallel());
		
		Stream<String>stream=Stream.of("张三","李四","张小明","张阳");
		Stream<String> parallel =stream.parallel();
		System.out.println(parallel.isParallel());
	}

}
