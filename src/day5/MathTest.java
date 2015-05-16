package day5;
/**
 * 通过API学习Math，并对一部分进行使用
 * @author Administrator
 *
 */
public class MathTest {
	public static void main(String[] args){
		int a =10;
		//求A的立方根
		System.out.println(Math.cbrt(a));
		//求A的平方根
		System.out.println(Math.sqrt(a));
		//随机输出一个数字
		System.out.println(Math.random());
		//随机输出一个数字位于1~100之间的
		int number = (int)(Math.random()*100)+1;
		System.out.println(number);
		
	}
}