<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>���� ������</h1>
	<form action="ex05.jsp">
		<table>
			<tr>		
				<td>�ؽ�Ʈ�ʵ�1</td>
				<td><input type="hidden" name="param1" value="msg" readonly="readonly"></td>
			</tr>
			<tr>		
				<td>�ؽ�Ʈ�ʵ�2</td>
				<td><input type="password" name="param2" value="msg2"></td>
			</tr>
			<tr>		
				<td>����Ʈ</td>
				<td>
					<select name="param3" multiple="multiple" size="2">
						<optgroup label="���� �� �����ϼ���">
						<option value="i1">item1</option>
						<option value="i2">item2</option>
						<option value="i3">item3</option>
						<option value="i4">item4</option>
						</optgroup>
					</select>
				</td>
			</tr>	
			<tr>		
				<td>�����ڽ�</td>
				<td>
					<input type="radio" name="ra" value="ra1" checked="checked">radio1
					<input type="radio" name="ra" value="ra2">radio2
					<input type="radio" name="ra" value="ra3">radio3
					<input type="radio" name="ra" value="ra4">radio4
				</td>
			</tr>
			<tr>		
				<td>üũ�ڽ�</td>
				<td>
					<input type="checkbox" name="box" value="ch1">check1
					<input type="checkbox" name="box" value="ch2">check2
					<input type="checkbox" name="box" value="ch3">check3
					<input type="checkbox" name="box" value="ch4">check4
				</td>
			</tr>
			<tr>		
				<td>�ؽ�Ʈ�ڽ�</td>
				<td>
					<textarea name="content" rows="7" cols="15"></textarea>
				</td>
			</tr>
			<tr>		
				<td colspan="2" align="center">
					<input type="submit" value="����">
					<input type="button" value="��ư">
					<input type="reset" value="���">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>