package day36_Pattern_����ģʽ;

/**
 * ��������ģʽ���� ��������ģʽ�г��󹤳��ฺ���崴������Ľӿڣ��������Ĵ��������ɼ̳г��󹤳��ľ�����ʵ�֡� �ŵ�
 * �ͻ��˲���Ҫ�ڸ������Ĵ������Ӷ���ȷ�˸������ְ��
 * ��������µĶ������ӣ�ֻ��Ҫ����һ���������;���Ĺ����༴�ɣ���Ӱ�����еĴ��룬����ά�����ף���ǿ��ϵͳ����չ�� ȱ�� ��Ҫ����ı�д���룬�����˹�����
 * 
 * @author Administrator
 * 
 */
public class AnimalDemo {
	public static void main(String[] args) {
		// ������Ҫ��ֻ��
		Factory f = new DogFactory();
		Animal a = f.createAnimal();
		a.eat();
		System.out.println("-------");
		
		//������Ҫ��ֻè
		f = new CatFactory();
		a = f.createAnimal();
		a.eat();
	}
}

