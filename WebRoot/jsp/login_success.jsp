<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
    
    
    
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="<%=basePath %>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成功界面</title>
</head>
<body style="background-image:url('/struts2Obj_1/image/5.gif');
	background-repeat: true;width:auto;height:auto;">
	<h1 style="color:greenyellow">登陆成功</h1>
	<h1 style="color:greenyellow">用户:${sessionScope.user.username }</h1>
	<h1 style="color:greenyellow">密码:${sessionScope.user.password }</h1>
	<h1 style="color:greenyellow"><strong style="color:greenyellow"><s:actionmessage/></strong></h1>
	<h2 style="color:greenyellow"><strong style="color:greenyellow">struts标签显示</strong></h2>
	<h1 style="color:greenyellow"><strong style="color:greenyellow">用户:<s:property value="#session.user.username"/></strong></h1>
	<h1 style="color:greenyellow"><strong style="color:greenyellow">密码:<s:property value="#session.user.password"/></strong></h1>
	<h1 style="color:greenyellow">action中的user对象用户名:<s:property value="user.username"/></h1>
	<h1 style="color:greenyellow">action中的user对象密 码:<s:property value="user.username"/></h1>
</body>
</html>