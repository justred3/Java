package day40_Net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UploadClient {
	public static void main(String [] args) throws IOException{
		//创建客户端Socket对象
		Socket s = new Socket("192.168.1.100",12345);
		
		//封装文本文件
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		//封装通道内的流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String line = null;
		while((line = br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		br.close();
		s.close();
	}
}
