package day44_Pattern;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone p = new Iphone();
		p.call();
		System.out.println("---");

		// ���������ڽӵ绰ǰ��������
		PhoneDecorate pd = new RingPhoneDecorate(p);
		pd.call();
		System.out.println("-------");

		// ���������ڽӵ绰��������
		pd = new MusicPhoneDecorate(p);
		pd.call();
		System.out.println("-------");

		// ���������ڽӵ绰ǰ��������
		// �ӵ绰��������
		pd = new MusicPhoneDecorate(new RingPhoneDecorate(p));
		pd.call();

		// ����������IO���е�ʹ��
		// InputStream is = System.in;
		// InputStreamReader isr = new InputStreamReader(is);
		// BufferedReader br = new BufferedReader(isr);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(
				System.out)));

		Scanner sc = new Scanner(System.in);
	}
}
