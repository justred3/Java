package day2;

import java.util.Scanner;

public class CompareNum {
	public static void main(String[] args){
		//�����û������һ������
		System.out.println("�������һ������:");
		Scanner sc =new Scanner(System.in);
		float x = sc.nextFloat();
		//�����û�����ڶ�������
		System.out.println("������ڶ�������:");
		float y = sc.nextFloat();
		//�����û��������������
		System.out.println("���������������:");
		float z = sc.nextFloat();
		float maxNum = (x>y?x:y)>z?(x>y?x:y):z;
		System.out.println("����������������У������ǣ�");
		System.out.println(maxNum);
	}
}
