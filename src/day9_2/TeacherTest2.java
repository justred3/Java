package day9_2;

/*
 形式参数：
 基本类型(太简单，不是我今天要讲解的)
 引用类型
 类名:(匿名对象的时候其实我们已经讲过了)需要的是该类的对象
 抽象类:需要的是该抽象的类子类对象
 接口:需要的是该接口的实现类对象
 */
//定义一个爱好的接口
interface Love1 {
	public abstract void love();
}

class LoveDemo1 {
	public void method(Love1 l) { // l; l = new Teacher(); Love l = new
									// Teacher(); 多态
		l.love();
	}
}

// 定义具体类实现接口
class Teacher1 implements Love1 {
	public void love() {
		System.out.println("老师爱学生,爱Java,爱林青霞");
	}
}

class TeacherTest1 {
	public static void main(String[] args) {
		// 需求：我要测试LoveDemo类中的love()方法
		LoveDemo1 ld = new LoveDemo1();
		Love1 l = new Teacher1();
		ld.method(l);
	}
}