package day9;

/*
 �����ࣺ
 �̳й�ϵ,ֻ�ܵ��̳�,���Զ��̳�.
 
 ����ӿڣ�
 ʵ�ֹ�ϵ,���Ե�ʵ��,Ҳ���Զ�ʵ�֡�
 ���һ������ڼ̳�һ�����ͬʱʵ�ֶ���ӿڡ�
 
 �ӿ���ӿڣ�
 �̳й�ϵ,���Ե��̳�,Ҳ���Զ�̳С�
 */
interface Father3 {
	public abstract void show();
}

interface Mother3 {
	public abstract void show2();
}

interface Sister3 extends Father3, Mother3 {

}

// class Son implements Father,Mother //��ʵ��
class Son3 extends Object implements Father3, Mother3 {
	public void show() {
		System.out.println("show son");
	}

	public void show2() {
		System.out.println("show2 son");
	}
}

class InterfaceDemo3 {
	public static void main(String[] args) {
		// ��������
		Father3 f = new Son3();
		f.show();
		// f.show2(); //����

		Mother3 m = new Son3();
		// m.show(); //����
		m.show2();
	}
}