package day3;

import java.util.Scanner;

/**
 * 打印杨辉三角形(行数可以键盘录入)
 * @author Administrator
 *
 */
public class YangHuiArrTest {
	public static void main(String args[]){
		//新建Scanner对象接受用户输入
		Scanner sc = new Scanner(System.in);
		//提示用户输入行数
		System.out.println("请输入行数：");
		int n = sc.nextInt();
		
		//引用calculate方法
		YangHuiArrTest test = new YangHuiArrTest();
		test.PrintArr(test.calculate(n));
	}
	//定义一个方法用来计算n行时，杨辉三角形里面的数据
	private int[][] calculate(int n){
		int arr[][]=new int[n][];
		//当n=1时，arr的值
		if(n==1){
			arr[n-1]= new int[n];
			arr[n-1][n-1]=1;
		}
		//当n=2时，arr的值
		else if(n==2){
			arr[n-2]= new int[n-1];
			arr[n-1]= new int[n];
			arr[n-2][n-2]=1;
			arr[n-1][n-2]=1;
			arr[n-1][n-1]=1;
		}
		//当n>=3时，arr的值
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
	//定义一个方法来打印出arr
	//数组名后直接加上length(如arr.length)，所指的是有几行(Row)；
	//指定索引后加上length(如arr[0].length)，指的是该行所拥有的元素，也就是列(Column)数目。
	private void PrintArr(int[][] arr){
		for(int a = 0; a<arr.length;a++){
			for(int b= 0;b<arr[a].length;b++){
				System.out.print(arr[a][b]+"\t");
			}
			System.out.println("");
		}
	}
}
