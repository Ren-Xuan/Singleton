package com.renxuan.single;
/**
 * 
 * ��1��������˽�л�
 * ��2���ø���̬�����������Ψһʵ��
 * @author ���
 *
 */
public class Singleton4 {
	private static Singleton4 instance;
	private Singleton4() {
		
	}
	//���߳��������û����
	//�����̲߳���ȫ
	public static Singleton4 getInstance() {
		if(instance == null) {
			instance = new Singleton4();
		}
		return instance;
	}
}
