package day32_Thread;

/*
 * ʵ��Runnable�ӿڵķ�ʽʵ��
 */
public class SellTicketDemo2 {
	public static void main(String[] args) {
		// ������Դ����
		SellTicket2 st = new SellTicket2();

		// ���������̶߳���
		Thread t1 = new Thread(st, "����1");
		Thread t2 = new Thread(st, "����2");
		Thread t3 = new Thread(st, "����3");

		// �����߳�
		t1.start();
		t2.start();
		t3.start();
	}
}