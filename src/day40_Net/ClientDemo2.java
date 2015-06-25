package day40_Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo2 {
	public static void main(String[] args) throws IOException{
		//创建客户端Socket对象
		 Socket s = new Socket("192.168.1.49",9999);
		 
		 //获取输出流
		 OutputStream os = s.getOutputStream();
		 os.write("集团年天天，乃离开家".getBytes());
		 
		 //获取输入流
		 InputStream is = s.getInputStream();
		 byte [] bys = new byte[1024];
		 int len =is.read(bys);//阻塞
		 String client =new String(bys,0,len);
		 System.out.println("client:"+client);
		 
		 //释放资源
		 s.close();
	}
}
