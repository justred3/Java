package day32_Thread;


/*
 * A:ͬ����������������˭��?
 * 		�������
 * 
 * B:ͬ�������ĸ�ʽ������������?
 * 		��ͬ���ؼ��ּ��ڷ����ϡ�
 * 
 * 		ͬ��������˭��?
 * 			this
 * 
 * C:��̬����������������?
 * 		��̬��������������˭��?
 * 			����ֽ����ļ�����(����ὲ)
 */
public class SellTicketDemo6 {
	public static void main(String[] args) {
		// ������Դ����
		SellTicket6 st = new SellTicket6();

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