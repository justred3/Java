package day21_Set_Son;

import java.util.Comparator;

public class MyComparator implements Comparator<Student4> {

	@Override
	public int compare(Student4 s1, Student4 s2) {
		// int num = this.name.length() - s.name.length();
		// this -- s1
		// s -- s2
		// ��������
		int num = s1.getName().length() - s2.getName().length();
		// ��������
		int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
		// ����
		int num3 = num2 == 0 ? s1.getAge() - s2.getAge() : num2;
		return num3;
	}

}