package day40_Net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo2 {
	public static void main(String[] args) throws IOException {
		//�������Ͷ˵� Socket����
		DatagramSocket ds = new DatagramSocket();
		
		//�������ݲ����
		byte[] bys = "hellowrld".getBytes();
		DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.1.49"),12345);
		
		//��������
		ds.send(dp);
		
		//�ͷ���Դ
		ds.close();
	}
}
