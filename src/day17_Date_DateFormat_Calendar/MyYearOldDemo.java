package day17_Date_DateFormat_Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * ��һ��������������������?
 * 
 * ������
 * 		A:����¼����ĳ�����������
 * 		B:�Ѹ��ַ���ת��Ϊһ������
 * 		C:ͨ�������ڵõ�һ������ֵ
 * 		D:��ȡ��ǰʱ��ĺ���ֵ
 * 		E:��D-C�õ�һ������ֵ
 * 		F:��E�ĺ���ֵת��Ϊ��
 * 			/1000/60/60/24
 */
public class MyYearOldDemo {
	public static void main(String[] args) throws ParseException {
		// ����¼����ĳ�����������
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ĳ���������:");
		String line = sc.nextLine();
		//����������
		String Regex = "[1-9]\\d{1,3}-\\d{2}-\\d{2}";
		if(line.matches(Regex)){
			// �Ѹ��ַ���ת��Ϊһ������
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d = sdf.parse(line);

			// ͨ�������ڵõ�һ������ֵ
			long myTime = d.getTime();

			// ��ȡ��ǰʱ��ĺ���ֵ
			long nowTime = System.currentTimeMillis();

			// ��D-C�õ�һ������ֵ
			long time = nowTime - myTime;

			// ��E�ĺ���ֵת��Ϊ��
			long day = time / 1000 / 60 / 60 / 24;

			System.out.println("������������磺" + day + "��");
		}
		else {
			System.out.println("������������");
		}
		
	}
}