package day27_DiGui;

/*
 * �������ô���ʵ����5�Ľ׳ˡ�
 * �����֪ʶҪ֪����
 * 		5! = 1*2*3*4*5
 * 		5! = 5*4!
 * 
 * �м��ַ���ʵ����?
 * 		A:ѭ��ʵ��
 * 		B:�ݹ�ʵ��
 * 			a:���ݹ�Ҫдһ������
 * 			b:��������
 * 			c:����
 */
public class DiGuiDemo2 {
	public static void main(String[] args) {
		int result = 1;
		for (int x = 1; x <= 5; x++) {
			result *= x;
			System.out.println(x);
		}
		System.out.println(result);
		System.out.println(jieCheng(5));
	}

	/*
	 * ���ݹ�Ҫдһ������: ����ֵ���ͣ�int �����б�int n ��������: if(n == 1) {return 1;} ����: if(n !=
	 * 1) {return n*������(n-1);}
	 */
	public static int jieCheng(int n){
		if(n==1){
			return 1;
		}else {
			return n*jieCheng(n-1);
		}
	}
}
