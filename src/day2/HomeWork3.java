package day2;

import java.util.Scanner;

/**
 * 考试成绩分等级。
	90~100	A等。
	80-89	B等。
	70-79	C等。
	60-69	D等。
	60以下	E等。
请根据给定成绩，输出对应的等级。
 * @author Administrator
 *
 */
public class HomeWork3 {
	public static void main(String [] args){
		//请用用户输入成绩
		System.out.println("请用户输入成绩:");
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		if(result>=90&result<=100){
			System.out.println("该成绩为A等");
		}else if(result>=80&result<=89){
			System.out.println("该成绩为B等");
		}else if(result>=70&result<=79){
			System.out.println("该成绩为C等");
		}else if(result>=60&result<=69){
			System.out.println("该成绩为D等");
		}else if(result>=0&result<=59){
			System.out.println("该成绩为E等");
		}else{
			System.out.println("您输入错误");
		}
			
	}
}
