package com.renxuan.initOrder;

/*
 * 
 * ����ʵ��������
 * super
 * i=test����
 * ����ķǾ�̬�����
 * ������޲ι���
 */
public class Son extends Father{
	private int i = test();
	private static int j = method();
	
	static {
		System.out.println("(6)");
	}
	
	public Son() {
		System.out.println("(7)");
	}
	
	{
		System.out.println("(8)");
	}
	
	public int test() {
		System.out.println("(9)");
		return 0;
		
	}
	
	public static int method() {
		System.out.println("(10)");
		return 0;
	}
}
