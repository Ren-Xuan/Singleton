package com.renxuan.single;

public class Test {
	public static void main(String[]args) {
		
		Singleton1 singleton1 = Singleton1.INSTANCE;
		
		Singleton2 singleton2 = Singleton2.INSTANCE;
		
		System.out.println(singleton1);
		System.out.println(singleton2);
	}
}
