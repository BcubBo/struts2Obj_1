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
	<h1><strong style="color:black;">&copy;BcubBo&trade;</strong></h1>
	<h1><strong style="color:gold;font-size:20px;">房屋信息</strong></h1>

	


<%-- 	<s:debug/> --%>
	
	<table>
	
		<tr>
		
			<td>编号：</td>
			<td>标题：</td>
			<td>用户：</td>
			<td>时间：</td>
			<td>街道：</td>
			<td>地区：</td>
			
		
		
		</tr>
		<s:iterator var="house"	value="houses" status="st">
		<tr>
			<td>
			<strong style="color:gold;font-size:20px;">
				<s:property value="house.id"/>
			</strong>
			</td>
			<td>
			<strong style="color:gold;font-size:20px;">
				<s:property value="house.title"/>
			</strong>
			</td>
			<td>
			<strong style="color:gold;font-size:20px;">：
				<s:property value="house.user.username"/>
			</strong>
			<td/>
			<td>
			<strong style="color:gold;font-size:20px;">
				<s:date name="house.addDate" format="yyyy-MM-dd-HH:mm:ss"/>
			</strong>
			</td>
			<td>
			<strong style="color:gold;font-size:20px;">
				<s:property value="house.street.streetName"/>
			</strong>			
			</td>
			<td>
			<strong style="color:gold;font-size:20px;">
				<s:property value="house.district.districtName"/>
			</strong>			
			</td>
		</tr>
		</s:iterator>
	
	</table>

	<span style="color:darkblue;font-size:18px;"><s:url var="url" namespace="/house" action="op_view">
		
		<s:param name="id" >1001</s:param>

	</s:url>
	
		<s:a href="%{url}">查看</s:a>
	</span>

</body>
</html>