package com.renxuan.single;
/**
 * 
 * ��1��������˽�л�
 * ��2���ø���̬�����������Ψһʵ��
 * @author ���
 *
 */
public class Singleton5 {
	private static Singleton5 instance;
	private Singleton5() {
		
	}

	//�̰߳�ȫ
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
