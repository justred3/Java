package day4;
/**
 * Student������
 * @author Administrator
 *
 */
public class StudentDemo {
	public static void main(String[] args) {
		//���� ������ = new ����();
		Student s = new Student();
		
		//�����Ա����ֵ
		//System.out.println(s.name);
		//System.out.println(s.age);
		//System.out.println(s.address);
		//�Ľ�д��
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		
		
		//����Ա������ֵ
		s.name = "����ϼ";
		s.age = 27;
		s.address = "����";
		//��ֵ������
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		
		//���÷���
		s.study();
		s.eat();
		s.sleep();
	}
}
