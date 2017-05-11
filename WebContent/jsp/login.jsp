<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta charset="UTF-8">
   <title>登陆</title>
   <link rel="stylesheet" href="../css/reset.css">
   <link rel="stylesheet" href="../css/bootstrap.min.css">
   <link rel="stylesheet" href="../css/login.css">
</head>
<body>
   <div><a href="${pageContext.request.contextPath}/logs/login.action" >log up</a>  &nbsp;
          <a href="${pageContext.request.contextPath}/index.jsp" >首页</a> 
   </div>
       
   <div id="form">
    <p id="start">iCloud</p>
    <form class="" role="form" method="post" action="${pageContext.request.contextPath}/logs/login.action">
        <font color="red">&nbsp;&nbsp;&nbsp;${requestScope.error }</font><br>
        <div class="input-group">
            <span class="input-group-addon">用户名</span>
            <input type="text" name="userCustom.username" class="form-control inputType" placeholder="用户名">
            
        </div>
        <br>
        <div class="input-group">
            <span class="input-group-addon">密码</span>
            <input type="password" name="userCustom.password" class="form-control inputType" placeholder="密码">
        </div>
       
       
		<br>
        <div class="input-group" >
            <input id="loginBtn" type="submit" class="form-control btn-primary" value="登陆">
            <!--<a href="reg.html"><button id="regBtn" class="btn" type="button">注册入口</button></a>-->
        </div>
    </form>
</body>
</html>