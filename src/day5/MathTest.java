package day5;
/**
 * ͨ��APIѧϰMath������һ���ֽ���ʹ��
 * @author Administrator
 *
 */
public class MathTest {
	public static void main(String[] args){
		int a =10;
		//��A��������
		System.out.println(Math.cbrt(a));
		//��A��ƽ����
		System.out.println(Math.sqrt(a));
		//������һ������
		System.out.println(Math.random());
		//������һ������λ��1~100֮���
		int number = (int)(Math.random()*100)+1;
		System.out.println(number);
		
	}
}