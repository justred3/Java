package day21_Set_Son;

import java.util.TreeSet;

/*
 * TreeSet�洢�Զ�����󲢱�֤�����Ψһ��
 * 
 * A:��û�и���������ô����
 * 		��Ȼ���򣬰��������С��������
 * B:Ԫ��ʲô�����Ψһ��Ҳû������
 * 		��Ա����ֵ����ͬ��Ϊͬһ��Ԫ��
 */
public class TreeSetDemo2 {
	public static void main(String[] args) {
		// �������϶���
		TreeSet<Student2> ts = new TreeSet<Student2>();

		// ����Ԫ��
		Student2 s1 = new Student2("linqingxia", 27);
		Student2 s2 = new Student2("zhangguorong", 29);
		Student2 s3 = new Student2("wanglihong", 23);
		Student2 s4 = new Student2("linqingxia", 27);
		Student2 s5 = new Student2("liushishi", 22);
		Student2 s6 = new Student2("wuqilong", 40);
		Student2 s7 = new Student2("fengqingy", 22);

		// ���Ԫ��
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);

		// ����
		for (Student2 s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
