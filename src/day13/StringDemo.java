package day13;

/*
 * String����������ܣ�
 * 
 * �滻���ܣ�
 * String replace(char old,char new)
 * String replace(String old,String new)
 *
 * ȥ���ַ������߿ո�	
 * String trim()
 * 
 * ���ֵ�˳��Ƚ������ַ���  
 * int compareTo(String str)
 * int compareToIgnoreCase(String str)
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "HelloWorld";
		String s2 = s1.replace('o', 'O');
		System.out.println(s2);
		System.out.println("-------------");
		String s3 = "Helloworld";
		String s4 = s3.replaceFirst("Hello", "See");
		System.out.println(s4);
		System.out.println("-------------");

		// ȥ���ַ������߿ո�
		String s5 = " hello world  ";
		String s6 = s5.trim();
		System.out.println("s4:" + s5 + "---");
		System.out.println("s5:" + s6 + "---");
		// ���ֵ�˳��Ƚ������ַ���
		String s7 = "hello";
		String s8 = "hello";
		String s9 = "abc";
		String s10 = "xyz";
		System.out.println(s7.compareTo(s8));// 0
		System.out.println(s7.compareTo(s9));// 7
		System.out.println(s7.compareTo(s10));// -16
	}
}
