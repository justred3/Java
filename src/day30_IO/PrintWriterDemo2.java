package day30_IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ��ӡ��
 * �ֽ�����ӡ��	PrintStream
 * �ַ���ӡ��	PrintWriter
 * 
 * ��ӡ�����ص㣺
 * 		A:ֻ��д���ݵģ�û�ж�ȡ���ݡ�ֻ�ܲ���Ŀ�ĵأ����ܲ�������Դ��
 * 		B:���Բ����������͵����ݡ�
 * 		C:����������Զ�ˢ�£��ܹ��Զ�ˢ�¡�
 * 		D:�����ǿ���ֱ�Ӳ����ı��ļ��ġ�
 * 			��Щ�������ǿ���ֱ�Ӳ����ı��ļ�����?
 * 			FileInputStream
 * 			FileOutputStream
 * 			FileReader
 * 			FileWriter
 * 			PrintStream
 * 			PrintWriter
 * 			��API,��������Ĺ��췽�������ͬʱ��File���ͺ�String���͵Ĳ�����һ����˵���ǿ���ֱ�Ӳ����ļ��ġ�
 * 
 * 			����
 * 				�������������ܹ�ֱ�Ӷ�д�ļ���
 * 				�߼������ڻ������������ṩ��һЩ�����Ĺ���
 */
/*
 * 1:���Բ����������͵����ݡ�
 * 		print()
 * 		println()
 * 2:�����Զ�ˢ��
 * 		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"), true);
 * 		����Ӧ�õ���println()�ķ����ſ���
 * 		���ʱ�򲻽����Զ�ˢ���ˣ���ʵ�������ݵĻ��С�
 * 
 * 		println()
 *		��ʵ�ȼ����ڣ�
 *		bw.write();
 *		bw.newLine();		
 *		bw.flush();
 */
public class PrintWriterDemo2 {
	public static void main(String[] args) throws IOException {
		// ������ӡ������
		// PrintWriter pw = new PrintWriter("pw2.txt");
		PrintWriter pw = new PrintWriter(new FileWriter("a.txt"), true);

		// write()�Ǹ㲻���ģ���ô����?
		// ���Ǿ�Ӧ�ÿ��������·���
		// pw.print(true);
		// pw.print(100);
		// pw.print("hello");

		pw.println("hello");
		pw.println(true);
		pw.println(100);

		pw.close();
	}
}