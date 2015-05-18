package day8;
/*
猫狗案例
	具体事物：猫，狗
	共性：姓名，年龄，吃饭

分析：从具体到抽象
	猫:
		成员变量：姓名，年龄
		构造方法：无参，带参
		成员方法：吃饭(猫吃鱼)
		
	狗:
		成员变量：姓名，年龄
		构造方法：无参，带参
		成员方法：吃饭(狗吃肉)
		
	因为有共性的内容，所以就提取了一个父类。动物。
	但是又由于吃饭的内容不一样，所以吃饭的方法是抽象的，
	而方法是抽象的类，类就必须定义为抽象类。
	
	抽象动物类：
		成员变量：姓名，年龄
		构造方法：无参，带参
		成员方法：吃饭();

实现：从抽象到具体
	动物类:
		成员变量：姓名，年龄
		构造方法：无参，带参
		成员方法：吃饭();
		
	狗类：
		继承自动物类
		重写吃饭();
		
	猫类：
		继承自动物类
		重写吃饭();
*/
//定义一个抽象动物类
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
//定义一个猫猫的具体类
class Cat3 extends Animal3{
	public Cat3(){}
	public Cat3(String name,int age){
		super(name,age);
	}
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃鱼");
	}
	
}
//定义一个狗的具体类
class Dog3 extends Animal3{
	public Dog3(){}
	public Dog3(String name,int age){
		super(name,age);
	}
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗吃屎");
	}
}

public class AbstractTest {
	public static void main(String args[]){
		//测试狗类
		//具体类用法
		//方式1：
		Dog3 d = new Dog3();
		d.setName("旺财");
		d.setAge(3);
		System.out.println(d.getName()+"---"+d.getAge());
		d.eat();
		//方式2：
		Dog3 d2 = new Dog3("旺财",3);
		System.out.println(d2.getName()+"---"+d2.getAge());
		d2.eat();
		System.out.println("---------------------------");
		
		Animal3 a = new Dog3();
		a.setName("旺财");
		a.setAge(3);
		System.out.println(a.getName()+"---"+a.getAge());
		a.eat();
		
		Animal3 a2 = new Dog3("旺财",3);
		System.out.println(a2.getName()+"---"+a2.getAge());
		a2.eat();
		
		//练习：测试猫类
	}
	
}
