package day20_Generic;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		// JDK7的新特性：泛型推断。
		// ArrayList<Student> array = new ArrayList<>();
		// 但是我不建议这样使用。
		ArrayList<Student> array = new ArrayList<Student>();

		// 创建元素对象
		Student s1 = new Student("曹操", 40); // 后知后觉
		Student s2 = new Student("蒋干", 30); // 不知不觉
		Student s3 = new Student("诸葛亮", 26);// 先知先觉

		// 添加元素
		array.add(s1);
		array.add(s2);
		array.add(s3);

		// 遍历
		Iterator<Student> it = array.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("------------------");

		for (int x = 0; x < array.size(); x++) {
			Student s = array.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}