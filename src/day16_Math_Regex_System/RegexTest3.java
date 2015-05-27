package day16_Math_Regex_System;

import java.util.Scanner;

/**
 * 检验你的邮箱帐号，只能使用QQ邮箱
 * @author Administrator
 *
 */
public class RegexTest3 {
	public static void main(String[] args){
		//创建一个Scanner对象
		Scanner sc = new Scanner(System.in);
		//提示用户输入QQ邮箱帐号
		System.out.println("请输入QQ邮箱：");
		String qq = sc.nextLine();
		System.out.println("checkQQE-mail:"+RegexTest3.checkQQ(qq));
	}

	public static boolean checkQQ(String qq) {
		String Regex = "\\d+@qq\\.\\w+";
		return qq.matches(Regex);
	}
}
