package cn.edu.lingnan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cn.edu.lingnan.util.DataAccess;

public class Pay_managementDAO {

	//------------添加工资信息------------------
	public void AddPay
	(String staff_name,String staff_login,float base_pay,Float seniority_pay,Float overtime_pay,Float reword_pay,Float punish_pay,Float dedect_pay,Float actual_pay)
	{
		Connection conn = null;
		PreparedStatement prep = null;
		
		conn = DataAccess.getConnection();
		System.out.println("连接成功……");
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
			
			System.out.println("添加工资信息成功……");
			
		} 

		catch (SQLException e) {
			System.out.println("运行SQL语句时出现错误。。。。");
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
				System.out.println("关闭连接、语句时出现错误");
					e.printStackTrace();
				}
		}
	}
	
	
	
	
}
