package day2;
/**
 * ���1~10��10~1
 * @author Administrator
 *
 */
public class Output1to10 {
	public static void main(String [] args){
		//���1~10
		for(int x=1;x<11;x++){
			System.out.print(x);
		}
		System.out.println("");
		//���10~1
		for(int y=10;y>0;y--){
			System.out.print(y);
		}
		//���1-10֮������֮��
		int sum = 0;
		for(int a=1;a<11;a++){
			sum +=a;
		}
		System.out.println(sum);
		//���1-100֮��ż����
		int sum1= 0;
		for(int b=2;b<101;b+=2){
			sum1 +=b;
		}
		System.out.println(sum1);
		//���1-100֮��������
		int sum2= 0;
		for(int c=1;c<100;c+=2){
			sum2 +=c;
		}
		System.out.println(sum2);
		//��5�Ľ׳�
		int sum3=1;
		for(int d =5;d>0;d--){
			sum3= sum3*d;
		}
		System.out.println(sum3);
	}
}
