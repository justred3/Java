package day2;
/*我国最高山峰是珠穆朗玛峰：8848m，我现在有一张足够大的纸张，
 * 厚度为：0.01m。请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?
*/
public class TestWhile {
	public static void main(String[] args){
		double height = 0.01;
		int time = 0;
		while(height<8848){
			height = height*2;
			time+=1;
			System.out.println("折"+time+"数后高度为："+height);
		}
		System.out.println(time);
	}
}
