package day9_2;

/*
 �����⣺
 Ҫ������շֱ����30��20��10��

 ע�⣺
 1:�ڲ�����ⲿ��û�м̳й�ϵ��
 2:ͨ���ⲿ�����޶�this����
 Outer.this
 */
class OuterT {
	public int num = 10;

	class InnerT {
		public int num = 20;

		public void show() {
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			// System.out.println(new Outer().num);
			System.out.println(OuterT.this.num);
		}
	}
}

class InnerClassTest {
	public static void main(String[] args) {
		OuterT.InnerT oi = new OuterT().new InnerT();
		oi.show();
	}
}