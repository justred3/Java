package day40_Net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer5 {
	public static void main(String[] args) throws IOException{
		//����������Socket����
		ServerSocket ss = new ServerSocket(11111);
		
		while(true){
			Socket s = ss.accept();
			new Thread(new UserThread(s)).start();
		}
	}
}
