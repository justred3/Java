package day21_Set_Son;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * �����밴�������ĳ�������
 * 
 * TreeSet���ϱ�֤Ԫ�������Ψһ�Ե�ԭ��
 * Ψһ�ԣ��Ǹ��ݱȽϵķ����Ƿ���0��������
 * ����
 * 		A:��Ȼ����(Ԫ�ؾ߱��Ƚ���)
 * 			��Ԫ����������ʵ����Ȼ����ӿ� Comparable
 * 		B:�Ƚ�������(���Ͼ߱��Ƚ���)
 * 			�ü��ϵĹ��췽������һ���Ƚ����ӿڵ�������� Comparator
 */
public class TreeSetDemo4 {
	public static void main(String[] args) {
		// �������϶���
		// TreeSet<Student4> ts = new TreeSet<Student4>(); //��Ȼ����
		// public TreeSet(Comparator comparator) //�Ƚ�������
		// TreeSet<Student4> ts = new TreeSet<Student4>(new MyComparator());

		// ���һ�������Ĳ����ǽӿڣ���ô����Ҫ���ǽӿڵ�ʵ����Ķ���
		// �������ڲ���Ϳ���ʵ���������
		TreeSet<Student4> ts = new TreeSet<Student4>(new Comparator<Student4>() {
			@Override
			public int compare(Student4 s1, Student4 s2) {
				// ��������
				int num = s1.getName().length() - s2.getName().length();
				// ��������
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName())
						: num;
				// ����
				int num3 = num2 == 0 ? s1.getAge() - s2.getAge() : num2;
				return num3;
			}
		});

		// ����Ԫ��
		Student4 s1 = new Student4("linqingxia", 27);
		Student4 s2 = new Student4("zhangguorong", 29);
		Student4 s3 = new Student4("wanglihong", 23);
		Student4 s4 = new Student4("linqingxia", 27);
		Student4 s5 = new Student4("liushishi", 22);
		Student4 s6 = new Student4("wuqilong", 40);
		Student4 s7 = new Student4("fengqingy", 22);
		Student4 s8 = new Student4("linqingxia", 29);

		// ���Ԫ��
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);

		// ����
		for (Student4 s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
