package day2;
/**
 * 小芳的妈妈每天给她2.5元钱，她都会存起来，但是，
 * 每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，
 * 请问，经过多少天，小芳才可以存到100元钱。
 * @author Administrator
 *
 */
public class TestBreak {
	public static void main(String [] args){
		//每天给2.5元
		int day = 1;
		for(double sum=2.5;sum<=100;day++,sum+=2.5){
			while(day%5==0){
				sum-=6;
				//假如不加break，当day为5时，就一直在循环，跳不出
				break;
			}
			System.out.println("第"+day+"天，一共存了"+sum+"元");
		}
		System.out.println("一共要用"+day+"天，才可以存到100元");
	}
}
