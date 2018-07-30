package cn.edu.lingnan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cn.edu.lingnan.util.DataAccess;

public class Pay_managementDAO {

	//------------��ӹ�����Ϣ------------------
	public void AddPay
	(String staff_name,String staff_login,float base_pay,Float seniority_pay,Float overtime_pay,Float reword_pay,Float punish_pay,Float dedect_pay,Float actual_pay)
	{
		Connection conn = null;
		PreparedStatement prep = null;
		
		conn = DataAccess.getConnection();
		System.out.println("���ӳɹ�����");
		String sql_AddInfo = 
				"insert into staff_info values(?,?,?,?,?,?,?,?)";
		try {
			prep = conn.prepareStatement(sql_AddInfo);
			
			prep.setString(1, staff_login);
			prep.setFloat(2, base_pay);
			prep.setFloat(3, seniority_pay);
			prep.setFloat(4, overtime_pay);
			prep.setFloat(5, reword_pay);
			prep.setFloat(6, punish_pay);
			prep.setFloat(7, dedect_pay);
			prep.setFloat(8, actual_pay);
			
			
			
			prep.executeUpdate();
			
			System.out.println("��ӹ�����Ϣ�ɹ�����");
			
		} 

		catch (SQLException e) {
			System.out.println("����SQL���ʱ���ִ��󡣡�����");
			e.printStackTrace();
		}
		
		finally{
			
				try {
					if(prep!=null)
						{
						prep.close();
						prep=null;
						}
					if(conn!=null)
					{
						conn.close();
						conn= null;
					}					
				} 			
			catch (SQLException e) {
				System.out.println("�ر����ӡ����ʱ���ִ���");
					e.printStackTrace();
				}
		}
	}
	
	
	
	
}
