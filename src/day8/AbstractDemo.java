package day8;

/*
 ������ĸ�����
 ���ﲻӦ�ö���Ϊ����Ķ��������Ҷ����еĳԣ�˯��Ҳ��Ӧ���Ǿ���ġ�
 ���ǰ�һ�����Ǿ���Ĺ��ܳ�Ϊ����Ĺ��ܣ���һ����������г���Ĺ��ܣ���������ǳ����ࡣ

 ��������ص㣺
 A:������ͳ��󷽷�������abstract�ؼ�������
 B:�������в�һ���г��󷽷�,�����г��󷽷�������붨��Ϊ������
 C:�����಻��ʵ����
 ��Ϊ�����Ǿ���ġ�
 �������й��췽�������ǲ���ʵ����?���췽����������ʲô��?
 ����������ʸ������ݵĳ�ʼ��
 D:���������
 a:���������д���󷽷�����������һ�������ࡣ
 b:��д���еĳ��󷽷������ʱ��������һ��������ࡣ

 �������ʵ������ʵ�ǿ����������ʵ�ֵġ��Ƕ�̬�ķ�ʽ��
 Animal a = new Cat();
 */


//abstract class Animal //�������������ʽ
abstract class Animal {
	// ���󷽷�
	// public abstract void eat(){} //�շ�����,����ᱨ�����󷽷�����������
	public abstract void eat();

	public Animal() {
	}
}

// �����ǳ�����
abstract class Dog extends Animal {
}

// �����Ǿ����࣬��д���󷽷�
class Cat extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("è����");
	}
	
	
}

class AbstractDemo {
	public static void main(String[] args) {
		// ��������
		// Animal�ǳ����; �޷�ʵ����
		// Animal a = new Animal();
		// ͨ����̬�ķ�ʽ
		Animal a = new Cat();
		a.eat();
	}
}
