package day2;

import java.util.Scanner;

/**
 * 键盘录入一个数据n(1<=n<=9)，输出对应的nn乘法表
 * @author Administrator
 *
 */
public class TestTable {
	//定义一个方法为乘法表
	private void output(int c){
		for(int a = 1;a<=c;a++){
			for(int b =1;b<=a;b++){
				int sum = a*b;
				System.out.print(a+"X"+b+"="+sum+"\t");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args){
		TestTable test = new TestTable();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		test.output(n);
	}
}

