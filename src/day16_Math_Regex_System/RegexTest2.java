package day16_Math_Regex_System;


import java.util.Arrays;

/*
 * ��������һ���ַ���:"91 27 46 38 50"
 * ��д����ʵ�������������ǣ�"27 38 46 50 91"
 * 
 * ������
 * 		A:����һ���ַ���
 * 		B:���ַ������зָ�õ�һ���ַ�������
 * 		C:���ַ�������任��int����
 * 		D:��int��������
 * 		E:��������int��������װ��һ���ַ���
 * 		F:����ַ���
 */
public class RegexTest2 {
	public static void main(String[] args) {
		// ����һ���ַ���
		String s = "91 27 46 38 50";

		// ���ַ������зָ�õ�һ���ַ�������
		String[] strArray = s.split(" ");

		// ���ַ�������任��int����
		int[] arr = new int[strArray.length];

		for (int x = 0; x < arr.length; x++) {
			arr[x] = Integer.parseInt(strArray[x]);
		}

		// ��int��������
		Arrays.sort(arr);

		// ��������int��������װ��һ���ַ���
		StringBuilder sb = new StringBuilder();
		for (int x = 0; x < arr.length; x++) {
			sb.append(arr[x]).append(" ");
		}
		//ת��Ϊ�ַ���
		// String trim()  �����ַ����ĸ���������ǰ���հ׺�β���հס� 
		String result = sb.toString().trim();
		
		//����ַ���
		System.out.println("result:"+result);
	}
}
