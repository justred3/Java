package day2;
/**
 * С��������ÿ�����2.5ԪǮ������������������ǣ�
 * ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ��������Ứȥ6ԪǮ��
 * ���ʣ����������죬С���ſ��Դ浽100ԪǮ��
 * @author Administrator
 *
 */
public class TestBreak {
	public static void main(String [] args){
		//ÿ���2.5Ԫ
		int day = 1;
		for(double sum=2.5;sum<=100;day++,sum+=2.5){
			while(day%5==0){
				sum-=6;
				//���粻��break����dayΪ5ʱ����һֱ��ѭ����������
				break;
			}
			System.out.println("��"+day+"�죬һ������"+sum+"Ԫ");
		}
		System.out.println("һ��Ҫ��"+day+"�죬�ſ��Դ浽100Ԫ");
	}
}
