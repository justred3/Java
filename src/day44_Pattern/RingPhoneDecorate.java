package day44_Pattern;

public class RingPhoneDecorate extends PhoneDecorate {

	public RingPhoneDecorate(Phone p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void call() {
		System.out.println("�ֻ�����������");
		super.call();
	}
	
}
