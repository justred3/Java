package day3;
/**
 * 公司年销售额求和
某公司按照季度和月份统计的数据如下：单位(万元)
第一季度：22,66,44
第二季度：77,33,88
第三季度：25,45,65
第四季度：11,66,99
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
