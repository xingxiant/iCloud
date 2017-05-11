<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/left.css">
</head>
<%
	String name=(String)session.getAttribute("name");
	//String siNum=(String)session.getAttribute("siNum");
%>

<body>
<div>
    <p id="welcome">欢迎，<%=name %></p>
</div>
<div id="nav">
    <ul class="nav nav-stacked">
        <li><a href="#collapseOne" data-toggle="collapse"><span class="glyphicon glyphicon-user"></span>我的信息</a></li>
        <div id="collapseOne" class="collapse">
            <ul class="nav nav-stacked">
                <li><a href="./table.jsp" target="mainWindow">查看信息</a></li>
                <li><a href="./staff_update.jsp" target="mainWindow">修改信息</a></li>
            </ul>
        </div>
        <li><a href="#collapseTwo" data-toggle="collapse"><span class="glyphicon glyphicon-home"></span>我的部门</a></li>
        <div id="collapseTwo" class="collapse">
            <ul class="nav nav-stacked">
                <li><a href="./listDepartment.jsp" target="mainWindow">部门人员</a></li>
                <li><a href="./staff_add.jsp" target="mainWindow">添加人员</a></li>
                <li><a href="./oneDepartment.jsp" target="mainWindow">岗位介绍</a></li>
            </ul>
        </div>
        <li><a href="#collapseThree" data-toggle="collapse"><span class="glyphicon glyphicon-th-list"></span>公司信息</a></li>
        <div id="collapseThree" class="collapse">
            <ul class="nav nav-stacked">
                <li><a href="./list.jsp?department=1&education=1&sex=1&marriage=1" target="mainWindow">人员总览</a></li>
                <li><a href="./allDepartment.jsp" target="mainWindow">部门介绍</a></li>
                
            </ul>
        </div>
        <li><a href="./login.jsp" target="_parent"><span class="glyphicon glyphicon-log-out"></span>退出</a></li>
    </ul>
</div>

<script src="${pageContext.request.contextPath}/js/jquery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</body>
</html>