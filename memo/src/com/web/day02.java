package com.web;

public class day02 {

	/*
	 * 
	 * �ڹ� �� ����ȯ�� ��ġ �� ����
	 * 
	 * 
	 * install new software
		juno
		web,xml,java ~~~
		
		��Ŭ���� �ڹ� EE �𺧷� ��
		��Ŭ���� �ڹ� �� �𺧷� ��
		��Ŭ���� �� �𺧷� ��
		�ڹٽ�ũ��Ʈ �𺧷� ��
		JST ���� ����� Ȯ��
		
		��ġ
		
		����ȯ�� ����
		open perspective
	 *  JAVA EE�� ����
	 * window
		show view
		servers
		new server wizard
		����ġ ��Ĺ7.3
		 browse ��ġ��� ���ϰ�
		jre �ڹ� ��ġ���� �ǴϽ�
	 * 
	 * 
	 * �÷��� �����ͺ��̽� �𺧷� üũ�� ��ġ
	 * �����ͺ��̽� �𺧷� ��ġ��
		�����ͺ��̽� �ҽ� �ͽ��÷η�
		�����ͺ��̽� Ŀ�ؼ� new
		����Ŭ ������
		�� ����̺�
		����Ŭ thin ����̹� 10����
		�ڸ� ��μ���
		xe
		host ip
		���� scott tiger
	 * 
	 * 
	 * ���̳��� �� ������Ʈ�� ����
	 * 
	 * �޸��� html ����
	 * 
	 * ex02.html
	 * <html>
		<head>
		<!--������ ���� -->
			<title>����</title>
		
		</head>
		<body>
		<!--������ �������� �κ� -->	
		My Web Site
		<img src="https://s.pstatic.net/static/www/img/2017/sp_main_v171220.png">
		
		<h1>��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;���±�1</h1>
		<p><font size=3 face='�ü�ü' color='red'>��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;��1<br></font>
		</p>
		
		��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;��2<br>
		����3<br>
		<h2>�����±�2</h2>
		����
		<h3>�����±�3</h3>
		����
		<h4>�����±�4</h4>
		����
		<h5>�����±�5</h5>
		����
		<h6>�����±�6</h6>
		����	
		<hr>
		<hr>	
		</body>
	</html>
	 * 
	 * 
	 * 
	 * ex07.html
	 * <frameset rows="150,*">
			<frame src="top.html" noresize scrolling="no" frameborder="no">
			<frameset cols="200,*" noresize scrolling="no">
				<frame src="menu.html" frameborder="no">
				<frame name="main" src="main.html" frameborder="no">
			</frameset>
		</frameset>
	 * top.html
	 * <html>
		<body>
		<img height="80%" src="https://s.pstatic.net/static/www/img/2017/sp_main_v171220.png">
		</body>
		</html>
	 * menu.html
	 * <html>
		<body>
		<ul>
			<li><a href="main.html" target="main">HOME</li>
			<li><a href="ex01.html" target="main">menu2</li>
			<li><a href="ex02.html" target="main">menu3</li>
			<li><a href="ex07.html" target="main">menu4</li>
		</ul>
		</body>
		</html>
	 * main.html
	 * <html>
		<body>
		<h1>�ȳ��ϼ���</h1>
		</body>
		</html>
	 * 
	 * ex08.html
	 * <html>
		<head>
		</head>
		<body>
			<table>
				<tr>
					<td colspan="2"><img src="imgs/top.jpg"></td>
				</tr>
				<tr>
					<td><img src="imgs/menu.jpg"></td>
					<td><img src="imgs/HOME.jpg"></td>
				</tr>
			</table>
		</body>
		</html>
	 * 
	 * ex11.html
	 * <html>
		<head>
		</head>
		<body>
			<marquee direction="right">������ ���� �帧</marquee>
			<h1>������ â</h1>
			<iframe name="main" frameborder="0" scrolling="no" src="ex01.html"></iframe>
			<a href="ex02.html" target="main">next</a>
		</body>
		</html>
	 * 
	 * 
	 * ex12.html
	 * <html>
		<head></head>
		<body>
			<h1>ȸ������</h1>
			<form>
			id:<input type="text" size="10"><br>
			pw:<input type="password"><br>
			content<textarea rows="10" cols="20"></textarea><br>
			<input type="button" value="��ư"><br>
			<select>
				<option>item1</option>
				<option>item2</option>
				<option>item3</option>
				<option>item4</option>
				<option>item5</option>
			</select><br>
			
			<input type="checkbox">item1
			<input type="checkbox">item2
			<input type="checkbox">item3
		<br>
			<input type="radio" name="ra">item1
			<input type="radio" name="ra">item2
			<input type="radio" name="ra">item3
			</form>
		</body>
		</html>
	 * 
	 * 
	 * ex01.jsp
	 * <html>
		<head></head>
			<body>
				<h1>jsp page</h1>
				<%
				int a=9;
				for(int i=0;i<10;i++){
					out.println(a+"x"+i+"="+a*i+"<br>");
				}
				%>
			</body>
		</html>
	 * 
	 * 
	 */
	
	
	
	/*
	 * ��Ŭ���� �� ����
	 * 
	 * html��� jsp
	 * <% %> �ȿ��� �ڹ� ���
	 * ex05.jsp 
	 * <%@ page language="java" contentType="text/html; charset=EUC-KR"
		    pageEncoding="EUC-KR"%>
		   <%//��Ƽ�� - Ŭ������ %>
		 <%@ page import="java.util.Date"  %>
		<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
		<title>Insert title here</title>
		</head>
		<%! //����� Ŭ������,�޼��� ��
			public int func01(int a,int b){
				//System.out.println(a*b);
				return a*b;
			}
		%>
		<body>
		<% //��ũ��Ʈ�� - ����� ����
			Date date=new Date();
			out.println(date+"<br>");
			//ǥ���� �ؿ� <%= 
		%>
		<%=date %>
			<table whidth="800" border="1" cellspacing="0">
			<tr>
			<%for (int i=2;i<10;i++){
				out.print("<td>"+i+"��</td>");
			}
			%>
			</tr>
			<%
			for(int i=1;i<10;i++){
				out.print("<tr>");
				for(int j=2;j<10;j++){
					out.print("<td>"+j+"X"+i+"="+func01(j,i)+"</td>");
				}
				out.print("</tr>");
			}
			%>
			</table>
		</body>
		</html>
	 * 
	 * 
	 * 
	 * 	<% //��ũ��Ʈ���� ���尴ü
		String addr=request.getRemoteAddr();
		System.out.println("addr:"+addr);
		String prot=request.getProtocol();
		System.out.println("protocol:"+prot);
		int port=request.getRemotePort();
		System.out.println("port:"+port);
		int port2=request.getLocalPort();
		System.out.println("port2:"+port2);
		String uri=request.getRequestURI();
		System.out.println("uri:"+uri);
		%>
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	 public void main(String[] args){
		 
	 }

}
