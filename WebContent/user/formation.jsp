<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>个人信息</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/change.css">
</head>

<body>
<div id="form">
    <p id="start">个人信息</p>
    <form role="form" method="post" action="${pageContext.request.contextPath }/userAction/update.action">
    	<div class="input-group">
    		<input type="hidden" value="${requestScope.userCustom.id }" name="userCustom.id">
            <span class="input-group-addon">用户名</span>
            
            <input value="${requestScope.userCustom.username }"  class="form-control inputType"  name="userCustom.username">
        </div>
        <br>
       	<div class="input-group">
            <span class="input-group-addon">密码</span>
            <input value="${requestScope.userCustom.password }"  class="form-control inputType"  name="userCustom.password">
        </div>
        <br>
        <div class="input-group">
            <span class="input-group-addon">vip用户</span>
            <select  class="form-control inputType" name="userCustom.isvip">
	            <c:if test="${requestScope.userCustom.isvip==1 }">
	            	<option value="1" selected="selected" >是</option>
	            	<option value="否">否</option>
	            </c:if>
				<c:if test="${requestScope.userCustom.isvip==0 }">
	            	<option value="是">是</option>
	            	<option value="否" selected="selected" value="0">否</option>
	            </c:if>
            </select>
            
        </div>
        <br>

        <br>
        <div class="input-group">
            <input id="subBtn" type="submit" class="form-control btn-primary" value="提交">
        </div>
    </form>
</div>
<script type="text/javascript">
    window.onload = function () {
       
    }
</script>
</body>
</html>