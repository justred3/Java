package day2;
/*��ͳ��1-1000֮��ͬʱ�������������������ж��ٸ���
��3������2
��5������3
��7������2*/

public class Test2 {
	public static void main(String [] args){
		for(int a=1;a<=1000;a++){
			if(a%3==2&a%5==3&a%7==2){
				System.out.println(a);
			}
		}
	}
}
