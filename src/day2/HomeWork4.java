package day2;

public class HomeWork4 {
	public static void main(String[] args){
		int x = 2,y=3;

		switch(x)
		{
		//因为执行default后，没有break出来，所以会继续算下去;
			default:
				y++;
				
			case 3:
				y++;
				break;
			case 4:
				y++;
		}

		System.out.println("y="+y);
	}
}
