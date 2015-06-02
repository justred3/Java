package day22_Map_Son;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的遍历。
 * Map -- 夫妻对
 * 
 * 思路：
 * 		A:获取所有结婚证的集合
 * 		B:遍历结婚证的集合，得到每一个结婚证
 * 		C:根据结婚证获取丈夫和妻子
 * 
 * 转换：
 * 		A:获取所有键值对对象的集合
 * 		B:遍历键值对对象的集合，得到每一个键值对对象
 * 		C:根据键值对对象获取键和值
 * 
 * 这里面最麻烦的就是键值对对象如何表示呢?
 * 看看我们开始的一个方法：
 * 		Set<Map.Entry<K,V>> entrySet()：返回的是键值对对象的集合
 */
public class MapDemo4 {
	public static void main(String [] args){
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("李晨" ,"范冰冰");
		hm.put("张国荣" ,"梅艳芳");
		hm.put("艾弗森" ,"科比");
		hm.put("艾弗森" ,"科比");
		System.out.println("老公"+"\t"+"妻子");
		Set<Map.Entry<String, String>> set = hm.entrySet();
		for (Map.Entry<String, String> me : set) {
			// 根据键值对对象获取键和值
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key + "\t" + value);
		}
	}
}
