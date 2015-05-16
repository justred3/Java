package day2;

public class Test1 {
	public static void main(String[] args){
//		请在控制台输出满足如下条件的五位数
//		个位等于万位
//		十位等于千位
//		个位+十位+千位+万位=百位
		for (int e=10000;e<100000;e++){
			//万位
			int f=e/10000;
			//千位
			int g=(e-f*10000)/1000;
			//百位
			int h=(e-f*10000-g*1000)/100;
			//十位
			int i=(e-f*10000-g*1000-h*100)/10;
			//个位
			int j=e-f*10000-g*1000-h*100-i*10;
			if(j==f&i==g&j+i+f+g==h){
				System.out.println(e);
			}
		}
	}
}
