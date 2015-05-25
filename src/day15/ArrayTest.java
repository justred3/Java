package day15;

import java.util.Scanner;

/*
 * 判断一个字符串是否是对称字符串
 * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 * 
 * 分析：
 * 		判断一个字符串是否是对称的字符串，我只需要把
 * 			第一个和最后一个比较
 * 			第二个和倒数第二个比较
 * 			...
 */
public class ArrayTest {
	public static void main(String[] args){
		//新建一个Scanner对象，用来接收
		Scanner sc = new Scanner(System.in);
		//提示用户输入
		String receiver = sc.nextLine();
		//将receiver代入方法myReverse
		boolean result = ArrayTest.reverse(receiver);
		//打印结果
		System.out.println(result);
	}

	private static boolean reverse(String receiver) {
		//定义返回值
		boolean flag = true;
		for(int start=0,end = receiver.length()-1;start<=end;start++,end--){
			if(receiver.charAt(start)!=receiver.charAt(end)){
				flag = false;
			}
		}
		return flag;
	}
}
