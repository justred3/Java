package day5;

import java.util.Scanner;

/*猜数字小游戏(数据在1-10之间)
分析：
	A:程序产生一个随机数。(被猜的)
	B:键盘录入数据。(你猜的)
	C:把你猜的和被猜的进行比较
		a:大了
		b:小了
		c:猜中了
	D:给出多次猜的机会，猜中就结束。
		while()循环，猜中就break*/
public class GuessNumber {
	public static void main(String args[]){
		//程序产生一个随机数
		int answer = (int)(Math.random()*10+1);
		while(true){
		//键盘录入数据
		Scanner sc = new Scanner(System.in);
		int content = sc.nextInt();
		//比较数据
		if(content>answer){
			System.out.println("猜大了");
		}else if(content<answer){
			System.out.println("猜小了");
		}else{
			System.out.println("你猜对了");
			break;
		}
		}
	}
}
