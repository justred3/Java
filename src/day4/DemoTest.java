package day4;

import java.util.Scanner;

public class DemoTest {
	public static void main(String[] args){
		//�½�һ��Scanner�������������û�������
		Scanner sc= new Scanner(System.in);
		//��ʾ�û�����������
		System.out.println("�������һ����:");
		int num1= sc.nextInt();
		System.out.println("������ڶ�����:");
		int num2= sc.nextInt();
		//�½�Demo����
		Demo test = new Demo();
		System.out.println(test.add(num1, num2));
	}
}
