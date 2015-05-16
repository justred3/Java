package day2;

import java.util.Scanner;

public class CompareNum {
	public static void main(String[] args){
		//请求用户输入第一个数字
		System.out.println("请输入第一个数字:");
		Scanner sc =new Scanner(System.in);
		float x = sc.nextFloat();
		//请求用户输入第二个数字
		System.out.println("请输入第二个数字:");
		float y = sc.nextFloat();
		//请求用户输入第三个数字
		System.out.println("请输入第三个数字:");
		float z = sc.nextFloat();
		float maxNum = (x>y?x:y)>z?(x>y?x:y):z;
		System.out.println("您输入的三个数字中，最大的是：");
		System.out.println(maxNum);
	}
}
