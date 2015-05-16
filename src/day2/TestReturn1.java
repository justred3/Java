package day2;

import java.util.Scanner;

/**
 * 键盘录入两个数据，比较两个数是否相等
 * @author Administrator
 *
 */
public class TestReturn1 {
	public static void main(String[] args){
	//输入两个数
		System.out.println("请输入第一个数：");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("请输入第二个数：");
		int num2 = sc.nextInt();
		TestReturn1 test1 = new TestReturn1();
		boolean resume =test1.Compare(num1, num2);
		System.out.println(resume);
	}
	
	//定义一个方法比较两个数是否相等，并返回结果
	private boolean Compare(int a,int b){
		return (a==b);
	}
	private boolean Compare(double a,double b){
		return (a==b);
	}
}
