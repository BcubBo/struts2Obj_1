<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VIEW页面</title>
<style type="text/css">

	td{
		
		 border: 1px green solid;
		 background-color: darkblue;
		 text-align: center;
	
	}
	
	strong{
	
		color:gold;
		font-size:20px;
		
	
	}
	
	table{
		
		align:center; 
		border:3px black solid;
		width:1000px;
		height:500px;
	
	
	
	}

</style>
</head>
<body style="background-color: darkgreen;">	
	<h1><strong style="color:black;">&copy;BcubBo&trade;</strong></h1>


	<table >
	
		<tr>
		
			<td><strong >编号</strong></td>
			<td><strong >标题</strong></td>
			<td><strong >用户</strong></td>
			<td><strong >时间</strong></td>
			<td><strong >街道</strong></td>
			<td><strong >地区</strong></td>

		</tr>

		<tr style="">
			<td>
			<strong>
				<s:property value="house.id"/>
			</strong>
			</td>
			<td>
			<strong>
				<s:property value="house.title"/>
			</strong>
			</td>
			<td>
			<strong>
				<s:property value="house.user.username"/>
			</strong>
			</td>
			<td>
			<strong>
				<s:date name="house.addDate" format="yyyy-MM-dd-HH:mm:ss"/>
			</strong>
			</td>
			<td>
			<strong>
				<s:property value="house.street.streetName"/>
			</strong>			
			</td>
			<td>
			<strong>
				<s:property value="house.district.districtName"/>
			</strong>			
			</td>
		</tr>

	
	</table>	
<%-- 	<s:debug/> --%>
	<s:include value="/jsp/house/copyright.jsp">
		<s:param name="t">1</s:param>
	
	
	</s:include>

</body>
</html>