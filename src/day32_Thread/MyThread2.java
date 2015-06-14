package day32_Thread;

public class MyThread2 extends Thread {

	public MyThread2() {
	}
	
	public MyThread2(String name){
		super(name);
	}

	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			System.out.println(getName() + ":" + x);
		}
	}
}

