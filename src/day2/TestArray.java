package day2;

public class TestArray {
	public static void main(String [] args){
		//数组遍历(依次输出数组中的每一个元素)
		int[] arr ={45,487,78,78,78,45,12};
		for(int a = 0;a<7;a++){
			System.out.println("int["+a+"]"+"="+arr[a]);
		}
		//数组获取最值(获取数组中的最大值最小值)
		int[] arr1 ={45,487,78,78,78,45,12};
		int c=arr[0],d=arr[0];
		for(int a = 0;a<6;a++){
			int b = arr1[a+1];
			c = c>b?c:b;	
			d = d>b?b:d;			
		}
		System.out.println("数组中最大的为："+c);
		System.out.println("数组中最小的为："+d);
		//数组元素逆序 (就是把元素对调)
		int arr2[]=new int[7];
		for(int a=0,b=6;a<7;a++,b--){
			arr2[b]=arr1[a];
		}
		for(int a = 0;a<7;a++){
			System.out.println("int["+a+"]"+"="+arr2[a]);
			
		}
	}
}
