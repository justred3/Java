package day21_Set_Son;

import java.util.TreeSet;

/*
 * TreeSet存储自定义对象并保证排序和唯一。
 * 
 * A:你没有告诉我们怎么排序
 * 		自然排序，按照年龄从小到大排序
 * B:元素什么情况算唯一你也没告诉我
 * 		成员变量值都相同即为同一个元素
 */
public class TreeSetDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		TreeSet<Student2> ts = new TreeSet<Student2>();

		// 创建元素
		Student2 s1 = new Student2("linqingxia", 27);
		Student2 s2 = new Student2("zhangguorong", 29);
		Student2 s3 = new Student2("wanglihong", 23);
		Student2 s4 = new Student2("linqingxia", 27);
		Student2 s5 = new Student2("liushishi", 22);
		Student2 s6 = new Student2("wuqilong", 40);
		Student2 s7 = new Student2("fengqingy", 22);

		// 添加元素
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);

		// 遍历
		for (Student2 s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
