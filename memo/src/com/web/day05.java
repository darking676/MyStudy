package com.web;

public class day05 {

	/*
	 * web05���� �系 �Խ��Ǹ����
		errpage="false";
		������ ������ �� ������������ ������ ����
		
		��� db������ ���ϱ� ���� ���̺귯���� ����
		
		package com.mydb.ora;
		
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.SQLException;
		
		public class MyOracle {
		
			public static Connection getConnection(){
				Connection conn=null;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn=DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.220:1521:xe","scott","tiger");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return conn;
			}
				
		
		}
		
		�ۼ��Ͽ� �ͽ���Ʈ�� jar���Ϸ� ������
		��Ű��.Ŭ����.�޼���
	 * 
	 * ���� ���� ����̳�
	 * ��������Ʈ ������ �ڹٸ��ҽ� src���� �Ȱ��� �����Ͽ� ��밡��
	 * package com.day05.util;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.SQLException;
		
		public class MyOracle {
			public static Connection getConnection() throws SQLException, ClassNotFoundException{
				String url="jdbc:oracle:thin:@203.236.209.220:1521:xe";
				String id="scott";
				String pw="tiger";
				Class.forName("oracle.jdbc.driver.OracleDriver");
				return DriverManager.getConnection(url,id,pw);
			}
		}

	 * 
	 * 
	 * ���ڰ˻�
	 * 
	 * 	String sub=request.getParameter("sub");
		sub=sub.replace("<", "&lt;");
		sub=sub.replace(">", "&gt;");
		String content=request.getParameter("content");
		content=content.replace("<", "&lt;");
		content=content.replace(">", "&gt;");
		content=content.replace("\r\n", "\n");
		content=content.replace("\n", "<br>");
		content=content.replace(" ", "&nbsp;");
	 * 
	 * session.setAttribute("result", true);
	   session.setAttribute("sabun", sabun);
	 * �α����� �����Ҷ� ���
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
	}

}
