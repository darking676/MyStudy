<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table width="100%">
		<tr>
			<td colspan="6">
				<h1>�����������α׷�(ver 0.6.0)</h1>
			</td>
		</tr>
		<tr bgcolor="#cccccc">
			<td>	</td>
			<td align="center" width="120" bgcolor="gray"><a href="../"><font color="#ffffff">HOME</font></a></td>
			<td align="center" width="120" bgcolor="gray"><a href="./list.jsp"><font color="#ffffff">��ü����</font></a></td>
			<td align="center" width="120" bgcolor="gray"><a href="./add.jsp"><font color="#ffffff">�л����</font></a></td>
			<td align="center" width="120" bgcolor="gray"><a href="./edit.jsp"><font color="#ffffff">�����Է�</font></a></td>
			<td>	</td>
		</tr>
		<tr>
		<td colspan="6" valign="top" align="center">
		<!-- content start -->
		<h1>�л���� ������</h1>
		<form action="./insert.jsp">
		<p>
			�й�:<input type="text" name="num">
		</p>
		<p>
			�̸�:<input type="text" name="name">
		</p>
		<p>
			<input type="submit" value="���"">
			<input type="reset" value="���">
		</p>					
		</form>
		<!-- content end -->
		</td>
		</tr>
	</table>
</body>
</html>