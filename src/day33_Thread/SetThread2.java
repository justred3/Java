package day33_Thread;

public class SetThread2 implements Runnable {

	private Student s;
	private int x = 0;

	public SetThread2(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if (x % 2 == 0) {
					s.name = "林青霞";//刚走到这里，就被别人抢到了执行权
					s.age = 27;
				} else {
					s.name = "刘意"; //刚走到这里，就被别人抢到了执行权
					s.age = 30;
				}
				x++;
			}
		}
	}
}