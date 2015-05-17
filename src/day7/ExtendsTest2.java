package day7;
/*
猫狗案例讲解

先找到具体的事物，然后发现具体的事物有共性，才提取出一个父类。

猫：
	成员变量：姓名，年龄，颜色
	构造方法：无参，带参
	成员方法：
		getXxx()/setXxx()
		eat()
		palyGame()
狗：
	成员变量：姓名，年龄，颜色
	构造方法：无参，带参
	成员方法：
		getXxx()/setXxx()
		eat()
		lookDoor()
		
共性：
	成员变量：姓名，年龄，颜色
	构造方法：无参，带参
	成员方法：
		getXxx()/setXxx()
		eat()
		
把共性定义到一个类中，这个类的名字叫：动物。
动物类：
	成员变量：姓名，年龄，颜色
	构造方法：无参，带参
	成员方法：
		getXxx()/setXxx()
		eat()
		
	猫：	
		构造方法：无参，带参
		成员方法：palyGame()
	狗：
		构造方法：无参，带参
		成员方法：lookDoor()
		*/
class Animal{
	private String name;
	private int age;
	private String color;
	Animal(){
		
	}
	Animal(String name,int age,String color){
		this.name=name;
		this.age=age;
		this.color=color;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//共同的特点，就是吃
	public void eat(){
		System.out.println("Animal like eating");
	}
	
}
class Cat extends Animal{
	Cat(){
		
	}
	Cat(String name,int age,String color){
		super.setAge(age);
		super.setName(name);
		super.setColor(color);
	}
	public void playGame(){
		System.out.println("Cat always love game");
	}
}

class Dog extends Animal{
	Dog(){
		
	}
	Dog(String name,int age,String color){
		super.setAge(age);
		super.setColor(color);
		super.setName(name);
	}
	public void lookDoor(){
		System.out.println("Dog can lookDoor");
	}
}
	public class ExtendsTest2 {
		public static void main(String ages[]){
			//测试猫
			//方式1
			Cat c1 = new Cat();
			c1.setName("Tom");
			c1.setAge(3);
			c1.setColor("白色");
			System.out.println("猫的名字是："+c1.getName()+";年龄是："+c1.getAge()+";颜色是："+c1.getColor());
			c1.eat();
			c1.playGame();
			System.out.println("---------------");
			
			//方式2
			Cat c2 = new Cat("杰瑞",5,"土豪金");
			System.out.println("猫的名字是："+c2.getName()+";年龄是："+c2.getAge()+";颜色是："+c2.getColor());
			c2.eat();
			c2.playGame();
			
			//作业：测试狗
		}
}
