package day2;
/**
 * ��ҵ��֤
 * @author Administrator
 *
 */
public class HomeWork {
	public static void main(String [] args){
		int x = 1,y = 1;
		//��Ϊ&&ǰ��Ϊtrue�����Բ�ִ�к����䣬Ҳ��y=1;
		if(x++==2 && ++y==2)
		{
			x =7;
		}
		System.out.println("x="+x+",y="+y);
	}
}
