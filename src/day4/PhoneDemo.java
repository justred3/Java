package day4;
/*
手机类的测试
*/
public class PhoneDemo {
	public static void main(String[] args){
		//创建手机对象
		//类名 对象名 = new 类名();
		Phone p = new Phone();
		//直接输出成员变量值
		System.out.println(p.getBrand()+"~~"+p.getPrice()+"~~"+p.getColor());
		//给成员变量赋值
		p.setBrand("诺基亚");
		p.setPrice(100);
		p.setColor( "灰色");
		//再次输出
		System.out.println(p.getBrand()+"~~"+p.getPrice()+"~~"+p.getColor());
		//调用方法
		p.call("林青霞");
		p.sendMessage();
		p.playGame();
	}
}
