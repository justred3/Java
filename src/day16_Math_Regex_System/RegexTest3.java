package day16_Math_Regex_System;

import java.util.Scanner;

/**
 * ������������ʺţ�ֻ��ʹ��QQ����
 * @author Administrator
 *
 */
public class RegexTest3 {
	public static void main(String[] args){
		//����һ��Scanner����
		Scanner sc = new Scanner(System.in);
		//��ʾ�û�����QQ�����ʺ�
		System.out.println("������QQ���䣺");
		String qq = sc.nextLine();
		System.out.println("checkQQE-mail:"+RegexTest3.checkQQ(qq));
	}

	public static boolean checkQQ(String qq) {
		String Regex = "\\d+@qq\\.\\w+";
		return qq.matches(Regex);
	}
}
