package day32_Thread;
/*
 * public static void yield():��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������̡߳� 
 * �ö���̵߳�ִ�и���г�����ǲ��ܿ�����֤һ��һ�Ρ�
 */
public class ThreadYieldDemo {
	public static void main(String[] args) {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();
		
		ty1.setName("����˿");
		ty2.setName("ղ��");
		
		ty1.start();
		ty2.start();
	}
}
