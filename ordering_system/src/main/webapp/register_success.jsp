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

	<!-- my custom css -->
	<link href='css/custom.css' rel='stylesheet'>
</head>

<body>

<!-- topbar -->
<%@include file="topbar.jsp" %>    
    
<div class="ch-container">
    <div class="row">
    
	    <div class="row">
	        <div class="col-md-12 center login-header">
	            <img alt="Charisma Logo" src="img/step3.png" class="hidden-xs" />
	        </div>
	        <!--/span-->
	    </div><!--/row-->
    
        <div id="content" class="col-md-5 center ">
            <!-- content starts -->
            
            <h1>注册成功！ </h1>
            <br>
            <a href="" class="btn btn-primary btn-lg">
            	<i class="glyphicon glyphicon-chevron-left glyphicon-white"></i> 返回首页</a>
			
    		<!-- content ends -->
    	</div><!--/#content.col-md-0-->
	</div><!--/fluid-row-->

	<!-- footer -->
	<%@include file="footer.jsp" %>

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

<!-- validate -->
<script src="js/jquery.validate.js"></script>
<script type="text/javascript">
function getPin_disabled(op){
	if(op == true) {
		$("#getPin").attr("disabled","true");
	} else {
		$("#getPin").removeAttr("disabled");
	}
}

function next_disabled(op){
	if(op == true) {
		$("#next").attr("disabled","true");
	} else {
		$("#next").removeAttr("disabled");
	}
}

function check_phone(){
	var phone = $("#phone").val();
	//验证手机格式！！！
	if(phone != null || phone != ""){
		$.ajax({
		   	type: "POST",
		   	url: "ifPhoneExist",
		   	data: {
		   		phone : phone,
		   		roleNo : 4
		   	},
		   	dataType:"text",
		   	success: function(data){
		   		if(data == "existent") {
		   			$("#phn_warn").html("<div style='color:red;'>该手机号已被注册，请使用手机号登录</div>");
		   			getPin_disabled(true);
		   			next_disabled(true);
		   		} else {
		   			$("#phn_warn").html("<div class='glyphicon glyphicon-ok-sign green'></div>");
		   			getPin_disabled(false);
		   			next_disabled(false);
		   		}
		   	},
		   	error: function(){
		    	alert("验证手机号失败");
		   	}
		});
	} else {
		$("#phn_warn").html("<div style='color:red;'>手机号不能为空</div>");
		getPin_disabled(true);
		next_disabled(true);
	}
}

function check_pin(){
	var pin1 = $("#pin").val();
	var pin2 = $.cookie("pin");
	
	if ( pin1 != pin2){
		$("#pin_warn").html("<div class='glyphicon glyphicon-remove-sign red'></div>");
		next_disabled(true);
		return false;
    } else {
    	$("#pin_warn").html("<div class='glyphicon glyphicon-ok-sign green'></div>");
    	next_disabled(false);
    	return true;
    }
}

$(function(){
	$("#phone").change(check_phone);
	
	$("#pin").change(check_pin);
	
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