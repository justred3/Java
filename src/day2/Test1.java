package day2;

public class Test1 {
	public static void main(String[] args){
//		���ڿ���̨�������������������λ��
//		��λ������λ
//		ʮλ����ǧλ
//		��λ+ʮλ+ǧλ+��λ=��λ
		for (int e=10000;e<100000;e++){
			//��λ
			int f=e/10000;
			//ǧλ
			int g=(e-f*10000)/1000;
			//��λ
			int h=(e-f*10000-g*1000)/100;
			//ʮλ
			int i=(e-f*10000-g*1000-h*100)/10;
			//��λ
			int j=e-f*10000-g*1000-h*100-i*10;
			if(j==f&i==g&j+i+f+g==h){
				System.out.println(e);
			}
		}
	}
}
