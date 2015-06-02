package day23_Map_Son;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * 为了更符合要求：
 * 		这次的数据就看成是学生对象。
 * 
 * 传智播客
 * 		bj	北京校区
 * 			jc	基础班
 * 					林青霞		27
 * 					风清扬		30
 * 			jy	就业班	
 * 					赵雅芝		28
 * 					武鑫		29
 * 		sh	上海校区
 * 			jc	基础班
 * 					郭美美		20
 * 					犀利哥		22
 * 			jy	就业班	
 * 					罗玉凤		21
 * 					马征		23
 * 		gz	广州校区
 * 			jc	基础班
 * 					王力宏		30
 * 					李静磊		32
 * 			jy	就业班	
 * 					郎朗		31
 * 					柳岩		33
 * 		xa	西安校区
 * 			jc	基础班
 * 					范冰冰		27
 * 					刘意		30
 * 			jy	就业班	
 * 					李冰冰		28
 * 					张志豪		29
 */
public class HashMapDemo6 {
	public static void main(String[] args) {
		// 创建大集合
		HashMap<String, HashMap<String, ArrayList<Student6>>> czbkMap = new HashMap<String, HashMap<String, ArrayList<Student6>>>();

		// 北京校区数据
		HashMap<String, ArrayList<Student6>> bjCzbkMap = new HashMap<String, ArrayList<Student6>>();
		ArrayList<Student6> array1 = new ArrayList<Student6>();
		Student6 s1 = new Student6("林青霞", 27);
		Student6 s2 = new Student6("风清扬", 30);
		array1.add(s1);
		array1.add(s2);
		ArrayList<Student6> array2 = new ArrayList<Student6>();
		Student6 s3 = new Student6("赵雅芝", 28);
		Student6 s4 = new Student6("武鑫", 29);
		array2.add(s3);
		array2.add(s4);
		bjCzbkMap.put("基础班", array1);
		bjCzbkMap.put("就业班", array2);
		czbkMap.put("北京校区", bjCzbkMap);

		// 晚上可以自己练习一下
		// 上海校区数据自己做
		// 广州校区数据自己做

		// 西安校区数据
		HashMap<String, ArrayList<Student6>> xaCzbkMap = new HashMap<String, ArrayList<Student6>>();
		ArrayList<Student6> array3 = new ArrayList<Student6>();
		Student6 s5 = new Student6("范冰冰", 27);
		Student6 s6 = new Student6("刘意", 30);
		array3.add(s5);
		array3.add(s6);
		ArrayList<Student6> array4 = new ArrayList<Student6>();
		Student6 s7 = new Student6("李冰冰", 28);
		Student6 s8 = new Student6("张志豪", 29);
		array4.add(s7);
		array4.add(s8);
		xaCzbkMap.put("基础班", array3);
		xaCzbkMap.put("就业班", array4);
		czbkMap.put("西安校区", xaCzbkMap);

		// 遍历集合
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

