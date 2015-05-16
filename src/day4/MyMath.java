package day4;
/**
 * 这是一个关于计算的方法集
 * @author 锦B
 * @version v10
 */
public class MyMath {
	//定义一个加法的方法
	/**
	 * 加法的运算
	 * @param a 加数
	 * @param b 被加数
	 * @return  返回a和b相加的结果
	 */
	public int add(int a,int b){
		int result =a+b;
		return result;
	}
	//减法
	/**
	 * 减法的运算
	 * @param a 减数
	 * @param b 被减数
	 * @return 返回a和b相减的结果
	 */
	public int sub(int a,int b){
		int result = a-b;
		return result;
	}
	//乘法
	/**
	 * 乘法的运算
	 * @param a 乘数
	 * @param b 被乘数
	 * @return 返回a和b相乘的结果
	 */
	public int mul(int a,int b){
		int result =a*b;
		return result;
	}
	//除法
	/**
	 * 除法的运算
	 * @param a 
	 * @param b
	 * @return 
	 */
	public int div(int a,int b){
		int result = a/b;
		return result;
	}
}
