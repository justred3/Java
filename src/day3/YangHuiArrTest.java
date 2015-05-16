package day3;

import java.util.Scanner;

/**
 * ��ӡ���������(�������Լ���¼��)
 * @author Administrator
 *
 */
public class YangHuiArrTest {
	public static void main(String args[]){
		//�½�Scanner��������û�����
		Scanner sc = new Scanner(System.in);
		//��ʾ�û���������
		System.out.println("������������");
		int n = sc.nextInt();
		
		//����calculate����
		YangHuiArrTest test = new YangHuiArrTest();
		test.PrintArr(test.calculate(n));
	}
	//����һ��������������n��ʱ��������������������
	private int[][] calculate(int n){
		int arr[][]=new int[n][];
		//��n=1ʱ��arr��ֵ
		if(n==1){
			arr[n-1]= new int[n];
			arr[n-1][n-1]=1;
		}
		//��n=2ʱ��arr��ֵ
		else if(n==2){
			arr[n-2]= new int[n-1];
			arr[n-1]= new int[n];
			arr[n-2][n-2]=1;
			arr[n-1][n-2]=1;
			arr[n-1][n-1]=1;
		}
		//��n>=3ʱ��arr��ֵ
		else {
			arr[0]= new int[1];
			arr[1]= new int[2];
			arr[0][0]=1;
			arr[1][0]=1;
			arr[1][1]=1;
			for(int a=2;a<n;a++){
				arr[a]= new int[a+1];
				arr[a][0]=1;
				arr[a][a]=1;
				for(int b=1;b<a;b++){
					arr[a][b]=arr[a-1][b-1]+arr[a-1][b];
				}
			}
		}
		return arr;
	} 
	//����һ����������ӡ��arr
	//��������ֱ�Ӽ���length(��arr.length)����ָ�����м���(Row)��
	//ָ�����������length(��arr[0].length)��ָ���Ǹ�����ӵ�е�Ԫ�أ�Ҳ������(Column)��Ŀ��
	private void PrintArr(int[][] arr){
		for(int a = 0; a<arr.length;a++){
			for(int b= 0;b<arr[a].length;b++){
				System.out.print(arr[a][b]+"\t");
			}
			System.out.println("");
		}
	}
}
