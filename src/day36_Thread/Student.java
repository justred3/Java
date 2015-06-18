package day36_Thread;

public class Student {
	String name;
	int age;
	boolean flag;

	public synchronized void set(String name, int age) {
		// 如果有数据，就等待
		if (this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// 设置数据
		this.name = name;
		this.age = age;

		// 修改标记
		this.flag = true;
		this.notify();
	}

	public synchronized void get() {
		// 如果没有数据，就等待
		if (!this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// 获取数据
		System.out.println(this.name + "---" + this.age);

		// 修改标记
		this.flag = false;
		this.notify();
	}
}
