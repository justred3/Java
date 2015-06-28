package day44_Pattern;

public class MusicPhoneDecorate extends PhoneDecorate {

	public MusicPhoneDecorate(Phone p) {
		super(p);
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		super.call();
		System.out.println("�ֻ�������������");
	}
	
}
