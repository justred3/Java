package day36_Thread;

public class GetThread implements Runnable {
	private Student s ;
	
	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while(true){
			s.get();
		}
	}
	
}