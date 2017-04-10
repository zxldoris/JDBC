package com.hxlxz.zxl;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DBUtil {
	//本地机连接
	private static final String url = "jdbc:mysql://localhost:3306/penetrate";
	private static final String user = "root";
	private static final String password = "zxl13705991";
	//云服务器mysql
	/*private static final String url = "jdbc:mysql://localhost:3306/Penetrate";
	private static final String user = "root";
	private static final String password = "zxl@13705991";*/

	private static Connection conn=null;
	static{
			//1.加载驱动程序
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					System.out.println("加载驱动失败");
					e.printStackTrace();
				}
				//2.获得数据库连接
				try {
				 conn = DriverManager.getConnection(url, user, password);
				} catch (SQLException e) {
					System.out.println("获取连接失败");
					e.printStackTrace();
				}
	}
	public static Connection getConnection(){
		return conn;
	}
}
