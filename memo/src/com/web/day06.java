package com.web;

public class day06 {

	/*
	 * web06 �޼��� ����
	 * web07 ���������� �޼��� ����
	 * web08 ��������
	 *  
	 * �� ������Ʈ�� �ֻ��� ������ ���
	 * String rootPath=application.getContextPath();
	 * 
	 * java.net.URL url=application.getResource("myfile.txt");
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getPath());
		
		String real=application.getRealPath("myfile.txt");
		System.out.println(real);
	 * 
	 * application.setAttribute("msg", "abcd1234");//�������� ����
		session.setAttribute("msg2", "asdfe13434");//������������ ����
		request.setAttribute("msg3", "req");//�������� ������ ����
		pageContext.setAttribute("msg4", "page");//������ �������� ����
	 * 
	 * 
	 * 	<%
		String id=session.getId();
		long time=session.getCreationTime();
		long time2=session.getLastAccessedTime();
		java.util.Date date=new java.util.Date(time);
		java.util.Date date2=new java.util.Date(time2);
		session.setAttribute("msg", "asdasdwq123");
		String msg2=(String)session.getAttribute("msg2");
		
		System.out.println(session.getMaxInactiveInterval());
		%>
		<h1>���ǰ�ü</h1>
		<p>id:<%=id %></p>
		<p>date:<%=date %></p>
		<p>date2:<%=date2 %></p>
		<p>msg2:<%=msg2 %></p>
		<a href="ex08.jsp">next</a>	
			
	 * session.invalidate(); ���� ��ü ����
	 * 
	 * 
	 * get����϶� �ѱ�ó��
	 * tomcat server-> server.xml
	 * <Connector connectionTimeout="20000" port="8080" protocol="HTTP/1.1" URIEncoding="euc-kr" redirectPort="8443"/>
	 * �Ӽ��� URIEncoding="euc-kr" �߰�
	 * request.setCharacterEncoding("EUC-KR");//post ����϶� �ѱ����
	 * 
	 * 
	 * <%
		//db�۾�
			String driver=application.getInitParameter("driver");
			String url=application.getInitParameter("url");
			String user=application.getInitParameter("user");
			String password=application.getInitParameter("password");
			
			ArrayList<HashMap> list=new ArrayList<HashMap>();
			
			Connection conn=null;
			Statement stmt=null;
			ResultSet rs=null;
			
			try{
				Class.forName(driver);
				conn=DriverManager.getConnection(url,user,password);
				stmt=conn.createStatement();
				rs=stmt.executeQuery("select rownum as rn,sabun,name,nalja,pay from guest");
				while(rs.next()){
					HashMap map=new HashMap();
					map.put("rn", rs.getInt(1));
					map.put("sabun", rs.getInt(2));
					map.put("name", rs.getString(3));
					map.put("nalja", rs.getDate(4));
					map.put("pay", rs.getInt(5));
					list.add(map);
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			}
		%>
		<body>
			<table width="80%" align="center">
				<tr>
					<td><img alt="logo" src="<%=application.getContextPath() %>/imgs/Desert.jpg" width="100"></td>
				</tr>
				<tr>
					<td align="center" bgcolor="#cccccc">
						<a href="<%=application.getContextPath()%>">[HOME]</a>
						<a href="<%=application.getContextPath()%>/guest/list.jsp">[GUEST]</a>
						<a href="#">[LOGIN]</a>
					</td>
				</tr>
				<tr>
					<td align="center">
						<h1>����Ʈ������</h1>
						<hr>
						<table>
							<tr>
								<td>��ȣ</td>
								<td>���</td>
								<td>�̸�</td>
								<td>��¥</td>
								<td>�ݾ�</td>
							</tr>
							<%
							for(int i=0;i<list.size();i++){
								HashMap hm=list.get(i);
							%>
							<tr>
								<td><%=hm.get("rn") %></td>
								<td><%=hm.get("sabun") %></td>
								<td><a href="detail.jsp?sabun=<%=hm.get("sabun")%>"><%=hm.get("name") %></a></td>
								<td><%=hm.get("nalja") %></td>
								<td><%=hm.get("pay") %></td>
							</tr>
							<%} %>
						</table>
						<a href="add.jsp">[�Է�]</a>
					</td>
				</tr>
				<tr>
					<td>
					Copyright &copy; ��Ʈķ�� All rights reserved.
					</td>
				</tr>
			</table>
	 *
	 *
	 *
	 *
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
