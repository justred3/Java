package day6;

/*
 ������д�����
 A:��Ա����������
 int x = 10; //��Ա�����ǻ�������
 Student s = new Student(); //��Ա��������������
 B:һ����ĳ�ʼ������
 ��Ա�����ĳ�ʼ��
 Ĭ�ϳ�ʼ��
 ��ʾ��ʼ��
 ���췽����ʼ��
 C:�Ӹ���ĳ�ʼ��(�ֲ��ʼ��)
 �Ƚ��и����ʼ����Ȼ����������ʼ����

 �����
 YXYZ

 ���⣺
 ��Ȼ�����й��췽��Ĭ����һ��super()
 ��ʼ����ʱ�򣬲��ǰ����Ǹ�˳����еġ�
 ���ǰ��շֲ��ʼ�����еġ�
 ��������ʾҪ�ȳ�ʼ���������ݣ��ٳ�ʼ���������ݡ�
 */
class X {

	X() {
		System.out.print("X");
	}

	Y b = new Y();
}

class Y {
	Y() {
		System.out.print("Y");
	}
}

public class Z extends X {
	
	Z() {
		// super
		System.out.print("Z");
	}
	Y y = new Y();
	

	public static void main(String[] args) {
		new Z();
	}
}
