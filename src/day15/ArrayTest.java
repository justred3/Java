package day15;

import java.util.Scanner;

/*
 * �ж�һ���ַ����Ƿ��ǶԳ��ַ���
 * ����"abc"���ǶԳ��ַ�����"aba"��"abba"��"aaa"��"mnanm"�ǶԳ��ַ���
 * 
 * ������
 * 		�ж�һ���ַ����Ƿ��ǶԳƵ��ַ�������ֻ��Ҫ��
 * 			��һ�������һ���Ƚ�
 * 			�ڶ����͵����ڶ����Ƚ�
 * 			...
 */
public class ArrayTest {
	public static void main(String[] args){
		//�½�һ��Scanner������������
		Scanner sc = new Scanner(System.in);
		//��ʾ�û�����
		String receiver = sc.nextLine();
		//��receiver���뷽��myReverse
		boolean result = ArrayTest.reverse(receiver);
		//��ӡ���
		System.out.println(result);
	}

	private static boolean reverse(String receiver) {
		//���巵��ֵ
		boolean flag = true;
		for(int start=0,end = receiver.length()-1;start<=end;start++,end--){
			if(receiver.charAt(start)!=receiver.charAt(end)){
				flag = false;
			}
		}
		return flag;
	}
}
