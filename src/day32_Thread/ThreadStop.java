package day32_Thread;

import java.util.Date;

public class ThreadStop extends Thread{

	@Override
	public void run() {
		System.out.println(getName()+"��ʼִ��:"+new Date());
		//��Ҫ��Ϣ10���ӣ��ף���Ҫ������
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("�̱߳���ֹ��");
			//e.printStackTrace();
		}
		System.out.println(getName()+"����ִ��"+new Date());
	}
	
}
