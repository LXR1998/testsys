package cn.edu.lingnan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import cn.edu.lingnan.util.DataAccess;

public class UserDAO {
	
	//����û���Ϣ
	public void AddUserInfo(String staff_login, String user_passwd,int is_manager)
	{
		boolean flag = false;
		
		Connection conn = null;
		PreparedStatement prep = null;
		
		conn = DataAccess.getConnection();
		System.out.println("���ӳɹ�����");
		
		String sql = "insert into user values(?,?,?)";
		try {
			prep = conn.prepareStatement(sql);
			prep.setString(1, staff_login);
			prep.setString(2,user_passwd);
			prep.setInt(3, is_manager);
			
			prep.executeUpdate();
			flag = true;
			System.out.println("����û���Ϣ�ɹ�����");
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	//�޸��û���Ϣ

}
