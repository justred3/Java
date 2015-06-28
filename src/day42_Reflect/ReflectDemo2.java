package day42_Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * ����ͨ������ȥ��ȡ�ù��췽����ʹ�ã�
 * public Person(String name, int age, String address)
 * 
 * Person p = new Person("����ϼ",27,"����");
 * System.out.println(p);
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//��ȡ�ֽ����ļ�����
		Class c = Class.forName("day42_Reflect.Person");
		
		//��ȡ���ι��췽������
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		Constructor con = c.getConstructor(String.class,int.class,String.class);
		
		//ͨ�����ι��췽�����󴴽�����
		// public T newInstance(Object... initargs)
		Object obj = con.newInstance("����ϼ",27,"����");
		
		System.out.println(obj);
		
		
		
		
		
	}
}
