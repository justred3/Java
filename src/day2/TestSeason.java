package day2;

import java.util.Scanner;

public class TestSeason {
	public static void main(String [] args){
		//提示用户输入现在的月份
		System.out.println("请输入现在的月份:");
		//定义好接受的对象
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		//分别定义输出的季节
		if(x>=3&x<=5){
			System.out.println("现在是春季");
		}
		else if(x>=6&x<=8){
			System.out.println("现在是夏季");
		}
		else if(x>=9&x<=11){
			System.out.println("现在是秋季");
		}
		else if(x==12|x==1|x==2){
			System.out.println("现在是冬季");
		}
		else{
			System.out.println("您输入有误");
		}
	}
}
