package day9_2;

/*
 ��ʽ������
 ��������(̫�򵥣������ҽ���Ҫ�����)
 ��������
 ����:(���������ʱ����ʵ�����Ѿ�������)��Ҫ���Ǹ���Ķ���
 ������:��Ҫ���Ǹó�������������
 �ӿ�:��Ҫ���Ǹýӿڵ�ʵ�������
 */
//����һ�����õĽӿ�
interface Love1 {
	public abstract void love();
}

class LoveDemo1 {
	public void method(Love1 l) { // l; l = new Teacher(); Love l = new
									// Teacher(); ��̬
		l.love();
	}
}

// ���������ʵ�ֽӿ�
class Teacher1 implements Love1 {
	public void love() {
		System.out.println("��ʦ��ѧ��,��Java,������ϼ");
	}
}

class TeacherTest1 {
	public static void main(String[] args) {
		// ������Ҫ����LoveDemo���е�love()����
		LoveDemo1 ld = new LoveDemo1();
		Love1 l = new Teacher1();
		ld.method(l);
	}
}