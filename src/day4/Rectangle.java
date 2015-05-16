package day4;

public class Rectangle {
	//定义矩形的长度
	private int height;
	//定义矩形的宽度
	private int width;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	//定义一个无参数构造方法
	public Rectangle(){
	}
	//定义一个有参构造方法
	public Rectangle(int height,int width){
		setHeight(height);
		setWidth(width);
	}
	//定义一个方法计算矩形的周长
	public int girth(){
		int height=this.height;
		int width=this.width;
		int girth=(height+width)*2;
		return girth;
	}
	//定义一个方法计算矩形的面积
	public int area(){
		int height=this.height;
		int width=this.width;
		int area = height*width;
		return area;
	}
}
