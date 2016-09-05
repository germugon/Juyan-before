<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!--
        ===
        This comment should NOT be removed.

        Charisma v2.0.0

        Copyright 2012-2014 Muhammad Usman
        Licensed under the Apache License v2.0
        http://www.apache.org/licenses/LICENSE-2.0

        http://usman.it
        http://twitter.com/halalit_usman
        ===
    -->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>用户注册</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.">
    <meta name="author" content="Muhammad Usman">

    <!-- The styles -->
    <link id="bs-css" href="css/bootstrap-cerulean.min.css" rel="stylesheet">

    <link href="css/charisma-app.css" rel="stylesheet">
    <link href='bower_components/fullcalendar/dist/fullcalendar.css' rel='stylesheet'>
    <link href='bower_components/fullcalendar/dist/fullcalendar.print.css' rel='stylesheet' media='print'>
    <link href='bower_components/chosen/chosen.min.css' rel='stylesheet'>
    <link href='bower_components/colorbox/example3/colorbox.css' rel='stylesheet'>
    <link href='bower_components/responsive-tables/responsive-tables.css' rel='stylesheet'>
    <link href='bower_components/bootstrap-tour/build/css/bootstrap-tour.min.css' rel='stylesheet'>
    <link href='css/jquery.noty.css' rel='stylesheet'>
    <link href='css/noty_theme_default.css' rel='stylesheet'>
    <link href='css/elfinder.min.css' rel='stylesheet'>
    <link href='css/elfinder.theme.css' rel='stylesheet'>
    <link href='css/jquery.iphone.toggle.css' rel='stylesheet'>
    <link href='css/uploadify.css' rel='stylesheet'>
    <link href='css/animate.min.css' rel='stylesheet'>

    <!-- jQuery -->
    <script src="bower_components/jquery/jquery.min.js"></script>

    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- The fav icon -->
    <link rel="shortcut icon" href="img/favicon.ico">

	<style>
		a { text-decoration:none; }
		a:hover { color:red; text-decoration:none; } 
	</style>
</head>

<body>
    <!-- topbar starts -->
    <div class="navbar navbar-default" role="navigation">

        <div class="navbar-inner">
            <button type="button" class="navbar-toggle pull-left animated flip">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html"> <img alt="Charisma Logo" src="img/logo20.png" class="hidden-xs" 
            	style="width:72px;height:38px"/></a>

            <!-- user dropdown starts -->
            <div class="btn-group pull-right">
                <button class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                    <i class="glyphicon glyphicon-user"></i><span class="hidden-sm hidden-xs"> 
                    	${sessionScope.user_session.account}
                    </span>
                    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu">
                    <li><a href="#">账户设置</a></li>
                    <li class="divider"></li>
                    <li><a href="login.html">退出</a></li>
                </ul>
            </div>
            <!-- user dropdown ends -->

            <ul class="collapse navbar-collapse nav navbar-nav top-menu">
                <li class="dropdown">
                    <a href="#" data-toggle="dropdown"><i class="glyphicon glyphicon-info-sign"></i> 关于聚妍 <span
                            class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">公司介绍</a></li>
                        <li class="divider"></li>
                        <li><a href="#">OPI</a></li>
                        <li><a href="#">贝瑞可</a></li>
                        <li><a href="#">CND</a></li>
                        <li><a href="#">YOUKA</a></li>
                    </ul>
                </li>
                <li><a href="#"><i class="glyphicon glyphicon-globe"></i> 最近消息及活动</a></li>
                <li><a href="#"><i class="glyphicon glyphicon-star"></i> 联系方式</a></li>               
            </ul>

        </div>
    </div>
    <!-- topbar ends -->
    
<div class="ch-container">
    <div class="row">
    
	    <div class="row">
	        <div class="col-md-12 center login-header">
	            <img alt="Charisma Logo" src="img/step1.png" class="hidden-xs" />
	        </div>
	        <!--/span-->
	    </div><!--/row-->
    
        <div id="content" class="col-md-4 center ">
            <!-- content starts -->
			<c:if test="msg!=null">
	       		<div class="alert alert-danger">
	        		${msg}
	        	</div>
	        </c:if>
	        	
			<form class="form-inline" action="verifyByPhone" method="post">
                <fieldset>
                    <div class="form-group has-feedback">
                        <label class="control-label" style="margin-right:10px">手机号 </label>
                        <input type="text" id="phone" name="phone" placeholder="请输入您的手机号"
                        	class="form-control" style="width:300px"/>
                        <span class="glyphicon glyphicon-ok green form-control-feedback"></span>
                    </div>
                    <div class="clearfix"></div><br>
					
					<div class="form-group-inline">
	                    <label class="control-label" style="margin-right:10px">验证码 </label>
	                    <input type="text" id="pin" name="pin" 
	                    	placeholder="请输入您收到的验证码" class="form-control">
	                    <button type="button" id="getPin" class="btn btn-default">获取验证码</button>
	                </div>
                    <div class="clearfix"></div><br>
                   
                   <button type="submit" class="btn btn-primary" style="width:170px">下一步</button>
                   
                </fieldset>
            </form>
			
    		<!-- content ends -->
    	</div><!--/#content.col-md-0-->
	</div><!--/fluid-row-->

	<hr>
    <footer class="row">
        <p class="col-md-9 col-sm-9 col-xs-12 copyright">&copy; Juyan 2016 - 2017</p>

        <p class="col-md-3 col-sm-3 col-xs-12 powered-by"><a href="">联系客服</a></p>
    </footer>

</div><!--/.fluid-container-->

<!-- external javascript -->

<script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<!-- library for cookie management -->
<script src="js/jquery.cookie.js"></script>
<!-- calender plugin -->
<script src='bower_components/moment/min/moment.min.js'></script>
<script src='bower_components/fullcalendar/dist/fullcalendar.min.js'></script>
<!-- data table plugin -->
<script src='js/jquery.dataTables.min.js'></script>

<!-- select or dropdown enhancer -->
<script src="bower_components/chosen/chosen.jquery.min.js"></script>
<!-- plugin for gallery image view -->
<script src="bower_components/colorbox/jquery.colorbox-min.js"></script>
<!-- notification plugin -->
<script src="js/jquery.noty.js"></script>
<!-- library for making tables responsive -->
<script src="bower_components/responsive-tables/responsive-tables.js"></script>
<!-- tour plugin -->
<script src="bower_components/bootstrap-tour/build/js/bootstrap-tour.min.js"></script>
<!-- star rating plugin -->
<script src="js/jquery.raty.min.js"></script>
<!-- for iOS style toggle switch -->
<script src="js/jquery.iphone.toggle.js"></script>
<!-- autogrowing textarea plugin -->
<script src="js/jquery.autogrow-textarea.js"></script>
<!-- multiple file upload plugin -->
<script src="js/jquery.uploadify-3.1.min.js"></script>
<!-- history.js for cross-browser state change on ajax -->
<script src="js/jquery.history.js"></script>
<!-- application script for Charisma demo -->
<script src="js/charisma.js"></script>

<script type="text/javascript">
$(function(){
	$("#getPin").click(function(){
		var phone = $("#phone").val();
		if(phone != null){
			$.ajax({
			   	type: "POST",
			   	url: "sendPin",
			   	data: {
			   		phone : phone
			   	},
			   	dataType:"text",
			   	success: function(data){
			   		//$("#pin").val(data);
			   		alert("验证码已发送到您的手机，15分钟内输入有效");
			    	return false;
			   	},
			   	error: function(){
			    	alert("验证码发送失败");
			    	return false;
			   	}
			});
		}
	});
});
</script>
</body>
</html>
