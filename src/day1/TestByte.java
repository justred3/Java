package day1;

public class TestByte {
	public static void main(String[] args){
		byte b1 = 3, b2 = 4,b;
		//因为两个byte相加有可能超出byte的范围，所以必须加上byte强制转型
		b = (byte) (b1 + b2);
		b = 3+4;
		//因为130已经超出了byte范围，所以必须加上byte强制转型
		byte a = (byte) 130;
		System.out.println(a);
		System.out.println('a');
		System.out.println('a'+0);
		System.out.println('a'+1);
		//先打印字符串，默认后面的都为字符串
		System.out.println("hello"+'a'+1);
		System.out.println('a'+1+"hello");
		System.out.println("5+5="+5+5);
		System.out.println(5+5+"=5+5");
		short s = 1;
		
	}
}
