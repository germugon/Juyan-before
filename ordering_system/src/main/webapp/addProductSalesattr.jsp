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
    <title>添加销售属性</title>
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
			            <a href="#">添加销售属性</a>
			        </li>
			    </ul>
			</div>
			-->
			 
			<div class="row">
			    <div class="box col-md-12">
			        <div class="box-inner">
			        
			            <div class="box-header well" data-original-title="">
			                <h2><i class="glyphicon glyphicon-edit"></i> 添加销售属性</h2>     
			            </div>
			            
			            <div class="box-content">
			                
			                <table id="dataTable" class="table">
			                	<thead>
			                        <tr>
			                            <th>sku编码</th>
			                            <th>属性名称</th>
			                            <th>属性图片</th>
			                            <th>属性描述</th>
			                            <th>价格（元）</th>
			                            <th>是否卫检</th>
			                            <th>库存（件）</th>
			                            <th>警戒库存（件）</th>
			                            <th>上架时间</th>
			                            <th>状态</th>
			                            <th>操作</th>
			                        </tr>
			                 	</thead>
			                    <tbody>
			                    	<c:forEach items="${ProductSalesattrList}" var="prodSalesattr">    	
                        				<tr>                      		
                        					<td>${prodSalesattr.sku}</td>
				                            <td>${prodSalesattr.attrName}</td>
				                            <td>
				                           		<a href="${prodSalesattr.attrName}">
				                            		<img src="${prodSalesattr.attrName}" class="small"/>
				                            	</a>
				                            </td>
				                            <td>${prodSalesattr.description}</td>				                            
				                            <td>${prodSalesattr.price}</td>
				                            <td>
				                            	<c:if test="${prodSalesattr.isInspect == 'Y'}">
				                            		<span class="label-success label-default label">是</span>
				                            	</c:if>
				                            	<c:if test="${prodSalesattr.isInspect == 'N'}">
				                            		<span class="label-default label">否</span>
				                            	</c:if>
				                            </td>
				                            <td>${prodSalesattr.stock}</td>
				                            <td>${prodSalesattr.stockWarn}</td>
				                            <td>${prodSalesattr.onsaleTime}</td>
				                            <td>
				                            	<c:if test="${prodSalesattr.status == 1}">
				                            		<span class="label-default label label-danger">待售</span>
				                            	</c:if>
				                            	<c:if test="${prodSalesattr.status == 2}">
				                            		<span class="label-default label label-success">在售</span>
				                            	</c:if>
				                            	<c:if test="${prodSalesattr.status == 3}">
				                            		<span class="label-default label">下架</span>
				                            	</c:if>
				                            </td> 
				                            <td>
				                            	<a class="glyphicon glyphicon-trash link"
				                            		onclick="deleteRow(this,${prodSalesattr.sku})">
				                            	</a>
				                            </td>
                        				</tr>
                        			</c:forEach>	
                        		</tbody>			                 
			                </table>
					            
					        
					        <div style="margin:80px 10px 10px 80px;">   
						        <i id="add" class="glyphicon glyphicon-edit" >
					          		<label>添加新属性</label></i>
					          	<br>
					          	<div id="msg" class="warn-msg"><c:if test="${msg != null}">${msg}</c:if></div>
					          	<br>
				          	</div> 
				                
							<form id="form" class="add-new">			                 

				            	<table>
				            		<tr>
				            			<td class="title">sku编码 </td>
				                		<td>
				                			<input type="text" name="sku" value="${sku}" class="form-control"/>
				                		</td>
				                 		<td id="prodNo_warn" class="warn-msg"></td>

				            			<td class="title">属性名称</td>
					            		<td>
					            			<div class="controls">
						                        <select name="attrName" data-rel="chosen">
						                            <option>颜色分类</option>
						                            <option>规格</option>
						                        </select>
						                    </div>
					            		</td>
				                		<td id="attrName_warn" class="warn-msg"></td>
					              	</tr>
					              	
					              	<tr>
				            			<td class="title">属性图片</td>
					            		<td>
					            			<a id="img_href" href="${image}">
						             			<img id="img_src" src="${image}" onload="onPreviewLoad(this,50)"/>
						               		</a>
						               		<input type="hidden" id="image" name="image" value="${image}"/>
					            			<input type="file" id="image_upload" data-no-uniform="true" />
					            		</td>
					            		<td id="image_warn" class="warn-msg"></td>
					            		
					            		<td class="title">属性描述</td>
					            		<td>
					            			<textarea name="description" class="form-control" rows="3" 
					            				placeholder="如NLB44淡绿色、120ml等">${description}</textarea>
				                		</td>
				                		<td id="description_warn" class="warn-msg"></td>
					              	</tr>
					              	
					          		<tr>
				            			<td class="title">价格（元）</td>
					            		<td>
					            			<input type="text" name="price" value="${price}" class="form-control"/>
					            		</td>
				                		<td id="price_warn" class="warn-msg"></td>

				            			<td class="title">是否卫检</td>
					            		<td>
					            			<div class="controls">
						                        <select name="isInspect" data-rel="chosen">
						                            <option value='Y'>是</option>
						                            <option value='N'>否</option>
						                        </select>
						                    </div>
					            		</td>
				                		<td id="attrName_warn" class="warn-msg"></td>
					              	</tr>
					              	
					              	<tr>
				            			<td class="title">库存（件）</td>
					            		<td>
					            			<input type="text" name="stock" value="${stock}" class="form-control"/>
					            		</td>
				                		<td id="stock_warn" class="warn-msg"></td>

				            			<td class="title">警戒库存（件）</td>
					            		<td>
					            			<input type="text" name="stockWarn" value="${stockWarn}" class="form-control"/>
					            		</td>
				                		<td id="stockWarn_warn" class="warn-msg"></td>
					              	</tr>
					              		
					              	<tr>
				            			<td class="title">上架时间</td>
					            		<td>
					            			<input type="text" name="onsaleTime" value="${onsaleTime}"
					            				class="form-control form_date" placeholder="格式yyyy-mm-dd"/>
					            		</td>
				                		<td id="onsaleTime_warn" class="warn-msg"></td>
				                		
				                		<td class="title">状态</td>
					            		<td>
					            			<div class="controls">
						                        <select name="status" data-rel="chosen">
						                            <option value="1">待售</option>
						                            <option value="2">在售</option>
						                            <option value="3">下架</option>
						                        </select>
						                    </div>
					            		</td>
				                		<td id="status_warn" class="warn-msg"></td>
					              	</tr>	
					              	
					              	<tr>
					              		<!-- 此处仅供测试使用，实际运行改回name="prodNo" value="${prodNo}" -->
					              		<td><input type="hidden" name="prodNo" value="JY002"/></td>
				            			<td><button type="button" id="save" class="btn btn-primary" 
				            				style="width:100px">保存</button></td>
				            			<td><td>
				            								            			
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

<!-- datepicker  -->
<script type="text/javascript" src="js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="js/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
<!-- my custom js -->
<script src="js/custom.js"></script>

<script type="text/javascript">
function deleteRow(sender,sku){
	//if (window.confirm("确认删除？"))
	var prodNo = $("*[name='prodNo']").val();
	if(prodNo != null || prodNo != '') {
		$.ajax({
			type: "POST",
			url: "removeProductSalesattr",
			data: {
				sku: sku,
				prodNo: prodNo
			},
			dataType:"text",
			success: function(data){
				if(data == '') {
					$(sender).parent().parent().remove();
				} else {
					$("#msg").html(data);
				}
			},
			error: function(){
				alert("删除属性失败");
			}
		});
	}
	
}

$(function(){
	/*
	$("#dataTable").dataTable({
		"aaSorting": [[1, "asc"]],
		"iDisplayLength":10,
	    "bDestroy": true,
	    "oLanguage": {					//多语言配置
	    	"sProcessing": "正在加载中...",
	    	"sLengthMenu": "每页显示 _MENU_ 条记录",
	    	"sZeroRecords": "对不起，查询不到相关数据！",
	    	"sInfoEmpty": " 0 条记录",
	    	"sInfo": "共 _TOTAL_ 条记录",
	    	"sInfoFiltered": "(从 _MAX_ 条记录中检索)",
	    	"sSearch": "搜索",
	    	"oPaginate": {
	    	 	"sFirst": "首页",
	    	    "sPrevious": "上一页",
	    	    "sNext": "下一页",
	    	    "sLast": "末页"
	    	}
	    } 
	});	
	*/
	
	$("#save").click(function(){
		var map = {};
		$("input").each(function(){
			if($(this).attr("type") == 'text' || $(this).attr("type") == 'hidden') {
				var name = $(this).attr("name");
				if(name != undefined)
		    		map[name] = $(this).val();
			}
		});
		
		$("textarea").each(function(){
			map[$(this).attr("name")] = $(this).val();
		});
		
		$("select").each(function(){
			map[$(this).attr("name")] = $(this).find("option:selected").text();
		});
		
		/*
		$.each(map, function(index, value) { 
			alert(index + ':' + value); 
		});
		*/
		
		var form_data = decodeURIComponent($("#form").serialize(),true);

		var sku = $("*[name='sku']").val();
		if(sku != null && sku != ''){
			$.ajax({
			   	type: "POST",
			   	url: "addProductSalesattr",
			   	data: form_data,
			   	dataType:"text",
			   	success: function(data){
			   		if(data == '') {
				   		$(".add-new").slideToggle();
				   		$("#dataTable").append("<tr><td>" + map['sku'] + "</td><td>" + map['attrName'] + "</td><td>" +
						  		"<a href='" + map['image'] + "'><img src='" + map['image'] + "' class='small'/></a></td><td>" +
						   		map['description'] + "</td><td>" +
						   		map['price'] + "</td><td>" + map['isInspect'] + "</td><td>" +
						   		map['stock'] + "</td><td>" + map['stockWarn'] + "</td><td>" +
						  		map['onsaleTime'] + "</td><td>" + map['status'] + "</td><td>" +
						  		"<a class='glyphicon glyphicon-trash link' onclick='deleteRow(this," + 
						  		map['sku'] + ")'></a></td></tr>"			   	
					   	);		
				   		$("#msg").html("");
			   		} else {
			   			$("#msg").html(data);
			   		}
			   	},
			   	error: function(){
			    	alert("添加新属性失败");
			   	}
			});
		}
	});
});
</script>

</body>
</html>

