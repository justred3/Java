package day32_Thread;

/*
 * public final void stop():���߳�ֹͣ����ʱ�ˣ����ǻ�����ʹ�á�
 * public void interrupt():�ж��̡߳� ���̵߳�״̬��ֹ�����׳�һ��InterruptedException��
 */
public class ThreadStopDemo {
	public static void main(String[] args){
		ThreadStop ts = new ThreadStop();
		ts.setName("������");
		ts.start();
		
		//�㳬�����벻�ѹ������Ҿ͸�����
		try {
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"��ʼ����");
			ts.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
