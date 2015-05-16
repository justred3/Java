package day4;

import java.util.Scanner;

public class DemoTest {
	public static void main(String[] args){
		//新建一个Scanner对象用来接受用户的输入
		Scanner sc= new Scanner(System.in);
		//提示用户输入两个数
		System.out.println("请输入第一个数:");
		int num1= sc.nextInt();
		System.out.println("请输入第二个数:");
		int num2= sc.nextInt();
		//新建Demo对象
		Demo test = new Demo();
		System.out.println(test.add(num1, num2));
	}
}
