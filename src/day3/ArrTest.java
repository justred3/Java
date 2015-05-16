package day3;

public class ArrTest {
	public static void main(String [] args){
		//定义一个数组
		int arr[] = new int[3];
		int arr1[] = new int[3];
		//输出数组名称
		System.out.println(arr);
		System.out.println(arr1);
		//输出数组元素值
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("--------");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		//给数组元素赋值
		arr[0]=100;
		arr[2]=200;
		arr1[0]=100;
		arr1[2]=200;
		//输出数组名称
		System.out.println(arr);
		System.out.println(arr1);
		//输出数组元素值
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		int [] arr3 =arr1;
		System.out.println(arr1);
		System.out.println(arr3);
	}
}
