package cn.edu.lingnan.dto;

public class Staff_infoDTO {//Ա����Ϣ����
	private int staff_id;//Ա��id
	private String staff_name;//Ա������
	private String staff_login;//Ա�����ţ���Ϊ��¼�˺�
	private String staff_sex;//Ա���Ա�
	private int staff_age;//Ա������
	private String depart;//����
	private String position;//ְλ
	private String staff_Tel;//��ϵ�绰
	private String entry_date;//��ְ���
	private String staff_edu;//ѧ��
	private int delete_flag;//ɾ����־��1Ϊ��ɾ��0Ϊδɾ
	
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
