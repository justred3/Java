package day1;

public class TestByte {
	public static void main(String[] args){
		byte b1 = 3, b2 = 4,b;
		//��Ϊ����byte����п��ܳ���byte�ķ�Χ�����Ա������byteǿ��ת��
		b = (byte) (b1 + b2);
		b = 3+4;
		//��Ϊ130�Ѿ�������byte��Χ�����Ա������byteǿ��ת��
		byte a = (byte) 130;
		System.out.println(a);
		System.out.println('a');
		System.out.println('a'+0);
		System.out.println('a'+1);
		//�ȴ�ӡ�ַ�����Ĭ�Ϻ���Ķ�Ϊ�ַ���
		System.out.println("hello"+'a'+1);
		System.out.println('a'+1+"hello");
		System.out.println("5+5="+5+5);
		System.out.println(5+5+"=5+5");
		short s = 1;
		
	}
}
