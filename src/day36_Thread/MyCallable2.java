package day36_Thread;

import java.util.concurrent.Callable;

/*
 * �߳���Ͱ���
 */
public class MyCallable2 implements Callable<Integer> {
	private int number;
	
	public MyCallable2(int number){
		this.number = number;
	}
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for(int x =0;x<number;x++){
			sum  += x;
		}
		return sum;
	}

}
