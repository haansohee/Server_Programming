<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<%
for (int i = 2; i <= 1000; i++) {
	/* System.out.println(i); */
	boolean bprime = true;
	
	for (int j = 2; j <= i; j++) {
		if (i % j == 0) {
			bprime = false;  // 소수 아님 
			break;
		}
	}
	
	if (bprime) { 
		System.out.println(i);
		%>
		<p> <%=i %> </p> <br>
		<%
	}
}
%>
</body>
</html>