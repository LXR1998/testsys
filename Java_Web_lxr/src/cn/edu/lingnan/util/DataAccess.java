package cn.edu.lingnan.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataAccess {
	public static Connection getConnection(){//获取连接的方法 
		Connection conn=null;		
		try {
			//第一步：加载驱动程序
			System.out.println("加载驱动程序········");
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//第二步：创建数据库连接
			System.out.println("创建数据库连接··········");
			conn=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/staff_db","root","lxr");
			
		} 
		catch (ClassNotFoundException e) {
			System.out.println("MYSQL的驱动程序加载失败");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("运行SQL语句时出现错误。");
			e.printStackTrace();
		}

		return conn;
	}
}
