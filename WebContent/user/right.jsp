<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*,com.xxt.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>right</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<style type="text/css">
body {
	background-color: rgba(255, 255, 200, 0.5);
	background-position: 61% 43%;
}


.content {
	margin-top: 50px;
	width: 200px;
	height: 200px;
	border-radius: 10px;
	background: rgba(255, 255, 200, 0.5);
	border: 1px solid #FFFF66;
    }
		#mask{
    		display:none;
    		position:fixed;
    		width: 600px;
    		height: 400px;
    		top: 50px ;
    		left: 160px;
    		background: #FFFFCC;
    		border-radius: 20px;
    		text-align:center;
    		padding: 30px 100px;
    	}
    	#mask input{
    		font-size: 12px;
    		
    		
    		border-left:3px solid #9f9f9f;
    		font-family: "微软雅黑";
    	}
    	#mask p{
    		font-size: 16px;
    		font-family: "微软雅黑";
    		text-indent: 2em;
    	}
    	.glyphicon{
    		cursor: pointer;
    		display: inline-block;
    		position:absolute;
    		font-size:30px;
    		right: 10px;
    		top: 10px;
    		transition: all 0.3s ease-in-out;
    	}
    	.glyphicon:hover{
    		color: #ff0000;
    		transform:rotate(90deg);
    	}

}
</style>
</head>
<body>

	<div class="container col-lg-12  ">
		<form id="uploadForm"
			action="${pageContext.request.contextPath }/fileAction/upload.action"
			method="post" enctype="multipart/form-data">


			<input type='file' name="file" class="btn btn-default btn-sm">
			<input type="hidden" name="userId" value="${sessionScope.user_id }">
		</form>
		<button type="button" class="btn btn-default btn-sm "
			onclick="mySubmit()">上传文件</button>

		<button type="button" class="btn btn-primary btn-sm ">新建文件夹</button>


		<button type="button" class="btn btn-success btn-sm ">下载选中文件</button>

		<button type="button" class="btn btn-info btn-sm ">我的设备</button>
		<button type="button" class="btn btn-warning btn-sm ">我的笔记</button>
		<a href="index.html" style="margin-left: 50px;"><button
				type="button" class="btn btn-danger btn-sm">返回首页</button></a>
	</div>
	<br>
	
	
	<!-- 分页显示 -->
	<div class="container col-lg-12  ">
		<table class="table table-striped table-responsive">

			<tr>
				<th>全部文件</th>

			</tr>

			<!-- 迭代数据 -->
			<c:choose>
				<c:when test="${not empty requestScope.pageBean.pageData}">
					<c:forEach var="emp" items="${requestScope.pageBean.pageData}"
						varStatus="vs">
						<tr>
							<td><label class="checkbox"> <input type="checkbox"
									value="${emp.id }">
							</label></td>
							<td>${vs.count }</td>
							<td>${emp.filename }</td>
							<td>${emp.filesize }字节</td>
							<td><fmt:formatDate value="${emp.createtime }"
									pattern="yyyy-MM-dd HH:mm:ss" /></td>
							<td><a href="${pageContext.request.contextPath }/fileAction/download.action?filename=${emp.filename}">下载</a></td>
							<td><a class="share" data-value="http://localhost:8080${pageContext.request.contextPath }/fileAction/download.action?filename=${emp.filename}">分享</a></td>
						</tr>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<tr>
						<td colspan="5">对不起，您没有上传资源</td>
					</tr>
				</c:otherwise>
			</c:choose>
			<tr>
				<td colspan="5" align="center">
					当前${requestScope.pageBean.currentPage }/${requestScope.pageBean.totalPage }页&nbsp;&nbsp; 
					<a href="${pageContext.request.contextPath }/fileAction/queryAll.action?currentPage=1">首页</a>
					<a href="${pageContext.request.contextPath }/fileAction/queryAll.action?currentPage=${requestScope.pageBean.currentPage-1}">上一页</a> 
					<a href="${pageContext.request.contextPath }/fileAction/queryAll.action?currentPage=${requestScope.pageBean.currentPage+1}">下一页</a> 
					<a href="${pageContext.request.contextPath }/fileAction/queryAll.action?currentPage=${requestScope.pageBean.totalPage}">末页</a>
				</td>
			</tr>
		</table>
	</div>
	<div id="mask">
		<span class="glyphicon glyphicon-remove">
		</span>
		<input type="text" id="fileLink">
		<input type="button" value="复制链接" onclick="copyLink()">
		
	</div>
	
	
	<script src="${pageContext.request.contextPath}/js/jquery-2.1.4.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script>
		window.onload = function(){
			var shares = $(".share");
			var mask = $("#mask");
			var maskInput = $("#mask>#fileLink");
			var maskC = $("#mask>div");
			var close = $(".glyphicon");
			shares.click(function(){
				maskInput[0].value=$(this)[0].getAttribute("data-value");
				mask.fadeIn();
			});
			close.click(function(){
				mask.fadeOut();
			});
		}
		function mySubmit() {
			document.getElementById("uploadForm").submit();
			alert("上传成功");

		}
		function copyLink()
		{
			var link=document.getElementById("fileLink");
			link.select(); // 选择对象
			document.execCommand("Copy"); // 执行浏览器复制命令
			alert("已复制链接到剪切板");
		}
	</script>
</body>
</html>