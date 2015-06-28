package day42_Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 需求：通过反射获取私有构造方法并使用
 * private Person(String name){}
 * 
 * Person p = new Person("风清扬");
 * System.out.println(p);
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//获取字节码对象
		Class c = Class.forName("day42_Reflect.Person");
		
		//获取私有构造方法对象
		// NoSuchMethodException：每个这个方法异常
		// 原因是一开始我们使用的方法只能获取公共的，下面这种方式就可以了。
		Constructor con = c.getDeclaredConstructor(String.class);
		
		// 用该私有构造方法创建对象
		// IllegalAccessException:非法的访问异常。
		// 暴力访问
		con.setAccessible(true);
		Object obj = con.newInstance("何力文");
		
		System.out.println(obj);
	}
}
