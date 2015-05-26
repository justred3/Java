package day16;

import java.util.Scanner;

/*
 * У��qq����.
 * 		1:Ҫ�������5-15λ����
 * 		2:0���ܿ�ͷ
 * 
 * ������
 * 		A:����¼��һ��QQ����
 * 		B:дһ������ʵ��У��
 * 		C:���ù��ܣ���������
 */
public class RegexDemo {
	public static void main(String[] args) {
		// �½�һ���������������û�����
		Scanner sc = new Scanner(System.in);
		// ��ʾ�û�����QQ����
		System.out.println("���������QQ���룺");
		// �����û�������
		String qq = sc.nextLine();
		System.out.println("checkQQ:" + checkQQ(qq));
	}

	/**
	 * дһ������ʵ��У��
	 * 
	 * @param qq
	 * @return
	 */
	public static boolean checkQQ(String qq) {
		boolean flag = true;
		// ���鳤��
		if (qq.length() >= 5 && qq.length() <= 15) {
			// 0���ܿ�ͷ
			if (!qq.startsWith("0")) {
				// ����������
				char arr[] = qq.toCharArray();
				for (int a = 0; a < arr.length; a++) {
					char ch = arr[a];
					if (!Character.isDigit(ch)) {
						flag = false;
						break;
					}

				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}
		return flag;
	}

}
