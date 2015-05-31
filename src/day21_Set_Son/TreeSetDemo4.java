package day21_Set_Son;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * 需求：请按照姓名的长度排序
 * 
 * TreeSet集合保证元素排序和唯一性的原理
 * 唯一性：是根据比较的返回是否是0来决定。
 * 排序：
 * 		A:自然排序(元素具备比较性)
 * 			让元素所属的类实现自然排序接口 Comparable
 * 		B:比较器排序(集合具备比较性)
 * 			让集合的构造方法接收一个比较器接口的子类对象 Comparator
 */
public class TreeSetDemo4 {
	public static void main(String[] args) {
		// 创建集合对象
		// TreeSet<Student4> ts = new TreeSet<Student4>(); //自然排序
		// public TreeSet(Comparator comparator) //比较器排序
		// TreeSet<Student4> ts = new TreeSet<Student4>(new MyComparator());

		// 如果一个方法的参数是接口，那么真正要的是接口的实现类的对象
		// 而匿名内部类就可以实现这个东西
		TreeSet<Student4> ts = new TreeSet<Student4>(new Comparator<Student4>() {
			@Override
			public int compare(Student4 s1, Student4 s2) {
				// 姓名长度
				int num = s1.getName().length() - s2.getName().length();
				// 姓名内容
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName())
						: num;
				// 年龄
				int num3 = num2 == 0 ? s1.getAge() - s2.getAge() : num2;
				return num3;
			}
		});

		// 创建元素
		Student4 s1 = new Student4("linqingxia", 27);
		Student4 s2 = new Student4("zhangguorong", 29);
		Student4 s3 = new Student4("wanglihong", 23);
		Student4 s4 = new Student4("linqingxia", 27);
		Student4 s5 = new Student4("liushishi", 22);
		Student4 s6 = new Student4("wuqilong", 40);
		Student4 s7 = new Student4("fengqingy", 22);
		Student4 s8 = new Student4("linqingxia", 29);

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
		for (Student4 s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
