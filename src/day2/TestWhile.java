package day2;
/*�ҹ����ɽ������������壺8848m����������һ���㹻���ֽ�ţ�
 * ���Ϊ��0.01m�����ʣ����۵����ٴΣ��Ϳ��Ա�֤��Ȳ��������������ĸ߶�?
*/
public class TestWhile {
	public static void main(String[] args){
		double height = 0.01;
		int time = 0;
		while(height<8848){
			height = height*2;
			time+=1;
			System.out.println("��"+time+"����߶�Ϊ��"+height);
		}
		System.out.println(time);
	}
}
