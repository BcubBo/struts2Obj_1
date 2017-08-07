<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 Demo</title>
</head>
<body style="background-color:darkgreen;background-image:url('/struts2Obj_1/image/7.gif')">
	<h1><strong style="color:black;">&copy;BcubBo&trade;</strong></h1>
	<h1><strong>STRUTS2 START!</strong></h1>
	<h1><strong>登录界面</strong></h1>
<br/><s:property value="#loginMsg"/><br/>
	<form action="<%=path %>/user/login.action" method="post">
		<input type="text" value="" name="user.username"><br/>
		<input type="password" value="" name="user.password"><br/>
		<input type="submit" value="登陆">
	</form>
<%-- <s:debug/> --%>
</body>
</html>