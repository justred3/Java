package day8;

/*��ʦ����
 ���������������ʦ����ҵ����ʦ
 ���ԣ����������䣬���Ρ�*/

abstract class Teacher {
	private String name;
	private int age;

	Teacher() {

	}

	Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	abstract void teach();
}

class JiuYe extends Teacher {
	JiuYe() {

	}

	JiuYe(String name, int age) {
		super.setName(name);
		super.setAge(age);
	}

	@Override
	void teach() {
		// TODO Auto-generated method stub
		System.out.println("��ҵ");
	}

}

class JiChu extends Teacher {
	JiChu() {

	}

	JiChu(String name, int age) {
		super.setName(name);
		super.setAge(age);
	}

	@Override
	void teach() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

}

public class AbstractTeacher {
	public static void main(String[] args) {
		Teacher a = new JiuYe("С��",14);
		a.teach();
	}
}
