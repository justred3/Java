package day2;
/*请统计1-1000之间同时满足如下条件的数据有多少个：
对3整除余2
对5整除余3
对7整除余2*/

public class Test2 {
	public static void main(String [] args){
		for(int a=1;a<=1000;a++){
			if(a%3==2&a%5==3&a%7==2){
				System.out.println(a);
			}
		}
	}
}
