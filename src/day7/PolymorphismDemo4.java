package day7;

/*
 ��̬�ı׶ˣ�
 ����ʹ����������й��ܡ�

 �Ҿ���ʹ����������й���?�в���?
 �С�

 ��ô����?
 A:�������������÷������ɡ�(���ԣ����Ǻܶ�ʱ�򲻺������ң�̫ռ�ڴ���)
 B:�Ѹ��������ǿ��ת��Ϊ��������á�(����ת��)

 ������ת�����⣺
 ����ת�ͣ�
 Fu f = new Zi();
 ����ת�ͣ�
 Zi z = (Zi)f; //Ҫ���f�������ܹ�ת��ΪZi�ġ�
 */
class Fu2 {
	public void show() {
		System.out.println("show fu");
	}
} 

class Zi2 extends Fu2 {
	public void show() {
		System.out.println("show zi");
	}

	public void method() {
		System.out.println("method zi");
	}

}

class PolymorphismDemo4 {
	public static void main(String[] args) {
		// ����
		Fu2 f = new Zi2();
		f.show();
		// f.method();

		// �����������
		// Zi z = new Zi();
		// z.show();
		// z.method();

		// ���ܹ����ӵĶ���ֵ�����ף���ô���ܲ��ܰѸ������ø�ֵ���ӵ�������?
		// ������ԣ���������
		Zi2 z = (Zi2) f;
		z.show();
		z.method();
	}
}