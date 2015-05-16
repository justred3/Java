package day4;
/*
手机事物：
	属性：品牌，价格，颜色...
	行为：打电话，发短信，玩游戏...
	
手机类：
	成员变量：品牌，价格，颜色
	成员方法：打电话，发短信，玩游戏
*/
public class Phone {
	//品牌
	private String brand;
	//价格
	private int price;
	//颜色
	private String color;
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//打电话的方法
	public void call(String name){
		System.out.println("给"+name+"打电话");
	}
	//发短信的方法
	public void sendMessage(){
		System.out.println("群发短信");
	}
	//玩游戏的方法
	public void playGame(){
		System.out.println("玩游戏");
	}
}
