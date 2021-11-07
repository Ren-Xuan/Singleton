package com.renxuan.single;


/**
 * 
 * 在内部类创建对象
 * @author 灵均
 *
 */
public class Singleton6 {
	
	
	private Singleton6() {
		
	}
	private static class Inner{
		private static Singleton6 INSTANCE = new Singleton6();
	}
	
	public static Singleton6 getInstance() {
		return Inner.INSTANCE;
	}
}
