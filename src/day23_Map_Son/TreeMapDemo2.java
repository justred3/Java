package day23_Map_Son;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/*
 * TreeMap<Student,String>
 * ��:Student
 * ֵ��String
 */
public class TreeMapDemo2 {
	public static void main(String[] args) {
		TreeMap<Student, String> tm = new TreeMap<Student, String>(new Comparator<Student>(
				
				) {
					@Override
					public int compare(Student s1, Student s2) {
						//�Ա�����ѧ������
						int num = s2.getName().compareTo(s1.getName());
						//�Ա�����
						int num2 = num==0?s2.getAge()-s1.getAge():0;
						return num2;
					}
		});
		Student s1 = new Student("�뿪��", 15);
		Student s2 = new Student("�뿪��", 15);
		Student s3 = new Student("����", 15);
		Student s4 = new Student("���", 15);
		tm.put(s1, "�ƽ�");
		tm.put(s2, "�ɽ���");
		tm.put(s3, "��");
		tm.put(s4, "��");
		Set<Student> set = tm.keySet();
		for (Student key : set) {
			String value = tm.get(key);
			System.out.println(key.getName()+"\t"+key.getAge()+"\t"+value);
		}
	}
}
