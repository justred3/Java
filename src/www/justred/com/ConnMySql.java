package www.justred.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnMySql {
	public static void main(String[] args) throws Exception{
		//1.����������ʹ�÷���֪ʶ�������ȼ�ס��ôд
		Class.forName("com.mysql.jdbc.Driver");
		try(			//2.ʹ��DriverManager��ȡ���ݿ�����
			//���з��ص�Connection�ʹ�����Java��������ݿ������
			//��ͬ���ݿ��URLд����Ҫ�������ĵ����û�����������DBA����
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/select_test","root","32147");
			//3.ʹ��Connection������һ��Statement����
			Statement stmt = conn.createStatement();
			//ִ��SQL���
			/*Statement������ִ��SQL�ķ���
			 * 1.execute()��ִ���κ�SQL��䣬����һ��boolean
			 * ���ִ�к��һ�����صĽ����ResultSet,�򷵻�true,����false
			 * 2.executeQuery()ִ��select��䣬���ز�ѯ���Ľ����
			 * 3.executeUpdate()����ִ��DML��䣬����һ������
			 * ����SQL���Ӱ��ļ�¼����
			 * */
			ResultSet rs = stmt.executeQuery("select s.*,teacher_name"
					+"from student_table s, teacher_table t"
					+"where t.teacher_id=s.java_teacher"))
			{//ResultSet��һϵ�е�getXxx��������|���������������ڻ�ȡ��¼ָ��
			//ָ���У��ض��е�ֵ������ʹ��next()����¼ָ������һ��
			//����ƶ�֮���¼ָ����Ȼָ����Ч�У���next������������true
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs. getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
	
			}
		}
	}

