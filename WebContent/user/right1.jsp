<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*,com.xxt.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<title>学习交流</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<style type="text/css">
</style>
<script>
window.onload = function(){
var input = document.getElementById("demo_input");
var result= document.getElementById("result");
var img_area = document.getElementById("img_area");
if ( typeof(FileReader) === 'undefined' ){
    result.innerHTML = "抱歉，你的浏览器不支持 FileReader，请使用现代浏览器操作！";
    input.setAttribute( 'disabled','disabled' );
} else {
    input.addEventListener( 'change',readFile,false );}
}
function readFile(){
    var file = this.files[0];
    console.log(file);
    //这里我们判断下类型如果不是图片就返回 去掉就可以上传任意文件
    if(!/image\/\w+/.test(file.type)){
    alert("请确保文件为图像类型");
    return false;
}
var reader = new FileReader();
reader.readAsDataURL(file);
reader.onload = function(e){
	    img_area.innerHTML = '<div class="sitetip">图片展示(点击可放大或缩小)：</div><img id="tryimg" src="'+this.result+'" alt="" width=200px style="cursor:pointer"/>';
	    var tryimg = document.getElementById('tryimg');
	    var bababa = 1;
		
		tryimg.onclick = function(){
			if(bababa == 1){
				tryimg.style.width = 400 + 'px';
				bababa = 0;
			}
			else if(bababa == 0){
				tryimg.style.width = 200 + 'px';
				bababa = 1;
			}
		}
}
}

</script>
</head>

<body>
	<audio src="media/track1.mp3" autoplay="" loap="-1">
	</audio>

	<div class="container col-lg-1 col-md-offset-0 "
		style="position: absolute;">

		<table class="table table-striped">
			<tr>
				<th><button type="button" class="btn btn-default btn-lg  ">全部</button></th>
			</tr>
			<tr>
				<th><button type="button" class="btn btn-primary btn-lg ">图片</button></th>
			</tr>
			<tr>
				<th><button type="button" class="btn btn-success btn-lg ">文档</button></th>
			</tr>

			<tr>
				<th><button type="button" class="btn btn-info btn-lg ">视频</button></th>
			</tr>

			<tr>
				<th><button type="button" class="btn btn-warning btn-lg ">种子</button></th>
			</tr>

			<tr>
				<th><button type="button" class="btn btn-danger btn-lg ">其他</button></th>
			</tr>

		</table>

	</div>

	<div class="container col-lg-11 col-md-offset-1 ">
		<table class="table table-striped table-responsive">
			<tr>
				<th>
					<button type="button" class="btn btn-default btn-sm ">上传文件</button>


					<button type="button" class="btn btn-primary btn-sm ">新建文件夹</button>


					<button type="button" class="btn btn-success btn-sm ">下载选中文件</button>



					<button type="button" class="btn btn-info btn-sm ">我的设备</button>
					<button type="button" class="btn btn-warning btn-sm ">我的笔记</button>
					<a href="index.html" style="margin-left: 50px;"><button
							type="button" class="btn btn-danger btn-sm">返回首页</button></a>
				</th>
			</tr>
			<tr>
				<th>全部文件</th>

			</tr>
			<tr>
				<th><label class="checkbox"> <input type="checkbox"
						value=""> 电路分析ppt1~6
				</label></th>

			</tr>
			<tr>
				<th><label class="checkbox"> <input type="checkbox"
						value=""> C语言课程源码
				</label></th>

			</tr>
			<tr>
				<th><label class="checkbox"> <input type="checkbox"
						value=""> 英语听力材料下载
				</label></th>

			</tr>
			<tr>
				<th><label class="checkbox"> <input type="checkbox"
						value=""> 马克思主原理实践活动具体流程
				</label></th>

			</tr>
			<tr>
				<th><label class="checkbox"> <input type="checkbox"
						value=""> 英语四六级历年真题
				</label></th>

			</tr>
			<tr>
				<th><label class="checkbox"> <input type="checkbox"
						value=""> C++语言教学视频
				</label></th>

			</tr>
			<tr>
				<th><label class="checkbox"> <input type="checkbox"
						value=""> “郑明杯”第五届全国大学生物流设计大赛介绍及案例
				</label></th>

			</tr>



		</table>

	</div>
	<div style="margin: 30px auto; width: 960px;">
		<p style="font-family: '微软雅黑'; font-size: 30px;">浏览本机图片</p>
		<br /> <input type="file" value="sdgsdg" id="demo_input" />
	</div>

</body>

</html>