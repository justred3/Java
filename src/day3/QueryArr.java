package day3;

import java.util.Scanner;

public class QueryArr {
	//���巵�ص�λ��
	int Index;
	public static void main(String[] args){
		int[] arr={54,547,87,457,87,51,2,8};
		Scanner sc = new Scanner(System.in);
		System.out.println("���û���������������һԪ��ֵ:{54,547,87,457,87,51,2,8}");
		int input = sc.nextInt();
		System.out.println("���������ֵλ�ڵ�"+new QueryArr().getIndex(arr, input)+"λ");
	}
	//����һ������������ѯ����
	private  int getIndex(int[] arr,int value){
		//��������
		for(int a =0;a<arr.length;a++){		
			if(value==arr[a]){
				Index=a+1;
				break;
			}
		}
		return Index;	
		
	}
}
