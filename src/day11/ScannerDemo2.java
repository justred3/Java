package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 基本格式：
 * 		public boolean hasNextXxx():判断是否是某种类型的元素
 * 		public Xxx nextXxx():获取该元素
 * 
 * 举例：用int类型的方法举例
 * 		public boolean hasNextInt()
 * 		public int nextInt()
 * 
 * 注意：
 * 		InputMismatchException：输入的和你想要的不匹配
 */
public class ScannerDemo2 {
	public static void main(String [] args){
		//新建一个Scanner对象
		Scanner sc = new Scanner(System.in);
		//判断输入的是不是int类型
		if(sc.hasNextInt()){
			int result = sc.nextInt();
			System.out.println(result);
		}else{
			System.out.println("输入有误");
		}
		
	}
}
