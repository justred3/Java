package day42_Reflect;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * ͨ�������ļ��������еķ���
 * 
 * ���䣺
 * 		��Ҫ�������ļ����ʹ�á�
 * 		��class.txt���档
 * 		������֪������������
 * 			className
 * 			methodName
 */
public class Test {
	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// ����ǰ������
		// Student s = new Student();
		// s.love();
		// Teacher t = new Teacher();
		// t.love();
		// Worker w = new Worker();
		// w.love();
		// ����������
		
		//���ؼ�ֵ������
		Properties prop = new Properties();
		FileReader fr = new FileReader("a.txt");
		prop.load(fr);
		fr.close();
		
		//��ȡ����
		String className = prop.getProperty("className");
		String methodName = prop.getProperty("methodName");
		
		//����
		Class c = Class.forName(className);
		
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
		//���÷���
		Method m = c.getMethod(methodName);
		m.invoke(obj);
	}
}
