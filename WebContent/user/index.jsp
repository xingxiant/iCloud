<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>iCloud</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
</head>
<%	

%>
<body>
<iframe src="${pageContext.request.contextPath}/user/top.jsp" width="100%" height="15%"></iframe>
<iframe src="${pageContext.request.contextPath}/user/left.jsp" width="15%" height="84%"></iframe>
<iframe src="${pageContext.request.contextPath}/fileAction/queryAll.action?currentPage=1" width="84%" height="84%" name="mainWindow"></iframe>
</body>
</html>