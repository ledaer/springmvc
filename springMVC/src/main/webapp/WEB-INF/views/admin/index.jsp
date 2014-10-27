<!DOCTYPE html>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link rel="stylesheet" type="text/css"
	href="resources/admin/css/font_awesome.css" media="all">
<link rel="stylesheet" type="text/css"
	href="resources/admin/css/left_menu.css" media="all">
<link rel="stylesheet" type="text/css"
	href="resources/admin/css/index.css" media="all">
<script src="resources/admin/js/yui-min.js"></script>
<script src="resources/admin/js/init_menu_html.js"></script>
<script src="resources/admin/js/config_menu.js"></script>
<script>
	var zNodes = [ {
		"id" : "500",
		"pId" : "0",
		"u" : "",
		"name" : "订单管理"
	}, {
		"id" : "500001",
		"pId" : "500",
		"u" : "userorders/manage/manage_list.jsp",
		"name" : "用户订单"
	}, {
		"id" : "600",
		"pId" : "0",
		"u" : "",
		"name" : "菜单类型管理"
	}, {
		"id" : "600001",
		"pId" : "600",
		"u" : "typeparam/manage/manage_list.jsp",
		"name" : "菜单类型"
	}, {
		"id" : "700",
		"pId" : "0",
		"u" : "",
		"name" : "定制信息管理"
	}, {
		"id" : "700001",
		"pId" : "700",
		"u" : "order/manage/manage_list.jsp",
		"name" : "定制信息"
	}, {
		"id" : "800",
		"pId" : "0",
		"u" : "",
		"name" : "商品管理"
	}, {
		"id" : "800001",
		"pId" : "800",
		"u" : "product/manage/manage_list.jsp",
		"name" : "商品信息"
	}, {
		"id" : "800002",
		"pId" : "800",
		"u" : "productapp/manage/manage_list.jsp",
		"name" : "商品软件信息"
	}, {
		"id" : "800004",
		"pId" : "800",
		"u" : "recommend/manage/manage_list.jsp",
		"name" : "推荐商品"
	}, {
		"id" : "900",
		"pId" : "0",
		"u" : "",
		"name" : "系统管理"
	}, {
		"id" : "900001",
		"pId" : "900",
		"u" : "systemportal/system/admin/manage/manage_list.jsp",
		"name" : "管理员管理"
	}, {
		"id" : "900002",
		"pId" : "900",
		"u" : "systemportal/system/adminrole/manage/manage_list.jsp",
		"name" : "角色管理"
	}, {
		"id" : "900003",
		"pId" : "900",
		"u" : "systemportal/system/roleduty/manage/manage_list.jsp",
		"name" : "角色授权"
	}, {
		"id" : "900006",
		"pId" : "900",
		"u" : "systemportal/system/log/manage/manage_list.jsp",
		"name" : "系统日志管理"
	}, {
		"id" : "900008",
		"pId" : "900",
		"u" : "systemportal/system/bulletin/manage/manage_list.jsp",
		"name" : "公告管理"
	} ];

	config_menu(zNodes);
</script>
</head>

<body>
	<div id="main" class="main">
		<div id="navigation" class="navigation"></div>
		<div id="content" class="content">
			<div id="left" class="left"
				style="overflow: hidden; outline: none; display: block;"></div>
			<div id="right" class="right">
				<iframe id="mainFrame" name="mainFrame" class="mainFrame"
					src="resources/admin/system/welcome.html"></iframe>
			</div>
		</div>
	</div>
</body>

</html>
