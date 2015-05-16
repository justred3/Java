package day6;
/**
 * 不仅要输出局部变量的num,还要输出成员变量的num。还要输出父类的成员变量
 * @author Administrator
 *this和super的区别
 *this代表本类对应的引用
 *sper代表父类存储空间的标识（可以理解为父类引用，可以操作父类的成员
 */
public class ExtendsDemo5 {
	public static void main(String[] args){
		Son1 s = new Son1();
		s.show();
	}
}
class Father1{
	public int num = 10;
}
class Son1 extends Father1{
	public int num = 20;
	
	public void show(){
		int num = 30;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}
