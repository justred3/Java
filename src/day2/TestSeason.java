package day2;

import java.util.Scanner;

public class TestSeason {
	public static void main(String [] args){
		//��ʾ�û��������ڵ��·�
		System.out.println("���������ڵ��·�:");
		//����ý��ܵĶ���
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		//�ֱ�������ļ���
		if(x>=3&x<=5){
			System.out.println("�����Ǵ���");
		}
		else if(x>=6&x<=8){
			System.out.println("�������ļ�");
		}
		else if(x>=9&x<=11){
			System.out.println("�������＾");
		}
		else if(x==12|x==1|x==2){
			System.out.println("�����Ƕ���");
		}
		else{
			System.out.println("����������");
		}
	}
}
