package com.test.ora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class TestConnection {

	
	public static void main(String[] args) {
		
		OracleDriver ora = new OracleDriver();
		System.out.println("ojdbc14����");
		if(ora==null){
			System.out.println("����");
		}else{
			System.out.println("����");
		}
		System.out.println("����Ŭ����");
		//oracle: jdbc:oracle:thin:@ip�ּ�:��������Ʈ:sid
		//mysql:  jdbc:mysql://ip�ּ�:3306/
		//java db: jdbc:derby:testdb;create=true
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Properties info=new Properties();
		info.put("user","scott");
		info.put("password","tiger");
		try {
			Connection conn=DriverManager.getConnection(url,info);
			System.out.println("����");	
			conn.close();
		} catch (SQLException e) {
			System.out.println("����");
			e.printStackTrace();
		}
		
		
	}

}
