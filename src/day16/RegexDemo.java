package day16;

import java.util.Scanner;

/*
 * 校验qq号码.
 * 		1:要求必须是5-15位数字
 * 		2:0不能开头
 * 
 * 分析：
 * 		A:键盘录入一个QQ号码
 * 		B:写一个功能实现校验
 * 		C:调用功能，输出结果。
 */
public class RegexDemo {
	public static void main(String[] args) {
		// 新建一个对象用来接受用户输入
		Scanner sc = new Scanner(System.in);
		// 提示用户输入QQ号码
		System.out.println("请输入你的QQ号码：");
		// 接受用户的输入
		String qq = sc.nextLine();
		System.out.println("checkQQ:" + checkQQ(qq));
	}

	/**
	 * 写一个功能实现校验
	 * 
	 * @param qq
	 * @return
	 */
	public static boolean checkQQ(String qq) {
		boolean flag = true;
		// 检验长度
		if (qq.length() >= 5 && qq.length() <= 15) {
			// 0不能开头
			if (!qq.startsWith("0")) {
				// 必须是数字
				char arr[] = qq.toCharArray();
				for (int a = 0; a < arr.length; a++) {
					char ch = arr[a];
					if (!Character.isDigit(ch)) {
						flag = false;
						break;
					}

				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}
		return flag;
	}

}
