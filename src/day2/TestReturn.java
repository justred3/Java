package day2;

import java.util.Scanner;

/**
 * ����¼���������ݣ������������еĽϴ�ֵ
����¼���������ݣ��Ƚ��������Ƿ����
����¼���������ݣ������������е����ֵ
 * @author Administrator
 *
 */
public class TestReturn {
	//����һ�����������Ƚ�������֮ǰ�Ľϴ�ֵ��������
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
