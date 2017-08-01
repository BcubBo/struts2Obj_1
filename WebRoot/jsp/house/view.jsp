<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VIEW页面</title>
</head>
<body style="background-color: darkgreen;">	
	<h1><strong style="color:black;">&copy;BcubBo&trade;</strong></h1>
	<h1><strong style="color:orange;">房屋信息</strong></h1>
	<h3><strong style="color:orange;">编号：<s:property value="house.id"/></strong></h3>
	<h3><strong style="color:orange;">标题：<s:property value="house.title"/></strong></h3>
	<h3><strong style="color:orange;">用户：<s:property value="house.user.username"/></strong></h3>	
	<h3><strong style="color:orange;">时间：<s:date name="house.addDate" format="yyyy-MM-dd-HH:mm:ss"/></strong></h3>
	<h3><strong style="color:orange;">街道：<s:property value="house.street.streetName"/></strong></h3>
	<h3><strong style="color:orange;">地区：<s:property value="house.district.districtName"/></strong></h3>
<%-- 	<s:debug/> --%>
	<s:include value="/jsp/house/copyright.jsp">
		<s:param name="t">1</s:param>
	
	
	</s:include>

</body>
</html>