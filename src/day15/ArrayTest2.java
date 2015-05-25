package day15;

import java.util.Scanner;

/**
 * 二分法的使用
 * 
 * @author Administrator
 *
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		// 首先定义一定数组
		int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		// 新建一个Scanner对象接受用户输入
		Scanner sc = new Scanner(System.in);
		// 提示用户输入
		System.out.println("请输入要查找的数值:");
		int value = sc.nextInt();
		// 将用户输入的数值代入到二分法中
		int index = ArrayTest2.dichotomy(arr, value)+1;
		// 将结果输出
		System.out.println("您要查询的数值位于:" + index);
	}

	public static int dichotomy(int[] arr, int value) {
		int max = arr.length - 1;
		int min = 0;
		int mid = (max + min) / 2;
		while (arr[mid] != value) {
			if (value > arr[mid]) {
				min = mid + 1;
				mid = (max + min) / 2;
			} else if (value < arr[mid]) {
				max = mid - 1;
				mid = (max + min) / 2;
			}
			if(max<min){
				return mid = -1;
			}
		}
		return mid;
	}
}
