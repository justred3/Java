package day2;
/**
 * 输出1~10，10~1
 * @author Administrator
 *
 */
public class Output1to10 {
	public static void main(String [] args){
		//输出1~10
		for(int x=1;x<11;x++){
			System.out.print(x);
		}
		System.out.println("");
		//输出10~1
		for(int y=10;y>0;y--){
			System.out.print(y);
		}
		//求出1-10之间数据之和
		int sum = 0;
		for(int a=1;a<11;a++){
			sum +=a;
		}
		System.out.println(sum);
		//求出1-100之间偶数和
		int sum1= 0;
		for(int b=2;b<101;b+=2){
			sum1 +=b;
		}
		System.out.println(sum1);
		//求出1-100之间奇数和
		int sum2= 0;
		for(int c=1;c<100;c+=2){
			sum2 +=c;
		}
		System.out.println(sum2);
		//求5的阶乘
		int sum3=1;
		for(int d =5;d>0;d--){
			sum3= sum3*d;
		}
		System.out.println(sum3);
	}
}
