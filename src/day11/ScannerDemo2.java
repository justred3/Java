package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ������ʽ��
 * 		public boolean hasNextXxx():�ж��Ƿ���ĳ�����͵�Ԫ��
 * 		public Xxx nextXxx():��ȡ��Ԫ��
 * 
 * ��������int���͵ķ�������
 * 		public boolean hasNextInt()
 * 		public int nextInt()
 * 
 * ע�⣺
 * 		InputMismatchException������ĺ�����Ҫ�Ĳ�ƥ��
 */
public class ScannerDemo2 {
	public static void main(String [] args){
		//�½�һ��Scanner����
		Scanner sc = new Scanner(System.in);
		//�ж�������ǲ���int����
		if(sc.hasNextInt()){
			int result = sc.nextInt();
			System.out.println(result);
		}else{
			System.out.println("��������");
		}
		
	}
}
