package day40_Net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * �ͻ����ı��ļ������������������̨
 */
public class ClientDemo5 {
	public static void main(String [] args) throws IOException{
		//����Socket����
		Socket s = new Socket("192.168.1.100",12345);
		
		//��װ�ļ�
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		//��װͨ���ڵ���
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String line =null;
		while((line = br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		br.close();
		s.close();
	}
}
