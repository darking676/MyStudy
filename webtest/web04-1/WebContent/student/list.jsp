<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table width="100%" align="center">
	<tr>
		<td colspan="6" align="center">
			<h1>�л�����</h1>
		</td>
	</tr>
	<tr valign="top" align="center" bgcolor="#cccccc">
		<td width="20%"> </td>	
		<td width="100"><a href="../">HOME</a></td>
		<td width="100"><a href="./list.jsp">list</a></td>
		<td width="100"><a href="./add.jsp">�л����</a></td>
		<td width="100"><a href="./update.jsp">�����Է�</a></td>
		<td width="20%"> </td>
	</tr>
	<tr>
		<td colspan="6" align="center">
			<!-- ���� ���� -->
			<h1>�л� ���</h1>
			
			<table border="1" width="80%">
				<tr>
					<th>�й�</th>
					<th>�̸�</th>
					<th>����</th>
					<th>����</th>
					<th>����</th>
					<th>����</th>
				</tr>
				<%
				String sql="SELECT NUM,NAME,KOR,ENG,MATH FROM STUDENT ORDER BY NUM";
				String driver="oracle.jdbc.driver.OracleDriver";
				String url="jdbc:oracle:thin:@203.236.209.220:1521:xe";
				String id="scott";
				String pw="tiger";
				
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
				try{
				Class.forName(driver);
				conn=DriverManager.getConnection(url,id,pw);
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				while(rs.next()){
				%>
				<tr>
					<td><%=rs.getInt(1) %></td>
					<td><%=rs.getString(2) %></td>
					<td><%=rs.getInt(3) %></td>
					<td><%=rs.getInt(4) %></td>
					<td><%=rs.getInt(5) %></td>
					<td align="center">
					<form action="delete.jsp">
					<input type="hidden" name="num" value="<%=rs.getInt(1) %>">
					<input type="submit" value="����" >
					</form>
					</td>
				</tr>				
				<%
				}
				}catch(Exception e){
					System.out.println("����Ʈ����");
				}finally{
					if(rs!=null){rs.close();}
					if(stmt!=null){stmt.close();}
					if(conn!=null){conn.close();}
				}
				%>	
			</table>
			
			<!-- ���� �� -->
		</td>
	</tr>
</table>
</body>
</html>