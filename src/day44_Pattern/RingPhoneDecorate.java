package day44_Pattern;

public class RingPhoneDecorate extends PhoneDecorate {

	public RingPhoneDecorate(Phone p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void call() {
		System.out.println("手机可以听彩铃");
		super.call();
	}
	
}
