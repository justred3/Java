package day12;
/*
 * 需求：把一个字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
 * 举例：
 * 		helloWORLD
 * 结果：
 * 		Helloworld
 * 
 * 分析：
 * 		A:先获取第一个字符
 * 		B:获取除了第一个字符以外的字符
 * 		C:把A转成大写
 * 		D:把B转成小写
 * 		E:C拼接D
 */
public class StringTest5 {
	public static void main(String [] args){
		//定义字符串helloWORLD
		String str = "helloWORLD";
		//先获取第一个字符以外的字符
		String s1 = str.substring(0, 1);
		//获取除了第一个字符以外的字符
		String s2 = str.substring(1, str.length());
		//将S1转换成大写
		String s3 = s1.toUpperCase();
		//将S2转换成小写
		String s4 = s2.toLowerCase();
		//将s3和s4拼接起来
//		str = s3+s4;
		String s5 = s3.concat(s4);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
}
