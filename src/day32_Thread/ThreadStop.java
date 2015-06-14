package day32_Thread;

import java.util.Date;

public class ThreadStop extends Thread{

	@Override
	public void run() {
		System.out.println(getName()+"开始执行:"+new Date());
		//我要休息10秒钟，亲，不要打扰我
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("线程被终止了");
			//e.printStackTrace();
		}
		System.out.println(getName()+"结束执行"+new Date());
	}
	
}
