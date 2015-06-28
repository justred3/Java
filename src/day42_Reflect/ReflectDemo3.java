package day42_Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * ����ͨ�������ȡ˽�й��췽����ʹ��
 * private Person(String name){}
 * 
 * Person p = new Person("������");
 * System.out.println(p);
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//��ȡ�ֽ������
		Class c = Class.forName("day42_Reflect.Person");
		
		//��ȡ˽�й��췽������
		// NoSuchMethodException��ÿ����������쳣
		// ԭ����һ��ʼ����ʹ�õķ���ֻ�ܻ�ȡ�����ģ��������ַ�ʽ�Ϳ����ˡ�
		Constructor con = c.getDeclaredConstructor(String.class);
		
		// �ø�˽�й��췽����������
		// IllegalAccessException:�Ƿ��ķ����쳣��
		// ��������
		con.setAccessible(true);
		Object obj = con.newInstance("������");
		
		System.out.println(obj);
	}
}
