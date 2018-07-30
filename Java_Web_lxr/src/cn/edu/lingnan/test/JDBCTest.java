package cn.edu.lingnan.test;

import java.util.Vector;

import cn.edu.lingnan.dao.Staff_infoDAO;
import cn.edu.lingnan.dao.UserDAO;
import cn.edu.lingnan.dao.VacationDAO;
import cn.edu.lingnan.dto.Staff_infoDTO;

public class JDBCTest {

	public static void main(String[] args) {
		
/*-----------------------插入用户信息的测试用例--------------------------*/
		UserDAO ud = new UserDAO();
		ud.AddUserInfo("00003","2016003",0);
		

/*---------------------查找所有员工的信息的测试用例------------------------------------*/		
			Staff_infoDAO si = new Staff_infoDAO();
			Vector<Staff_infoDTO> v = new Vector<Staff_infoDTO>();
			v=si.FindAllInfo();
			for(Staff_infoDTO sd : v)
				System.out.println
				(sd.getstaff_login()+"   "+sd.getstaff_name()+"   "+sd.getstaff_sex()+"   "+sd.getstaff_Tel()+"   "+sd.getposition()+"   "+sd.getstaff_edu());

		
/*-----------------------删除用户信息的测试用例--------------------------*/

		si.DeleteStaff_info("1002017101");
		
		
/*-------------------------根据员工号修改员工姓名的测试用例---------------------------*/
	
//	si.AlterStaff_nameBylogin( "1002015101", "李四");
	
	
	
/*-------------------------根据员工号修改员工部门的测试用例---------------------------*/
		si.AlterdepartBylogin("1002015101", "新闻部");
		
/*-------------------------根据员工号修改员工职位的测试用例---------------------------*/
		si.AlterpositionBylogin("1002015101", "普通职员");	
		
/*-------------------------根据员工号修改员工电话的测试用例---------------------------*/
		si.AlterStaff_TelBylogin("1002015101", "13566458609");
		
/*--------------------------添加请假/休假信息的测试用例----------------------------------*/
		VacationDAO vd = new VacationDAO();
		vd.AddVacation("1002015102", "病假","2018-04-13","2018-04-15",null,"已批准");

	}
}
