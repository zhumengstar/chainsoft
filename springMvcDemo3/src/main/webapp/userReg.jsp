<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.4.1.js" type="text/javascript" charset="utf-8"></script>

<script type="text/javascri pt">
$(document).ready(function(){
	$("#userAcc").blur(function(){
		var val=$("#userAcc").val();//获得输入框账号信息
		$.ajax({
			url:"user/checkAcc",
			data:"account="+val,
			type:"get",
			success:function(data){
				$.each(data,function(index,da){
					alert(da);
				})
			}
		});
	});
	
});
</script>
</head>
<body>

<input type="text" name="userAcc" id="userAcc" >
</body>
</html>