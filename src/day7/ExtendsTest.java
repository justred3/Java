package day7;
/*
ѧ����������ʦ��������

ѧ����
	��Ա����������������
	���췽�����޲Σ�����
	��Ա������getXxx()/setXxx()
��ʦ��
	��Ա����������������
	���췽�����޲Σ�����
	��Ա������getXxx()/setXxx()
*/
public class ExtendsTest {
	public static void main(String[] args){
		//����ѧ�����󲢲���
				//��ʽ1
				Student s1 = new Student();
				s1.setName("����ϼ");
				s1.setAge(27);
				System.out.println(s1.getName()+"---"+s1.getAge());
				
				//��ʽ2
				Student s2 = new Student("����ϼ",27);
				System.out.println(s2.getName()+"---"+s2.getAge());
				
				//��Ӧ����ʦ�����Ҳ����ˣ����������Լ���ϰ��
	}
}
//����ѧ����
class Student{
	private String name;
	private int age;
	Student(){
	}
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}

//������ʦ��
class Teacher{
	private String name;
	private int age;
	Teacher(){
	}
	Teacher(String name,int age){
		this.name=name;
		this.age=age;
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
	
}