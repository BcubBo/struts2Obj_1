<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body  style="background-image:url('/struts2Obj_1/image/19.jpg');background-repeat: repeat;">
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
	<br/>
	<h1><strong style="color:gold;font-size:20px;">房屋信息</strong></h1>
	<strong style="color:gold;font-size:20px;">标题：
		<s:property value="houses[1].title"/>
	</strong>
	<br/>
	<strong style="color:gold;font-size:20px;">用户：
		<s:property value="houses[1].user.username"/>
	</strong>
	<br/>
	<strong style="color:gold;font-size:20px;">街道：
		<s:property value="houses[1].street.streetName"/>
	</strong>
	<br/>
	<strong style="color:gold;font-size:20px;">地区：
		<s:property value="houses[1].street.district.districtName"/>
	</strong>

	<s:debug/>
	
	
	<div style="color:greenyellow;font-size:18px;">
	<h1>使用EL表达式</h1>
	<strong>
		
		标题：${requestScope.houses[2].title }<br/>
		用户：${requestScope.houses[2].user.username }<br/>
		街道：${requestScope.houses[2].street.streetName }<br/>
		地区：${requestScope.houses[2].district.districtName }<br/>
	</strong>
	</div>
	<span style="color:darkblue;font-size:18px;"><s:url var="url" namespace="/house" action="op_list">
		
		<s:param name="type">12</s:param>
		<s:param name="page">32</s:param>

	</s:url>
	
		<s:a href="%{url}">查看</s:a>
	</span>
	
	

</body>
</html>