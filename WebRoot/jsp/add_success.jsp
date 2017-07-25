<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
    <%String path  = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加方法</title>
</head>
<body style="background-image:url('<%=path%>/image/16.gif');
	background-repeat: true;width:auto;height:auto;">
	<h1><strong style="color:gold">动态调用方法，add方法添加成功</strong></h1>
	<h1 style="background-color: gold">取出user:<s:property value="user.username"/></h1>
	<s:debug/>
	
	
</body>
</html>