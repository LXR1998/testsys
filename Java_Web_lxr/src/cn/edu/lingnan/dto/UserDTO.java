package cn.edu.lingnan.dto;

public class UserDTO {//用户信息传输
	private String  staff_login;//员工工号
	private String user_passwd;//登录密码
	private int is_management;//用户权限字段
	
	public String getstaff_login()
	{
		return staff_login;
	}
	public void setstaff_login(String Staff_login)
	{
		staff_login=Staff_login;
	}
	
	public String getuser_passwd()
	{
		return user_passwd;
	}
	public void setuser_passed(String User_passwd)
	{
		user_passwd=User_passwd;
	}
	
	public int getis_management()
	{
		return is_management;
	}
	public void setis_management(int Is_management)
	{
		is_management=Is_management;
	}

}
