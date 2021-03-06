package day36_Pattern_简单工厂模式;
/**
 * 简单工厂模式概述
又叫静态工厂方法模式，它定义一个具体的工厂类负责创建一些类的实例
优点
客户端不需要在负责对象的创建，从而明确了各个类的职责
缺点
这个静态工厂类负责所有对象的创建，如果有新的对象增加，或者某些对象的创建方式不同，就需要不断的修改工厂类，不利于后期的维护

 */
 
public class AnimalDemo {
	public static void main(String[] args) {
		// 具体类调用
		Dog d = new Dog();
		d.eat();
		Cat c = new Cat();
		c.eat();
		System.out.println("------------");

		// 工厂有了后，通过工厂给造
		// Dog dd = AnimalFactory.createDog();
		// Cat cc = AnimalFactory.createCat();
		// dd.eat();
		// cc.eat();
		// System.out.println("------------");

		// 工厂改进后
		Animal a = AnimalFactory.createAnimal("dog");
		a.eat();
		a = AnimalFactory.createAnimal("cat");
		a.eat();

		// NullPointerException
		a = AnimalFactory.createAnimal("pig");
		if (a != null) {
			a.eat();
		} else {
			System.out.println("对不起，暂时不提供这种动物");
		}
	}
}