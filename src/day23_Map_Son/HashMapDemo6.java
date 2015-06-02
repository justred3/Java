package day23_Map_Son;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * Ϊ�˸�����Ҫ��
 * 		��ε����ݾͿ�����ѧ������
 * 
 * ���ǲ���
 * 		bj	����У��
 * 			jc	������
 * 					����ϼ		27
 * 					������		30
 * 			jy	��ҵ��	
 * 					����֥		28
 * 					����		29
 * 		sh	�Ϻ�У��
 * 			jc	������
 * 					������		20
 * 					Ϭ����		22
 * 			jy	��ҵ��	
 * 					�����		21
 * 					����		23
 * 		gz	����У��
 * 			jc	������
 * 					������		30
 * 					���		32
 * 			jy	��ҵ��	
 * 					����		31
 * 					����		33
 * 		xa	����У��
 * 			jc	������
 * 					������		27
 * 					����		30
 * 			jy	��ҵ��	
 * 					�����		28
 * 					��־��		29
 */
public class HashMapDemo6 {
	public static void main(String[] args) {
		// �����󼯺�
		HashMap<String, HashMap<String, ArrayList<Student6>>> czbkMap = new HashMap<String, HashMap<String, ArrayList<Student6>>>();

		// ����У������
		HashMap<String, ArrayList<Student6>> bjCzbkMap = new HashMap<String, ArrayList<Student6>>();
		ArrayList<Student6> array1 = new ArrayList<Student6>();
		Student6 s1 = new Student6("����ϼ", 27);
		Student6 s2 = new Student6("������", 30);
		array1.add(s1);
		array1.add(s2);
		ArrayList<Student6> array2 = new ArrayList<Student6>();
		Student6 s3 = new Student6("����֥", 28);
		Student6 s4 = new Student6("����", 29);
		array2.add(s3);
		array2.add(s4);
		bjCzbkMap.put("������", array1);
		bjCzbkMap.put("��ҵ��", array2);
		czbkMap.put("����У��", bjCzbkMap);

		// ���Ͽ����Լ���ϰһ��
		// �Ϻ�У�������Լ���
		// ����У�������Լ���

		// ����У������
		HashMap<String, ArrayList<Student6>> xaCzbkMap = new HashMap<String, ArrayList<Student6>>();
		ArrayList<Student6> array3 = new ArrayList<Student6>();
		Student6 s5 = new Student6("������", 27);
		Student6 s6 = new Student6("����", 30);
		array3.add(s5);
		array3.add(s6);
		ArrayList<Student6> array4 = new ArrayList<Student6>();
		Student6 s7 = new Student6("�����", 28);
		Student6 s8 = new Student6("��־��", 29);
		array4.add(s7);
		array4.add(s8);
		xaCzbkMap.put("������", array3);
		xaCzbkMap.put("��ҵ��", array4);
		czbkMap.put("����У��", xaCzbkMap);

		// ��������
		Set<String> czbkMapSet = czbkMap.keySet();
		for (String czbkMapKey : czbkMapSet) {
			System.out.println(czbkMapKey);
			HashMap<String, ArrayList<Student6>> czbkMapValue = czbkMap
					.get(czbkMapKey);
			Set<String> czbkMapValueSet = czbkMapValue.keySet();
			for (String czbkMapValueKey : czbkMapValueSet) {
				System.out.println("\t" + czbkMapValueKey);
				ArrayList<Student6> czbkMapValueValue = czbkMapValue
						.get(czbkMapValueKey);
				for (Student6 s : czbkMapValueValue) {
					System.out.println("\t\t" + s.getName() + "---"
							+ s.getAge());
				}
			}
		}
	}
}

