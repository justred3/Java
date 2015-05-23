package day13;

/*
 * ͳ�ƴ���С�����ֵĴ���
 * ������
 * 		���ַ���"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"
 * �����
 * 		java������5��
 * 
 * ������
 * 		ǰ�᣺���Ѿ�֪���˴󴮺�С����
 * 
 * 		A:����һ��ͳ�Ʊ�������ʼ��ֵ��0
 * 		B:���ڴ��в���һ��С����һ�γ��ֵ�λ��
 * 			int indexOf(String str):����ָ���ַ����ڴ��ַ����е�һ�γ��ִ���������
 * 			String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ���,Ĭ�ϵ�ĩβ��
 * 			a:������-1��˵���������ˣ��ͷ���ͳ�Ʊ���
 * 			b:��������-1��˵�����ڣ�ͳ�Ʊ���++s
 * 		C:�Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡ��һ�εĴ󴮣�����һ���µ��ַ��������Ѹ��ַ�����ֵ���¸�ֵ����
 * 		D:�ص�B
 */
public class StringTest4 {
	public static void main(String[] args) {
		// �����
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		// ����С��
		String minString = "java";

		// д����ʵ��
		int count = getCount(maxString, minString);
		System.out.println("Java�ڴ��г����ˣ�" + count + "��");
	}

	/*
	 * ������ȷ�� ����ֵ���ͣ�int �����б������ַ���
	 */
	public static int getCount(String maxString, String minString) {
		// ����һ��ͳ�Ʊ�������ʼ��ֵ��0
		int count = 0;

		// ���ڴ��в���һ��С����һ�γ��ֵ�λ��
		int index = maxString.indexOf(minString);

		// ��������-1��˵�����ڣ�ͳ�Ʊ���++
		while (index != -1) {
			count++;
			// �Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡ��һ�εĴ󴮣�����һ���µ��ַ��������Ѹ��ַ�����ֵ���¸�ֵ����
			int startIndex = index + minString.length();
			maxString = maxString.substring(startIndex);
			// ������
			index = maxString.indexOf(minString);
		}

		return count;
	}
}
//public class StringTest4 {
//	// ����һ��ͳ�Ʊ���
//	public static void main(String[] args) {
//		int result = 0;
//		String big = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
//		String small = "java";
//		while (true) {
//			int index = big.indexOf(small);
//			if(index==-1){
//				break;
//			}
//			big = big.substring(index + 4);
//			result++;
//			
//		}
//		System.out.println(big);
//		System.out.println(result);
//	}
//
//}
