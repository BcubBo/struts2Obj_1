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
<body style="background-image:url('<%=path%>/image/15.gif');
	background-repeat: true;width:1000px;height:1000px;background-color:darkgreen;">
	<h1><strong style="color:black;">&copy;BcubBo&trade;</strong></h1>
	<h1><strong style="color:gold">动态调用方法，add方法添加成功</strong></h1>
	<h1 style="background-color: gold">取出user:<s:property value="user.username"/></h1>
<%-- 	<s:debug/> --%>
	<br/>
	添加结果<!-- 默认为xhtml -->
	<s:form>
		<s:textfield label="用户名"></s:textfield>
		<s:textfield label="密码"></s:textfield>		
		<s:textfield label="生日"></s:textfield>
		<s:textfield label="email"></s:textfield>	
	</s:form>
	
</body>
</html>