<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>login</title>
</head>
<body>
<h2>Welcome!</h2>
账号：${sessionScope.user_session.account}<br>
名称：${sessionScope.user_session.name}<br>
密码：${sessionScope.user_session.password}<br>
${msg}
</body>
</html>
