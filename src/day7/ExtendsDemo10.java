package day7;

/*
 ������д��ע������
 A:������˽�з������ܱ���д
 ��Ϊ����˽�з�������������޷��̳�
 B:������д���෽��ʱ������Ȩ�޲��ܸ���
 ��þ�һ��
 C:���ྲ̬����������Ҳ����ͨ����̬����������д
 ��ʵ����㲻�Ϸ�����д����������ȷʵ��ˣ�����Ϊʲô�㲻�Ϸ�����д����̬���һὲ��

 ������д���෽����ʱ���������һģһ����
 */
class Father1 {
	// private void show() {}

	/*
	 * public void show() { System.out.println("show Father"); }
	 */

	void show() {
		System.out.println("show Father");
	}

	/*
	 * public static void method() {
	 * 
	 * }
	 */

	public static void method() {

	}
}

class Son1 extends Father1 {
	// private void show() {}

	/*
	 * public void show() { System.out.println("show Son"); }
	 */

	public void show() {
		System.out.println("show Son");
	}

	public static void method() {

	}

	/*
	 * public void method() {
	 * 
	 * }
	 */
}

class ExtendsDemo10 {
	public static void main(String[] args) {
		Son1 s = new Son1();
		s.show();
	}
}