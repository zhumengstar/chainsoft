<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- El表达式 -->
${name }
<br>
${user }
${user.userAccount }
<img src="../${user.userPhoto }" width="200px">
<br>
session+${sessionScope.userSe}
${sessionScope.userSe.userPhoto}
</body>
</html>