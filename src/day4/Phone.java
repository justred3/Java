package day4;
/*
�ֻ����
	���ԣ�Ʒ�ƣ��۸���ɫ...
	��Ϊ����绰�������ţ�����Ϸ...
	
�ֻ��ࣺ
	��Ա������Ʒ�ƣ��۸���ɫ
	��Ա��������绰�������ţ�����Ϸ
*/
public class Phone {
	//Ʒ��
	private String brand;
	//�۸�
	private int price;
	//��ɫ
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
	//��绰�ķ���
	public void call(String name){
		System.out.println("��"+name+"��绰");
	}
	//�����ŵķ���
	public void sendMessage(){
		System.out.println("Ⱥ������");
	}
	//����Ϸ�ķ���
	public void playGame(){
		System.out.println("����Ϸ");
	}
}
