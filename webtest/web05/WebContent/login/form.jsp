<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
				<%
				Boolean login=(Boolean)application.getAttribute("result");
				if(login==null||login==false){
				%>
				<a href="/web05/login/form.jsp">�α���</a>
				<%}else{ %>
				<a href="/web05/login/logout.jsp">�α׾ƿ�</a>
				<%} %>
			</td>
		</tr>
		<tr>
			<td valign="top" align="center">
				<h1>�α���</h1>
				<form action="login.jsp" method="post">
				<table>
					<tr>
						<td>���</td>
						<td><input type="text" name="sabun"></td>
					</tr>
					<tr>
						<td>�̸�</td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit" value="�α���">
							<input type="reset" value="���">
						</td>
					</tr>
				</table>
				</form>
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