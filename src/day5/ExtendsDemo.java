package day5;
/*
�̳и�����
	�Ѷ��������ͬ�����ݸ���ȡ�������嵽һ�����С�
	
���ʵ�ּ̳���?	
	Java�ṩ�˹ؼ��֣�extends
	
��ʽ��
	class ������ extends ������ {}
	
�ô���
	A:����˴���ĸ�����
	B:����˴����ά����
	C:��������֮������˹�ϵ���Ƕ�̬��ǰ��

����������˹�ϵ����ʵҲ�Ǽ̳е�һ���׶ˣ�
	����������ǿ�ˡ�
	
	������ԭ�򣺵���ϣ����ھۡ�
	��ϣ�������Ĺ�ϵ
	�ھۣ������Լ����ĳ�����������
*/

public class ExtendsDemo {
	public static void main(String[] args){
	Teacher t = new Teacher();
	t.sleep();
	t.eat();
	Student1 s =new Student1();
	s.eat();
	s.sleep();
	}
}

class Teacher extends Person{}

class Student1 extends Person{}

class Person{
	public void sleep(){
		System.out.println("˯��");
	}
	public void eat(){
		System.out.println("�Է�");
	}
}