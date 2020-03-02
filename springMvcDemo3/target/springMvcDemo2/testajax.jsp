<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#showUser").click(function(){
		
		/* var val=$("#userAcc").val();//获得输入框账号信息 */
		$.ajax({
			url:"user/testJson",
			type:"get",
			dataType:"json",
			success:function(data){
				console.log("-------------");
			/* 	alert(data); */
			$.each(data, function(index,da){
				alert(index+" "+da);
			});
			}
		});
	});
	
	
	/*json 集*/
	

	$("#showUserArray").click(function(){
		
		/* var val=$("#userAcc").val();//获得输入框账号信息 */
		$.ajax({
			url:"user/testJsonArray",
			type:"get",
			dataType:"json",
			success:function(data){
				console.log("-------------");
			/* 	alert(data); */
			$.each(data, function(index,da){
				/* alert(index+" "+da); */
				$.each(da,function(attrname,arrtva){
					
					alert(attrname+" "+arrtva)
				});
			});
			}
		});
	});
});
</script>
</head>
<body>
<span id="showUser">显示用户信息</span>

<hr>

<span id="showUserArray">显示用户集信息</span>

</body>
</html>