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
<body style="background-image:url('<%=basePath%>/image/10.gif');
	background-repeat: true;width:auto;height:auto;">
	<h1>ModelDriven页面</h1>
	

	<h2><strong>struts标签显示</strong></h2>
	<h1><strong>用户:<s:property value="user.username"/></strong></h1>
	<h1><strong>密码:<s:property value="user.password"/></strong></h1>
	<h2><strong>struts modelDriven方法标签显示</strong></h2>
	<h1><strong>用户:<s:property value="username"/></strong></h1>
	<h1><strong>密码:<s:property value="password"/></strong></h1>
	<s:debug></s:debug>
	
</body>
</html>