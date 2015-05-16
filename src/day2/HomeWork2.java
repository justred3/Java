package day2;
/**
 * 
 * @author Administrator
 *
 */
public class HomeWork2 {
	public static void main(String [] args){

		int x = 1,y = 1;
		//同理，||左边的通过后，右边的不执行，即y依然为1。
		if(x++==1 || ++y==1)
		{
			x =7;
		}
		System.out.println("x="+x+",y="+y);


	}
}
