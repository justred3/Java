package day5;
/*
д�����ִ�н����

����ϼ��60�ˣ��Һ�����
����main����
Student ��̬�����
Student ��������
Student ���췽��
Student ��������
Student ���췽��
*/
class Student {
	static {
		System.out.println("Student ��̬�����");
	}
	
	{
		System.out.println("Student ��������");
	}
	
	public Student() {
		System.out.println("Student ���췽��");
	}
}

class StudentDemo {
	static {
		System.out.println("����ϼ��60�ˣ��Һ�����");
	}
	
	public static void main(String[] args) {
		System.out.println("����main����");
		
		Student s1 = new Student();
		Student s2 = new Student();
	}
}