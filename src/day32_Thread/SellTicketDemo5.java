package day32_Thread;


/*
 * ������
 * 		���ϲ�����
 * 
 * ͬ�����ص㣺
 * 		ǰ�᣺
 * 			����߳�
 *		��������ʱ��Ҫע�⣺
 *			����߳�ʹ�õ���ͬһ��������
 * ͬ���ĺô� 
 *		ͬ���ĳ��ֽ���˶��̵߳İ�ȫ���⡣
 * ͬ���ı׶�
 *		���߳��൱��ʱ����Ϊÿ���̶߳���ȥ�ж�ͬ���ϵ��������Ǻܺķ���Դ�ģ������лή�ͳ��������Ч�ʡ�
 */
public class SellTicketDemo5 {
	public static void main(String[] args) {
		// ������Դ����
		SellTicket5 st = new SellTicket5();

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