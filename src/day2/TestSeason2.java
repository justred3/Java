package day2;

import java.util.Scanner;

/**
 * 使用switch语句进行季节的判定
 * @author Administrator
 *
 */
public class TestSeason2 {
	public static void main(String [] args){
		System.out.println("请输入当前月份");
		//定义Scanner对象，接受用户输入
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch(x){
		case 3:
		case 4:
		case 5:
			System.out.println("现在是春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("现在是夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("现在是秋季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("现在是冬季");
			break;
		default:
			System.out.println("您的输入有误");
		}
	}
}
