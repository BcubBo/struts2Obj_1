<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
    <%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">

	td{
		
		 border: 1px green solid;
		 text-align: center;
	
	}

	
	strong{
	
		color:yellowgreen;
		font-size:20px;
		
	
	}
	
	table{
		
		align:center; 
		border:3px black solid;
		width:auto;
		height:auto;
	
	
	
	}
	
	body{
	
		background-image:url('/struts2Obj_1/image/22.gif');
		background-repeat: repeat;
		
		
}
	
	
	

</style>
</head>
<body  >
	<h1><strong >房屋信息</strong></h1>

<%-- 	<s:debug/> --%>
	
	<table >
	
		<tr>
		
			<td><strong >编号</strong></td>
			<td><strong >标题</strong></td>
			<td><strong >用户</strong></td>
			<td><strong >时间</strong></td>
			<td><strong >街道</strong></td>
			<td><strong >地区</strong></td>

		</tr>
		<s:iterator var="h"	value="houses" status="st">
		
		<tr
			<s:if test="(#st.index)%2!=0">
				bgcolor="greenyellow"
			</s:if>
			<s:if test="(#st.index)%2==0">
				bgcolor="buttonface"
			</s:if>
		
		
		>
			<td>
			<strong>
				<s:property value="#h.id"/>
			</strong>
			</td>
			<td>
			<strong>
				<s:property value="#h.title"/>
			</strong>
			</td>
			<td>
			<strong>
				<s:property value="#h.user.username"/>
			</strong>
			</td>
			<td>
			<strong>
				<s:date name="#h.addDate" format="yyyy-MM-dd-HH:mm:ss"/>
			</strong>
			</td>
			<td>
			<strong>
				<s:property value="#h.street.streetName"/>
			</strong>			
			</td>
			<td>
			<strong>
				<s:property value="#h.district.districtName"/>
			</strong>			
			</td>
		</tr>
		</s:iterator>
	
	</table>

	<span style="color:darkblue;font-size:18px;"><s:url var="url" namespace="/house" action="op_view.action">
		
		<s:param name="id" >1001</s:param>

	</s:url>
	
		<s:a href="%{url}">查看</s:a>
	</span>
	<table >
	
		<tr>
			<td><strong >编号</strong></td>		
			<td><strong >地区</strong></td>
			<td><strong >街道号</strong></td>
			<td><strong >标题</strong></td>
			<td><strong >发布日期</strong></td>
			<td><strong >房屋类型</strong></td>		
		</tr>
		
		<tr>
			<td>
			<strong>
				<s:property value="house.id"/>
			</strong>
			</td>
			<td>
			<strong>
				<s:property value="house.street.district.districtName"/>
			</strong>
			</td>
			<td>
			<strong>
				<s:property value="house.street.streetName"/>
			</strong>
			</td>
			<td>
			<strong>
				<s:property value="house.title"/>
			</strong>
			</td>			
			<td>
			<strong>
				<s:date name="house.addDate" format="yyyy-MM-dd" />
			</strong>
			</td>	
			<td>
			<strong>
				<s:property value="house.houseType.typeName"/>
			</strong>
			</td>	

		</tr>
	</table>
	<sx:head />
	<sx:datetimepicker name="house.addDate" label="发表时间" displayFormat="yyyy-MM-dd"></sx:datetimepicker>
	

</body>
</html>