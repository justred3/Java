package day14;
/*
 * StringBuffer�Ľ�ȡ����:ע�ⷵ��ֵ���Ͳ�����StringBuffer������
 * public String substring(int start)
 * public String substring(int start,int end)
 */
public class StringBufferDemo6 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("ѧϰjava����Ҫ�Ǽ��");
		String s1 = sb.substring(2);
		String s2 = sb.substring(2,6);
		System.out.println(s1);
		System.out.println(s2);
	}
}
