package day21_Set_Son;

public class Student2 implements Comparable<Student2>{
	private String name;
	private int age;
	
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student2(String name, int age) {
		super();
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

	@Override
	public int compareTo(Student2 s) {
		// return 0;
		// return 1;
		// return -1;

		// ���ﷵ��ʲô����ʵӦ�ø����ҵ������������
		// ������������,��Ҫ����
		int num = this.age - s.age;
		// ��Ҫ����
		// ������ͬ��ʱ�򣬻���ȥ�������Ƿ�Ҳ��ͬ
		// ����������������ͬ������ͬһ��Ԫ��
		int num2 = num == 0 ? this.name.compareTo(s.name) : num;
		return num2;
	}
}
