package day2;

import java.util.Scanner;

/**
 * ����¼��һ������n(1<=n<=9)�������Ӧ��nn�˷���
 * @author Administrator
 *
 */
public class TestTable {
	//����һ������Ϊ�˷���
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

