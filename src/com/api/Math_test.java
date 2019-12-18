package com.api;

public class Math_test {

	public static void main(String[] args) {
		System.out.println("绝度值的结果是:"+Math.abs(-1));
		System.out.println("正弦的结果是:"+Math.sin(1.57));
		System.out.println("余弦的结果是:"+Math.cos(2.0));
		System.out.println("正切的结果是:"+Math.tan(0.8));
		System.out.println("平方根的结果是:"+Math.sqrt(4));
		System.out.println("立方根的结果是:"+Math.cbrt(9));
		System.out.println("乘方的结果是:"+Math.pow(2,2));
		System.out.println("求大于参数的最小整数:"+Math.ceil(4.6));
		System.out.println("求小于参数的最大整数:"+Math.floor(-5.2));
		System.out.println("对小数进行四舍五入后:"+Math.round(-8.6));
		System.out.println("求两个数的较大值:"+Math.max(5.1,5.5));
		System.out.println("求两个数的较小值:"+Math.min(5.1,5.5));
		System.out.println("生成一个大于等于0.0小于1.0的随机值:"+Math.random());

	}

}
