<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    String path=request.getParameter("path");
    
    
    %>
    
	<tr>
			<td align="center" bgcolor="#ccccccc">
				<a href="/web10/">HOME</a>
				<a href="<%=path %>/guest/list.jsp">�Խ���</a>
				<a href="<%=path %>/login/form.jsp">�α���</a>
			</td>
		</tr>
		<tr>
			<td>
				<!-- ���� ���� -->