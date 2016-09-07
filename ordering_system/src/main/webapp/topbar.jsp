<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
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
                    	${sessionScope.user.account}
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