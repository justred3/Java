package day5;

public class CodeDemo {
	public static void main(String[] args) {
		//局部代码块
		{
			int x = 10;
			System.out.println(x);
		}
		//找不到符号
		//System.out.println(x);
		{
			int y = 20;
			System.out.println(y);
		}
		System.out.println("---------------");
		
		Code c = new Code();	
		System.out.println("---------------");
		Code c2 = new Code();
		System.out.println("---------------");
		Code c3 = new Code(1);
	}
}

