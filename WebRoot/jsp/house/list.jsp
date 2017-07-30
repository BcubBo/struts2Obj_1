<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><strong style="color:gold;font-size:20px;">房屋信息</strong></h1>
	<strong style="color:gold;font-size:20px;">标题：
		<s:property value="houses[0].title"/>
	</strong>
	<br/>
	<strong style="color:gold;font-size:20px;">用户：
		<s:property value="houses[0].user.username"/>
	</strong>
	<br/>
	<strong style="color:gold;font-size:20px;">街道：
		<s:property value="houses[0].street.streetName"/>
	</strong>
	<br/>
	<strong style="color:gold;font-size:20px;">地区：
		<s:property value="houses[0].street.district.districtName"/>
	</strong>

	<s:debug/>

</body>
</html>