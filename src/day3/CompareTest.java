package day3;

import java.util.Scanner;

public class CompareTest {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//提示用户输入数字
		System.out.println("请输入第一个数:");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个数:");
		int num2 = sc.nextInt();
		System.out.println(compareNum(num1,num2));
	}
	//定义一个方法来比较来个数
		private static boolean compareNum(int a,int b){
		//为什么可以直接写上a==b,因为==本身就是一个比较运算符，得出是一个boolean数值
		return a==b;
	} 
}
