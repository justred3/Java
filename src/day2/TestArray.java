package day2;

public class TestArray {
	public static void main(String [] args){
		//�������(������������е�ÿһ��Ԫ��)
		int[] arr ={45,487,78,78,78,45,12};
		for(int a = 0;a<7;a++){
			System.out.println("int["+a+"]"+"="+arr[a]);
		}
		//�����ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)
		int[] arr1 ={45,487,78,78,78,45,12};
		int c=arr[0],d=arr[0];
		for(int a = 0;a<6;a++){
			int b = arr1[a+1];
			c = c>b?c:b;	
			d = d>b?b:d;			
		}
		System.out.println("����������Ϊ��"+c);
		System.out.println("��������С��Ϊ��"+d);
		//����Ԫ������ (���ǰ�Ԫ�ضԵ�)
		int arr2[]=new int[7];
		for(int a=0,b=6;a<7;a++,b--){
			arr2[b]=arr1[a];
		}
		for(int a = 0;a<7;a++){
			System.out.println("int["+a+"]"+"="+arr2[a]);
			
		}
	}
}
