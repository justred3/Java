package day8;
/*
è������
	�������è����
	���ԣ����������䣬�Է�

�������Ӿ��嵽����
	è:
		��Ա����������������
		���췽�����޲Σ�����
		��Ա�������Է�(è����)
		
	��:
		��Ա����������������
		���췽�����޲Σ�����
		��Ա�������Է�(������)
		
	��Ϊ�й��Ե����ݣ����Ծ���ȡ��һ�����ࡣ���
	���������ڳԷ������ݲ�һ�������ԳԷ��ķ����ǳ���ģ�
	�������ǳ�����࣬��ͱ��붨��Ϊ�����ࡣ
	
	�������ࣺ
		��Ա����������������
		���췽�����޲Σ�����
		��Ա�������Է�();

ʵ�֣��ӳ��󵽾���
	������:
		��Ա����������������
		���췽�����޲Σ�����
		��Ա�������Է�();
		
	���ࣺ
		�̳��Զ�����
		��д�Է�();
		
	è�ࣺ
		�̳��Զ�����
		��д�Է�();
*/
//����һ����������
abstract class Animal3{
	private String name;
	private int age;
	public Animal3(){};
	public Animal3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	abstract void eat();
}
//����һ��èè�ľ�����
class Cat3 extends Animal3{
	public Cat3(){}
	public Cat3(String name,int age){
		super(name,age);
	}
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}
	
}
//����һ�����ľ�����
class Dog3 extends Animal3{
	public Dog3(){}
	public Dog3(String name,int age){
		super(name,age);
	}
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("����ʺ");
	}
}

public class AbstractTest {
	public static void main(String args[]){
		//���Թ���
		//�������÷�
		//��ʽ1��
		Dog3 d = new Dog3();
		d.setName("����");
		d.setAge(3);
		System.out.println(d.getName()+"---"+d.getAge());
		d.eat();
		//��ʽ2��
		Dog3 d2 = new Dog3("����",3);
		System.out.println(d2.getName()+"---"+d2.getAge());
		d2.eat();
		System.out.println("---------------------------");
		
		Animal3 a = new Dog3();
		a.setName("����");
		a.setAge(3);
		System.out.println(a.getName()+"---"+a.getAge());
		a.eat();
		
		Animal3 a2 = new Dog3("����",3);
		System.out.println(a2.getName()+"---"+a2.getAge());
		a2.eat();
		
		//��ϰ������è��
	}
	
}
