package day40_Net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * 客户端键盘录入，服务器输出文本文件
 */
public class ClientDemo4 {
	public static void main(String [] args) throws IOException{
		//创建客户端Socket对象
		Socket s = new Socket("192.168.1.100",23456);
		
		//封装键盘录入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//封装通道内的数据
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String line = null;
		while((line=br.readLine())!=null){
			if("over".equals(line)){
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		s.close();
	}
}
