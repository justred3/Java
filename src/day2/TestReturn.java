package day2;

import java.util.Scanner;

/**
 * 键盘录入两个数据，返回两个数中的较大值
键盘录入两个数据，比较两个数是否相等
键盘录入三个数据，返回三个数中的最大值
 * @author Administrator
 *
 */
public class TestReturn {
	//定义一个方法用来比较两个数之前的较大值，并返回
	public int Compare(int a,int b){
		return (a>b?a:b);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		TestReturn test1 = new TestReturn();
		int h =test1.Compare(numA, numB);
		System.out.println(h);
	}
}
