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
    <title>个人用户登录</title>
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

	<!-- my custom css -->
	<link href='css/custom.css' rel='stylesheet'>
</head>

<body>
<div class="ch-container">
	<div class="row">
	        
	    <div class="row">
	        <div class="col-md-12 center login-header">
	            <img alt="Charisma Logo" src="img/logo20.png" class="hidden-xs" 
	            	style="width:144px;height:76px"/>
	        </div>
	        <!--/span-->
	    </div><!--/row-->
	
	    <div class="row">
	        <div class="well col-md-4 center login-box">
	            
	            <form class="form-horizontal" action="login" method="post">
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-user red"></i></span>
                        <input type="text" id="account" name="account" class="form-control" placeholder="账号/手机号">
                    </div>
                    <br>

                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock red"></i></span>
                        <input type="password" name="password" class="form-control" placeholder="密码">
                    </div>
                    
					<div style="color:red; margin-top:10px;">
                    	<c:if test="${msg != null}">		       		
			        		${msg}			        	
			        	</c:if>
			        </div>
 
                    <div class="input-prepend">
                        <div style="float:left">
                        	<input type="checkbox" id="remember"> 记住账号</input>
                        </div>
                        <div style="float:right">
                        	<a href=""> 忘记密码?</a>
                        </div>
                    </div>    

					<input type="hidden" name="roleNo" value="4"/>
					
                   	<button type="submit" class="btn btn-default" onclick="rememberUser()">登录</button>

                   	<button type="button" class="btn" onclick="location='register.jsp'">免费注册</button>
	            </form>
	        </div>
	        <!--/span-->
	    </div><!--/row-->
	</div><!--/fluid-row-->
	
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

<!-- my custom js -->
<script src="js/custom.js"></script>

<script type="text/javascript">
$(function(){
    if ($.cookie("rememberUser") == "true"){
        $("#remember").attr("checked", true);
        $("#account").val($.cookie("account"));
    }
});

function rememberUser(){
    if ($("#remember").is(':checked')){
        var account = $("#account").val();
        $.cookie("rememberUser", "true", { expires: 7 }); 	// 存储一个带7天期限的 cookie
        $.cookie("account", account, { expires: 7 }); 		// 存储一个带7天期限的 cookie
    }
    else {
        $.cookie("rememberUser", "false", { expires: -1 });	// 删除 cookie
        $.cookie("account", '', { expires: -1 });
    }
}
</script>

</body>
</html>
