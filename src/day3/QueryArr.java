package day3;

import java.util.Scanner;

public class QueryArr {
	//定义返回的位置
	int Index;
	public static void main(String[] args){
		int[] arr={54,547,87,457,87,51,2,8};
		Scanner sc = new Scanner(System.in);
		System.out.println("请用户输入数组中任意一元素值:{54,547,87,457,87,51,2,8}");
		int input = sc.nextInt();
		System.out.println("您输入的数值位于第"+new QueryArr().getIndex(arr, input)+"位");
	}
	//定义一个方法用来查询数组
	private  int getIndex(int[] arr,int value){
		//遍历数组
		for(int a =0;a<arr.length;a++){		
			if(value==arr[a]){
				Index=a+1;
				break;
			}
		}
		return Index;	
		
	}
}
