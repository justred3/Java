package day16;

import java.util.Scanner;

/*
 * ������ʽ������һ��������ַ�����
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("���������QQ���룺");
		String qq = sc.nextLine();
		System.out.println("check:QQ:" + checkQQ(qq));
	}

	public static boolean checkQQ(String qq) {
		// TODO Auto-generated method stub
		return qq.matches("[1-9]\\d{4,14}");
	}
}
