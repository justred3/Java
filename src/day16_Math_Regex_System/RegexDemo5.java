package day16_Math_Regex_System;


/*
 * �ָ����ϰ
 */
public class RegexDemo5 {
	public static void main(String[] args) {
		// ����һ���ַ���
		String s1 = "aa,bb,cc";
		// ֱ�ӷָ�
		String[] str1Array = s1.split(",");
		for (int x = 0; x < str1Array.length; x++) {
			System.out.println(str1Array[x]);
		}
		System.out.println("---------------------");

		String s2 = "aa.bb.cc";
		String[] str2Array = s2.split("\\.");
		for (int x = 0; x < str2Array.length; x++) {
			System.out.println(str2Array[x]);
		}
		System.out.println("---------------------");

		String s3 = "aa    bb                cc";
		String[] str3Array = s3.split(" +");
		for (int x = 0; x < str3Array.length; x++) {
			System.out.println(str3Array[x]);
		}
		System.out.println("---------------------");
		
		//Ӳ���ϵ�·��������Ӧ����\\���\
		//��Ϊ����������\�����Ծ���Ҫ4��\	
		String s4 = "E:\\JavaSE\\day14\\avi";
		String[] str4Array = s4.split("\\\\");
		for (int x = 0; x < str4Array.length; x++) {
			System.out.println(str4Array[x]);
		}
		System.out.println("---------------------");
	}
}