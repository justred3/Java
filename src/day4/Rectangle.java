package day4;

public class Rectangle {
	//������εĳ���
	private int height;
	//������εĿ��
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
	//����һ���޲������췽��
	public Rectangle(){
	}
	//����һ���вι��췽��
	public Rectangle(int height,int width){
		setHeight(height);
		setWidth(width);
	}
	//����һ������������ε��ܳ�
	public int girth(){
		int height=this.height;
		int width=this.width;
		int girth=(height+width)*2;
		return girth;
	}
	//����һ������������ε����
	public int area(){
		int height=this.height;
		int width=this.width;
		int area = height*width;
		return area;
	}
}
