<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*,com.day05.util.MyOracle" errorPage="../err.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table width="800" align="center">
		<tr>
			<td align="center">
			 <img src="/web05/imgs/Lighthouse.jpg" width="300">
			</td>
		</tr>
		<tr>
			<td bgcolor="#cccccc" align="center">
				<a href="/web05/index.jsp">HOME</a>
				<a href="/web05/user/list.jsp">������</a>
				<a href="/web05/bbs/list.jsp">�Խ���</a>
				<a href="/web05/login/form.jsp">�α���</a>
			</td>
		</tr>
		<tr>
			<td valign="top">
				<h1>������</h1>
				<a href="add.jsp">������</a>
				<ol>
				<%
					String sql="SELECT * FROM BBS_USER ORDER BY SABUN";
					Connection conn=null;
					Statement stmt=null;
					ResultSet rs=null;
					try{
						conn=MyOracle.getConnection();
						stmt=conn.createStatement();
						rs=stmt.executeQuery(sql);
						while(rs.next()){
				%>	
				
					<li><%=rs.getInt(1) %>:<%=rs.getString(2) %></li>
				
				<%
						}
					}catch(Exception e){
						System.out.println("��ȸ ����");
					}finally{
						conn.close();
					}
				%>
				</ol>
				<br><br><br>
			</td>
		</tr>
		<tr>
			<td bgcolor="#cccccc">
			 ��Ʈķ��
			</td>
		</tr>
	</table>
</body>
</html>