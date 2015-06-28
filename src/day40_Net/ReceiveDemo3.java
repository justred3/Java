package day40_Net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * ����������նˣ�
 * 		java.net.BindException: Address already in use: Cannot bind
 * 		�˿ڱ�ռ�á�
 */
public class ReceiveDemo3 {
	public static void main(String[] args) throws IOException {
		//�������ն˵�Socket
		DatagramSocket ds = new DatagramSocket(12345);
		
		while(true){
			//����һ������
			byte[] bys = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bys,bys.length);
			
			//��������
			ds.receive(dp);
			
			//��������
			String ip = dp.getAddress().getHostAddress();
			String s = new String(dp.getData(),0,dp.getLength());
			System.out.println("from"+ip+"data is:"+s);
		}
		//�ͷ���Դ
		//���ն�Ӧ��һֱ���ŵȴ����ݡ��ǲ���Ҫ�ر�
	}
}