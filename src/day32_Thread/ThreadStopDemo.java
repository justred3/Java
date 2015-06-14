package day32_Thread;

/*
 * public final void stop():让线程停止，过时了，但是还可以使用。
 * public void interrupt():中断线程。 把线程的状态终止，并抛出一个InterruptedException。
 */
public class ThreadStopDemo {
	public static void main(String[] args){
		ThreadStop ts = new ThreadStop();
		ts.setName("何力文");
		ts.start();
		
		//你超过三秒不醒过来，我就干死你
		try {
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"开始发力");
			ts.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
