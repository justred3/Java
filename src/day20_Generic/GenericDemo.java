package day20_Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList�洢�ַ���������
 * 
 * ���ǰ���������д����д������� ���ȷ�����ˡ�
 * Ϊʲô��?
 * 		��Ϊ���ǿ�ʼ�洢��ʱ�򣬴洢��String��Integer�������͵����ݡ�
 * 		���ڱ�����ʱ�����ǰ����Ƕ�����String���ʹ���ģ�����ת�������Ծͱ����ˡ�
 * �����أ����ڱ����ڼ�ȴû�и������ǡ�
 * ���ԣ��Ҿ;��������ƵĲ��á�
 * ����һ�£����ǵ�����
 * 		String[] strArray = new String[3];
 * 		strArray[0] = "hello";
 * 		strArray[1] = "world";
 * 		strArray[2] = 10;
 * ����Ҳģ��������������������ڴ��������ʱ����ȷԪ�ص��������͡������Ͳ������������ˡ�
 * �����ּ�������Ϊ�����͡�
 * 
 * ���ͣ���һ�ְ�������ȷ�Ĺ����Ƴٵ�����������ߵ��÷�����ʱ���ȥ��ȷ����������͡����������ͣ������͵�������һ���Ĵ��ݡ�
 * ��ʽ��
 * 		<��������>
 * 		�˴�����������ֻ�����������͡�
 * �ô���
 * 		A:������ʱ�ڵ�������ǰ���˱����ڼ�
 * 		B:������ǿ������ת��
 * 		C:�Ż��˳�����ƣ�����˻�ɫ������
 */
public class GenericDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("java");
		list.add("Iterator");
		list.add("Vector");
		list.add("LinkedList");
		for (int x = 0; x < list.size(); x++) {
			System.out.println(list.get(x));
		}
		
		System.out.println("~~~~~~~~~~~~~~");
		Iterator it = list.iterator();
		while(it.hasNext()){
			String x= (String)it.next();
			System.out.println(x);
		}

	}
}
