package day4;

import java.util.Scanner;

public class RectangleTest {
	public static void main(String[] args){
		//新建一个Scanner对象用来接受用户输入
		Scanner sc = new Scanner(System.in);
		//提示用户输入参数
		System.out.println("请输入矩形的长:");
		int height = sc.nextInt();
		System.out.println("请输入矩形的宽:");
		int width = sc.nextInt();
		//新建Rectangle对象
		Rectangle test = new Rectangle(height,width);
		//调用girth方法求周长
		System.out.println("该矩形的周长为："+test.girth());
		//调用area方法求面积
		System.out.println("该矩形的面积为:"+test.area());
		
	}
}
