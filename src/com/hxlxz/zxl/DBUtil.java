package com.hxlxz.zxl;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DBUtil {
	//���ػ�����
	private static final String url = "jdbc:mysql://localhost:3306/penetrate";
	private static final String user = "root";
	private static final String password = "zxl13705991";
	//�Ʒ�����mysql
	/*private static final String url = "jdbc:mysql://localhost:3306/Penetrate";
	private static final String user = "root";
	private static final String password = "zxl@13705991";*/

	private static Connection conn=null;
	static{
			//1.������������
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					System.out.println("��������ʧ��");
					e.printStackTrace();
				}
				//2.������ݿ�����
				try {
				 conn = DriverManager.getConnection(url, user, password);
				} catch (SQLException e) {
					System.out.println("��ȡ����ʧ��");
					e.printStackTrace();
				}
	}
	public static Connection getConnection(){
		return conn;
	}
}
