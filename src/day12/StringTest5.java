package day12;
/*
 * ���󣺰�һ���ַ���������ĸת�ɴ�д������ΪСд��(ֻ����Ӣ�Ĵ�Сд��ĸ�ַ�)
 * ������
 * 		helloWORLD
 * �����
 * 		Helloworld
 * 
 * ������
 * 		A:�Ȼ�ȡ��һ���ַ�
 * 		B:��ȡ���˵�һ���ַ�������ַ�
 * 		C:��Aת�ɴ�д
 * 		D:��Bת��Сд
 * 		E:Cƴ��D
 */
public class StringTest5 {
	public static void main(String [] args){
		//�����ַ���helloWORLD
		String str = "helloWORLD";
		//�Ȼ�ȡ��һ���ַ�������ַ�
		String s1 = str.substring(0, 1);
		//��ȡ���˵�һ���ַ�������ַ�
		String s2 = str.substring(1, str.length());
		//��S1ת���ɴ�д
		String s3 = s1.toUpperCase();
		//��S2ת����Сд
		String s4 = s2.toLowerCase();
		//��s3��s4ƴ������
//		str = s3+s4;
		String s5 = s3.concat(s4);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
}
