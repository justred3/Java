package day9_2;

/*
 ��ʽ������
 ��������(̫�򵥣������ҽ���Ҫ�����)
 ��������
 ����:(���������ʱ����ʵ�����Ѿ�������)��Ҫ���Ǹ���Ķ���
 ������:��Ҫ���Ǹó�������������
 �ӿ�
 */
abstract class Person {
	public abstract void study();
}

class PersonDemo {
	public void method(Person p) {// p; p = new Student(); Person p = new
									// Student(); //��̬
		p.study();
	}
}

// ����һ�������ѧ����
class Student extends Person {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class PersonTest {
	public static void main(String[] args) {
		// Ŀǰ��û�а취��ʹ�õ�
		// ��Ϊ������û�ж�Ӧ�ľ�����
		// ��ô�����Ǿ�Ӧ���ȶ���һ��������
		// ������Ҫʹ��PersonDemo���е�method()����
		PersonDemo pd = new PersonDemo();
		Student p = new Student();
		pd.method(p);
	}
}