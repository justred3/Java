package day7;
/*
è����������

���ҵ���������Ȼ���־���������й��ԣ�����ȡ��һ�����ࡣ

è��
	��Ա���������������䣬��ɫ
	���췽�����޲Σ�����
	��Ա������
		getXxx()/setXxx()
		eat()
		palyGame()
����
	��Ա���������������䣬��ɫ
	���췽�����޲Σ�����
	��Ա������
		getXxx()/setXxx()
		eat()
		lookDoor()
		
���ԣ�
	��Ա���������������䣬��ɫ
	���췽�����޲Σ�����
	��Ա������
		getXxx()/setXxx()
		eat()
		
�ѹ��Զ��嵽һ�����У����������ֽУ����
�����ࣺ
	��Ա���������������䣬��ɫ
	���췽�����޲Σ�����
	��Ա������
		getXxx()/setXxx()
		eat()
		
	è��	
		���췽�����޲Σ�����
		��Ա������palyGame()
	����
		���췽�����޲Σ�����
		��Ա������lookDoor()
		*/
class Animal{
	private String name;
	private int age;
	private String color;
	Animal(){
		
	}
	Animal(String name,int age,String color){
		this.name=name;
		this.age=age;
		this.color=color;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//��ͬ���ص㣬���ǳ�
	public void eat(){
		System.out.println("Animal like eating");
	}
	
}
class Cat extends Animal{
	Cat(){
		
	}
	Cat(String name,int age,String color){
		super.setAge(age);
		super.setName(name);
		super.setColor(color);
	}
	public void playGame(){
		System.out.println("Cat always love game");
	}
}

class Dog extends Animal{
	Dog(){
		
	}
	Dog(String name,int age,String color){
		super.setAge(age);
		super.setColor(color);
		super.setName(name);
	}
	public void lookDoor(){
		System.out.println("Dog can lookDoor");
	}
}
	public class ExtendsTest2 {
		public static void main(String ages[]){
			//����è
			//��ʽ1
			Cat c1 = new Cat();
			c1.setName("Tom");
			c1.setAge(3);
			c1.setColor("��ɫ");
			System.out.println("è�������ǣ�"+c1.getName()+";�����ǣ�"+c1.getAge()+";��ɫ�ǣ�"+c1.getColor());
			c1.eat();
			c1.playGame();
			System.out.println("---------------");
			
			//��ʽ2
			Cat c2 = new Cat("����",5,"������");
			System.out.println("è�������ǣ�"+c2.getName()+";�����ǣ�"+c2.getAge()+";��ɫ�ǣ�"+c2.getColor());
			c2.eat();
			c2.playGame();
			
			//��ҵ�����Թ�
		}
}
