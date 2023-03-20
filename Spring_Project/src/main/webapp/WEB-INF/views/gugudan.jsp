<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
h2 {text-align: center;}
</style>
<body>

<h2> 구구단 </h2>

<br><br> 

<table border = "1">
<%
int i = 1;
int j = 1;
for (i = 1; i <= 9; i++) {
	%>
	<tr>
	<%
	for (j = 1; j <= 9; j++) {
		%>
		 <td> <%= i %> X <%= j %> = <%= i*j %></td> 
<%	} %>
	</tr>
	
<% }
%>
</table>
</body>
</html>