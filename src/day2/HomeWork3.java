package day2;

import java.util.Scanner;

/**
 * ���Գɼ��ֵȼ���
	90~100	A�ȡ�
	80-89	B�ȡ�
	70-79	C�ȡ�
	60-69	D�ȡ�
	60����	E�ȡ�
����ݸ����ɼ��������Ӧ�ĵȼ���
 * @author Administrator
 *
 */
public class HomeWork3 {
	public static void main(String [] args){
		//�����û�����ɼ�
		System.out.println("���û�����ɼ�:");
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		if(result>=90&result<=100){
			System.out.println("�óɼ�ΪA��");
		}else if(result>=80&result<=89){
			System.out.println("�óɼ�ΪB��");
		}else if(result>=70&result<=79){
			System.out.println("�óɼ�ΪC��");
		}else if(result>=60&result<=69){
			System.out.println("�óɼ�ΪD��");
		}else if(result>=0&result<=59){
			System.out.println("�óɼ�ΪE��");
		}else{
			System.out.println("���������");
		}
			
	}
}
