<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"  %>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
-------------
 ${userSe }
 <br>
 ${userSe } --获得对象 <br>
${sessionScope.userSe.userPhoto} //用户对象照片属性
${sessionScope.userSe.userName}
<br>
 ${sessionScope.info}
</body>
</html>