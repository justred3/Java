package day2;

import java.util.Scanner;

/**
 * ����¼���������ݣ��Ƚ��������Ƿ����
 * @author Administrator
 *
 */
public class TestReturn1 {
	public static void main(String[] args){
	//����������
		System.out.println("�������һ������");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("������ڶ�������");
		int num2 = sc.nextInt();
		TestReturn1 test1 = new TestReturn1();
		boolean resume =test1.Compare(num1, num2);
		System.out.println(resume);
	}
	
	//����һ�������Ƚ��������Ƿ���ȣ������ؽ��
	private boolean Compare(int a,int b){
		return (a==b);
	}
	private boolean Compare(double a,double b){
		return (a==b);
	}
}
