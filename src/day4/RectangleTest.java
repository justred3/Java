package day4;

import java.util.Scanner;

public class RectangleTest {
	public static void main(String[] args){
		//�½�һ��Scanner�������������û�����
		Scanner sc = new Scanner(System.in);
		//��ʾ�û��������
		System.out.println("��������εĳ�:");
		int height = sc.nextInt();
		System.out.println("��������εĿ�:");
		int width = sc.nextInt();
		//�½�Rectangle����
		Rectangle test = new Rectangle(height,width);
		//����girth�������ܳ�
		System.out.println("�þ��ε��ܳ�Ϊ��"+test.girth());
		//����area���������
		System.out.println("�þ��ε����Ϊ:"+test.area());
		
	}
}
