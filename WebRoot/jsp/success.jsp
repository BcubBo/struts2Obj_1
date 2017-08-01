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
<body style="background-image:url('<%=basePath%>/image/11.gif');
	background-repeat: true;width:auto;height:auto;background-color:darkgreen;">
	<h1>默认执行父类execute方法成功界面</h1>
	<h1><strong><s:actionmessage/></strong></h1>
	
</body>
</html>