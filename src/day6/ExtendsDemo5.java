package day6;
/**
 * ����Ҫ����ֲ�������num,��Ҫ�����Ա������num����Ҫ�������ĳ�Ա����
 * @author Administrator
 *this��super������
 *this�������Ӧ������
 *sper������洢�ռ�ı�ʶ���������Ϊ�������ã����Բ�������ĳ�Ա
 */
public class ExtendsDemo5 {
	public static void main(String[] args){
		Son1 s = new Son1();
		s.show();
	}
}
class Father1{
	public int num = 10;
}
class Son1 extends Father1{
	public int num = 20;
	
	public void show(){
		int num = 30;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}
