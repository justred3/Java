package day22_Map_Son;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵı�����
 * Map -- ���޶�
 * 
 * ˼·��
 * 		A:��ȡ���н��֤�ļ���
 * 		B:�������֤�ļ��ϣ��õ�ÿһ�����֤
 * 		C:���ݽ��֤��ȡ�ɷ������
 * 
 * ת����
 * 		A:��ȡ���м�ֵ�Զ���ļ���
 * 		B:������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
 * 		C:���ݼ�ֵ�Զ����ȡ����ֵ
 * 
 * ���������鷳�ľ��Ǽ�ֵ�Զ�����α�ʾ��?
 * �������ǿ�ʼ��һ��������
 * 		Set<Map.Entry<K,V>> entrySet()�����ص��Ǽ�ֵ�Զ���ļ���
 */
public class MapDemo4 {
	public static void main(String [] args){
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("�" ,"������");
		hm.put("�Ź���" ,"÷�޷�");
		hm.put("����ɭ" ,"�Ʊ�");
		hm.put("����ɭ" ,"�Ʊ�");
		System.out.println("�Ϲ�"+"\t"+"����");
		Set<Map.Entry<String, String>> set = hm.entrySet();
		for (Map.Entry<String, String> me : set) {
			// ���ݼ�ֵ�Զ����ȡ����ֵ
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key + "\t" + value);
		}
	}
}
