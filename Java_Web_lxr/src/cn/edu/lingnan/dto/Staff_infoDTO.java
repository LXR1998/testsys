package cn.edu.lingnan.dto;

public class Staff_infoDTO {//员工信息传递
	private int staff_id;//员工id
	private String staff_name;//员工姓名
	private String staff_login;//员工工号，作为登录账号
	private String staff_sex;//员工性别
	private int staff_age;//员工年龄
	private String depart;//部门
	private String position;//职位
	private String staff_Tel;//联系电话
	private String entry_date;//就职年份
	private String staff_edu;//学历
	private int delete_flag;//删除标志，1为已删，0为未删
	
	public int getstaff_id()
	{
		return staff_id;
	}
	public void setstaff_id(int Staff_id){
		staff_id=Staff_id;
	}
	
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
	
	public String getstaff_sex()
	{
		return staff_sex;
	}
	public void setstaff_sex(String Staff_sex)
	{
		staff_sex=Staff_sex;
	}
	
	public int getstaff_age()
	{
		return staff_age;
	}
	public void setstaff_age(int Staff_age){
		staff_age=Staff_age;
	}
	
	public String getdepart()
	{
		return depart;
	}
	public void setdepart(String Depart)
	{
		depart=Depart;
	}
	
	public String getposition()
	{
		return position;
	}
	public void setposition(String Position)
	{
		position=Position;
	}
	
	public String getstaff_Tel()
	{
		return staff_Tel;
	}
	public void setstaff_Tel(String Staff_Tel)
	{
		staff_Tel=Staff_Tel;
	}
	
	public String getentry_date()
	{
		return entry_date;
	}
	public void setentry_date(String Entry_date)
	{
		entry_date=Entry_date;
	}
	
	public String getstaff_edu()
	{
		return staff_edu;
	}
	public void setstaff_edu(String Staff_edu)
	{
		staff_edu=Staff_edu;
	}
	
	public int getdelete_flag()
	{
		return delete_flag;
	}
	public void setdelete_flag(int Delete_flag){
		delete_flag=Delete_flag;
	}

}
