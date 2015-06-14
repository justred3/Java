package day32_Thread;
/*
 * public final void join():等待该线程终止。 
 */
public class ThreadJoinDemo {
	public static void main(String[] args){
		ThreadJoin tj1 = new ThreadJoin();
		ThreadJoin tj2 = new ThreadJoin();
		ThreadJoin tj3 = new ThreadJoin();
		
		tj1.setName("艾弗森");
		tj2.setName("董建华");
		tj3.setName("詹狗");
		
		tj1.start();
		
		try{
			tj1.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		tj2.start();
		tj3.start();
	}
}
