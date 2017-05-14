<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>left</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/left.css">
</head>	


<body>
<div>
    <p id="welcome">欢迎，${sessionScope.user_name }</p>
</div>
<div id="nav">
    <ul class="nav nav-stacked">
        <li><a href="#collapseOne" data-toggle="collapse"><span class="glyphicon glyphicon-user"></span>我的信息</a></li>
        <div id="collapseOne" class="collapse">
            <ul class="nav nav-stacked">
            
                <li>
                	<a 
                	href= "${pageContext.request.contextPath}/userAction/queryById.action?id=${sessionScope.user_id}" 
                	target="mainWindow">查看信息</a>
                </li>
                
            </ul>
        </div>
        <li><a href="#collapseTwo" data-toggle="collapse"><span class="glyphicon glyphicon-home"></span>我的资源</a></li>
        <div id="collapseTwo" class="collapse">
            <ul class="nav nav-stacked">
                <li><a href="${pageContext.request.contextPath }/fileAction/queryFile.action?currentPage=1" target="mainWindow">我的文件</a></li>
                <li><a href="./staff_add.jsp" target="mainWindow">我的笔记</a></li>
                
            </ul>
        </div>
        
        <li><a href="${pageContext.request.contextPath }/logs/logout.action" target="_parent"><span class="glyphicon glyphicon-log-out"></span>退出</a></li>
    </ul>
</div>

<script src="${pageContext.request.contextPath}/js/jquery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</body>
</html>