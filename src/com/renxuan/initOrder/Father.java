package com.renxuan.initOrder;

/*
 * 
 * ����ʵ��������
 * super
 * i=test����
 * ����ķǾ�̬�����
 * ������޲ι���
 */
public class Father {
	private int i = test();
	private static int j = method();
	
	static {
		System.out.println("(1)");
	}
	
	public Father() {
		System.out.println("(2)");
	}
	
	{
		System.out.println("(3)");
	}
	
	public int test() {
		System.out.println("(4)");
		return 0;
		
	}
	
	public static int method() {
		System.out.println("(5)");
		return 0;
	}
}
