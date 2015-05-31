package day21_Set_Son;

import java.util.TreeSet;

/*
 * 需求：请按照姓名的长度排序
 */
public class TreeSetDemo3 {
	public static void main(String[] args) {
		// 创建集合对象
		TreeSet<Student3> ts = new TreeSet<Student3>();

		// 创建元素
		Student3 s1 = new Student3("linqingxia", 27);
		Student3 s2 = new Student3("zhangguorong", 29);
		Student3 s3 = new Student3("wanglihong", 23);
		Student3 s4 = new Student3("linqingxia", 27);
		Student3 s5 = new Student3("liushishi", 22);
		Student3 s6 = new Student3("wuqilong", 40);
		Student3 s7 = new Student3("fengqingy", 22);
		Student3 s8 = new Student3("linqingxia", 29);

		// 添加元素
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);

		// 遍历
		for (Student3 s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}