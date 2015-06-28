package day44_Pattern;

public class MusicPhoneDecorate extends PhoneDecorate {

	public MusicPhoneDecorate(Phone p) {
		super(p);
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		super.call();
		System.out.println("手机可以听音乐了");
	}
	
}
