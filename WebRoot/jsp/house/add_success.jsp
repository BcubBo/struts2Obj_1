<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
    <%String path  = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">

	td{
		
		 border: 1px green solid;
		 background-color: buttonshadow;
		 text-align: center;
	
	}
	
	strong{
	
		color:gold;
		font-size:20px;
		
	
	}
	
	table{
		
		align:center; 
		border:3px black solid;
		width:auto;
		height:auto;
	
	
	
	}
	body{background-color: yellowgreen;}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加方法</title>
</head>
<body style="background-image:url('<%=path%>/image/21.gif');
	background-repeat: true;width:1000px;height:1000px;background-color:darkgreen;">
<h1><strong>添加房屋信息成功</strong></h1>
	<br/>
	房屋添加结果页面<!-- 默认为xhtml -->
		<s:debug/>
	<h2>

	<s:form action="/house/op_add" method="post">
		<s:textfield label="标题" name="house.title"></s:textfield>
		<s:select label="房屋类型" 
			name="house.houseType.typeId"
			list="@util.Cache@houseTypes"
			listKey="typeId"
			listValue="typeName"
			
		
		
		></s:select>
		
		<s:doubleselect
			label="区域和街道"
			name="house.houseType.houseTypeId" 
			list="@util.Cache@districts"
			listKey="districtId"
			listValue="districtName"
			
			doubleName="streetId"
			doubleList="@util.Cache@areas.get(top.districtId)" 
			doubleListKey="streetId"
			doubleListValue="streetName" 
			
			
			
			
			
			
			></s:doubleselect>
				

		<s:submit/>	
	</s:form>
	</h2>
</body>
</html>