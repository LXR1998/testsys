package cn.edu.lingnan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cn.edu.lingnan.dto.Staff_infoDTO;
import cn.edu.lingnan.util.DataAccess;

import java.util.Vector;


public class Staff_infoDAO {
	
	
	//------------���Ա����Ϣ------------------
	public void AddStaffInfo
	(int staff_id,String staff_name, String staff_login,String staff_sex,int staff_age,String depart,String position,String staff_Tel,int entry_date,String staff_edu,int delete_flag)
	{
		Connection conn = null;
		PreparedStatement prep = null;
		
		conn = DataAccess.getConnection();
		System.out.println("���ӳɹ�����");
		String sql_AddInfo = 
				"insert into staff_info values(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			prep = conn.prepareStatement(sql_AddInfo);
			
			prep.setInt(1, staff_id);
			prep.setString(2, staff_name);
			prep.setString(3, staff_login);
			prep.setString(4, staff_sex);
			prep.setInt(5, staff_age);
			prep.setString(6, depart);
			prep.setString(7, position);
			prep.setString(8, staff_Tel);
			prep.setInt(9,entry_date);
			prep.setString(10,staff_edu);
			prep.setInt(11, delete_flag);
			
			prep.executeUpdate();
			
			System.out.println("���Ա����Ϣ�ɹ�����");
			
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
		
		
/*----------------------ɾ��Ա����Ϣ��ʹ����ɾ����-----------------------------*/
		public boolean DeleteStaff_info(String staff_login)
		{
			boolean flag = false;
			Connection conn = null;
			PreparedStatement prep = null;
			
			conn = DataAccess.getConnection();
			System.out.println("���ӳɹ�����");
			try {
				prep = conn.prepareStatement
						("update staff_info set delete_flag=? where staff_login=?");
				prep.setInt(1, 1);
				prep.setString(2,staff_login);
				prep.executeUpdate();
				
				flag = true;
				System.out.println("ɾ���ɹ�");
				
			} 
			
			catch (SQLException e) {
				System.out.println("����SQL���ʱ���ִ���");
				e.printStackTrace();
			}
			finally{
				
					try {
						if(prep!=null)
						{
							prep.close();
							prep = null;
						} 
						if(conn!=null)
						{
							conn.close();
							conn= null;
						}
					}
					catch (SQLException e) {
						System.out.println("�ر����ӡ���䡢�����ʱ���ִ���");
						e.printStackTrace();
				}
			}
			return flag;		
	}
		
		
//-------------��ѯ����Ա����Ϣ------------
		public Vector <Staff_infoDTO> FindAllInfo()
		{
			
			Vector <Staff_infoDTO> v = new Vector <Staff_infoDTO>();
			Connection conn = null;
			Statement stat = null;
			ResultSet rs = null;
			
			try {
				conn = DataAccess.getConnection();
				System.out.println("���ӳɹ�����");
				stat =conn.createStatement();
				String sql = "select * from staff_info";
				rs=stat.executeQuery(sql);
				
				//��������
				while(rs.next())
				{
					Staff_infoDTO s = new Staff_infoDTO();
					s.setstaff_id(rs.getInt("staff_id"));
					s.setstaff_login(rs.getString("staff_login"));
					s.setdepart(rs.getString("depart"));
					s.setposition(rs.getString("position"));
					s.setstaff_Tel(rs.getString("staff_Tel"));
					s.setstaff_name(rs.getString("staff_name"));
					s.setstaff_sex(rs.getString("staff_sex"));
					s.setstaff_edu(rs.getString("staff_edu"));
					s.setstaff_age(rs.getInt("staff_age"));
					s.setdelete_flag(rs.getInt("delete_flag"));
					s.setentry_date(rs.getString("entry_date"));
					v.add(s);
					
					
				}
				
			} 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				
					try {
						if(rs!=null)
						{
							rs.close();
							rs=null;
						}
						if(stat!=null)
						{
						stat.close();
						stat =null;
					} 
						if(conn!=null)
						{
							conn.close();
							conn= null;
						}
				}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return v;
		}
		
  //-------------����Ա�����޸�Ա������------------
		public void AlterStaff_nameBylogin(String staff_login,String staff_name)
		{
			Connection conn = null;
			PreparedStatement prep = null;
			
			conn = DataAccess.getConnection();
			System.out.println("���ӳɹ�����");
			try {
				prep = conn.prepareStatement
						("update staff_info set staff_name=? where staff_login=?");
				prep.setString(1, staff_name);
				prep.setString(2,staff_login);
				prep.executeUpdate();
				
				System.out.println("�޸ĳɹ�����");
				
			} 
			
			catch (SQLException e) {
				System.out.println("����SQL���ʱ���ִ���");
				e.printStackTrace();
			}
			finally{
				
					try {
						if(prep!=null)
						{
							prep.close();
							prep = null;
						} 
						if(conn!=null)
						{
							conn.close();
							conn= null;
						}
					}
					catch (SQLException e) {
						System.out.println("�ر����ӡ���䡢�����ʱ���ִ���");
						e.printStackTrace();
				}
			}
			
		}
		
		//-------------����Ա�����޸�Ա������------------
				public void AlterdepartBylogin(String staff_login,String depart)
				{
					Connection conn = null;
					PreparedStatement prep = null;
					
					conn = DataAccess.getConnection();
					System.out.println("���ӳɹ�����");
					try {
						prep = conn.prepareStatement
								("update staff_info set depart=? where staff_login=?");
						prep.setString(1, depart);
						prep.setString(2,staff_login);
						prep.executeUpdate();
						
						System.out.println("�޸ĳɹ�����");
						
					} 
					
					catch (SQLException e) {
						System.out.println("����SQL���ʱ���ִ���");
						e.printStackTrace();
					}
					finally{
						
							try {
								if(prep!=null)
								{
									prep.close();
									prep = null;
								} 
								if(conn!=null)
								{
									conn.close();
									conn= null;
								}
							}
							catch (SQLException e) {
								System.out.println("�ر����ӡ���䡢�����ʱ���ִ���");
								e.printStackTrace();
						}
					}
					
				}
	//-------------����Ա�����޸�Ա��ְλ------------
				public void AlterpositionBylogin(String staff_login,String position)
				{
					Connection conn = null;
					PreparedStatement prep = null;
					
					conn = DataAccess.getConnection();
					System.out.println("���ӳɹ�����");
					try {
						prep = conn.prepareStatement
								("update staff_info set position=? where staff_login=?");
						prep.setString(1, position);
						prep.setString(2,staff_login);
						prep.executeUpdate();
						
						System.out.println("�޸ĳɹ�����");
						
					} 
					
					catch (SQLException e) {
						System.out.println("����SQL���ʱ���ִ���");
						e.printStackTrace();
					}
					finally{
						
							try {
								if(prep!=null)
								{
									prep.close();
									prep = null;
								} 
								if(conn!=null)
								{
									conn.close();
									conn= null;
								}
							}
							catch (SQLException e) {
								System.out.println("�ر����ӡ���䡢�����ʱ���ִ���");
								e.printStackTrace();
						}
					}
					
				}	
				
	//-------------����Ա�����޸�Ա���绰------------
				public void AlterStaff_TelBylogin(String staff_login,String Staff_Tel)
				{
					Connection conn = null;
					PreparedStatement prep = null;
					
					conn = DataAccess.getConnection();
					System.out.println("���ӳɹ�����");
					try {
						prep = conn.prepareStatement
								("update staff_info set Staff_Tel=? where staff_login=?");
						prep.setString(1, Staff_Tel);
						prep.setString(2,staff_login);
						prep.executeUpdate();
						
						System.out.println("�޸ĳɹ�����");
						
					} 
					
					catch (SQLException e) {
						System.out.println("����SQL���ʱ���ִ���");
						e.printStackTrace();
					}
					finally{
						
							try {
								if(prep!=null)
								{
									prep.close();
									prep = null;
								} 
								if(conn!=null)
								{
									conn.close();
									conn= null;
								}
							}
							catch (SQLException e) {
								System.out.println("�ر����ӡ���䡢�����ʱ���ִ���");
								e.printStackTrace();
						}
					}
					
				}		
				
				
}


