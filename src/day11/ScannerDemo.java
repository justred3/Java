package day11;

import java.util.Scanner;

/*
 * Scanner:���ڽ��ռ���¼�����ݡ�
 * 
 * ǰ���ʱ��
 * 		A:����
 * 		B:��������
 * 		C:���÷���
 * 
 * System������һ����̬���ֶΣ�
 * 		public static final InputStream in; ��׼������������Ӧ�ż���¼�롣
 * 
 * 		InputStream is = System.in;
 * 
 * class Demo {
 * 		public static final int x = 10;
 * 		public static final Student s = new Student();
 * }
 * int y = Demo.x;
 * Student s = Demo.s;
 * 
 * 
 * ���췽����
 * 		Scanner(InputStream source)
 */


public class ScannerDemo {
	public static void main(String[] args) {
		// ��������
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("s:"+s);
	}
}
