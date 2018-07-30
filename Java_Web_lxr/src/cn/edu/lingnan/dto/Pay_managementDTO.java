package cn.edu.lingnan.dto;

public class Pay_managementDTO {
	private String staff_name;//员工姓名
	private String staff_login;//员工工号
	private float base_pay;//基本工资
	private float seniority_pay;//工龄工资
	private float overtime_pay;//加班工资
	private float reword_pay;//奖金
	private float punish_pay;//罚款
	private float dedect_pay;//扣除工资
	private float actual_pay;//实发工资
	
	
	public String getstaff_name()
	{
		return staff_name;
	}
	public void setstaff_name(String Staff_name){
		staff_name=Staff_name;
	}
	
	public String getstaff_login()
	{
		return staff_login;
	}
	public void setstaff_login(String Staff_login)
	{
		staff_login=Staff_login;
	}
	
	public float getbase_pay()
	{
		return base_pay;
	}
	public void setbase_pay(float Base_pay)
	{
		base_pay=Base_pay;
	}
	
	public float getseniority_pay()
	{
		return seniority_pay;
	}
	public void setseniority_pay(float Seniority_pay)
	{
		seniority_pay=Seniority_pay;
	}
	
	public float getovertime_pay()
	{
		return overtime_pay;
	}
	public void setovertime_pay(float Overtime_pay)
	{
		overtime_pay=Overtime_pay;
	}
	
	public float getreword_pay()
	{
		return reword_pay;
	}
	public void setreword_pay(float Reword_pay)
	{
		reword_pay=Reword_pay;
	}
	
	public float getpunish_pay()
	{
		return punish_pay;
	}
	public void setpunish_pay(float Punish_pay)
	{
		punish_pay=Punish_pay;
	}
	
	public float getdedect_pay()
	{
		return dedect_pay;
	}
	public void setdedect_pay(float Dedect_pay)
	{
		dedect_pay=Dedect_pay;
	}
	
	public float getactual_pay()
	{
		return actual_pay;
	}
	public void setactual_pay(float Actual_pay)
	{
		actual_pay=Actual_pay;
	}
	

}
