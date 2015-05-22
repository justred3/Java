package day12;

/*
 * 字符串的特点：一旦被赋值，就不能改变。
 */
public class StringDemo1 {
	public static void main(String [] args){
		String s = "Hello";
		s += "World";
		System.out.println("s:"+s);
	}
}
