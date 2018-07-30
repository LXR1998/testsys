package cn.edu.lingnan.test;

import java.util.Vector;

import cn.edu.lingnan.dao.Staff_infoDAO;
import cn.edu.lingnan.dao.UserDAO;
import cn.edu.lingnan.dao.VacationDAO;
import cn.edu.lingnan.dto.Staff_infoDTO;

public class JDBCTest {

	public static void main(String[] args) {
		
/*-----------------------�����û���Ϣ�Ĳ�������--------------------------*/
		UserDAO ud = new UserDAO();
		ud.AddUserInfo("00003","2016003",0);
		

/*---------------------��������Ա������Ϣ�Ĳ�������------------------------------------*/		
			Staff_infoDAO si = new Staff_infoDAO();
			Vector<Staff_infoDTO> v = new Vector<Staff_infoDTO>();
			v=si.FindAllInfo();
			for(Staff_infoDTO sd : v)
				System.out.println
				(sd.getstaff_login()+"   "+sd.getstaff_name()+"   "+sd.getstaff_sex()+"   "+sd.getstaff_Tel()+"   "+sd.getposition()+"   "+sd.getstaff_edu());

		
/*-----------------------ɾ���û���Ϣ�Ĳ�������--------------------------*/

		si.DeleteStaff_info("1002017101");
		
		
/*-------------------------����Ա�����޸�Ա�������Ĳ�������---------------------------*/
	
//	si.AlterStaff_nameBylogin( "1002015101", "����");
	
	
	
/*-------------------------����Ա�����޸�Ա�����ŵĲ�������---------------------------*/
		si.AlterdepartBylogin("1002015101", "���Ų�");
		
/*-------------------------����Ա�����޸�Ա��ְλ�Ĳ�������---------------------------*/
		si.AlterpositionBylogin("1002015101", "��ְͨԱ");	
		
/*-------------------------����Ա�����޸�Ա���绰�Ĳ�������---------------------------*/
		si.AlterStaff_TelBylogin("1002015101", "13566458609");
		
/*--------------------------������/�ݼ���Ϣ�Ĳ�������----------------------------------*/
		VacationDAO vd = new VacationDAO();
		vd.AddVacation("1002015102", "����","2018-04-13","2018-04-15",null,"����׼");

	}
}
