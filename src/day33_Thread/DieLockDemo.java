package day33_Thread;

/*
 * ͬ���ı׶ˣ�
 * 		A:Ч�ʵ�
 * 		B:���ײ�������
 * 
 * ������
 * 		�������������ϵ��߳���������Դ�Ĺ����У�������һ���໥�ȴ�������
 * 
 * ������
 * 		�й��ˣ������˳Է�������
 * 		���������
 * 			�й���:������֧
 * 			������:���Ͳ�
 * 		���ڣ�
 * 			�й��ˣ�����1֧����һ��
 * 			�����ˣ�����1֧����һ��
 */
public class DieLockDemo {
	public static void main(String[] args) {
		DieLock d1 = new DieLock(true);
		DieLock d2 = new DieLock(false);
		
		d1.start();
		d2.start();
	}
}
