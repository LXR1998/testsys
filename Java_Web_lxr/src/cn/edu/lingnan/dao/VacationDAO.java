package cn.edu.lingnan.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cn.edu.lingnan.util.DataAccess;

public class VacationDAO {
	
	
	//------------添加休假/请假信息------------------
	public void AddVacation
		(String staff_login,String vocatoin_type,String begin_time,String end_time,String remark,String remark_boss)
		{
			Connection conn = null;
			PreparedStatement prep = null;
			
			conn = DataAccess.getConnection();
			System.out.println("连接成功……");
			String sql_AddInfo = 
					"insert into vacation values(?,?,?,?,?,?)";
			try {
				prep = conn.prepareStatement(sql_AddInfo);
				
				prep.setString(1, staff_login);
				prep.setString(2, vocatoin_type);
				prep.setString(3, begin_time);
				prep.setString(4, end_time);
				prep.setString(5, remark);
				prep.setString(6, remark_boss);
				prep.executeUpdate();
				
				System.out.println("添加信息成功……");
				
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
