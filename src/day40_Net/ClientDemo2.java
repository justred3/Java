package day40_Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo2 {
	public static void main(String[] args) throws IOException{
		//�����ͻ���Socket����
		 Socket s = new Socket("192.168.1.49",9999);
		 
		 //��ȡ�����
		 OutputStream os = s.getOutputStream();
		 os.write("���������죬���뿪��".getBytes());
		 
		 //��ȡ������
		 InputStream is = s.getInputStream();
		 byte [] bys = new byte[1024];
		 int len =is.read(bys);//����
		 String client =new String(bys,0,len);
		 System.out.println("client:"+client);
		 
		 //�ͷ���Դ
		 s.close();
	}
}
