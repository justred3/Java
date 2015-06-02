package day23_Map_Son;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * ���� ��"aababcabcdabcde",��ȡ�ַ�����ÿһ����ĸ���ֵĴ���Ҫ����:a(5)b(4)c(3)d(2)e(1)
 * 
 * ������
 * 		A:����һ���ַ���(���ԸĽ�Ϊ����¼��)
 * 		B:����һ��TreeMap����
 * 			��:Character
 * 			ֵ��Integer
 * 		C:
 * 		D:�����ַ����飬�õ�ÿһ���ַ�
 * 		E:�øղŵõ����ַ���Ϊ����������ȥ��ֵ��������ֵ
 * 			��null:˵���ü������ڣ��ͰѸ��ַ���Ϊ����1��Ϊֵ�洢
 * 			����null:˵���ü����ڣ��Ͱ�ֵ��1��Ȼ����д�洢�ü���ֵ
 * 		F:�����ַ�������������
 * 		G:�������ϣ��õ�����ֵ�����а���Ҫ��ƴ��
 * 		H:���ַ���������ת��Ϊ�ַ������
 * 
 * ¼�룺linqingxia
 * �����result:a(1)g(1)i(3)l(1)n(2)q(1)x(1)
 */
public class TreeMapDemo3 {
	public static void main(String[] args){
		//����һ��Scanner��������û�����
		Scanner sc = new Scanner(System.in);
		//��ʾ�û�����
		System.out.println("������:");
		String s = sc.nextLine();
		//����һ��TreeMap����
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		//���ַ���ת��Ϊ�ַ�����
		char [] arr = s.toCharArray();
		//�����ַ����飬�õ�ÿһ���ַ�
		for(char key :arr){
			//�øղŵõ����ַ���Ϊ����������ȥ��ֵ��������ֵ
			Integer i = tm.get(key);
			//��null:˵���ü������ڣ��ͰѸ��ַ���Ϊ����1��Ϊֵ�洢
			if(i==null){
				tm.put(key, 1);
			}
			//����null:˵���ü����ڣ��Ͱ�ֵ��1��Ȼ����д�洢�ü���ֵ
			else{
				i++;
				tm.put(key, i);
			}
		}
		//�����ַ�������������
		StringBuilder sb =new StringBuilder();
		//�������ϣ��õ�����ֵ�����а���Ҫ��ƴ��
		Set<Character> set = tm.keySet();
		for(Character key: set){
			Integer value = tm.get(key);
			sb.append(key).append("(").append(value).append(")");
		}
		//���ַ���������ת��Ϊ�ַ������
		String result = sb.toString();
		System.out.println(result);
	}
}
