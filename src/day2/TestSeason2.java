package day2;

import java.util.Scanner;

/**
 * ʹ��switch�����м��ڵ��ж�
 * @author Administrator
 *
 */
public class TestSeason2 {
	public static void main(String [] args){
		System.out.println("�����뵱ǰ�·�");
		//����Scanner���󣬽����û�����
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch(x){
		case 3:
		case 4:
		case 5:
			System.out.println("�����Ǵ���");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�������ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�������＾");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("�����Ƕ���");
			break;
		default:
			System.out.println("������������");
		}
	}
}
