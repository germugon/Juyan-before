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
	            <img alt="Charisma Logo" src="img/step2.png" class="hidden-xs" />
	        </div>
	        <!--/span-->
	    </div><!--/row-->
    
    
        <div id="content" class="col-md-3 center ">
            <!-- content starts -->

			<form onsubmit="return check_all()" action="register" method="post">
                <table>
                	<tr>
	                    <td class="title"><label>登录名 </label></td>
	                    <td>${phone}</td>
	                    <td><input type="hidden" name="phone" value="${phone}"/></td>
	                </tr>
                                       
                    <tr>
                    	<td class="title"><label>设置登录密码</label></td>
                    </tr>
                    <tr>
	                    <td class="title">登录密码</td>
	                    <td><input type="password" id="password" name="password" 
	                    	placeholder="设置您的登录密码" class="form-control"></td>
	                    <td id="password_warn"></td>
					</tr>
					
                    <tr>
	                    <td class="title">密码确认 </td>
	                    <td><input type="password" id="password_confirm" name="password_confirm" 
	                    	placeholder="请再次输入您的密码" class="form-control"></td>
	                    <td id="password_confirm_warn"></td>
					</tr>
                    
                    <tr>
                    	<td class="title"><label>设置账号</label></td>
                    </tr>
                    <tr>
	                    <td class="title">登录名 </td>
	                    <td><input type="text" id="account" name="merchantNo" 
	                    	placeholder="账号一旦设置成功，无法修改" class="form-control"></td>
	                    <td id="account_warn"></td>
					</tr>
					
                    <tr>
	                    <td><input type="hidden" name="roleNo" value="4"/></td>
                   		<td><button type="submit" id="next" class="btn btn-primary" style="width:170px">下一步</button></td>
                   	</tr>
                   
                </table>
            </form>
			
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

<!-- my custom js -->
<script src="js/custom.js"></script>

<script type="text/javascript">
function next_disabled(op){
	if(op == true) {
		$("#next").attr("disabled","true");
	} else {
		$("#next").removeAttr("disabled");
	}
}

function check_password(){
	var password = $("#password").val();
	//验证密码格式！！！
	if(password == null || password == ""){
		$("#password_warn").html("<div style='color:red;'>密码不能为空</div>");
		return false;
	} else {
		$("#password_warn").html("<div class='glyphicon glyphicon-ok green'></div>");
		return true;
	}
}

function check_password_confirm(){
	var password = $("#password").val();
	var password_confirm = $("#password_confirm").val();
	if(password != password_confirm){
		$("#password_confirm_warn").html("<div style='color:red;'>两次密码输入不一致</div>");
		return false;
	} else {
		$("#password_confirm_warn").html("<div class='glyphicon glyphicon-ok green'></div>");
		return true;
	}
}

function check_account(){
	var account = $("#account").val();
	//验证账号格式！！！
	if(account != null || account != ""){
		$.ajax({
		   	type: "POST",
		   	url: "ifAccountExist",
		   	data: {
		   		account : account
		   	},
		   	dataType:"text",
		   	success: function(data){
		   		if(data == "existent") {
		   			$("#account_warn").html("<div style='color:red;'>该账号已被使用，请选择其他账号</div>");
		   			next_disabled(true);
		   		} else {
		   			$("#account_warn").html("");
		   			next_disabled(false);
		   		}
		   	},
		   	error: function(){
		    	alert("验证账号失败");
		   	}
		});
	} else {
		$("#account_warn").html("<div style='color:red;'>账号不能为空</div>");
		next_disabled(true);
	}
}

function check_all(){
	if(check_password() && check_password_confirm()){
		next_disabled(false);
		check_account();
		if($("#account_warn").html() == null || $("#account_warn").html() == ''){
			return true;
		} else{
			return false;
		}
	} else {
		next_disabled(true);
		return false;
	}	
}

$(function(){
	$("#password").change(function(){
		if(check_password()) {
			next_disabled(false);
		} else {
			next_disabled(true);
		}	
	});
	
	$("#password_confirm").change(function(){
		if(check_password_confirm()){
			next_disabled(false);
		} else {
			next_disabled(true);
		}	
	});
	
	$("#account").change(check_account);
});
</script>
</body>
</html>
