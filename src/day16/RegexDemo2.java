package day16;

import java.util.Scanner;

/*
 * 正则表达式：符合一定规则的字符串。
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的QQ号码：");
		String qq = sc.nextLine();
		System.out.println("check:QQ:" + checkQQ(qq));
	}

	public static boolean checkQQ(String qq) {
		// TODO Auto-generated method stub
		return qq.matches("[1-9]\\d{4,14}");
	}
}
