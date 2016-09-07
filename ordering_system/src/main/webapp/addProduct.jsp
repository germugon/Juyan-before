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
    <title>添加新产品</title>
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
        
        <!-- topbar -->
		<%@include file="leftMenu.jsp" %>  

        <div id="content" class="col-lg-10 col-sm-10">
            <!-- content starts -->
            
            <!-- 
            <div>
			    <ul class="breadcrumb">
			        <li>
			            <a href="#">首页</a>
			        </li>
			        <li>
			            <a href="#">添加新商品</a>
			        </li>
			    </ul>
			</div>
			-->
			 
			<div class="row">
			    <div class="box col-md-12">
			        <div class="box-inner">
			        
			            <div class="box-header well" data-original-title="">
			                <h2><i class="glyphicon glyphicon-edit"></i> 添加新商品</h2>     
			            </div>
			            
			            <div class="box-content">
			                
							<form action="addProduct" method="post">
				            	<table>
					            	<tr>
				                    	<td><label>基本信息</label></td>
				                    </tr>
				                    
				            		<tr>
				            			<td class="title">商品编码 </td>
				                		<td class="col-md-9">
				                			<input type="text" name="prodNo" value="${prodNo}" class="form-control"/>
				                		</td>
				                 		<td id="prodNo_warn" style="color:red;"></td>
									</tr>
									
					          		<tr>
				            			<td class="title">名称</td>
					            		<td class="col-md-9">
					            			<input type="text" name="name" value="${name}" class="form-control"/>
					            		</td>
				                		<td id="name_warn" style="color:red;"></td>
					              	</tr>
					              	
					              	<tr>
				            			<td class="title">描述</td>
					            		<td class="col-md-9">
					            			<textarea name="description" class="form-control" rows="3">${description}</textarea>
					            		</td>
				                		<td id="description_warn" style="color:red;"></td>
					              	</tr>
					              	
					              	<tr>
				            			<td class="title">产地</td>
					            		<td class="col-md-9">
					            			<input type="text" name="place" value="${place}" class="form-control"/>
				                		</td>
				                		<td id="place_warn" style="color:red;"></td>
					              	</tr>
				                
				                	<tr>
				            			<td class="title">品牌</td>
					            		<td class="col-md-9">
					            			<div class="controls">
						                        <select name="brand" data-rel="chosen" class="col-md-5">
						                            <option>OPI</option>
						                            <option>贝瑞可</option>
						                            <option>CND</option>
						                            <option>YONKA</option>
						                        </select>
						                    </div>
					            		</td>
				                		<td id="place_warn" style="color:red;"></td>
					              	</tr>
					              	
					              	<tr>
				            			<td class="title">详情图片</td>
					            		<td class="col-md-9">
					            			<a id="img_href" href="${detail}">
						             			<img id="img_src" src="${detail}" style="vertical-align:middle;display:block;" 
						               				onload="onPreviewLoad(this,200)"/>
						               		</a>
						               		<input type="hidden" id="image" name="detail"/>
					            			<input type="file" id="image_upload" data-no-uniform="true" />
				                		</td>
				                		<td id="image_warn" style="color:red;"></td>
					              	</tr>
									
				                	<tr>
				            			<td></td>
				            			<td><div style="color:red;"><c:if test="${msg != null}">${msg}</c:if></div></td>
				            		</tr>
				                	
				                	<tr>
				                		<td></td>
				            			<td><button type="submit" id="next" class="btn btn-primary" style="width:200px">下一步</button></td>
				                	</tr>
				
								</table>
				                   
				            </form>
			                
			            </div>
			        </div>
			    </div>
			    <!--/span-->
			
			</div><!--/row-->

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

</body>
</html>

