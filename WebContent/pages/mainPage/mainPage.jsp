<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>掌上党建后台管理系统</title>
	<link rel="stylesheet" type="text/css" href="mainPage.css">
	<script type="text/javascript" src="../jquery-3.2.1.js"></script>
	<script type="text/javascript" src="mainPage.js"></script>
</head>
<body>
	<div id="global_variable" class="global_variable">
		<div id="top" class="top">
			<div class="logo">
				<img src="../../images/cpccslogo.png" style="width: 15%;height: 95%;margin-right: 3%;">
				<font style="position: absolute; font-size: 200%;top: 25%;color: red;font-family: STXingkai ">掌上党建管理后台</font>
				<img src="../../images/topshuxian.png" style="position: absolute;width: 10%;height: 100%;margin-right: 0%;left: 70%">
			</div>
			<div class="info">
				<form class="seach_form">
					<input type="search" class="form-control" placeholder="Search">
				</form>
				<a href="#">
					<div id="manage" class="manage">
						<img src="../../images/touxiang.png" style="height: 100%;width: 100%">
					</div>
				</a>
				<a href="#">
					<div id="refresh" class="refresh">
						<img src="../../images/shuaxin.png" style="height: 100%;width: 100%">
					</div>
				</a>
				<a href="#">
					<div id="switch" class="switch">
						<img src="../../images/qiehuan.png" style="height: 100%;width: 100%">
					</div>
				</a>
			</div>
		</div>
		<div id="buttom" class="buttom">
			<div id="left" class="left">
				<div style="height: 0.2%;width: 100%;border: 0;margin: 0;padding: 0;background-color: #272821;"></div>
				<a href="#" style=" text-decoration:none;">
					<div id="data_cente" class="data_cente">
						<div class="div1"><img src="../../images/data.png" style="height: 100%;width: 100%"></div>
						<div class="div2">数据中心</div>
					</div>
				</a>
				<a href="#" style=" text-decoration:none;">
					<div id="news_manage" class="news_manage">
						<div class="div1"><img src="../../images/news.png" style="height: 100%;width: 100%"></div>
						<div class="div2">新闻管理</div>
					</div>
				</a>
				<a href="#" style=" text-decoration:none;">
					<div id="inform_manage" class="inform_manage">
						<div class="div1"><img src="../../images/inform.png" style="height: 100%;width: 100%"></div>
						<div class="div2">公告管理</div>
					</div>
				</a>
				<a href="#" style=" text-decoration:none;">
					<div id="user_manage" class="user_manage">
						<div class="div1"><img src="../../images/users.png" style="height: 100%;width: 100%"></div>
						<div class="div2">用户管理</div>
					</div>
				</a>
				<a href="#" style=" text-decoration:none;">
					<div id="cpccs_work" class="cpccs_work">
						<div class="div1"><img src="../../images/cpccs.png" style="height: 100%;width: 100%"></div>
						<div class="div2">党建工作</div>
					</div>
				</a>
			</div>
			<div id="right" class="right">
				<iframe src="../dataCent/dataCent.jsp" style="height: 100%;width: 100%" id="iframe"></iframe>
			</div>	
		</div>

		<div id="manage_info" class="manage_info">
			<ul style="list-style-type:none">
				<a href="#" style=" text-decoration:none;">
					<li style="margin-top: 20%;margin-left: -20%" id="change_pwd"><font color="#FFFFFF">修改密码</font></li>
				</a>
				<a href="#" style=" text-decoration:none;">
					<li style="margin-top: 20%;margin-left: -20%" id="play_record"><font color="#FFFFFF">操作记录</font></li>
				</a>
				<a href="#" style=" text-decoration:none;">
					<li style="margin-top: 20%;margin-left: -20%" id="self_info"><font color="#FFFFFF">个人信息</font></li>
				</a>
				<a href="#" style=" text-decoration:none;">
					<li style="margin-top: 20%;margin-left: -20%" id="self_other"><font color="#FFFFFF">其他</font></li>
				</a>
			</ul>
		</div>
	</div>
</body>
</html>