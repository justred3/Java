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
 * 键:Student
 * 值：String
 */
public class TreeMapDemo2 {
	public static void main(String[] args) {
		TreeMap<Student, String> tm = new TreeMap<Student, String>(new Comparator<Student>(
				
				) {
					@Override
					public int compare(Student s1, Student s2) {
						//对比两个学生名字
						int num = s2.getName().compareTo(s1.getName());
						//对比年龄
						int num2 = num==0?s2.getAge()-s1.getAge():0;
						return num2;
					}
		});
		Student s1 = new Student("离开家", 15);
		Student s2 = new Student("离开家", 15);
		Student s3 = new Student("立即", 15);
		Student s4 = new Student("离家", 15);
		tm.put(s1, "科健");
		tm.put(s2, "可降低");
		tm.put(s3, "我");
		tm.put(s4, "扣");
		Set<Student> set = tm.keySet();
		for (Student key : set) {
			String value = tm.get(key);
			System.out.println(key.getName()+"\t"+key.getAge()+"\t"+value);
		}
	}
}
