package day5;

import java.util.Scanner;

/*������С��Ϸ(������1-10֮��)
������
	A:�������һ���������(���µ�)
	B:����¼�����ݡ�(��µ�)
	C:����µĺͱ��µĽ��бȽ�
		a:����
		b:С��
		c:������
	D:������βµĻ��ᣬ���оͽ�����
		while()ѭ�������о�break*/
public class GuessNumber {
	public static void main(String args[]){
		//�������һ�������
		int answer = (int)(Math.random()*10+1);
		while(true){
		//����¼������
		Scanner sc = new Scanner(System.in);
		int content = sc.nextInt();
		//�Ƚ�����
		if(content>answer){
			System.out.println("�´���");
		}else if(content<answer){
			System.out.println("��С��");
		}else{
			System.out.println("��¶���");
			break;
		}
		}
	}
}
