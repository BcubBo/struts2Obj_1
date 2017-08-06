<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传页面</title>
</head>
<body>
<img alt="图片" src='${pageContext.request.contextPath }/uploads/<s:property value="picFileName"/>' />
	<s:actionmessage/><br/>
	<s:form action="/house/fileupload.action" enctype="multipart/form-data">
		<s:file name="pic" label="图片上传"></s:file>
		<s:submit value="提交"/>
	</s:form>
</body>
</html>