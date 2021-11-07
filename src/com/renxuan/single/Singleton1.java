package com.renxuan.single;
/**
 * 
 * 
 * @author 灵均
 *	饿汉式
 *	直接创建实例对象
 *
 */
public class Singleton1 {
	public static final Singleton1 INSTANCE = new Singleton1();
	
	private Singleton1() {
		
	}
	
}
