package cn.edu.lingnan.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataAccess {
	public static Connection getConnection(){//��ȡ���ӵķ��� 
		Connection conn=null;		
		try {
			//��һ����������������
			System.out.println("�����������򡤡�������������");
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//�ڶ������������ݿ�����
			System.out.println("�������ݿ����ӡ�������������������");
			conn=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/staff_db","root","lxr");
			
		} 
		catch (ClassNotFoundException e) {
			System.out.println("MYSQL�������������ʧ��");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("����SQL���ʱ���ִ���");
			e.printStackTrace();
		}

		return conn;
	}
}
