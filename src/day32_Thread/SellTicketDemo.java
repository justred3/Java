package day32_Thread;
/*
 * ĳ��ӰԺĿǰ������ӳ�����Ƭ(�����,�����´���ؾ���)������100��Ʊ��
 * ������3����Ʊ������Ʊ�������һ������ģ��õ�ӰԺ��Ʊ��
 * �̳�Thread����ʵ�֡�
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket st1 = new SellTicket();
		SellTicket st2 = new SellTicket();
		SellTicket st3 = new SellTicket();
		
		st1.setName("����ɭ");
		st2.setName("�ǵ�");
		st3.setName("����");
		
		st1.start();
		st2.start();
		st3.start();
	}
}
