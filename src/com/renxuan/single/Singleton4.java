package com.renxuan.single;
/**
 * 
 * （1）构造器私有化
 * （2）用个静态变量保存这个唯一实例
 * @author 灵均
 *
 */
public class Singleton4 {
	private static Singleton4 instance;
	private Singleton4() {
		
	}
	//单线程情况下是没问题
	//但是线程不安全
	public static Singleton4 getInstance() {
		if(instance == null) {
			instance = new Singleton4();
		}
		return instance;
	}
}
