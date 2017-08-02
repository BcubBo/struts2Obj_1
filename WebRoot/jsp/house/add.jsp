<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
    <%String path  = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加方法</title>
<style type="text/css">


	strong{
	
		color:gold;
		font-size:20px;
		
	
	}
	

	body{background-color: yellowgreen;}

</style>
</head>
<body style="background-image:url('<%=path%>/image/15.gif');
	background-repeat: true;width:1000px;height:1000px;background-color:darkgreen;">

	<br/>
	<h2><strong>
	房屋添加页面<!-- 默认为xhtml -->
	
	<s:form action="/house/add" method="post">
		<s:textfield label="标题" name="house.title"></s:textfield>
		<s:select label="房屋类型" 
			name="house.houseType.typeId"
			list="@util.Cache@houseTypes"
			listKey="typeId"
			listValue="typeName"
			
		
		
		></s:select>
		
		<s:doubleselect
			label="区域和街道"
			name="districtId" 
			list="@util.Cache@districts"
			listKey="districtId"
			listValue="districtName"
			
			doubleName="streetId"
			doubleList="@util.Cache@areas.get(top.districtId)" 
			doubleListKey="streetId"
			doubleListValue="streetName" 
			
			
			
			
			
			
			></s:doubleselect>
				

		<s:submit />	
	</s:form>
	</strong>
	</h2>
	
</body>
</html>