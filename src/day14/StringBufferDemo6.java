package day14;
/*
 * StringBuffer的截取功能:注意返回值类型不再是StringBuffer本身了
 * public String substring(int start)
 * public String substring(int start,int end)
 */
public class StringBufferDemo6 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("学习java最重要是坚持");
		String s1 = sb.substring(2);
		String s2 = sb.substring(2,6);
		System.out.println(s1);
		System.out.println(s2);
	}
}
