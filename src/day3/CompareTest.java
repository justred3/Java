package day3;

import java.util.Scanner;

public class CompareTest {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//��ʾ�û���������
		System.out.println("�������һ����:");
		int num1 = sc.nextInt();
		System.out.println("������ڶ�����:");
		int num2 = sc.nextInt();
		System.out.println(compareNum(num1,num2));
	}
	//����һ���������Ƚ�������
		private static boolean compareNum(int a,int b){
		//Ϊʲô����ֱ��д��a==b,��Ϊ==�������һ���Ƚ���������ó���һ��boolean��ֵ
		return a==b;
	} 
}
