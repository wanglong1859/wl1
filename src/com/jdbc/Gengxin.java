package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class Gengxin {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","12345678.W");
		Statement yuju=lianjie.createStatement();
		String sql="UPDATE tb_user SET email = 'jack@qq.com' WHERE id = 1";
		yuju.execute(sql);
	}

}
