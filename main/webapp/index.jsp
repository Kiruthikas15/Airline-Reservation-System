<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.box{
height:100px;
width:100px;
background-color:pink;
color:black;
}
body{
text-align:center;
background-color:lightblue;
}
</style>
</head>
<body>
<p>Registered Successfully!!! </p>
<%for(int i=0;i<5;i++){ 
for(int j=0;j<5;j++){%>
<span class="box">hello</span>
<%}%><br>
<%}%>
</body>
</html>