package day36_Pattern_����ģʽ;

public class Student {
	// ����˽��
	private Student() {
	}

	// �Լ���һ��
	// ��̬����ֻ�ܷ��ʾ�̬��Ա�������Ӿ�̬
	// Ϊ�˲������ֱ�ӷ����޸����ֵ����private
	private static Student s = new Student();

	// �ṩ�����ķ��ʷ�ʽ
	// Ϊ�˱�֤����ܹ�ֱ��ʹ�ø÷������Ӿ�̬
	public static Student getStudent() {
		return s;
	}
}
