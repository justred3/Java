package day7;

/*
 final���������࣬����������

 �ص㣺
 final���������࣬���಻�ܱ��̳С�
 final�������η������÷������ܱ���д��(���ǣ���д)
 final�������α������ñ������ܱ����¸�ֵ����Ϊ���������ʵ������

 ������
 A:����ֵ����
 "hello",10,true
 B:�Զ��峣��
 final int x = 10;
 */

//final class Fu //�޷�������Fu���м̳�

class Fu1 {
	public int num = 10;
	public final int num2 = 20;

	/*
	 * public final void show() {
	 * 
	 * }
	 */
}

class Zi1 extends Fu1 {
	// Zi�е�show()�޷�����Fu�е�show()
	public void show() {
		num = 100;
		System.out.println(num);

		// �޷�Ϊ���ձ���num2����ֵ
		// num2 = 200;
		System.out.println(num2);
	}
}

class FinalDemo {
	public static void main(String[] args) {
		Zi1 z = new Zi1();
		z.show();
	}
}