package day2;
/**
 * �����ڿ���̨����žų˷���
 * @author Administrator
 *
 */
public class Calculate {
	public static void main(String [] args){
		for(int a = 1;a<=9;a++){
			for(int b =1;b<=a;b++){
				int sum = a*b;
				System.out.print(a+"X"+b+"="+sum+"\t");
			}
			System.out.println("");
		}
	}
}
