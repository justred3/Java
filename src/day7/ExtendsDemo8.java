package day7;

/*
 �̳��г�Ա�����Ĺ�ϵ:
 A:�����еķ����͸����еķ���������һ�������̫�򵥡�
 B:�����еķ����͸����еķ�������һ�����������ô����?
 ͨ�����������÷�����
 a:���������У�����û������������о�ʹ��
 b:�ٿ������У���û������������о�ʹ��
 c:���û�оͱ���
 */
class Father {
	public void show() {
		System.out.println("show Father");
	}
}

class Son extends Father {
	public void method() {
		System.out.println("method Son");
	}

	public void show() {
		System.out.println("show Son");
	}
}

class ExtendsDemo8 {
	public static void main(String[] args) {
		// ��������
		Son s = new Son();
		s.show();
		s.method();
		// s.fucntion(); //�Ҳ�������
	}
}