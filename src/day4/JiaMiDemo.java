package day4;

import java.util.Scanner;

/*
ĳ����˾���ù��õ绰����������Ϣ��������С��8λ��������Ϊ��ȷ����ȫ��
�ڴ��ݹ�������Ҫ���ܣ����ܹ������£�
	���Ƚ����ݵ���Ȼ��ÿλ���ֶ�����5�����úͳ���10��������������֣�
	��󽫵�һλ�����һλ���ֽ����� ���������һ��С��8λ��������
	Ȼ�󣬰Ѽ��ܺ�Ľ���ڿ���̨��ӡ������ 
	
��ĿҪ��
	A:������С��8λ������
		����һ��int���͵�����
		int number = 123456;
	B:���ܹ���
		a:���Ƚ����ݵ���
			��� 654321
		b:Ȼ��ÿλ���ֶ�����5�����úͳ���10���������������
			��� 109876
		c:��󽫵�һλ�����һλ���ֽ���
			��� 609871
	C:�Ѽ��ܺ�Ľ������ڿ���̨
	
	ͨ���򵥵ķ���������֪����������а취��������ݱ������ͺ��ˡ�
	����ֱ��д��������ӵģ�
		int[] arr = {1,2,3,4,5,6};
		
	��ΰ�����ת��������?
		A:����һ������
			int number = 123456;
		B:����һ������,���ʱ����������ˣ�����ĳ����Ƕ�����?
			int[] arr = new int[8]; //�����ܳ���8
			�ڸ�ֵ��ʱ������һ��������¼�����ı仯��
			����һ������ֵ��0
			int index = 0;
		C:��ȡÿһ������
			int ge = number%10
			int shi = number/10%10
			int bai = number/10/10%10
			
			arr[index] = ge;
			index++;
			arr[index] = shi;
			index++;
			arr[index] = bai;
			...
*/
public class JiaMiDemo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("���û���������:");
		int Message = sc.nextInt();
		System.out.println(new JiaMiDemo().encrypt(Message));
	}
	//����һ�����ݼ��ܵķ���
	public int encrypt(int Message){
		//������������Ϊ��Ϣ�п���������8λ��λ������
		int index=0;
		int arr[] =new int[8];
		int passage;
		//�Ƚ���Ϣ��������
		while(Message>0){
			arr[index]=Message%10;
			index++;
			Message /= 10;
		}
		index--;
		//���Ƚ����ݵ���
		for(int a=0;a<=index/2;a++){
			int temp =arr[a];
			arr[a]=arr[index-a];
			arr[index-a]=temp;
		}
		//Ȼ��ÿλ���ֶ�����5�����úͳ���10���������������
		for(int x=0; x<=index; x++) {
			arr[x] += 5;
			arr[x] %= 10;
		}
		//��󽫵�һλ�����һλ���ֽ���
		int temp =arr[0];
		arr[0]=arr[index];
		arr[index]=temp;
		int password=0;	
		int n =1;
		for(int a =0;a<=index;a++){
			int temp1 = arr[a]*n;
			n =n*10 ;
			password +=temp1;
		}
		return password;
	}
}
