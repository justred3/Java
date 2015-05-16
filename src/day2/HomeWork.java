package day2;
/**
 * 作业验证
 * @author Administrator
 *
 */
public class HomeWork {
	public static void main(String [] args){
		int x = 1,y = 1;
		//因为&&前面为true，所以不执行后面半句，也就y=1;
		if(x++==2 && ++y==2)
		{
			x =7;
		}
		System.out.println("x="+x+",y="+y);
	}
}
