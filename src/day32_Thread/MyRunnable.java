package day32_Thread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int x = 0;x<100;x++){
			//����ʵ�ֽӿڵķ�ʽ�Ͳ���ֱ��ʹ��Thread��ķ����ˣ����ǿ��Լ�ӵ�ʹ��
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
	}

}
