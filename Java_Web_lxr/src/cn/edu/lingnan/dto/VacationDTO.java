package cn.edu.lingnan.dto;

public class VacationDTO {
	private String staff_login;
	private String vacation_type;
	private String begin_time;
	private String end_time;
	private String remark;
	private String remark_boss;
	
	public String getstaff_login()
	{
		return staff_login;
	}
	public void setstaff_login(String Staff_login)
	{
		staff_login=Staff_login;
	}
	public String getvacation_type()
	{
		return vacation_type;
	}
	public void setvacation_type(String Vacation_type)
	{
		vacation_type=Vacation_type;
	}
	public String getbegin_time()
	{
		return begin_time;
	}
	public void setbegin_time(String Begin_time)
	{
		begin_time=Begin_time;
	}
	public String getend_time()
	{
		return end_time;
	}
	public void setend_time(String End_time)
	{
		end_time=End_time;
	}
	public String getremark()
	{
		return remark;
	}
	public void setremark(String Remark)
	{
		remark=Remark;
	}
	public String getremark_boss()
	{
		return remark_boss;
	}
	public void setremark_boss(String Remark_boss)
	{
		remark_boss=Remark_boss;
	}

}
