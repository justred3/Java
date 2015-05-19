package day9;

/*
 类与类：
 继承关系,只能单继承,可以多层继承.
 
 类与接口：
 实现关系,可以单实现,也可以多实现。
 并且还可以在继承一个类的同时实现多个接口。
 
 接口与接口：
 继承关系,可以单继承,也可以多继承。
 */
interface Father3 {
	public abstract void show();
}

interface Mother3 {
	public abstract void show2();
}

interface Sister3 extends Father3, Mother3 {

}

// class Son implements Father,Mother //多实现
class Son3 extends Object implements Father3, Mother3 {
	public void show() {
		System.out.println("show son");
	}

	public void show2() {
		System.out.println("show2 son");
	}
}

class InterfaceDemo3 {
	public static void main(String[] args) {
		// 创建对象
		Father3 f = new Son3();
		f.show();
		// f.show2(); //报错

		Mother3 m = new Son3();
		// m.show(); //报错
		m.show2();
	}
}