package com.renxuan.single;
/**
 * 
 * （1）构造器私有化
 * （2）用个静态变量保存这个唯一实例
 * @author 灵均
 *
 */
public class Singleton5 {
	private static Singleton5 instance;
	private Singleton5() {
		
	}

	//线程安全
	public static Singleton5 getInstance() throws InterruptedException {
		if(instance == null) {
			synchronized (Singleton5.class) {
				if(instance == null) {
					Thread.sleep(100);
					instance = new Singleton5();
				}
			}
		}
		
		return instance;
	}
}
