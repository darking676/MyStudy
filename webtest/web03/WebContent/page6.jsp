<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table width="800" align="center">
		<tr>
			<td colspan="2">
				<a href="ex08.jsp"><img alt="logo" src="imgs/logo.jpg" width="200"></a>
			</td>
		</tr>
		<tr>
			<td width="150" height="600" bgcolor="#9999ff">
				<p><a href="page1.jsp">�λ縻</a></p>
				<p><a href="page2.jsp">���ô±�</a></p>
				<p><a href="page3.jsp">�Խ���</a></p>
				<p><a href="#">����</a></p>
				<p><a href="#">���</a></p>
			</td>
			<td>
			<!-- ���� �� �κ� -->
			<%
			int empno=Integer.parseInt(request.getParameter("empno"));
			String ename=request.getParameter("ename");
			String job=request.getParameter("job");
			int mgr=Integer.parseInt(request.getParameter("mgr"));
			int sal=Integer.parseInt(request.getParameter("sal"));
			int deptno=Integer.parseInt(request.getParameter("deptno"));
				String sql="insert into emp (empno,ename,job,mgr,hiredate,sal,deptno)";
			sql+="values("+empno+",'"+ename+"','"+job+"',"+mgr+",sysdate,"+sal+","+deptno+")";
			Connection conn=null;
			Statement stmt=null;
			
			try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.220:1521:xe","scott","tiger");
			stmt=conn.createStatement();
			int cnt=stmt.executeUpdate(sql);
			
			if(cnt>0){
				//out.println("<h1>�Է¿Ϸ�</h1>");
				response.sendRedirect("page3.jsp");
			}else{
				out.println("<h1>�Է½���</h1>");
			}
			}catch(ClassNotFoundException e){
				System.out.println("����̹� jar���� ���� Ȯ�� ���");
				out.println("<h1>�Է½���</h1>");
			}catch(SQLException e){
				System.out.println("���ӽ���(url,id,pw)Ȯ�ο��");
				out.println("<h1>��� �� ��õ� �ٶ��ϴ�</h1>");
			}finally{
				stmt.close();
				conn.close();
			}
			%>			
			</td>
		</tr>
	</table>
</body>
</html>