<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 Demo</title>
</head>
<body>
	<h1><strong>STRUTS2 START!</strong></h1>
	<h1><strong>登录界面</strong></h1>
	用户登录:<br/>
	<form action="<%=path %>/user/login" method="post">
	<!-- name属性里的名称要写相应的bean名称 -->
		<input type="text" value="" name="username"><br/>
		<input type="password" value="" name="password"><br/>
		<input type="submit" value="登陆">
	
	
	
	
	</form>

</body>
</html>