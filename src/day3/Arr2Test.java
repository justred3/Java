package day3;
/**
 * ��˾�����۶����
ĳ��˾���ռ��Ⱥ��·�ͳ�Ƶ��������£���λ(��Ԫ)
��һ���ȣ�22,66,44
�ڶ����ȣ�77,33,88
�������ȣ�25,45,65
���ļ��ȣ�11,66,99
 * @author Administrator
 *
 */
public class Arr2Test {
	public static void main(String[] args){
		int arr[][] = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		int sum=0;
		for(int a = 0;a<4;a++){
			for(int b= 0;b<3;b++){
				sum +=arr[a][b];
			}
			
		}
		System.out.println(sum);
	}
}
