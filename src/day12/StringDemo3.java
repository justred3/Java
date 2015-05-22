package day12;
/*
 * 看程序写结果
 */
public class StringDemo3 {
	public static void main(String [] args){
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1 ==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("Hello");
		String s4 = "hello";
		System.out.println(s3 ==s4);
		System.out.println(s3.equals(s4));
		
		String s5 = "Hello";
		String s6 = "Hello";
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
	}
}
