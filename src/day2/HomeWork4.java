package day2;

public class HomeWork4 {
	public static void main(String[] args){
		int x = 2,y=3;

		switch(x)
		{
		//��Ϊִ��default��û��break���������Ի��������ȥ;
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
