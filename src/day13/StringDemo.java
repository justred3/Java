package day13;

/*
 * String类的其他功能：
 * 
 * 替换功能：
 * String replace(char old,char new)
 * String replace(String old,String new)
 *
 * 去除字符串两边空格	
 * String trim()
 * 
 * 按字典顺序比较两个字符串  
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

		// 去除字符串两边空格
		String s5 = " hello world  ";
		String s6 = s5.trim();
		System.out.println("s4:" + s5 + "---");
		System.out.println("s5:" + s6 + "---");
		// 按字典顺序比较两个字符串
		String s7 = "hello";
		String s8 = "hello";
		String s9 = "abc";
		String s10 = "xyz";
		System.out.println(s7.compareTo(s8));// 0
		System.out.println(s7.compareTo(s9));// 7
		System.out.println(s7.compareTo(s10));// -16
	}
}
