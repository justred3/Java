package day4;
/*
�ֻ���Ĳ���
*/
public class PhoneDemo {
	public static void main(String[] args){
		//�����ֻ�����
		//���� ������ = new ����();
		Phone p = new Phone();
		//ֱ�������Ա����ֵ
		System.out.println(p.getBrand()+"~~"+p.getPrice()+"~~"+p.getColor());
		//����Ա������ֵ
		p.setBrand("ŵ����");
		p.setPrice(100);
		p.setColor( "��ɫ");
		//�ٴ����
		System.out.println(p.getBrand()+"~~"+p.getPrice()+"~~"+p.getColor());
		//���÷���
		p.call("����ϼ");
		p.sendMessage();
		p.playGame();
	}
}
