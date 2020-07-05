package cn.edu.zucc.assistance.util;

import java.sql.Connection;

public class DBUtil {
	private static final String jdbcUrl="jdbc:mysql://39.101.189.21:3306/zjz1?useUnicode=true&characterEncoding=UTF-8";
	private static final String dbUser="sxj";
	private static final String dbPwd="991024sxj";
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws java.sql.SQLException{
		return java.sql.DriverManager.getConnection(jdbcUrl, dbUser, dbPwd);
	}
}
