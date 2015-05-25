package day15;

import java.util.Scanner;

/**
 * ���ַ���ʹ��
 * 
 * @author Administrator
 *
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		// ���ȶ���һ������
		int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		// �½�һ��Scanner��������û�����
		Scanner sc = new Scanner(System.in);
		// ��ʾ�û�����
		System.out.println("������Ҫ���ҵ���ֵ:");
		int value = sc.nextInt();
		// ���û��������ֵ���뵽���ַ���
		int index = ArrayTest2.dichotomy(arr, value)+1;
		// ��������
		System.out.println("��Ҫ��ѯ����ֵλ��:" + index);
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
